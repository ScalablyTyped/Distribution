package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.iOS.BlurView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait BlurViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: BlurView = js.native
}
object BlurViewBaseEvent {
  
  @scala.inline
  def apply(source: BlurView): BlurViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurViewBaseEvent]
  }
  
  @scala.inline
  implicit class BlurViewBaseEventMutableBuilder[Self <: BlurViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: BlurView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
