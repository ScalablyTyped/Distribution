package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Diagnostic
import typings.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getConfigFileParsingDiagnostics")
@js.native
object getConfigFileParsingDiagnostics extends js.Object {
  
  def apply(configFileParseResult: ParsedCommandLine): js.Array[Diagnostic] = js.native
}
