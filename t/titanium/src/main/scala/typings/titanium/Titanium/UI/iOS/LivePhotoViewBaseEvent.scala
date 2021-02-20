package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.iOS.LivePhotoView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait LivePhotoViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: LivePhotoView = js.native
}
object LivePhotoViewBaseEvent {
  
  @scala.inline
  def apply(source: LivePhotoView): LivePhotoViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePhotoViewBaseEvent]
  }
  
  @scala.inline
  implicit class LivePhotoViewBaseEventMutableBuilder[Self <: LivePhotoViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: LivePhotoView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
