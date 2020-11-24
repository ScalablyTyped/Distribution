package typings.yaml.typesMod.AST

import typings.yaml.typesMod.Node
import typings.yaml.typesMod.YAMLSeq
import typings.yaml.utilMod.Type.FLOW_SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowSeq extends YAMLSeq {
  
  @JSName("cstNode")
  var cstNode_FlowSeq: js.UndefOr[typings.yaml.parseCstMod.CST.FlowSeq] = js.native
  
  @JSName("items")
  var items_FlowSeq: js.Array[Node] = js.native
  
  @JSName("type")
  var type_FlowSeq: FLOW_SEQ = js.native
}
