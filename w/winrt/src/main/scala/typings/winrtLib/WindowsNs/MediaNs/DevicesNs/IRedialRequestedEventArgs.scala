package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRedialRequestedEventArgs extends js.Object {
  def handled(): scala.Unit
}

object IRedialRequestedEventArgs {
  @scala.inline
  def apply(handled: () => scala.Unit): IRedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = js.Any.fromFunction0(handled))
  
    __obj.asInstanceOf[IRedialRequestedEventArgs]
  }
}

