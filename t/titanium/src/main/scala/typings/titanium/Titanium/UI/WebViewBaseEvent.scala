package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.WebView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait WebViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: WebView = js.native
}
object WebViewBaseEvent {
  
  @scala.inline
  def apply(source: WebView): WebViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewBaseEvent]
  }
  
  @scala.inline
  implicit class WebViewBaseEventMutableBuilder[Self <: WebViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: WebView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
