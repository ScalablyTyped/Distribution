package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.ImageView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ImageViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: ImageView = js.native
}
object ImageViewBaseEvent {
  
  @scala.inline
  def apply(source: ImageView): ImageViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageViewBaseEvent]
  }
  
  @scala.inline
  implicit class ImageViewBaseEventMutableBuilder[Self <: ImageViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: ImageView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
