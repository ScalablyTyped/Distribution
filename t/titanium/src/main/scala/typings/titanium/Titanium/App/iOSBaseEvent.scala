package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.App.iOS
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait iOSBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: iOS = js.native
}
object iOSBaseEvent {
  
  @scala.inline
  def apply(source: iOS): iOSBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSBaseEvent]
  }
  
  @scala.inline
  implicit class iOSBaseEventMutableBuilder[Self <: iOSBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: iOS): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
