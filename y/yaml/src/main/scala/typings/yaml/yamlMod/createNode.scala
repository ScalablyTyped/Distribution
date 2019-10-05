package typings.yaml.yamlMod

import typings.yaml.yamlMod.ast.MapBase
import typings.yaml.yamlMod.ast.Scalar
import typings.yaml.yamlMod.ast.SeqBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "createNode")
@js.native
object createNode extends js.Object {
  def apply(value: js.Any): MapBase | SeqBase | Scalar = js.native
}

