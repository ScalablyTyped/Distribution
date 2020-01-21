package typings.tensorflowTfjsNode.callbacksMod

import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.batch
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.epoch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorBoardCallbackArgs extends js.Object {
  /**
    * The frequency at which loss and metric values are written to logs.
    *
    * Currently supported options are:
    *
    * - 'batch': Write logs at the end of every batch of training, in addition
    *   to the end of every epoch of training.
    * - 'epoch': Write logs at the end of every epoch of training.
    *
    * Note that writing logs too often slows down the training.
    *
    * Default: 'epoch'.
    */
  var updateFreq: js.UndefOr[batch | epoch] = js.undefined
}

object TensorBoardCallbackArgs {
  @scala.inline
  def apply(updateFreq: batch | epoch = null): TensorBoardCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (updateFreq != null) __obj.updateDynamic("updateFreq")(updateFreq.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorBoardCallbackArgs]
  }
}

