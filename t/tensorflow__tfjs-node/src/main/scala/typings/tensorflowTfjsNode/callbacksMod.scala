package typings.tensorflowTfjsNode

import typings.tensorflowTfjs.mod.CustomCallback
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.batch
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.epoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbacksMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/callbacks", "ProgbarLogger")
  @js.native
  /**
    * Construtor of LoggingCallback.
    */
  class ProgbarLogger () extends CustomCallback {
    
    val RENDER_THROTTLE_MS: js.Any = js.native
    
    var batchesInLatestEpoch: js.Any = js.native
    
    var currentEpochBegin: js.Any = js.native
    
    var epochDurationMillis: js.Any = js.native
    
    var formatLogsAsMetricsContent: js.Any = js.native
    
    var isFieldRelevant: js.Any = js.native
    
    var numTrainBatchesPerEpoch: js.Any = js.native
    
    var progressBar: js.Any = js.native
    
    var terminalWidth: js.Any = js.native
    
    var usPerStep: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node/dist/callbacks", "TensorBoardCallback")
  @js.native
  class TensorBoardCallback () extends CustomCallback {
    def this(logdir: String) = this()
    def this(logdir: js.UndefOr[scala.Nothing], args: TensorBoardCallbackArgs) = this()
    def this(logdir: String, args: TensorBoardCallbackArgs) = this()
    
    val args: js.Any = js.native
    
    var batchesSeen: js.Any = js.native
    
    var ensureTrainWriterCreated: js.Any = js.native
    
    var ensureValWriterCreated: js.Any = js.native
    
    var logMetrics: js.Any = js.native
    
    val logdir: String = js.native
    
    var trainWriter: js.Any = js.native
    
    var valWriter: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node/dist/callbacks", "getDisplayDecimalPlaces")
  @js.native
  def getDisplayDecimalPlaces(x: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/callbacks", "getSuccinctNumberDisplay")
  @js.native
  def getSuccinctNumberDisplay(x: Double): String = js.native
  
  object progressBarHelper {
    
    @JSImport("@tensorflow/tfjs-node/dist/callbacks", "progressBarHelper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-node/dist/callbacks", "progressBarHelper.ProgressBar")
    @js.native
    def ProgressBar: js.Any = js.native
    @scala.inline
    def ProgressBar_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProgressBar")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/callbacks", "progressBarHelper.log")
    @js.native
    def log: js.Function = js.native
    @scala.inline
    def log_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-node/dist/callbacks", "tensorBoard")
  @js.native
  def tensorBoard(): TensorBoardCallback = js.native
  @JSImport("@tensorflow/tfjs-node/dist/callbacks", "tensorBoard")
  @js.native
  def tensorBoard(logdir: js.UndefOr[scala.Nothing], args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
  @JSImport("@tensorflow/tfjs-node/dist/callbacks", "tensorBoard")
  @js.native
  def tensorBoard(logdir: String): TensorBoardCallback = js.native
  @JSImport("@tensorflow/tfjs-node/dist/callbacks", "tensorBoard")
  @js.native
  def tensorBoard(logdir: String, args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
  
  @js.native
  trait TensorBoardCallbackArgs extends StObject {
    
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
    implicit class TensorBoardCallbackArgsMutableBuilder[Self <: TensorBoardCallbackArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdateFreq(value: batch | epoch): Self = StObject.set(x, "updateFreq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateFreqUndefined: Self = StObject.set(x, "updateFreq", js.undefined)
    }
  }
}
