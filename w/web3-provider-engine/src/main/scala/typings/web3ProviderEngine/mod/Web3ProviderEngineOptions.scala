package typings.web3ProviderEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Web3ProviderEngineOptions extends js.Object {
  var blockTracker: js.UndefOr[js.Any] = js.native
  var blockTrackerProvider: js.UndefOr[js.Any] = js.native
  var pollingInterval: js.UndefOr[Double] = js.native
}

object Web3ProviderEngineOptions {
  @scala.inline
  def apply(): Web3ProviderEngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Web3ProviderEngineOptions]
  }
  @scala.inline
  implicit class Web3ProviderEngineOptionsOps[Self <: Web3ProviderEngineOptions] (val x: Self) extends AnyVal {
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
    def setBlockTracker(value: js.Any): Self = this.set("blockTracker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockTracker: Self = this.set("blockTracker", js.undefined)
    @scala.inline
    def setBlockTrackerProvider(value: js.Any): Self = this.set("blockTrackerProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockTrackerProvider: Self = this.set("blockTrackerProvider", js.undefined)
    @scala.inline
    def setPollingInterval(value: Double): Self = this.set("pollingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollingInterval: Self = this.set("pollingInterval", js.undefined)
  }
  
}

