package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVisibilityChangedEventArgs extends ICoreWindowEventArgs {
  
  var visible: Boolean = js.native
}
object IVisibilityChangedEventArgs {
  
  @scala.inline
  def apply(handled: Boolean, visible: Boolean): IVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVisibilityChangedEventArgs]
  }
  
  @scala.inline
  implicit class IVisibilityChangedEventArgsMutableBuilder[Self <: IVisibilityChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
