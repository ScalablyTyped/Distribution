package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingOptions extends js.Object {
  
  /**
    * You can set what cost function to use for the training, there are three built-in cost functions (Trainer.cost.CROSS_ENTROPY, Trainer.cost.MSE and Trainer.cost.BINARY) to choose from cross-entropy or mean squared error. You can also use you own cost function(targetValues, outputValues).
    */
  var cost: js.UndefOr[CostFunction] = js.native
  
  /**
    * Minimum error.
    */
  var error: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of iterations.
    */
  var iterations: js.UndefOr[Double] = js.native
  
  /**
    * This commands the trainer to console.log the error and iterations every X number of iterations.
    */
  var log: js.UndefOr[Double] = js.native
  
  /**
    * Learning rate to train the network. It can be a static rate (just a number), dynamic (an array of numbers, which will transition from one to the next one according to the number of iterations) or a callback function: (iterations, error) => rate.
    */
  var rate: js.UndefOr[
    Double | js.Array[Double] | (js.Function2[/* iterations */ Double, /* error */ Double, Double])
  ] = js.native
  
  /**
    * You can create custom scheduled tasks that will be executed every X number of iterations. It can be used to create custom logs, or to compute analytics based on the data passed to the task (data object includes error, iterations and the current learning rate). If the returned value of the task is true, the training will be aborted. This can be used to create special conditions to stop the training (i.e. if the error starts to increase).
    */
  var schedule: js.UndefOr[TrainingScheduleOptions] = js.native
  
  /**
    * If true, the training set is shuffled after every iteration, this is useful for training data sequences which order is not meaningful to networks with context memory, like LSTM's.
    */
  var shuffle: js.UndefOr[Boolean] = js.native
}
object TrainingOptions {
  
  @scala.inline
  def apply(): TrainingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingOptions]
  }
  
  @scala.inline
  implicit class TrainingOptionsOps[Self <: TrainingOptions] (val x: Self) extends AnyVal {
    
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
    def setCost(value: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => Double): Self = this.set("cost", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCost: Self = this.set("cost", js.undefined)
    
    @scala.inline
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    
    @scala.inline
    def setLog(value: Double): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setRateFunction2(value: (/* iterations */ Double, /* error */ Double) => Double): Self = this.set("rate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRateVarargs(value: Double*): Self = this.set("rate", js.Array(value :_*))
    
    @scala.inline
    def setRate(
      value: Double | js.Array[Double] | (js.Function2[/* iterations */ Double, /* error */ Double, Double])
    ): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setSchedule(value: TrainingScheduleOptions): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setShuffle(value: Boolean): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShuffle: Self = this.set("shuffle", js.undefined)
  }
}
