package typings.yaml.mod

import typings.yaml.typesMod.YAMLMap
import typings.yaml.typesMod.YAMLSeq
import typings.yaml.yamlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml", "createNode")
@js.native
object createNode_false extends js.Object {
  
  def apply(value: js.Any, wrapScalars: `false`): YAMLMap | YAMLSeq | String | Double | Boolean | Null = js.native
  def apply(value: js.Any, wrapScalars: `false`, tag: String): YAMLMap | YAMLSeq | String | Double | Boolean | Null = js.native
}
