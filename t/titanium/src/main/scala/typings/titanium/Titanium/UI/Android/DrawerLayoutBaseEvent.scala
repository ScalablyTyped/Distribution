package typings.titanium.Titanium.UI.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Android.DrawerLayout
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait DrawerLayoutBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: DrawerLayout = js.native
}
object DrawerLayoutBaseEvent {
  
  @scala.inline
  def apply(source: DrawerLayout): DrawerLayoutBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutBaseEvent]
  }
  
  @scala.inline
  implicit class DrawerLayoutBaseEventMutableBuilder[Self <: DrawerLayoutBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: DrawerLayout): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
