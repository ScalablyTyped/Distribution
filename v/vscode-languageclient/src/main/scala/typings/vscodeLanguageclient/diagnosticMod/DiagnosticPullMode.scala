package typings.vscodeLanguageclient.diagnosticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticPullMode extends StObject
@JSImport("vscode-languageclient/lib/common/diagnostic", "DiagnosticPullMode")
@js.native
object DiagnosticPullMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DiagnosticPullMode & String] = js.native
  
  @js.native
  sealed trait onSave
    extends StObject
       with DiagnosticPullMode
  /* "onSave" */ val onSave: typings.vscodeLanguageclient.diagnosticMod.DiagnosticPullMode.onSave & String = js.native
  
  @js.native
  sealed trait onType
    extends StObject
       with DiagnosticPullMode
  /* "onType" */ val onType: typings.vscodeLanguageclient.diagnosticMod.DiagnosticPullMode.onType & String = js.native
}
