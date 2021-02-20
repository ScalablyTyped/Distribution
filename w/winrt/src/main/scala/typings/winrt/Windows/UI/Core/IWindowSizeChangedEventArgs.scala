package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWindowSizeChangedEventArgs extends ICoreWindowEventArgs {
  
  var size: Size = js.native
}
object IWindowSizeChangedEventArgs {
  
  @scala.inline
  def apply(handled: Boolean, size: Size): IWindowSizeChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindowSizeChangedEventArgs]
  }
  
  @scala.inline
  implicit class IWindowSizeChangedEventArgsMutableBuilder[Self <: IWindowSizeChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
