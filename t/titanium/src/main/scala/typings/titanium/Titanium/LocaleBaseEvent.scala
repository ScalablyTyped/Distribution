package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Locale
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait LocaleBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Locale = js.native
}
object LocaleBaseEvent {
  
  @scala.inline
  def apply(source: Locale): LocaleBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleBaseEvent]
  }
  
  @scala.inline
  implicit class LocaleBaseEventMutableBuilder[Self <: LocaleBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Locale): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
