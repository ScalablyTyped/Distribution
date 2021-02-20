package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.containerMod.Container
import typings.tensorflowTfjsLayers.logsMod.Logs
import typings.tensorflowTfjsLayers.logsMod.UnresolvedLogs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseCallbacksMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "BaseCallback")
  @js.native
  abstract class BaseCallback () extends StObject {
    
    def onBatchBegin(batch: Double): js.Promise[Unit] = js.native
    def onBatchBegin(batch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    def onBatchEnd(batch: Double): js.Promise[Unit] = js.native
    def onBatchEnd(batch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    def onEpochBegin(epoch: Double): js.Promise[Unit] = js.native
    def onEpochBegin(epoch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    def onEpochEnd(epoch: Double): js.Promise[Unit] = js.native
    def onEpochEnd(epoch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    def onTrainBegin(): js.Promise[Unit] = js.native
    def onTrainBegin(logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    def onTrainEnd(): js.Promise[Unit] = js.native
    def onTrainEnd(logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    /**
      * Training parameters (eg. verbosity, batch size, number of epochs...).
      */
    var params: Params = js.native
    
    def setModel(model: Container): Unit = js.native
    
    def setParams(params: Params): Unit = js.native
    
    var validationData: Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "BaseLogger")
  @js.native
  class BaseLogger () extends BaseCallback {
    
    var seen: js.Any = js.native
    
    var totals: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry")
  @js.native
  /**
    * Blocks public access to constructor.
    */
  class CallbackConstructorRegistry protected () extends StObject
  /* static members */
  object CallbackConstructorRegistry {
    
    @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry.checkForDuplicate")
    @js.native
    def checkForDuplicate: js.Any = js.native
    @scala.inline
    def checkForDuplicate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkForDuplicate")(x.asInstanceOf[js.Any])
    
    /**
      * Clear all registered callback constructors.
      */
    @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry.clear")
    @js.native
    def clear(): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry.constructors")
    @js.native
    def constructors: js.Any = js.native
    @scala.inline
    def constructors_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constructors")(x.asInstanceOf[js.Any])
    
    /**
      * Create callbacks using the registered callback constructors.
      *
      * Given `verbosityLevel`, all constructors registered at that level or above
      * will be called and the instantiated callbacks will be used.
      *
      * @param verbosityLevel: Level of verbosity.
      */
    @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry.createCallbacks")
    @js.native
    def createCallbacks(verbosityLevel: Double): js.Array[BaseCallback] = js.native
    
    /**
      * Register a tf.LayersModel.fit() callback constructor.
      *
      * The registered callback constructor will be used to instantiate
      * callbacks for every tf.LayersModel.fit() call afterwards.
      *
      * @param verbosityLevel Level of verbosity at which the `callbackConstructor`
      *   is to be reigstered.
      * @param callbackConstructor A no-arg constructor for `tf.Callback`.
      * @throws Error, if the same callbackConstructor has been registered before,
      *   either at the same or a different `verbosityLevel`.
      */
    @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry.registerCallbackConstructor")
    @js.native
    def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackList")
  @js.native
  /**
    * Constructor of CallbackList.
    * @param callbacks Array of `Callback` instances.
    * @param queueLength Queue length for keeping running statistics over
    *   callback execution time.
    */
  class CallbackList () extends StObject {
    def this(callbacks: js.Array[BaseCallback]) = this()
    def this(callbacks: js.UndefOr[scala.Nothing], queueLength: Double) = this()
    def this(callbacks: js.Array[BaseCallback], queueLength: Double) = this()
    
    def append(callback: BaseCallback): Unit = js.native
    
    var callbacks: js.Array[BaseCallback] = js.native
    
    /**
      * Called  right before processing a batch.
      * @param batch Index of batch within the current epoch.
      * @param logs Dictionary of logs.
      */
    def onBatchBegin(batch: Double): js.Promise[Unit] = js.native
    def onBatchBegin(batch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    /**
      * Called at the end of a batch.
      * @param batch Index of batch within the current epoch.
      * @param logs Dictionary of logs.
      */
    def onBatchEnd(batch: Double): js.Promise[Unit] = js.native
    def onBatchEnd(batch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    /**
      * Called at the start of an epoch.
      * @param epoch Index of epoch.
      * @param logs Dictionary of logs.
      */
    def onEpochBegin(epoch: Double): js.Promise[Unit] = js.native
    def onEpochBegin(epoch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    /**
      * Called at the end of an epoch.
      * @param epoch Index of epoch.
      * @param logs Dictionary of logs.
      */
    def onEpochEnd(epoch: Double): js.Promise[Unit] = js.native
    def onEpochEnd(epoch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    /**
      * Called at the beginning of training.
      * @param logs Dictionary of logs.
      */
    def onTrainBegin(): js.Promise[Unit] = js.native
    def onTrainBegin(logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    /**
      * Called at the end of training.
      * @param logs Dictionary of logs.
      */
    def onTrainEnd(): js.Promise[Unit] = js.native
    def onTrainEnd(logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    var queueLength: Double = js.native
    
    def setModel(model: Container): Unit = js.native
    
    def setParams(params: Params): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CustomCallback")
  @js.native
  class CustomCallback protected () extends BaseCallback {
    def this(args: CustomCallbackArgs) = this()
    def this(args: CustomCallbackArgs, yieldEvery: YieldEveryOptions) = this()
    
    /* protected */ def batchBegin(batch: Double): Unit | js.Promise[Unit] = js.native
    /* protected */ def batchBegin(batch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
    
    /* protected */ def batchEnd(batch: Double): Unit | js.Promise[Unit] = js.native
    /* protected */ def batchEnd(batch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
    
    var currentEpoch: js.Any = js.native
    
    /* protected */ def epochBegin(epoch: Double): Unit | js.Promise[Unit] = js.native
    /* protected */ def epochBegin(epoch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
    
    /* protected */ def epochEnd(epoch: Double): Unit | js.Promise[Unit] = js.native
    /* protected */ def epochEnd(epoch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
    
    def maybeWait(epoch: Double, batch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    /* protected */ def trainBegin(): Unit | js.Promise[Unit] = js.native
    /* protected */ def trainBegin(logs: Logs): Unit | js.Promise[Unit] = js.native
    
    /* protected */ def trainEnd(): Unit | js.Promise[Unit] = js.native
    /* protected */ def trainEnd(logs: Logs): Unit | js.Promise[Unit] = js.native
    
    /* protected */ def `yield`(epoch: Double, batch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
    
    var yieldEvery: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "DEFAULT_YIELD_EVERY_MS")
  @js.native
  val DEFAULT_YIELD_EVERY_MS: /* 125 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "History")
  @js.native
  class History () extends BaseCallback {
    
    var epoch: js.Array[Double] = js.native
    
    var history: StringDictionary[js.Array[Double | Tensor[Rank]]] = js.native
    
    /**
      * Await the values of all losses and metrics.
      */
    def syncData(): js.Promise[Unit] = js.native
  }
  
  @js.native
  sealed trait ModelLoggingVerbosity extends StObject
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "ModelLoggingVerbosity")
  @js.native
  object ModelLoggingVerbosity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ModelLoggingVerbosity with Double] = js.native
    
    @js.native
    sealed trait SILENT extends ModelLoggingVerbosity
    /* 0 */ val SILENT: typings.tensorflowTfjsLayers.baseCallbacksMod.ModelLoggingVerbosity.SILENT with Double = js.native
    
    @js.native
    sealed trait VERBOSE extends ModelLoggingVerbosity
    /* 1 */ val VERBOSE: typings.tensorflowTfjsLayers.baseCallbacksMod.ModelLoggingVerbosity.VERBOSE with Double = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "configureCallbacks")
  @js.native
  def configureCallbacks(
    callbacks: js.Array[BaseCallback],
    verbose: ModelLoggingVerbosity,
    epochs: Double,
    initialEpoch: Double,
    numTrainSamples: Double,
    stepsPerEpoch: Double,
    batchSize: Double,
    doValidation: Boolean,
    callbackMetrics: js.Array[String]
  ): typings.tensorflowTfjsLayers.anon.CallbackList = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "standardizeCallbacks")
  @js.native
  def standardizeCallbacks(callbacks: js.Array[BaseCallback | CustomCallbackArgs], yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "standardizeCallbacks")
  @js.native
  def standardizeCallbacks(callbacks: BaseCallback, yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "standardizeCallbacks")
  @js.native
  def standardizeCallbacks(callbacks: CustomCallbackArgs, yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
  
  @js.native
  trait BaseCallbackConstructor extends Instantiable0[BaseCallback]
  
  @js.native
  trait CustomCallbackArgs extends StObject {
    
    var onBatchBegin: js.UndefOr[
        js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
      ] = js.native
    
    var onBatchEnd: js.UndefOr[
        js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
      ] = js.native
    
    var onEpochBegin: js.UndefOr[
        js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
      ] = js.native
    
    var onEpochEnd: js.UndefOr[
        js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
      ] = js.native
    
    var onTrainBegin: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.native
    
    var onTrainEnd: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.native
    
    var onYield: js.UndefOr[
        js.Function3[/* epoch */ Double, /* batch */ Double, /* logs */ Logs, Unit | js.Promise[Unit]]
      ] = js.native
  }
  object CustomCallbackArgs {
    
    @scala.inline
    def apply(): CustomCallbackArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomCallbackArgs]
    }
    
    @scala.inline
    implicit class CustomCallbackArgsMutableBuilder[Self <: CustomCallbackArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBatchBegin(value: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "onBatchBegin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBatchBeginUndefined: Self = StObject.set(x, "onBatchBegin", js.undefined)
      
      @scala.inline
      def setOnBatchEnd(value: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "onBatchEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBatchEndUndefined: Self = StObject.set(x, "onBatchEnd", js.undefined)
      
      @scala.inline
      def setOnEpochBegin(value: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "onEpochBegin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEpochBeginUndefined: Self = StObject.set(x, "onEpochBegin", js.undefined)
      
      @scala.inline
      def setOnEpochEnd(value: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "onEpochEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEpochEndUndefined: Self = StObject.set(x, "onEpochEnd", js.undefined)
      
      @scala.inline
      def setOnTrainBegin(value: /* logs */ js.UndefOr[Logs] => Unit | js.Promise[Unit]): Self = StObject.set(x, "onTrainBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTrainBeginUndefined: Self = StObject.set(x, "onTrainBegin", js.undefined)
      
      @scala.inline
      def setOnTrainEnd(value: /* logs */ js.UndefOr[Logs] => Unit | js.Promise[Unit]): Self = StObject.set(x, "onTrainEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTrainEndUndefined: Self = StObject.set(x, "onTrainEnd", js.undefined)
      
      @scala.inline
      def setOnYield(value: (/* epoch */ Double, /* batch */ Double, /* logs */ Logs) => Unit | js.Promise[Unit]): Self = StObject.set(x, "onYield", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnYieldUndefined: Self = StObject.set(x, "onYield", js.undefined)
    }
  }
  
  type Params = StringDictionary[Double | String | Boolean | (js.Array[Boolean | Double | String])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.auto
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.batch
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.epoch
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.never
    - scala.Double
  */
  type YieldEveryOptions = _YieldEveryOptions | Double
  
  trait _YieldEveryOptions extends StObject
}
