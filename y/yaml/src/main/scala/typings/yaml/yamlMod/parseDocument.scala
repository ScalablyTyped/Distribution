package typings.yaml.yamlMod

import typings.yaml.yamlMod.ast.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "parseDocument")
@js.native
object parseDocument extends js.Object {
  def apply(str: String): Document = js.native
  def apply(str: String, options: ParseOptions): Document = js.native
}

