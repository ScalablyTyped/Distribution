package typings.yaml.mod

import typings.yaml.mod.ast.MapBase
import typings.yaml.mod.ast.Scalar
import typings.yaml.mod.ast.SeqBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "createNode")
@js.native
object createNode extends js.Object {
  def apply(value: js.Any): MapBase | SeqBase | Scalar = js.native
}

