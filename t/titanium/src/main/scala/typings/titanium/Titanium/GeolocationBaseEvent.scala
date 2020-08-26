package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.Geolocation
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait GeolocationBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: Geolocation = js.native
}

object GeolocationBaseEvent {
  @scala.inline
  def apply(source: Geolocation): GeolocationBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationBaseEvent]
  }
  @scala.inline
  implicit class GeolocationBaseEventOps[Self <: GeolocationBaseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSource(value: Geolocation): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

