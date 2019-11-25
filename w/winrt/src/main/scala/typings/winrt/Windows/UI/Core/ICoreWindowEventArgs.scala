package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowEventArgs extends js.Object {
  var handled: Boolean
}

object ICoreWindowEventArgs {
  @scala.inline
  def apply(handled: Boolean): ICoreWindowEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICoreWindowEventArgs]
  }
}

