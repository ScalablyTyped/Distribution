package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowSizeChangedEventArgs extends ICoreWindowEventArgs {
  var size: winrtLib.WindowsNs.FoundationNs.Size
}

object IWindowSizeChangedEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean, size: winrtLib.WindowsNs.FoundationNs.Size): IWindowSizeChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, size = size)
  
    __obj.asInstanceOf[IWindowSizeChangedEventArgs]
  }
}

