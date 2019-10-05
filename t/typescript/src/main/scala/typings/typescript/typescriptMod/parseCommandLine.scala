package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "parseCommandLine")
@js.native
object parseCommandLine extends js.Object {
  def apply(commandLine: js.Array[String]): ParsedCommandLine = js.native
  def apply(commandLine: js.Array[String], readFile: js.Function1[/* path */ String, js.UndefOr[String]]): ParsedCommandLine = js.native
}

