package typings.yaml.mod

import typings.yaml.typesMod.Scalar
import typings.yaml.typesMod.YAMLMap
import typings.yaml.typesMod.YAMLSeq
import typings.yaml.yamlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "createNode")
@js.native
object createNode_true extends js.Object {
  def apply(value: js.Any, wrapScalars: `true`): YAMLMap | YAMLSeq | Scalar = js.native
  def apply(value: js.Any, wrapScalars: `true`, tag: String): YAMLMap | YAMLSeq | Scalar = js.native
}

