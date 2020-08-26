package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.ApplicationModel.Background.IBackgroundTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of background transfer operations ( DownloadOperation or UploadOperation objects) that trigger a background task once all the operations are done (if the operations completed successfully) or fail with an error. */
@js.native
trait BackgroundTransferCompletionGroup extends js.Object {
  /** Gets a value that indicates if Enable method on a BackgroundTransferCompletionGroup has already been called. */
  var isEnabled: Boolean = js.native
  /** Gets the IBackgroundTrigger used to set up the background task associated with the BackgroundTransferCompletionGroup . */
  var trigger: IBackgroundTrigger = js.native
  /** Indicates that the BackgroundTransferCompletionGroup is complete and no more background transfer operations ( DownloadOperation or UploadOperation objects) will be added t the completion group. */
  def enable(): Unit = js.native
}

object BackgroundTransferCompletionGroup {
  @scala.inline
  def apply(enable: () => Unit, isEnabled: Boolean, trigger: IBackgroundTrigger): BackgroundTransferCompletionGroup = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), isEnabled = isEnabled.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTransferCompletionGroup]
  }
  @scala.inline
  implicit class BackgroundTransferCompletionGroupOps[Self <: BackgroundTransferCompletionGroup] (val x: Self) extends AnyVal {
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
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrigger(value: IBackgroundTrigger): Self = this.set("trigger", value.asInstanceOf[js.Any])
  }
  
}

