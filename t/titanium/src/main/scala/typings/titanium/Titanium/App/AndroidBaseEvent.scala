package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.App.Android
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait AndroidBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Android = js.native
}
object AndroidBaseEvent {
  
  @scala.inline
  def apply(source: Android): AndroidBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidBaseEvent]
  }
  
  @scala.inline
  implicit class AndroidBaseEventMutableBuilder[Self <: AndroidBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Android): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
