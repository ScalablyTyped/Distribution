package typings
package atTensorflowTfjsDashConverterLib.distSrcOperationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph extends js.Object {
  var inputs: js.Array[Node]
  var nodes: org.scalablytyped.runtime.StringDictionary[Node]
  var outputs: js.Array[Node]
  var placeholders: js.Array[Node]
  var weights: js.Array[Node]
}

object Graph {
  @scala.inline
  def apply(
    inputs: js.Array[Node],
    nodes: org.scalablytyped.runtime.StringDictionary[Node],
    outputs: js.Array[Node],
    placeholders: js.Array[Node],
    weights: js.Array[Node]
  ): Graph = {
    val __obj = js.Dynamic.literal(inputs = inputs, nodes = nodes, outputs = outputs, placeholders = placeholders, weights = weights)
  
    __obj.asInstanceOf[Graph]
  }
}

