package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Contacts
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ContactsBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Contacts = js.native
}
object ContactsBaseEvent {
  
  @scala.inline
  def apply(source: Contacts): ContactsBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsBaseEvent]
  }
  
  @scala.inline
  implicit class ContactsBaseEventMutableBuilder[Self <: ContactsBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Contacts): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
