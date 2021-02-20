package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Animation
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait AnimationBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Animation = js.native
}
object AnimationBaseEvent {
  
  @scala.inline
  def apply(source: Animation): AnimationBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationBaseEvent]
  }
  
  @scala.inline
  implicit class AnimationBaseEventMutableBuilder[Self <: AnimationBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Animation): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
