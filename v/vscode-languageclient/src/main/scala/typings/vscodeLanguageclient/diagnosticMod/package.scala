package typings.vscodeLanguageclient.diagnosticMod

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscode.mod.Uri
import typings.vscodeLanguageclient.diagnosticMod.vsdiag.DocumentDiagnosticReport
import typings.vscodeLanguageclient.diagnosticMod.vsdiag.PreviousResultId
import typings.vscodeLanguageclient.diagnosticMod.vsdiag.ResultReporter
import typings.vscodeLanguageclient.diagnosticMod.vsdiag.WorkspaceDiagnosticReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ProvideDiagnosticSignature = js.ThisFunction3[
/* this */ Unit, 
/* document */ TextDocument | Uri, 
/* previousResultId */ js.UndefOr[String], 
/* token */ CancellationToken, 
ProviderResult[DocumentDiagnosticReport]]

type ProvideWorkspaceDiagnosticSignature = js.ThisFunction3[
/* this */ Unit, 
/* resultIds */ js.Array[PreviousResultId], 
/* token */ CancellationToken, 
/* resultReporter */ ResultReporter, 
ProviderResult[WorkspaceDiagnosticReport]]
