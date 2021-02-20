package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.ScrollableView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ScrollableViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: ScrollableView = js.native
}
object ScrollableViewBaseEvent {
  
  @scala.inline
  def apply(source: ScrollableView): ScrollableViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewBaseEvent]
  }
  
  @scala.inline
  implicit class ScrollableViewBaseEventMutableBuilder[Self <: ScrollableViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: ScrollableView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
