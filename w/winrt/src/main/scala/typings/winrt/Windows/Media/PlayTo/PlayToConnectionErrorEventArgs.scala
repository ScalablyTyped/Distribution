package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayToConnectionErrorEventArgs extends IPlayToConnectionErrorEventArgs

object PlayToConnectionErrorEventArgs {
  @scala.inline
  def apply(code: PlayToConnectionError, message: String): PlayToConnectionErrorEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionErrorEventArgs]
  }
}

