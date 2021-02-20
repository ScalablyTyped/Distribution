package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.App
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait AppBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: App = js.native
}
object AppBaseEvent {
  
  @scala.inline
  def apply(source: App): AppBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppBaseEvent]
  }
  
  @scala.inline
  implicit class AppBaseEventMutableBuilder[Self <: AppBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: App): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
