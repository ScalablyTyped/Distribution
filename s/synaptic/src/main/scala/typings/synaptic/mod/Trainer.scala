package typings.synaptic.mod

import typings.synaptic.anon.Test
import typings.synaptic.mod.Trainer.DSROptions
import typings.synaptic.mod.Trainer.DSRTrainingResult
import typings.synaptic.mod.Trainer.ERGOptions
import typings.synaptic.mod.Trainer.ERGTrainingResult
import typings.synaptic.mod.Trainer.TrainingOptions
import typings.synaptic.mod.Trainer.TrainingResult
import typings.synaptic.mod.Trainer.TrainingSet
import typings.synaptic.mod.Trainer.XOROptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("synaptic", "Trainer")
@js.native
open class Trainer protected () extends StObject {
  /**
    * The Trainer makes it easier to train any set to any network, no matter its architecture. The trainer also contains built-in tasks to test the performance of your network.
    * @param network
    */
  def this(network: Network) = this()
  
  /**
    * This method trains the network to complete a Discrete Sequence Recall, which is a task for testing context memory in neural networks.
    */
  def DSR(): DSRTrainingResult = js.native
  def DSR(options: DSROptions): DSRTrainingResult = js.native
  
  /**
    * This method trains the network to pass an Embedded Reber Grammar test.
    */
  def ERG(): ERGTrainingResult = js.native
  def ERG(options: ERGOptions): ERGTrainingResult = js.native
  
  /**
    * This method trains an XOR to the network, is useful when you are experimenting with different architectures and you want to test and compare their performances.
    */
  def XOR(): TrainingResult = js.native
  def XOR(options: XOROptions): TrainingResult = js.native
  
  /**
    * This method accepts the same arguments as train(dataSet, options). It will iterate over the dataSet, activating the network.
    * @returns It returns the elapsed time and the error (by default, the MSE, but you can specify the cost function in the options, same way as in train()).
    */
  def test(trainingSet: TrainingSet): TrainingResult = js.native
  def test(trainingSet: TrainingSet, trainingOptions: TrainingOptions): TrainingResult = js.native
  
  /**
    * This test challenges the network to complete a timing task.
    */
  def timingTask(): Test = js.native
  def timingTask(options: Any): Test = js.native
  
  /**
    * This method allows you to train any training set to a Network.
    * @returns When the training is done this method returns an object with the error, the iterations, and the elapsed time of the training.
    */
  def train(trainingSet: TrainingSet): TrainingResult = js.native
  def train(trainingSet: TrainingSet, trainingOptions: TrainingOptions): TrainingResult = js.native
  
  /**
    * This method allows you to train any training set to a Network.
    * @returns When the training is done this method returns an object with the error, the iterations, and the elapsed time of the training.
    */
  def trainAsync(trainingSet: TrainingSet): js.Promise[TrainingResult] = js.native
  def trainAsync(trainingSet: TrainingSet, trainingOptions: TrainingOptions): js.Promise[TrainingResult] = js.native
}
object Trainer {
  
  object cost {
    
    @JSImport("synaptic", "Trainer.cost.BINARY")
    @js.native
    val BINARY: CostFunction = js.native
    
    @JSImport("synaptic", "Trainer.cost.CROSS_ENTROPY")
    @js.native
    val CROSS_ENTROPY: CostFunction = js.native
    
    @JSImport("synaptic", "Trainer.cost.MSE")
    @js.native
    val MSE: CostFunction = js.native
  }
  
  type CostFunction = js.Function2[/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double], Double]
  
  trait DSROptions extends StObject {
    
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
  object DSROptions {
    
    inline def apply(): DSROptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DSROptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DSROptions] (val x: Self) extends AnyVal {
      
      inline def setCost(value: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => Double): Self = StObject.set(x, "cost", js.Any.fromFunction2(value))
      
      inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
      
      inline def setDistractors(value: js.Array[Double]): Self = StObject.set(x, "distractors", value.asInstanceOf[js.Any])
      
      inline def setDistractorsUndefined: Self = StObject.set(x, "distractors", js.undefined)
      
      inline def setDistractorsVarargs(value: Double*): Self = StObject.set(x, "distractors", js.Array(value*))
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLog(value: Double): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setPrompts(value: js.Array[Double]): Self = StObject.set(x, "prompts", value.asInstanceOf[js.Any])
      
      inline def setPromptsUndefined: Self = StObject.set(x, "prompts", js.undefined)
      
      inline def setPromptsVarargs(value: Double*): Self = StObject.set(x, "prompts", js.Array(value*))
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setSchedule(value: TrainingScheduleOptions): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      inline def setSuccess(value: Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setTargets(value: js.Array[Double]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: Double*): Self = StObject.set(x, "targets", js.Array(value*))
    }
  }
  
  trait DSRTrainingResult extends StObject {
    
    var error: Double
    
    var iterations: Double
    
    var success: Any
    
    var time: Double
  }
  object DSRTrainingResult {
    
    inline def apply(error: Double, iterations: Double, success: Any, time: Double): DSRTrainingResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[DSRTrainingResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DSRTrainingResult] (val x: Self) extends AnyVal {
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Any): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait ERGOptions extends StObject {
    
    var cost: js.UndefOr[CostFunction] = js.undefined
    
    var error: js.UndefOr[Double] = js.undefined
    
    var iterations: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[Double] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
  }
  object ERGOptions {
    
    inline def apply(): ERGOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ERGOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ERGOptions] (val x: Self) extends AnyVal {
      
      inline def setCost(value: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => Double): Self = StObject.set(x, "cost", js.Any.fromFunction2(value))
      
      inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setLog(value: Double): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    }
  }
  
  trait ERGTrainingResult extends StObject {
    
    var error: Double
    
    var generate: Any
    
    var iterations: Double
    
    var test: Any
    
    var time: Double
  }
  object ERGTrainingResult {
    
    inline def apply(error: Double, generate: Any, iterations: Double, test: Any, time: Double): ERGTrainingResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], generate = generate.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[ERGTrainingResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ERGTrainingResult] (val x: Self) extends AnyVal {
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setGenerate(value: Any): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setTest(value: Any): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrainingOptions extends StObject {
    
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
    
    inline def apply(): TrainingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrainingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrainingOptions] (val x: Self) extends AnyVal {
      
      inline def setCost(value: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => Double): Self = StObject.set(x, "cost", js.Any.fromFunction2(value))
      
      inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setLog(value: Double): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setRate(
        value: Double | js.Array[Double] | (js.Function2[/* iterations */ Double, /* error */ Double, Double])
      ): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateFunction2(value: (/* iterations */ Double, /* error */ Double) => Double): Self = StObject.set(x, "rate", js.Any.fromFunction2(value))
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setRateVarargs(value: Double*): Self = StObject.set(x, "rate", js.Array(value*))
      
      inline def setSchedule(value: TrainingScheduleOptions): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
    }
  }
  
  trait TrainingPair extends StObject {
    
    var input: js.Array[Double]
    
    var output: js.Array[Double]
  }
  object TrainingPair {
    
    inline def apply(input: js.Array[Double], output: js.Array[Double]): TrainingPair = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrainingPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrainingPair] (val x: Self) extends AnyVal {
      
      inline def setInput(value: js.Array[Double]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputVarargs(value: Double*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setOutput(value: js.Array[Double]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: Double*): Self = StObject.set(x, "output", js.Array(value*))
    }
  }
  
  trait TrainingResult extends StObject {
    
    var error: Double
    
    var iterations: Double
    
    var time: Double
  }
  object TrainingResult {
    
    inline def apply(error: Double, iterations: Double, time: Double): TrainingResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrainingResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrainingResult] (val x: Self) extends AnyVal {
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrainingScheduleDoData extends StObject {
    
    var error: Any
    
    var iterations: Any
    
    /**
      * The current learning rate.
      */
    var rate: Any
  }
  object TrainingScheduleDoData {
    
    inline def apply(error: Any, iterations: Any, rate: Any): TrainingScheduleDoData = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrainingScheduleDoData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrainingScheduleDoData] (val x: Self) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Any): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setRate(value: Any): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrainingScheduleOptions extends StObject {
    
    def `do`(data: TrainingScheduleDoData): Boolean | Unit
    
    var every: Double
  }
  object TrainingScheduleOptions {
    
    inline def apply(`do`: TrainingScheduleDoData => Boolean | Unit, every: Double): TrainingScheduleOptions = {
      val __obj = js.Dynamic.literal(every = every.asInstanceOf[js.Any])
      __obj.updateDynamic("do")(js.Any.fromFunction1(`do`))
      __obj.asInstanceOf[TrainingScheduleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrainingScheduleOptions] (val x: Self) extends AnyVal {
      
      inline def setDo(value: TrainingScheduleDoData => Boolean | Unit): Self = StObject.set(x, "do", js.Any.fromFunction1(value))
      
      inline def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
    }
  }
  
  type TrainingSet = js.Array[TrainingPair]
  
  trait XOROptions extends StObject {
    
    var cost: js.UndefOr[CostFunction] = js.undefined
    
    var iterations: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[Double] = js.undefined
    
    var shuffle: js.UndefOr[Boolean] = js.undefined
  }
  object XOROptions {
    
    inline def apply(): XOROptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XOROptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XOROptions] (val x: Self) extends AnyVal {
      
      inline def setCost(value: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => Double): Self = StObject.set(x, "cost", js.Any.fromFunction2(value))
      
      inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setLog(value: Double): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
    }
  }
}
