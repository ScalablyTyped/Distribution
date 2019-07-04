package typings
package vueDashSplitpaneLib.vueDashSplitpaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneMethods extends js.Object {
  def onClick(): scala.Unit
  def onMouseDown(): scala.Unit
  def onMouseMove(e: stdLib.Event): scala.Unit
  def onMouseUp(): scala.Unit
}

object SplitpaneMethods {
  @scala.inline
  def apply(
    onClick: () => scala.Unit,
    onMouseDown: () => scala.Unit,
    onMouseMove: stdLib.Event => scala.Unit,
    onMouseUp: () => scala.Unit
  ): SplitpaneMethods = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), onMouseDown = js.Any.fromFunction0(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction0(onMouseUp))
  
    __obj.asInstanceOf[SplitpaneMethods]
  }
}

