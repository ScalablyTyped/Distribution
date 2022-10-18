package typings.vscodeLanguageclient.libCommonDiagnosticMod

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscode.mod.Uri
import typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.DocumentDiagnosticReport
import typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.PreviousResultId
import typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.ResultReporter
import typings.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.WorkspaceDiagnosticReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticProviderMiddleware extends StObject {
  
  var provideDiagnostics: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument | Uri, 
      /* previousResultId */ js.UndefOr[String], 
      /* token */ CancellationToken, 
      /* next */ ProvideDiagnosticSignature, 
      ProviderResult[DocumentDiagnosticReport]
    ]
  ] = js.undefined
  
  var provideWorkspaceDiagnostics: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* resultIds */ js.Array[PreviousResultId], 
      /* token */ CancellationToken, 
      /* resultReporter */ ResultReporter, 
      /* next */ ProvideWorkspaceDiagnosticSignature, 
      ProviderResult[WorkspaceDiagnosticReport]
    ]
  ] = js.undefined
}
object DiagnosticProviderMiddleware {
  
  inline def apply(): DiagnosticProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticProviderMiddleware]
  }
  
  extension [Self <: DiagnosticProviderMiddleware](x: Self) {
    
    inline def setProvideDiagnostics(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument | Uri, 
          /* previousResultId */ js.UndefOr[String], 
          /* token */ CancellationToken, 
          /* next */ ProvideDiagnosticSignature, 
          ProviderResult[DocumentDiagnosticReport]
        ]
    ): Self = StObject.set(x, "provideDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setProvideDiagnosticsUndefined: Self = StObject.set(x, "provideDiagnostics", js.undefined)
    
    inline def setProvideWorkspaceDiagnostics(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* resultIds */ js.Array[PreviousResultId], 
          /* token */ CancellationToken, 
          /* resultReporter */ ResultReporter, 
          /* next */ ProvideWorkspaceDiagnosticSignature, 
          ProviderResult[WorkspaceDiagnosticReport]
        ]
    ): Self = StObject.set(x, "provideWorkspaceDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setProvideWorkspaceDiagnosticsUndefined: Self = StObject.set(x, "provideWorkspaceDiagnostics", js.undefined)
  }
}
