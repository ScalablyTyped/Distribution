package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a media processing background task access to the set of arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
@js.native
trait MediaProcessingTriggerDetails extends js.Object {
  /** Gets a value set containing the arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
  var arguments: ValueSet = js.native
}

object MediaProcessingTriggerDetails {
  @scala.inline
  def apply(arguments: ValueSet): MediaProcessingTriggerDetails = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProcessingTriggerDetails]
  }
  @scala.inline
  implicit class MediaProcessingTriggerDetailsOps[Self <: MediaProcessingTriggerDetails] (val x: Self) extends AnyVal {
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
    def setArguments(value: ValueSet): Self = this.set("arguments", value.asInstanceOf[js.Any])
  }
  
}

