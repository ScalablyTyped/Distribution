package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.iOS.Animator
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait AnimatorBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Animator = js.native
}
object AnimatorBaseEvent {
  
  @scala.inline
  def apply(source: Animator): AnimatorBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatorBaseEvent]
  }
  
  @scala.inline
  implicit class AnimatorBaseEventMutableBuilder[Self <: AnimatorBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Animator): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
