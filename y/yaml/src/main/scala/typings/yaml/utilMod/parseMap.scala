package typings.yaml.utilMod

import typings.yaml.mod.Document
import typings.yaml.parseCstMod.CST.FlowMap
import typings.yaml.parseCstMod.CST.Map
import typings.yaml.typesMod.AST.BlockMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml/util", "parseMap")
@js.native
object parseMap extends js.Object {
  def apply(doc: Document, cst: FlowMap): typings.yaml.typesMod.AST.FlowMap = js.native
  def apply(doc: Document, cst: Map): BlockMap = js.native
}

