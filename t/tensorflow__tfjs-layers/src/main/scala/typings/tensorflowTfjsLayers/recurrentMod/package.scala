package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object recurrentMod {
  
  @scala.inline
  def generateDropoutMask(args: typings.tensorflowTfjsLayers.anon.Count): typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ]) = typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateDropoutMask")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ])]
  
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
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
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
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
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
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
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
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
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
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
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
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
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
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
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
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
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
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
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
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
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
    ]
  ] = (typings.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  
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
}
