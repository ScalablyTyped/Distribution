package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "TraceFormat")
@js.native
object TraceFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.vscodeJsonrpc.mod.TraceFormat with String] = js.native
  
  /* "json" */ val JSON: typings.vscodeJsonrpc.mod.TraceFormat.JSON with String = js.native
  
  /* "text" */ val Text: typings.vscodeJsonrpc.mod.TraceFormat.Text with String = js.native
  
  def fromString(value: String): typings.vscodeJsonrpc.mod.TraceFormat = js.native
}
