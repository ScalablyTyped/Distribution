package typings.winrtUwp.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for a MediaProtectionManager object when the load of binary data fails. */
@js.native
trait ComponentLoadFailedEventArgs extends js.Object {
  /** Returns an indication of the completion of the event. */
  var completion: MediaProtectionServiceCompletion = js.native
  /** Returns a list of components in the RevocationAndRenewalInformation object that need to be revoked and renewed with updated components. */
  var information: RevocationAndRenewalInformation = js.native
}

object ComponentLoadFailedEventArgs {
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, information: RevocationAndRenewalInformation): ComponentLoadFailedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentLoadFailedEventArgs]
  }
  @scala.inline
  implicit class ComponentLoadFailedEventArgsOps[Self <: ComponentLoadFailedEventArgs] (val x: Self) extends AnyVal {
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
    def setCompletion(value: MediaProtectionServiceCompletion): Self = this.set("completion", value.asInstanceOf[js.Any])
    @scala.inline
    def setInformation(value: RevocationAndRenewalInformation): Self = this.set("information", value.asInstanceOf[js.Any])
  }
  
}

