package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchPaneVisibilityChangedEventArgs extends StObject {
  
  var visible: Boolean = js.native
}
object ISearchPaneVisibilityChangedEventArgs {
  
  @scala.inline
  def apply(visible: Boolean): ISearchPaneVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneVisibilityChangedEventArgs]
  }
  
  @scala.inline
  implicit class ISearchPaneVisibilityChangedEventArgsMutableBuilder[Self <: ISearchPaneVisibilityChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
