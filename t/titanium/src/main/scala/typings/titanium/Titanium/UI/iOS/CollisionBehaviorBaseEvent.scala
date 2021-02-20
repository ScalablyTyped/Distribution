package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.iOS.CollisionBehavior
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait CollisionBehaviorBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: CollisionBehavior = js.native
}
object CollisionBehaviorBaseEvent {
  
  @scala.inline
  def apply(source: CollisionBehavior): CollisionBehaviorBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionBehaviorBaseEvent]
  }
  
  @scala.inline
  implicit class CollisionBehaviorBaseEventMutableBuilder[Self <: CollisionBehaviorBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: CollisionBehavior): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
