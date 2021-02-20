package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.RefreshControl
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait RefreshControlBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: RefreshControl = js.native
}
object RefreshControlBaseEvent {
  
  @scala.inline
  def apply(source: RefreshControl): RefreshControlBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlBaseEvent]
  }
  
  @scala.inline
  implicit class RefreshControlBaseEventMutableBuilder[Self <: RefreshControlBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: RefreshControl): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
