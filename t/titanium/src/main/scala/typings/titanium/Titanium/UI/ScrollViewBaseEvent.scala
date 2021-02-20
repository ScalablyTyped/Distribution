package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.ScrollView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ScrollViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: ScrollView = js.native
}
object ScrollViewBaseEvent {
  
  @scala.inline
  def apply(source: ScrollView): ScrollViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewBaseEvent]
  }
  
  @scala.inline
  implicit class ScrollViewBaseEventMutableBuilder[Self <: ScrollViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: ScrollView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
