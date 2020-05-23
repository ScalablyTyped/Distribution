package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is used to trigger background tasks. */
@js.native
trait ApplicationTrigger extends js.Object {
  /**
    * This method attempts to set the trigger and start the registered background task.
    * @return Returns an ApplicationTriggerResult enumeration that indicates whether the user provided the necessary consent for the operation or the system policies didn't reject the request to trigger a background task.
    */
  def requestAsync(): IPromiseWithIAsyncOperation[ApplicationTriggerResult] = js.native
  /**
    * This method attempts to set the trigger and start the registered background task with specified arguments.
    * @param arguments The serialized arguments that are passed to the background task.
    * @return Returns an ApplicationTriggerResult enumeration that indicates whether the user provided the necessary consent for the operation or the system policies didn't reject the request to trigger a background task.
    */
  def requestAsync(args: ValueSet): IPromiseWithIAsyncOperation[ApplicationTriggerResult] = js.native
}

