package typings.tensorflowTfjsConverter.operationsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.compiledApiMod.ISignatureDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph extends js.Object {
  var inputs: js.Array[Node]
  var nodes: StringDictionary[Node]
  var outputs: js.Array[Node]
  var placeholders: js.Array[Node]
  var signature: js.UndefOr[ISignatureDef] = js.undefined
  var weights: js.Array[Node]
}

object Graph {
  @scala.inline
  def apply(
    inputs: js.Array[Node],
    nodes: StringDictionary[Node],
    outputs: js.Array[Node],
    placeholders: js.Array[Node],
    weights: js.Array[Node],
    signature: ISignatureDef = null
  ): Graph = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], placeholders = placeholders.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
}

