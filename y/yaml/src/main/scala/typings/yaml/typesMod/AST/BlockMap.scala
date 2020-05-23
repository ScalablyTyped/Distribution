package typings.yaml.typesMod.AST

import typings.yaml.parseCstMod.CST.Map
import typings.yaml.typesMod.YAMLMap
import typings.yaml.utilMod.Type.MAP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockMap extends YAMLMap {
  @JSName("cstNode")
  var cstNode_BlockMap: js.UndefOr[Map] = js.native
  @JSName("type")
  var type_BlockMap: MAP = js.native
}

