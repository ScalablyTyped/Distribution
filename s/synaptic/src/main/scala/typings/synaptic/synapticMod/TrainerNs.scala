package typings.synaptic.synapticMod

import typings.synaptic.synapticMod.TrainerNs.CostFunction
import typings.synaptic.synapticMod.TrainerNs.TrainingPair
import typings.synaptic.synapticMod.TrainerNs.TrainingScheduleDoData
import typings.synaptic.synapticMod.TrainerNs.TrainingScheduleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Trainer")
@js.native
object TrainerNs extends js.Object {
  trait DSROptions extends js.Object {
    var cost: js.UndefOr[CostFunction] = js.undefined
    var distractors: js.UndefOr[js.Array[Double]] = js.undefined
    var iterations: js.UndefOr[Double] = js.undefined
    var length: js.UndefOr[Double] = js.undefined
    var log: js.UndefOr[Double] = js.undefined
    var prompts: js.UndefOr[js.Array[Double]] = js.undefined
    var rate: js.UndefOr[Double] = js.undefined
    var schedule: js.UndefOr[TrainingScheduleOptions] = js.undefined
    var success: js.UndefOr[Double] = js.undefined
    var targets: js.UndefOr[js.Array[Double]] = js.undefined
  }
  
  trait DSRTrainingResult extends js.Object {
    var error: Double
    var iterations: Double
    var success: js.Any
    var time: Double
  }
  
  trait ERGOptions extends js.Object {
    var cost: js.UndefOr[CostFunction] = js.undefined
    var error: js.UndefOr[Double] = js.undefined
    var iterations: js.UndefOr[Double] = js.undefined
    var log: js.UndefOr[Double] = js.undefined
    var rate: js.UndefOr[Double] = js.undefined
  }
  
  trait ERGTrainingResult extends js.Object {
    var error: Double
    var generate: js.Any
    var iterations: Double
    var test: js.Any
    var time: Double
  }
  
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
  
  trait TrainingPair extends js.Object {
    var input: js.Array[Double]
    var output: js.Array[Double]
  }
  
  trait TrainingResult extends js.Object {
    var error: Double
    var iterations: Double
    var time: Double
  }
  
  trait TrainingScheduleDoData extends js.Object {
    var error: js.Any
    var iterations: js.Any
    /**
      * The current learning rate.
      */
    var rate: js.Any
  }
  
  trait TrainingScheduleOptions extends js.Object {
    var every: Double
    def `do`(data: TrainingScheduleDoData): Boolean | Unit
  }
  
  trait XOROptions extends js.Object {
    var cost: js.UndefOr[CostFunction] = js.undefined
    var iterations: js.UndefOr[Double] = js.undefined
    var log: js.UndefOr[Double] = js.undefined
    var shuffle: js.UndefOr[Boolean] = js.undefined
  }
  
  @JSName("cost")
  @js.native
  object costNs extends js.Object {
    val BINARY: CostFunction = js.native
    val CROSS_ENTROPY: CostFunction = js.native
    val MSE: CostFunction = js.native
  }
  
  type CostFunction = js.Function2[/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double], Double]
  type TrainingSet = js.Array[TrainingPair]
}

