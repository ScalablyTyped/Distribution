package typings.tensorflowTfjsLayers.distLayersRecurrentMod

import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseRNNLayerArgs
  extends StObject
     with LayerArgs {
  
  /**
    * A RNN cell instance. A RNN cell is a class that has:
    *   - a `call()` method, which takes `[Tensor, Tensor]` as the
    *     first input argument. The first item is the input at time t, and
    *     second item is the cell state at time t.
    *     The `call()` method returns `[outputAtT, statesAtTPlus1]`.
    *     The `call()` method of the cell can also take the argument `constants`,
    *     see section "Note on passing external constants" below.
    *     Porting Node: PyKeras overrides the `call()` signature of RNN cells,
    *       which are Layer subtypes, to accept two arguments. tfjs-layers does
    *       not do such overriding. Instead we preseve the `call()` signature,
    *       which due to its `Tensor|Tensor[]` argument and return value is
    *       flexible enough to handle the inputs and states.
    *   - a `stateSize` attribute. This can be a single integer (single state)
    *     in which case it is the size of the recurrent state (which should be
    *     the same as the size of the cell output). This can also be an Array of
    *     integers (one size per state). In this case, the first entry
    *     (`stateSize[0]`) should be the same as the size of the cell output.
    * It is also possible for `cell` to be a list of RNN cell instances, in which
    * case the cells get stacked on after the other in the RNN, implementing an
    * efficient stacked RNN.
    */
  var cell: js.UndefOr[RNNCell | js.Array[RNNCell]] = js.undefined
  
  /**
    * If `true`, process the input sequence backwards and return the reversed
    * sequence (default: `false`).
    */
  var goBackwards: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Dimensionality of the input (integer).
    *   This option (or alternatively, the option `inputShape`) is required when
    *   this layer is used as the first layer in a model.
    */
  var inputDim: js.UndefOr[Double] = js.undefined
  
  /**
    * Length of the input sequences, to be specified when it is constant.
    * This argument is required if you are going to connect `Flatten` then
    * `Dense` layers upstream (without it, the shape of the dense outputs cannot
    * be computed). Note that if the recurrent layer is not the first layer in
    * your model, you would need to specify the input length at the level of the
    * first layer (e.g., via the `inputShape` option).
    */
  var inputLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to return the last output in the output sequence, or the full
    * sequence.
    */
  var returnSequences: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to return the last state in addition to the output.
    */
  var returnState: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the last state for each sample at index i in a batch will be
    * used as initial state of the sample of index i in the following batch
    * (default: `false`).
    *
    * You can set RNN layers to be "stateful", which means that the states
    * computed for the samples in one batch will be reused as initial states
    * for the samples in the next batch. This assumes a one-to-one mapping
    * between samples in different successive batches.
    *
    * To enable "statefulness":
    *   - specify `stateful: true` in the layer constructor.
    *   - specify a fixed batch size for your model, by passing
    *     - if sequential model:
    *       `batchInputShape: [...]` to the first layer in your model.
    *     - else for functional model with 1 or more Input layers:
    *       `batchShape: [...]` to all the first layers in your model.
    *     This is the expected shape of your inputs
    *     *including the batch size*.
    *     It should be a tuple of integers, e.g., `[32, 10, 100]`.
    *   - specify `shuffle: false` when calling `LayersModel.fit()`.
    *
    * To reset the state of your model, call `resetStates()` on either the
    * specific layer or on the entire model.
    */
  var stateful: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the network will be unrolled, else a symbolic loop will be
    * used. Unrolling can speed up a RNN, although it tends to be more
    * memory-intensive. Unrolling is only suitable for short sequences (default:
    * `false`).
    * Porting Note: tfjs-layers has an imperative backend. RNNs are executed with
    *   normal TypeScript control flow. Hence this property is inapplicable and
    *   ignored in tfjs-layers.
    */
  var unroll: js.UndefOr[Boolean] = js.undefined
}
object BaseRNNLayerArgs {
  
  inline def apply(): BaseRNNLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRNNLayerArgs]
  }
  
  extension [Self <: BaseRNNLayerArgs](x: Self) {
    
    inline def setCell(value: RNNCell | js.Array[RNNCell]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    inline def setCellVarargs(value: RNNCell*): Self = StObject.set(x, "cell", js.Array(value*))
    
    inline def setGoBackwards(value: Boolean): Self = StObject.set(x, "goBackwards", value.asInstanceOf[js.Any])
    
    inline def setGoBackwardsUndefined: Self = StObject.set(x, "goBackwards", js.undefined)
    
    inline def setInputDim(value: Double): Self = StObject.set(x, "inputDim", value.asInstanceOf[js.Any])
    
    inline def setInputDimUndefined: Self = StObject.set(x, "inputDim", js.undefined)
    
    inline def setInputLength(value: Double): Self = StObject.set(x, "inputLength", value.asInstanceOf[js.Any])
    
    inline def setInputLengthUndefined: Self = StObject.set(x, "inputLength", js.undefined)
    
    inline def setReturnSequences(value: Boolean): Self = StObject.set(x, "returnSequences", value.asInstanceOf[js.Any])
    
    inline def setReturnSequencesUndefined: Self = StObject.set(x, "returnSequences", js.undefined)
    
    inline def setReturnState(value: Boolean): Self = StObject.set(x, "returnState", value.asInstanceOf[js.Any])
    
    inline def setReturnStateUndefined: Self = StObject.set(x, "returnState", js.undefined)
    
    inline def setStateful(value: Boolean): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
    
    inline def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
    
    inline def setUnroll(value: Boolean): Self = StObject.set(x, "unroll", value.asInstanceOf[js.Any])
    
    inline def setUnrollUndefined: Self = StObject.set(x, "unroll", js.undefined)
  }
}
