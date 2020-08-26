package typings.web3Eth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Syncing extends js.Object {
  var CurrentBlock: Double = js.native
  var HighestBlock: Double = js.native
  var KnownStates: Double = js.native
  var PulledStates: Double = js.native
  var StartingBlock: Double = js.native
}

object Syncing {
  @scala.inline
  def apply(
    CurrentBlock: Double,
    HighestBlock: Double,
    KnownStates: Double,
    PulledStates: Double,
    StartingBlock: Double
  ): Syncing = {
    val __obj = js.Dynamic.literal(CurrentBlock = CurrentBlock.asInstanceOf[js.Any], HighestBlock = HighestBlock.asInstanceOf[js.Any], KnownStates = KnownStates.asInstanceOf[js.Any], PulledStates = PulledStates.asInstanceOf[js.Any], StartingBlock = StartingBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Syncing]
  }
  @scala.inline
  implicit class SyncingOps[Self <: Syncing] (val x: Self) extends AnyVal {
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
    def setCurrentBlock(value: Double): Self = this.set("CurrentBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighestBlock(value: Double): Self = this.set("HighestBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setKnownStates(value: Double): Self = this.set("KnownStates", value.asInstanceOf[js.Any])
    @scala.inline
    def setPulledStates(value: Double): Self = this.set("PulledStates", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartingBlock(value: Double): Self = this.set("StartingBlock", value.asInstanceOf[js.Any])
  }
  
}

