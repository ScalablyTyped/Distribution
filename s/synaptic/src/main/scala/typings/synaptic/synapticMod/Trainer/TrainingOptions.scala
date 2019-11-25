package typings.synaptic.synapticMod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingOptions extends js.Object {
  /**
    * You can set what cost function to use for the training, there are three built-in cost functions (Trainer.cost.CROSS_ENTROPY, Trainer.cost.MSE and Trainer.cost.BINARY) to choose from cross-entropy or mean squared error. You can also use you own cost function(targetValues, outputValues).
    */
  var cost: js.UndefOr[CostFunction] = js.undefined
  /**
    * Minimum error.
    */
  var error: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of iterations.
    */
  var iterations: js.UndefOr[Double] = js.undefined
  /**
    * This commands the trainer to console.log the error and iterations every X number of iterations.
    */
  var log: js.UndefOr[Double] = js.undefined
  /**
    * Learning rate to train the network. It can be a static rate (just a number), dynamic (an array of numbers, which will transition from one to the next one according to the number of iterations) or a callback function: (iterations, error) => rate.
    */
  var rate: js.UndefOr[
    Double | js.Array[Double] | (js.Function2[/* iterations */ Double, /* error */ Double, Double])
  ] = js.undefined
  /**
    * You can create custom scheduled tasks that will be executed every X number of iterations. It can be used to create custom logs, or to compute analytics based on the data passed to the task (data object includes error, iterations and the current learning rate). If the returned value of the task is true, the training will be aborted. This can be used to create special conditions to stop the training (i.e. if the error starts to increase).
    */
  var schedule: js.UndefOr[TrainingScheduleOptions] = js.undefined
  /**
    * If true, the training set is shuffled after every iteration, this is useful for training data sequences which order is not meaningful to networks with context memory, like LSTM's.
    */
  var shuffle: js.UndefOr[Boolean] = js.undefined
}

object TrainingOptions {
  @scala.inline
  def apply(
    cost: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => Double = null,
    error: Int | Double = null,
    iterations: Int | Double = null,
    log: Int | Double = null,
    rate: Double | js.Array[Double] | (js.Function2[/* iterations */ Double, /* error */ Double, Double]) = null,
    schedule: TrainingScheduleOptions = null,
    shuffle: js.UndefOr[Boolean] = js.undefined
  ): TrainingOptions = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(js.Any.fromFunction2(cost))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingOptions]
  }
}

