package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPaneVisibilityChangedEventArgs
  extends StObject
     with ISearchPaneVisibilityChangedEventArgs
object SearchPaneVisibilityChangedEventArgs {
  
  inline def apply(visible: Boolean): SearchPaneVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneVisibilityChangedEventArgs]
  }
}
