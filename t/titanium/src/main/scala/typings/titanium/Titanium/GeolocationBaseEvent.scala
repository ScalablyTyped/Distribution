package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Base event for class Titanium.Geolocation
	 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait GeolocationBaseEvent extends js.Object {
  /**
  		 * Source object that fired the event.
  		 */
  var source: Geolocation
}

object GeolocationBaseEvent {
  @scala.inline
  def apply(source: Geolocation): GeolocationBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationBaseEvent]
  }
}

