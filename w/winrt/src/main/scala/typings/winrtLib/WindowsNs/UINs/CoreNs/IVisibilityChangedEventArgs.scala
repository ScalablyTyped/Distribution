package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVisibilityChangedEventArgs extends ICoreWindowEventArgs {
  var visible: scala.Boolean
}

object IVisibilityChangedEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean, visible: scala.Boolean): IVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, visible = visible)
  
    __obj.asInstanceOf[IVisibilityChangedEventArgs]
  }
}

