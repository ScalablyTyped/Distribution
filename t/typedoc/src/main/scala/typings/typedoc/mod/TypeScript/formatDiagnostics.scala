package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Diagnostic
import typings.typescript.mod.FormatDiagnosticsHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.formatDiagnostics")
@js.native
object formatDiagnostics extends js.Object {
  
  def apply(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = js.native
}
