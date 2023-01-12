package typings.tensorflowTfjsNode

import typings.tensorflowTfjs.mod.CustomCallback
import typings.tensorflowTfjs.mod.LayersModel
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.batch
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.epoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCallbacksMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/callbacks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/callbacks", "ProgbarLogger")
  @js.native
  /**
    * Construtor of LoggingCallback.
    */
  open class ProgbarLogger () extends CustomCallback {
    
    /* private */ val RENDER_THROTTLE_MS: Any = js.native
    
    /* private */ var batchesInLatestEpoch: Any = js.native
    
    /* private */ var currentEpochBegin: Any = js.native
    
    /* private */ var epochDurationMillis: Any = js.native
    
    /* private */ var formatLogsAsMetricsContent: Any = js.native
    
    /* private */ var isFieldRelevant: Any = js.native
    
    /* private */ var numTrainBatchesPerEpoch: Any = js.native
    
    /* private */ var progressBar: Any = js.native
    
    /* private */ var terminalWidth: Any = js.native
    
    /* private */ var usPerStep: Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node/dist/callbacks", "TensorBoardCallback")
  @js.native
  open class TensorBoardCallback () extends CustomCallback {
    def this(logdir: String) = this()
    def this(logdir: String, args: TensorBoardCallbackArgs) = this()
    def this(logdir: Unit, args: TensorBoardCallbackArgs) = this()
    
    /* private */ val args: Any = js.native
    
    /* private */ var batchesSeen: Any = js.native
    
    /* private */ var ensureTrainWriterCreated: Any = js.native
    
    /* private */ var ensureValWriterCreated: Any = js.native
    
    /* private */ var logMetrics: Any = js.native
    
    /* private */ var logWeights: Any = js.native
    
    val logdir: String = js.native
    
    /* private */ var model: Any = js.native
    
    def setModel(model: LayersModel): Unit = js.native
    
    /* private */ var trainWriter: Any = js.native
    
    /* private */ var valWriter: Any = js.native
  }
  
  inline def getDisplayDecimalPlaces(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayDecimalPlaces")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getSuccinctNumberDisplay(x: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuccinctNumberDisplay")(x.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object progressBarHelper {
    
    @JSImport("@tensorflow/tfjs-node/dist/callbacks", "progressBarHelper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-node/dist/callbacks", "progressBarHelper.ProgressBar")
    @js.native
    def ProgressBar: Any = js.native
    inline def ProgressBar_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProgressBar")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/callbacks", "progressBarHelper.log")
    @js.native
    def log: js.Function = js.native
    inline def log_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  }
  
  inline def tensorBoard(): TensorBoardCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("tensorBoard")().asInstanceOf[TensorBoardCallback]
  inline def tensorBoard(logdir: String): TensorBoardCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("tensorBoard")(logdir.asInstanceOf[js.Any]).asInstanceOf[TensorBoardCallback]
  inline def tensorBoard(logdir: String, args: TensorBoardCallbackArgs): TensorBoardCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorBoard")(logdir.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[TensorBoardCallback]
  inline def tensorBoard(logdir: Unit, args: TensorBoardCallbackArgs): TensorBoardCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorBoard")(logdir.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[TensorBoardCallback]
  
  trait TensorBoardCallbackArgs extends StObject {
    
    /**
      * The frequency (in epochs) at which to compute activation and weight
      * histograms for the layers of the model.
      *
      * If set to 0, histograms won't be computed.
      *
      * Validation data (or split) must be specified for histogram visualizations.
      *
      * Default: 0.
      */
    var histogramFreq: js.UndefOr[Double] = js.undefined
    
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
    
    inline def apply(): TensorBoardCallbackArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TensorBoardCallbackArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TensorBoardCallbackArgs] (val x: Self) extends AnyVal {
      
      inline def setHistogramFreq(value: Double): Self = StObject.set(x, "histogramFreq", value.asInstanceOf[js.Any])
      
      inline def setHistogramFreqUndefined: Self = StObject.set(x, "histogramFreq", js.undefined)
      
      inline def setUpdateFreq(value: batch | epoch): Self = StObject.set(x, "updateFreq", value.asInstanceOf[js.Any])
      
      inline def setUpdateFreqUndefined: Self = StObject.set(x, "updateFreq", js.undefined)
    }
  }
}
