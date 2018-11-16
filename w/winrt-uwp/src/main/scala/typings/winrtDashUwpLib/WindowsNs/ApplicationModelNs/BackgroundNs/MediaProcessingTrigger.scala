package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task for performing media processing. */
@JSGlobal("Windows.ApplicationModel.Background.MediaProcessingTrigger")
@js.native
class MediaProcessingTrigger () extends js.Object {
  /**
                   * Triggers the background task and returns a MediaProcessingTriggerResult indicating success or failure of the trigger request.
                   * @return An asynchronous operation that returns a MediaProcessingTriggerResult upon completion.
                   */
  def requestAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[MediaProcessingTriggerResult] = js.native
  /**
                   * Triggers the background task with the provided collection of arguments and returns a MediaProcessingTriggerResult indicating success or failure of the trigger request.
                   * @param arguments A collection of arguments that will be passed to the media processing background task.
                   * @return An asynchronous operation that returns a MediaProcessingTriggerResult upon completion.
                   */
  def requestAsync(args: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[MediaProcessingTriggerResult] = js.native
}

