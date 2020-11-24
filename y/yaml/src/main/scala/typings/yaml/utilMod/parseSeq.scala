package typings.yaml.utilMod

import typings.yaml.mod.Document
import typings.yaml.parseCstMod.CST.FlowSeq
import typings.yaml.parseCstMod.CST.Seq
import typings.yaml.typesMod.AST.BlockSeq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/util", "parseSeq")
@js.native
object parseSeq extends js.Object {
  
  def apply(doc: Document, cst: FlowSeq): typings.yaml.typesMod.AST.FlowSeq = js.native
  def apply(doc: Document, cst: Seq): BlockSeq = js.native
}
