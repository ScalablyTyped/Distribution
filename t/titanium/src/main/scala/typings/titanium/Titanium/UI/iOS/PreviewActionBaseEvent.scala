package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.iOS.PreviewAction
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait PreviewActionBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: PreviewAction = js.native
}
object PreviewActionBaseEvent {
  
  @scala.inline
  def apply(source: PreviewAction): PreviewActionBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewActionBaseEvent]
  }
  
  @scala.inline
  implicit class PreviewActionBaseEventMutableBuilder[Self <: PreviewActionBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: PreviewAction): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
