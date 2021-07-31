package typings.tensorflowTfjsLayers.recurrentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def generateDropoutMask(args: typings.tensorflowTfjsLayers.anon.Count): typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]) = typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateDropoutMask")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]])]

@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: scala.Unit,
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: scala.Unit,
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: scala.Unit,
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Boolean,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: scala.Unit,
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Unit,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: scala.Unit,
  constants: scala.Unit,
  unroll: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: scala.Unit,
  constants: scala.Unit,
  unroll: scala.Boolean,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: scala.Unit,
  constants: scala.Unit,
  unroll: scala.Unit,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Boolean,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Unit,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: scala.Unit,
  unroll: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: scala.Unit,
  unroll: scala.Boolean,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Boolean,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: scala.Unit,
  unroll: scala.Unit,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: scala.Unit,
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: scala.Unit,
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: scala.Unit,
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Boolean,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: scala.Unit,
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Unit,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: scala.Unit,
  constants: scala.Unit,
  unroll: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: scala.Unit,
  constants: scala.Unit,
  unroll: scala.Boolean,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: scala.Unit,
  constants: scala.Unit,
  unroll: scala.Unit,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Boolean,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  unroll: scala.Unit,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: scala.Unit,
  unroll: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: scala.Unit,
  unroll: scala.Boolean,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]
@scala.inline
def rnn(
  stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  initialStates: js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
],
  goBackwards: scala.Unit,
  mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
  constants: scala.Unit,
  unroll: scala.Unit,
  needPerStepOutputs: scala.Boolean
): js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
js.Array[
  typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]]]

@scala.inline
def standardizeArgs(
  inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
  typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor | typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]) | typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor,
  initialState: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
  typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor | typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]) | typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor,
  constants: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
  typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor | typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
]) | typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor,
  numConstants: js.UndefOr[scala.Double]
): typings.tensorflowTfjsLayers.anon.Constants = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("standardizeArgs")(inputs.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], numConstants.asInstanceOf[js.Any])).asInstanceOf[typings.tensorflowTfjsLayers.anon.Constants]
