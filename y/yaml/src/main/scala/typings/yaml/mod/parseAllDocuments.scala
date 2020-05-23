package typings.yaml.mod

import typings.yaml.mod.Document.Parsed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "parseAllDocuments")
@js.native
object parseAllDocuments extends js.Object {
  def apply(str: String): js.Array[Parsed] = js.native
  def apply(str: String, options: Options): js.Array[Parsed] = js.native
}

