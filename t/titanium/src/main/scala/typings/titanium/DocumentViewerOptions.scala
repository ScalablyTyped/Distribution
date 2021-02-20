package typings.titanium

import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object for specifying options when showing or dismissing a <Titanium.UI.iOS.DocumentViewer>.
  */
@js.native
trait DocumentViewerOptions extends StObject {
  
  /**
    * Indicates whether to animate the transition.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Anchors the options menu to the specified view.
    */
  var view: js.UndefOr[View] = js.native
}
object DocumentViewerOptions {
  
  @scala.inline
  def apply(): DocumentViewerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentViewerOptions]
  }
  
  @scala.inline
  implicit class DocumentViewerOptionsMutableBuilder[Self <: DocumentViewerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
