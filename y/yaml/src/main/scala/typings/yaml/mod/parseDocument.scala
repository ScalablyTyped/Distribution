package typings.yaml.mod

import typings.yaml.mod.Document.Parsed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "parseDocument")
@js.native
object parseDocument extends js.Object {
  def apply(str: String): Parsed = js.native
  def apply(str: String, options: Options): Parsed = js.native
}

