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
  def apply(complete: () => scala.Unit): IPlayToSourceDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IPlayToSourceDeferral]
  }
}

