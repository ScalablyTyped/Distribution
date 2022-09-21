package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.anon.Constants
import typings.tensorflowTfjsLayers.anon.Count
import typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction
import typings.tensorflowTfjsLayers.recurrentMod.^
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def generateDropoutMask(args: Count): Tensor[Rank] | js.Array[Tensor[Rank]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDropoutMask")(args.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank] | js.Array[Tensor[Rank]]]

inline def rnn(stepFunction: RnnStepFunction, inputs: Tensor[Rank], initialStates: js.Array[Tensor[Rank]]): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Unit,
  constants: js.Array[Tensor[Rank]]
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Unit,
  constants: js.Array[Tensor[Rank]],
  unroll: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Unit,
  constants: js.Array[Tensor[Rank]],
  unroll: Boolean,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Unit,
  constants: js.Array[Tensor[Rank]],
  unroll: Unit,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Unit,
  constants: Unit,
  unroll: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Unit,
  constants: Unit,
  unroll: Boolean,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Unit,
  constants: Unit,
  unroll: Unit,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Tensor[Rank]
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Tensor[Rank],
  constants: js.Array[Tensor[Rank]]
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Tensor[Rank],
  constants: js.Array[Tensor[Rank]],
  unroll: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Tensor[Rank],
  constants: js.Array[Tensor[Rank]],
  unroll: Boolean,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Tensor[Rank],
  constants: js.Array[Tensor[Rank]],
  unroll: Unit,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Tensor[Rank],
  constants: Unit,
  unroll: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Tensor[Rank],
  constants: Unit,
  unroll: Boolean,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Boolean,
  mask: Tensor[Rank],
  constants: Unit,
  unroll: Unit,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Unit,
  constants: js.Array[Tensor[Rank]]
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Unit,
  constants: js.Array[Tensor[Rank]],
  unroll: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Unit,
  constants: js.Array[Tensor[Rank]],
  unroll: Boolean,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Unit,
  constants: js.Array[Tensor[Rank]],
  unroll: Unit,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Unit,
  constants: Unit,
  unroll: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Unit,
  constants: Unit,
  unroll: Boolean,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Unit,
  constants: Unit,
  unroll: Unit,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Tensor[Rank]
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Tensor[Rank],
  constants: js.Array[Tensor[Rank]]
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Tensor[Rank],
  constants: js.Array[Tensor[Rank]],
  unroll: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Tensor[Rank],
  constants: js.Array[Tensor[Rank]],
  unroll: Boolean,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Tensor[Rank],
  constants: js.Array[Tensor[Rank]],
  unroll: Unit,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Tensor[Rank],
  constants: Unit,
  unroll: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Tensor[Rank],
  constants: Unit,
  unroll: Boolean,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]
inline def rnn(
  stepFunction: RnnStepFunction,
  inputs: Tensor[Rank],
  initialStates: js.Array[Tensor[Rank]],
  goBackwards: Unit,
  mask: Tensor[Rank],
  constants: Unit,
  unroll: Unit,
  needPerStepOutputs: Boolean
): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]]]

inline def standardizeArgs(
  inputs: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor,
  initialState: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor,
  constants: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor,
  numConstants: js.UndefOr[Double]
): Constants = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeArgs")(inputs.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], numConstants.asInstanceOf[js.Any])).asInstanceOf[Constants]
