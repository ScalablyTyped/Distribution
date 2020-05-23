package typings.yaml.typesMod.AST

import typings.yaml.typesMod.YAMLMap
import typings.yaml.utilMod.Type.FLOW_MAP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowMap extends YAMLMap {
  @JSName("cstNode")
  var cstNode_FlowMap: js.UndefOr[typings.yaml.parseCstMod.CST.FlowMap] = js.native
  @JSName("type")
  var type_FlowMap: FLOW_MAP = js.native
}

