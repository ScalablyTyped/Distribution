package typings.web3DashEth.web3DashEthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Syncing extends js.Object {
  var CurrentBlock: Double
  var HighestBlock: Double
  var KnownStates: Double
  var PulledStates: Double
  var StartingBlock: Double
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
    val __obj = js.Dynamic.literal(CurrentBlock = CurrentBlock, HighestBlock = HighestBlock, KnownStates = KnownStates, PulledStates = PulledStates, StartingBlock = StartingBlock)
  
    __obj.asInstanceOf[Syncing]
  }
}

