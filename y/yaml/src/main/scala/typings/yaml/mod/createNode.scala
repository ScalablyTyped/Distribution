package typings.yaml.mod

import typings.yaml.typesMod.Scalar
import typings.yaml.typesMod.YAMLMap
import typings.yaml.typesMod.YAMLSeq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml", "createNode")
@js.native
object createNode extends js.Object {
  
  def apply(value: js.Any): YAMLMap | YAMLSeq | Scalar = js.native
  def apply(value: js.Any, wrapScalars: js.UndefOr[scala.Nothing], tag: String): YAMLMap | YAMLSeq | Scalar = js.native
}
