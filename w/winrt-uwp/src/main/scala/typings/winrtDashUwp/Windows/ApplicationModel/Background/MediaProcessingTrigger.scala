package typings.winrtDashUwp.Windows.ApplicationModel.Background

import typings.winrtDashUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task for performing media processing. */
@JSGlobal("Windows.ApplicationModel.Background.MediaProcessingTrigger")
@js.native
/** Initializes a new instance of the MediaProcessingTrigger class. */
class MediaProcessingTrigger () extends js.Object {
  /**
    * Triggers the background task and returns a MediaProcessingTriggerResult indicating success or failure of the trigger request.
    * @return An asynchronous operation that returns a MediaProcessingTriggerResult upon completion.
    */
  def requestAsync(): IPromiseWithIAsyncOperation[MediaProcessingTriggerResult] = js.native
  /**
    * Triggers the background task with the provided collection of arguments and returns a MediaProcessingTriggerResult indicating success or failure of the trigger request.
    * @param arguments A collection of arguments that will be passed to the media processing background task.
    * @return An asynchronous operation that returns a MediaProcessingTriggerResult upon completion.
    */
  def requestAsync(args: ValueSet): IPromiseWithIAsyncOperation[MediaProcessingTriggerResult] = js.native
}

