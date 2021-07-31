package typings.winrtUwp.Windows.UI.ViewManagement

import typings.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the input pane Hiding and Showing events. */
trait InputPaneVisibilityEventArgs extends StObject {
  
  /** Identifies whether the application has taken steps to ensure that the input pane doesn't cover the UI element that has focus. */
  var ensuredFocusedElementInView: Boolean
  
  /** Gets the region of the application's window that the input pane is covering. */
  var occludedRect: Rect
}
object InputPaneVisibilityEventArgs {
  
  @scala.inline
  def apply(ensuredFocusedElementInView: Boolean, occludedRect: Rect): InputPaneVisibilityEventArgs = {
    val __obj = js.Dynamic.literal(ensuredFocusedElementInView = ensuredFocusedElementInView.asInstanceOf[js.Any], occludedRect = occludedRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputPaneVisibilityEventArgs]
  }
  
  @scala.inline
  implicit class InputPaneVisibilityEventArgsMutableBuilder[Self <: InputPaneVisibilityEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnsuredFocusedElementInView(value: Boolean): Self = StObject.set(x, "ensuredFocusedElementInView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccludedRect(value: Rect): Self = StObject.set(x, "occludedRect", value.asInstanceOf[js.Any])
  }
}
