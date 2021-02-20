package typings.titanium.Titanium.UI.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Android.SearchView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait SearchViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: SearchView = js.native
}
object SearchViewBaseEvent {
  
  @scala.inline
  def apply(source: SearchView): SearchViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchViewBaseEvent]
  }
  
  @scala.inline
  implicit class SearchViewBaseEventMutableBuilder[Self <: SearchViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: SearchView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
