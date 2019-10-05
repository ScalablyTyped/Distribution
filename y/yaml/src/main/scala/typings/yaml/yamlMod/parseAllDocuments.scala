package typings.yaml.yamlMod

import typings.yaml.yamlMod.ast.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "parseAllDocuments")
@js.native
object parseAllDocuments extends js.Object {
  def apply(str: String): js.Array[Document] = js.native
  def apply(str: String, options: ParseOptions): js.Array[Document] = js.native
}

