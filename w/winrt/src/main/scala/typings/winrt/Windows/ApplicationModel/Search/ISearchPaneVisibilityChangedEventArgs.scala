package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneVisibilityChangedEventArgs extends StObject {
  
  var visible: Boolean
}
object ISearchPaneVisibilityChangedEventArgs {
  
  inline def apply(visible: Boolean): ISearchPaneVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneVisibilityChangedEventArgs]
  }
  
  extension [Self <: ISearchPaneVisibilityChangedEventArgs](x: Self) {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
