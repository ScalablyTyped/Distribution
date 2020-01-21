package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** (Applies to Windows Phone only) The details of an ApplicationTrigger . */
@JSGlobal("Windows.ApplicationModel.Background.ApplicationTriggerDetails")
@js.native
abstract class ApplicationTriggerDetails () extends js.Object {
  /** The arguments that were passed to the background task using the ApplicationTrigger.RequestAsync(ValueSet) method. */
  var arguments: ValueSet = js.native
}

