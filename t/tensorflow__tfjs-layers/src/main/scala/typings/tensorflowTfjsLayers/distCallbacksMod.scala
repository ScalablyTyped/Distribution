package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distBaseCallbacksMod.BaseCallback
import typings.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.auto
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCallbacksMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/callbacks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/callbacks", "Callback")
  @js.native
  open class Callback () extends BaseCallback {
    
    /** Instance of `keras.models.Model`. Reference of the model being trained. */
    var model: LayersModel = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/callbacks", "EarlyStopping")
  @js.native
  open class EarlyStopping_ () extends Callback {
    def this(args: EarlyStoppingCallbackArgs) = this()
    
    /* protected */ val baseline: Double = js.native
    
    /* private */ var best: Any = js.native
    
    /* private */ var getMonitorValue: Any = js.native
    
    /* protected */ val minDelta: Double = js.native
    
    /* protected */ val mode: auto | min | max = js.native
    
    /* protected */ val monitor: String = js.native
    
    /* protected */ def monitorFunc(currVal: Double, prevVal: Double): Boolean = js.native
    
    /* protected */ val patience: Double = js.native
    
    /* private */ var stoppedEpoch: Any = js.native
    
    /* protected */ val verbose: Double = js.native
    
    /* private */ @JSName("wait")
    var wait_FEarlyStopping_ : Any = js.native
  }
  
  object callbacks {
    
    @JSImport("@tensorflow/tfjs-layers/dist/callbacks", "callbacks")
    @js.native
    val ^ : js.Any = js.native
    
    inline def earlyStopping(): EarlyStopping_ = ^.asInstanceOf[js.Dynamic].applyDynamic("earlyStopping")().asInstanceOf[EarlyStopping_]
    inline def earlyStopping(args: EarlyStoppingCallbackArgs): EarlyStopping_ = ^.asInstanceOf[js.Dynamic].applyDynamic("earlyStopping")(args.asInstanceOf[js.Any]).asInstanceOf[EarlyStopping_]
    @JSImport("@tensorflow/tfjs-layers/dist/callbacks", "callbacks.earlyStopping")
    @js.native
    def earlyStopping_Fcallbacks: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_] = js.native
    
    inline def earlyStopping_Fcallbacks_=(x: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("earlyStopping")(x.asInstanceOf[js.Any])
  }
  
  inline def earlyStopping(): EarlyStopping_ = ^.asInstanceOf[js.Dynamic].applyDynamic("earlyStopping")().asInstanceOf[EarlyStopping_]
  inline def earlyStopping(args: EarlyStoppingCallbackArgs): EarlyStopping_ = ^.asInstanceOf[js.Dynamic].applyDynamic("earlyStopping")(args.asInstanceOf[js.Any]).asInstanceOf[EarlyStopping_]
  
  trait EarlyStoppingCallbackArgs extends StObject {
    
    /**
      * Baseline value of the monitored quantity.
      *
      * If specified, training will be stopped if the model doesn't show
      * improvement over the baseline.
      */
    var baseline: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum change in the monitored quantity to qualify as improvement,
      * i.e., an absolute change of less than `minDelta` will count as no
      * improvement.
      *
      * Defaults to 0.
      */
    var minDelta: js.UndefOr[Double] = js.undefined
    
    /**
      * Mode: one of 'min', 'max', and 'auto'.
      * - In 'min' mode, training will be stopped when the quantity monitored has
      *   stopped decreasing.
      * - In 'max' mode, training will be stopped when the quantity monitored has
      *   stopped increasing.
      * - In 'auto' mode, the direction is inferred automatically from the name of
      *   the monitored quantity.
      *
      * Defaults to 'auto'.
      */
    var mode: js.UndefOr[auto | min | max] = js.undefined
    
    /**
      * Quantity to be monitored.
      *
      * Defaults to 'val_loss'.
      */
    var monitor: js.UndefOr[String] = js.undefined
    
    /**
      * Number of epochs with no improvement after which training will be stopped.
      *
      * Defaults to 0.
      */
    var patience: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to restore model weights from the epoch with the best value
      * of the monitored quantity. If `False`, the model weights obtained at the
      * last step of training are used.
      *
      * **`True` is not supported yet.**
      */
    var restoreBestWeights: js.UndefOr[Boolean] = js.undefined
    
    /** Verbosity mode. */
    var verbose: js.UndefOr[Double] = js.undefined
  }
  object EarlyStoppingCallbackArgs {
    
    inline def apply(): EarlyStoppingCallbackArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EarlyStoppingCallbackArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EarlyStoppingCallbackArgs] (val x: Self) extends AnyVal {
      
      inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      inline def setMinDelta(value: Double): Self = StObject.set(x, "minDelta", value.asInstanceOf[js.Any])
      
      inline def setMinDeltaUndefined: Self = StObject.set(x, "minDelta", js.undefined)
      
      inline def setMode(value: auto | min | max): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMonitor(value: String): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
      
      inline def setMonitorUndefined: Self = StObject.set(x, "monitor", js.undefined)
      
      inline def setPatience(value: Double): Self = StObject.set(x, "patience", value.asInstanceOf[js.Any])
      
      inline def setPatienceUndefined: Self = StObject.set(x, "patience", js.undefined)
      
      inline def setRestoreBestWeights(value: Boolean): Self = StObject.set(x, "restoreBestWeights", value.asInstanceOf[js.Any])
      
      inline def setRestoreBestWeightsUndefined: Self = StObject.set(x, "restoreBestWeights", js.undefined)
      
      inline def setVerbose(value: Double): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
