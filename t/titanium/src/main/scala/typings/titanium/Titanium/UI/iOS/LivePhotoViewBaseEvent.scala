package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base event for class Titanium.UI.iOS.LivePhotoView
			 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait LivePhotoViewBaseEvent extends js.Object {
  /**
  				 * Source object that fired the event.
  				 */
  var source: LivePhotoView
}

object LivePhotoViewBaseEvent {
  @scala.inline
  def apply(source: LivePhotoView): LivePhotoViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePhotoViewBaseEvent]
  }
}

