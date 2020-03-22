package typings.typedoc.mod.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.findConfigFile")
@js.native
object findConfigFile extends js.Object {
  def apply(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean]): js.UndefOr[String] = js.native
  def apply(searchPath: String, fileExists: js.Function1[/* fileName */ String, Boolean], configName: String): js.UndefOr[String] = js.native
}

