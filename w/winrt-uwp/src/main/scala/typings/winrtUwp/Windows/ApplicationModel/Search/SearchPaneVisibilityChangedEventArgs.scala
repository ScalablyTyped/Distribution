package typings.winrtUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a visibilitychanged event that is associated with a searchPane object. */
@js.native
trait SearchPaneVisibilityChangedEventArgs extends StObject {
  
  /** Indicates whether the search pane is open. */
  var visible: Boolean = js.native
}
object SearchPaneVisibilityChangedEventArgs {
  
  @scala.inline
  def apply(visible: Boolean): SearchPaneVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneVisibilityChangedEventArgs]
  }
  
  @scala.inline
  implicit class SearchPaneVisibilityChangedEventArgsMutableBuilder[Self <: SearchPaneVisibilityChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
