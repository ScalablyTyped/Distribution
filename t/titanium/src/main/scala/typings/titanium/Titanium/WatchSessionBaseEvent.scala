package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.WatchSession
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait WatchSessionBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: WatchSession = js.native
}
object WatchSessionBaseEvent {
  
  @scala.inline
  def apply(source: WatchSession): WatchSessionBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionBaseEvent]
  }
  
  @scala.inline
  implicit class WatchSessionBaseEventMutableBuilder[Self <: WatchSessionBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: WatchSession): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
