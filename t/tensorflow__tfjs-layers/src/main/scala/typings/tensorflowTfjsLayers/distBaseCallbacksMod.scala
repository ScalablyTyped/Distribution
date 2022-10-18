package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distEngineContainerMod.Container
import typings.tensorflowTfjsLayers.distLogsMod.Logs
import typings.tensorflowTfjsLayers.distLogsMod.UnresolvedLogs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBaseCallbacksMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "BaseCallback")
  @js.native
  open class BaseCallback () extends StObject {
    
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
  open class BaseLogger () extends BaseCallback {
    
    /* private */ var seen: Any = js.native
    
    /* private */ var totals: Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry")
  @js.native
  /**
    * Blocks public access to constructor.
    */
  /* private */ open class CallbackConstructorRegistry () extends StObject
  /* static members */
  object CallbackConstructorRegistry {
    
    @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry.checkForDuplicate")
    @js.native
    def checkForDuplicate: Any = js.native
    inline def checkForDuplicate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkForDuplicate")(x.asInstanceOf[js.Any])
    
    /**
      * Clear all registered callback constructors.
      */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry.constructors")
    @js.native
    def constructors: Any = js.native
    inline def constructors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constructors")(x.asInstanceOf[js.Any])
    
    /**
      * Create callbacks using the registered callback constructors.
      *
      * Given `verbosityLevel`, all constructors registered at that level or above
      * will be called and the instantiated callbacks will be used.
      *
      * @param verbosityLevel: Level of verbosity.
      */
    inline def createCallbacks(verbosityLevel: Double): js.Array[BaseCallback] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCallbacks")(verbosityLevel.asInstanceOf[js.Any]).asInstanceOf[js.Array[BaseCallback]]
    
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
    inline def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCallbackConstructor")(verbosityLevel.asInstanceOf[js.Any], callbackConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackList")
  @js.native
  /**
    * Constructor of CallbackList.
    * @param callbacks Array of `Callback` instances.
    * @param queueLength Queue length for keeping running statistics over
    *   callback execution time.
    */
  open class CallbackList () extends StObject {
    def this(callbacks: js.Array[BaseCallback]) = this()
    def this(callbacks: js.Array[BaseCallback], queueLength: Double) = this()
    def this(callbacks: Unit, queueLength: Double) = this()
    
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
  open class CustomCallback protected () extends BaseCallback {
    def this(args: CustomCallbackArgs) = this()
    def this(args: CustomCallbackArgs, yieldEvery: YieldEveryOptions) = this()
    
    /* protected */ def batchBegin(batch: Double): Unit | js.Promise[Unit] = js.native
    /* protected */ def batchBegin(batch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
    
    /* protected */ def batchEnd(batch: Double): Unit | js.Promise[Unit] = js.native
    /* protected */ def batchEnd(batch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
    
    /* private */ var currentEpoch: Any = js.native
    
    /* protected */ def epochBegin(epoch: Double): Unit | js.Promise[Unit] = js.native
    /* protected */ def epochBegin(epoch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
    
    /* protected */ def epochEnd(epoch: Double): Unit | js.Promise[Unit] = js.native
    /* protected */ def epochEnd(epoch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
    
    def maybeWait(epoch: Double, batch: Double, logs: UnresolvedLogs): js.Promise[Unit] = js.native
    
    var nextFrameFunc: js.Function = js.native
    
    var nowFunc: js.Function = js.native
    
    /* protected */ def trainBegin(): Unit | js.Promise[Unit] = js.native
    /* protected */ def trainBegin(logs: Logs): Unit | js.Promise[Unit] = js.native
    
    /* protected */ def trainEnd(): Unit | js.Promise[Unit] = js.native
    /* protected */ def trainEnd(logs: Logs): Unit | js.Promise[Unit] = js.native
    
    /* protected */ def `yield`(epoch: Double, batch: Double, logs: Logs): Unit | js.Promise[Unit] = js.native
    
    /* private */ var yieldEvery: Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "DEFAULT_YIELD_EVERY_MS")
  @js.native
  val DEFAULT_YIELD_EVERY_MS: /* 125 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "History")
  @js.native
  open class History () extends BaseCallback {
    
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
    def apply(value: Double): js.UndefOr[ModelLoggingVerbosity & Double] = js.native
    
    @js.native
    sealed trait SILENT
      extends StObject
         with ModelLoggingVerbosity
    /* 0 */ val SILENT: typings.tensorflowTfjsLayers.distBaseCallbacksMod.ModelLoggingVerbosity.SILENT & Double = js.native
    
    @js.native
    sealed trait VERBOSE
      extends StObject
         with ModelLoggingVerbosity
    /* 1 */ val VERBOSE: typings.tensorflowTfjsLayers.distBaseCallbacksMod.ModelLoggingVerbosity.VERBOSE & Double = js.native
  }
  
  inline def configureCallbacks(
    callbacks: js.Array[BaseCallback],
    verbose: ModelLoggingVerbosity,
    epochs: Double,
    initialEpoch: Double,
    numTrainSamples: Double,
    stepsPerEpoch: Double,
    batchSize: Double,
    doValidation: Boolean,
    callbackMetrics: js.Array[String]
  ): typings.tensorflowTfjsLayers.anon.CallbackList = (^.asInstanceOf[js.Dynamic].applyDynamic("configureCallbacks")(callbacks.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], epochs.asInstanceOf[js.Any], initialEpoch.asInstanceOf[js.Any], numTrainSamples.asInstanceOf[js.Any], stepsPerEpoch.asInstanceOf[js.Any], batchSize.asInstanceOf[js.Any], doValidation.asInstanceOf[js.Any], callbackMetrics.asInstanceOf[js.Any])).asInstanceOf[typings.tensorflowTfjsLayers.anon.CallbackList]
  
  inline def standardizeCallbacks(callbacks: js.Array[BaseCallback | CustomCallbackArgs], yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeCallbacks")(callbacks.asInstanceOf[js.Any], yieldEvery.asInstanceOf[js.Any])).asInstanceOf[js.Array[BaseCallback]]
  inline def standardizeCallbacks(callbacks: BaseCallback, yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeCallbacks")(callbacks.asInstanceOf[js.Any], yieldEvery.asInstanceOf[js.Any])).asInstanceOf[js.Array[BaseCallback]]
  inline def standardizeCallbacks(callbacks: CustomCallbackArgs, yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeCallbacks")(callbacks.asInstanceOf[js.Any], yieldEvery.asInstanceOf[js.Any])).asInstanceOf[js.Array[BaseCallback]]
  
  @js.native
  trait BaseCallbackConstructor
    extends StObject
       with Instantiable0[BaseCallback]
  
  trait CustomCallbackArgs extends StObject {
    
    var nextFrameFunc: js.UndefOr[js.Function] = js.undefined
    
    var nowFunc: js.UndefOr[js.Function] = js.undefined
    
    var onBatchBegin: js.UndefOr[
        js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
      ] = js.undefined
    
    var onBatchEnd: js.UndefOr[
        js.Function2[/* batch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
      ] = js.undefined
    
    var onEpochBegin: js.UndefOr[
        js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
      ] = js.undefined
    
    var onEpochEnd: js.UndefOr[
        js.Function2[/* epoch */ Double, /* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]
      ] = js.undefined
    
    var onTrainBegin: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.undefined
    
    var onTrainEnd: js.UndefOr[js.Function1[/* logs */ js.UndefOr[Logs], Unit | js.Promise[Unit]]] = js.undefined
    
    var onYield: js.UndefOr[
        js.Function3[/* epoch */ Double, /* batch */ Double, /* logs */ Logs, Unit | js.Promise[Unit]]
      ] = js.undefined
  }
  object CustomCallbackArgs {
    
    inline def apply(): CustomCallbackArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomCallbackArgs]
    }
    
    extension [Self <: CustomCallbackArgs](x: Self) {
      
      inline def setNextFrameFunc(value: js.Function): Self = StObject.set(x, "nextFrameFunc", value.asInstanceOf[js.Any])
      
      inline def setNextFrameFuncUndefined: Self = StObject.set(x, "nextFrameFunc", js.undefined)
      
      inline def setNowFunc(value: js.Function): Self = StObject.set(x, "nowFunc", value.asInstanceOf[js.Any])
      
      inline def setNowFuncUndefined: Self = StObject.set(x, "nowFunc", js.undefined)
      
      inline def setOnBatchBegin(value: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "onBatchBegin", js.Any.fromFunction2(value))
      
      inline def setOnBatchBeginUndefined: Self = StObject.set(x, "onBatchBegin", js.undefined)
      
      inline def setOnBatchEnd(value: (/* batch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "onBatchEnd", js.Any.fromFunction2(value))
      
      inline def setOnBatchEndUndefined: Self = StObject.set(x, "onBatchEnd", js.undefined)
      
      inline def setOnEpochBegin(value: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "onEpochBegin", js.Any.fromFunction2(value))
      
      inline def setOnEpochBeginUndefined: Self = StObject.set(x, "onEpochBegin", js.undefined)
      
      inline def setOnEpochEnd(value: (/* epoch */ Double, /* logs */ js.UndefOr[Logs]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "onEpochEnd", js.Any.fromFunction2(value))
      
      inline def setOnEpochEndUndefined: Self = StObject.set(x, "onEpochEnd", js.undefined)
      
      inline def setOnTrainBegin(value: /* logs */ js.UndefOr[Logs] => Unit | js.Promise[Unit]): Self = StObject.set(x, "onTrainBegin", js.Any.fromFunction1(value))
      
      inline def setOnTrainBeginUndefined: Self = StObject.set(x, "onTrainBegin", js.undefined)
      
      inline def setOnTrainEnd(value: /* logs */ js.UndefOr[Logs] => Unit | js.Promise[Unit]): Self = StObject.set(x, "onTrainEnd", js.Any.fromFunction1(value))
      
      inline def setOnTrainEndUndefined: Self = StObject.set(x, "onTrainEnd", js.undefined)
      
      inline def setOnYield(value: (/* epoch */ Double, /* batch */ Double, /* logs */ Logs) => Unit | js.Promise[Unit]): Self = StObject.set(x, "onYield", js.Any.fromFunction3(value))
      
      inline def setOnYieldUndefined: Self = StObject.set(x, "onYield", js.undefined)
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
