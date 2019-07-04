package typings
package vueDashSplitpaneLib.vueDashSplitpaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneWatch extends js.Object {
  def defaultPercent(`val`: js.Any): scala.Unit
}

object SplitpaneWatch {
  @scala.inline
  def apply(defaultPercent: js.Any => scala.Unit): SplitpaneWatch = {
    val __obj = js.Dynamic.literal(defaultPercent = js.Any.fromFunction1(defaultPercent))
  
    __obj.asInstanceOf[SplitpaneWatch]
  }
}

