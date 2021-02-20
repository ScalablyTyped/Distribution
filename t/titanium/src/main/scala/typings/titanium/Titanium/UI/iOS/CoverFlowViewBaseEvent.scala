package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.iOS.CoverFlowView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait CoverFlowViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: CoverFlowView = js.native
}
object CoverFlowViewBaseEvent {
  
  @scala.inline
  def apply(source: CoverFlowView): CoverFlowViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowViewBaseEvent]
  }
  
  @scala.inline
  implicit class CoverFlowViewBaseEventMutableBuilder[Self <: CoverFlowViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: CoverFlowView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
