package typings
package atTensorflowTfjsDashConverterLib.distSrcOperationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphNode extends js.Object {
  var attrs: org.scalablytyped.runtime.StringDictionary[ValueType]
  var inputs: js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]
}

object GraphNode {
  @scala.inline
  def apply(
    attrs: org.scalablytyped.runtime.StringDictionary[ValueType],
    inputs: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): GraphNode = {
    val __obj = js.Dynamic.literal(attrs = attrs, inputs = inputs)
  
    __obj.asInstanceOf[GraphNode]
  }
}

