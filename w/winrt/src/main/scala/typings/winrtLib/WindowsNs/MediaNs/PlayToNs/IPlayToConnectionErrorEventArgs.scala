package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToConnectionErrorEventArgs extends js.Object {
  var code: PlayToConnectionError
  var message: java.lang.String
}

object IPlayToConnectionErrorEventArgs {
  @scala.inline
  def apply(code: PlayToConnectionError, message: java.lang.String): IPlayToConnectionErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[IPlayToConnectionErrorEventArgs]
  }
}

