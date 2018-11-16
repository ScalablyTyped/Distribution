package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FlowSeq extends SeqBase {
  @JSName("cstNode")
  var cstNode_FlowSeq: js.UndefOr[yamlLib.yamlMod.cstNs.FlowSeq] = js.undefined
  @JSName("items")
  var items_FlowSeq: js.Array[AstNode | Pair]
  @JSName("type")
  var type_FlowSeq: yamlLib.yamlLibStrings.FLOW_SEQ
}

