package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.MaskedImage
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait MaskedImageBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: MaskedImage = js.native
}
object MaskedImageBaseEvent {
  
  @scala.inline
  def apply(source: MaskedImage): MaskedImageBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedImageBaseEvent]
  }
  
  @scala.inline
  implicit class MaskedImageBaseEventMutableBuilder[Self <: MaskedImageBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: MaskedImage): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
