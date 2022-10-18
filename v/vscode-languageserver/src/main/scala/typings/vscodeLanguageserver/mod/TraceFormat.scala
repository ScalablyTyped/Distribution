package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "TraceFormat")
@js.native
object TraceFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.vscodeJsonrpc.libCommonConnectionMod.TraceFormat & String] = js.native
  
  /* "json" */ val JSON: typings.vscodeJsonrpc.libCommonConnectionMod.TraceFormat.JSON & String = js.native
  
  /* "text" */ val Text: typings.vscodeJsonrpc.libCommonConnectionMod.TraceFormat.Text & String = js.native
  
  def fromString(value: String): typings.vscodeJsonrpc.libCommonConnectionMod.TraceFormat = js.native
}
