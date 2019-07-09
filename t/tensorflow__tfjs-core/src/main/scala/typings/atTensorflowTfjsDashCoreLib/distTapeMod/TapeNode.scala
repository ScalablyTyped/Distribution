package typings
package atTensorflowTfjsDashCoreLib.distTapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapeNode extends js.Object {
  var gradient: js.UndefOr[
    js.Function1[
      /* dy */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
        atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ]), 
      NamedGradientMap
    ]
  ] = js.undefined
  var id: scala.Double
  var inputs: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap
  var name: java.lang.String
  var outputs: js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]
  var saved: js.UndefOr[
    js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.undefined
}

object TapeNode {
  @scala.inline
  def apply(
    id: scala.Double,
    inputs: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap,
    name: java.lang.String,
    outputs: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    gradient: /* dy */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]) => NamedGradientMap = null,
    saved: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): TapeNode = {
    val __obj = js.Dynamic.literal(id = id, inputs = inputs, name = name, outputs = outputs)
    if (gradient != null) __obj.updateDynamic("gradient")(js.Any.fromFunction1(gradient))
    if (saved != null) __obj.updateDynamic("saved")(saved)
    __obj.asInstanceOf[TapeNode]
  }
}

