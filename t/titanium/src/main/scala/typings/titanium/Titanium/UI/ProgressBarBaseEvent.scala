package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.ProgressBar
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ProgressBarBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: ProgressBar = js.native
}
object ProgressBarBaseEvent {
  
  @scala.inline
  def apply(source: ProgressBar): ProgressBarBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarBaseEvent]
  }
  
  @scala.inline
  implicit class ProgressBarBaseEventMutableBuilder[Self <: ProgressBarBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: ProgressBar): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
