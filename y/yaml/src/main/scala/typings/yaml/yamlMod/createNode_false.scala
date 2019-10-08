package typings.yaml.yamlMod

import typings.yaml.yamlMod.ast.MapBase
import typings.yaml.yamlMod.ast.SeqBase
import typings.yaml.yamlNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "createNode")
@js.native
object createNode_false extends js.Object {
  def apply(value: js.Any, wrapScalars: `false`): MapBase | SeqBase | String | Double | Boolean | Null = js.native
  def apply(value: js.Any, wrapScalars: `false`, tag: String): MapBase | SeqBase | String | Double | Boolean | Null = js.native
}

