package typings.stripeV3.stripe

import typings.stripeV3.stripe.setupIntents.SetupIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetupIntentResponse extends js.Object {
  var error: js.UndefOr[Error] = js.native
  var setupIntent: js.UndefOr[SetupIntent] = js.native
}

object SetupIntentResponse {
  @scala.inline
  def apply(): SetupIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetupIntentResponse]
  }
  @scala.inline
  implicit class SetupIntentResponseOps[Self <: SetupIntentResponse] (val x: Self) extends AnyVal {
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setSetupIntent(value: SetupIntent): Self = this.set("setupIntent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetupIntent: Self = this.set("setupIntent", js.undefined)
  }
  
}

