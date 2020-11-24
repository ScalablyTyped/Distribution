package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.parseCommandLine")
@js.native
object parseCommandLine extends js.Object {
  
  def apply(commandLine: js.Array[String]): ParsedCommandLine = js.native
  def apply(commandLine: js.Array[String], readFile: js.Function1[/* path */ String, js.UndefOr[String]]): ParsedCommandLine = js.native
}
