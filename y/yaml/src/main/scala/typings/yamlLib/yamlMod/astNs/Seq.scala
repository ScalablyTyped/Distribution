package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seq extends SeqBase {
  @JSName("cstNode")
  var cstNode_Seq: js.UndefOr[yamlLib.yamlMod.cstNs.Seq] = js.undefined
  @JSName("items")
  var items_Seq: js.Array[AstNode | scala.Null]
  @JSName("type")
  var type_Seq: yamlLib.yamlLibStrings.SEQ
}

