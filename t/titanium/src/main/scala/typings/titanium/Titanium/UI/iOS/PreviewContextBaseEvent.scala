package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.iOS.PreviewContext
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait PreviewContextBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: PreviewContext = js.native
}
object PreviewContextBaseEvent {
  
  @scala.inline
  def apply(source: PreviewContext): PreviewContextBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewContextBaseEvent]
  }
  
  @scala.inline
  implicit class PreviewContextBaseEventMutableBuilder[Self <: PreviewContextBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: PreviewContext): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
