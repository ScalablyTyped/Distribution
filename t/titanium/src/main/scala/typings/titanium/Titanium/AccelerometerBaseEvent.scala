package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Base event for class Titanium.Accelerometer
	 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait AccelerometerBaseEvent extends js.Object {
  /**
  		 * Source object that fired the event.
  		 */
  var source: Accelerometer
}

object AccelerometerBaseEvent {
  @scala.inline
  def apply(source: Accelerometer): AccelerometerBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerBaseEvent]
  }
}

