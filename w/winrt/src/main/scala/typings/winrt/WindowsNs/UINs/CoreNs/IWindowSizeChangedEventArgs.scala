package typings.winrt.WindowsNs.UINs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowSizeChangedEventArgs extends ICoreWindowEventArgs {
  var size: Size
}

object IWindowSizeChangedEventArgs {
  @scala.inline
  def apply(handled: Boolean, size: Size): IWindowSizeChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, size = size)
  
    __obj.asInstanceOf[IWindowSizeChangedEventArgs]
  }
}

