package typings.titanium.Titanium.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Android.QuickSettingsService
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait QuickSettingsServiceBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: QuickSettingsService = js.native
}
object QuickSettingsServiceBaseEvent {
  
  @scala.inline
  def apply(source: QuickSettingsService): QuickSettingsServiceBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickSettingsServiceBaseEvent]
  }
  
  @scala.inline
  implicit class QuickSettingsServiceBaseEventMutableBuilder[Self <: QuickSettingsServiceBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: QuickSettingsService): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
