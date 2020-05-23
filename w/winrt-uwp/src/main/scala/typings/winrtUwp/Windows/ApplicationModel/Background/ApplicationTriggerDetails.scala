package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** (Applies to Windows Phone only) The details of an ApplicationTrigger . */
trait ApplicationTriggerDetails extends js.Object {
  /** The arguments that were passed to the background task using the ApplicationTrigger.RequestAsync(ValueSet) method. */
  var arguments: ValueSet
}

object ApplicationTriggerDetails {
  @scala.inline
  def apply(arguments: ValueSet): ApplicationTriggerDetails = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationTriggerDetails]
  }
}

