package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSourceDeferral extends js.Object {
  def complete(): scala.Unit
}

object IPlayToSourceDeferral {
  @scala.inline
  def apply(complete: js.Function0[scala.Unit]): IPlayToSourceDeferral = {
    val __obj = js.Dynamic.literal(complete = complete)
  
    __obj.asInstanceOf[IPlayToSourceDeferral]
  }
}

