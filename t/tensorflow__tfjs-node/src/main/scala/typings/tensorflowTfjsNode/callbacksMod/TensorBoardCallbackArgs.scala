package typings.tensorflowTfjsNode.callbacksMod

import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.batch
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.epoch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var updateFreq: js.UndefOr[batch | epoch] = js.native
}
object TensorBoardCallbackArgs {
  
  @scala.inline
  def apply(): TensorBoardCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TensorBoardCallbackArgs]
  }
  
  @scala.inline
  implicit class TensorBoardCallbackArgsOps[Self <: TensorBoardCallbackArgs] (val x: Self) extends AnyVal {
    
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
    def setUpdateFreq(value: batch | epoch): Self = this.set("updateFreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateFreq: Self = this.set("updateFreq", js.undefined)
  }
}
