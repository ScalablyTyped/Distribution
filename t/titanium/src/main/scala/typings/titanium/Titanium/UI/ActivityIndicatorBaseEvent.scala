package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.ActivityIndicator
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ActivityIndicatorBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: ActivityIndicator = js.native
}
object ActivityIndicatorBaseEvent {
  
  @scala.inline
  def apply(source: ActivityIndicator): ActivityIndicatorBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityIndicatorBaseEvent]
  }
  
  @scala.inline
  implicit class ActivityIndicatorBaseEventMutableBuilder[Self <: ActivityIndicatorBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: ActivityIndicator): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
