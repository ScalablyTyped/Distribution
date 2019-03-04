package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scrollable extends js.Object {
  def getScrollState(): js.Any
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit
}

object Scrollable {
  @scala.inline
  def apply(
    getScrollState: js.Function0[js.Any],
    scrollTo: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): Scrollable = {
    val __obj = js.Dynamic.literal(getScrollState = getScrollState, scrollTo = scrollTo)
  
    __obj.asInstanceOf[Scrollable]
  }
}

