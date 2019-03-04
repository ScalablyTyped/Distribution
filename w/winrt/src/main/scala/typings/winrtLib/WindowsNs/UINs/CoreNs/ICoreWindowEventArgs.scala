package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowEventArgs extends js.Object {
  var handled: scala.Boolean
}

object ICoreWindowEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean): ICoreWindowEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled)
  
    __obj.asInstanceOf[ICoreWindowEventArgs]
  }
}

