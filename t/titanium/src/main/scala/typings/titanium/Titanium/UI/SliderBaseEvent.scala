package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Slider
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait SliderBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Slider = js.native
}
object SliderBaseEvent {
  
  @scala.inline
  def apply(source: Slider): SliderBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderBaseEvent]
  }
  
  @scala.inline
  implicit class SliderBaseEventMutableBuilder[Self <: SliderBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Slider): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
