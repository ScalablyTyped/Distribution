package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.iOS.SplitWindow
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait SplitWindowBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: SplitWindow = js.native
}
object SplitWindowBaseEvent {
  
  @scala.inline
  def apply(source: SplitWindow): SplitWindowBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitWindowBaseEvent]
  }
  
  @scala.inline
  implicit class SplitWindowBaseEventMutableBuilder[Self <: SplitWindowBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: SplitWindow): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
