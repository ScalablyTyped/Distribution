package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowCollection extends Node {
  var items: js.Array[FlowChar | Comment | Alias | Scalar | FlowCollection]
  @JSName("type")
  var type_FlowCollection: yamlLib.yamlLibStrings.FLOW_MAP | yamlLib.yamlLibStrings.FLOW_SEQ
}

