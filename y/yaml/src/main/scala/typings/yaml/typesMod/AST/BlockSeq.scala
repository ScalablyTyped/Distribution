package typings.yaml.typesMod.AST

import typings.yaml.parseCstMod.CST.Seq
import typings.yaml.typesMod.Node
import typings.yaml.typesMod.YAMLSeq
import typings.yaml.utilMod.Type.SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockSeq extends YAMLSeq {
  @JSName("cstNode")
  var cstNode_BlockSeq: js.UndefOr[Seq] = js.native
  @JSName("items")
  var items_BlockSeq: js.Array[Node | Null] = js.native
  @JSName("type")
  var type_BlockSeq: SEQ = js.native
}

