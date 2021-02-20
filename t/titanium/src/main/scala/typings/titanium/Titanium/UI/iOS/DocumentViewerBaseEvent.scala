package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.iOS.DocumentViewer
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait DocumentViewerBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: DocumentViewer = js.native
}
object DocumentViewerBaseEvent {
  
  @scala.inline
  def apply(source: DocumentViewer): DocumentViewerBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewerBaseEvent]
  }
  
  @scala.inline
  implicit class DocumentViewerBaseEventMutableBuilder[Self <: DocumentViewerBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: DocumentViewer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
