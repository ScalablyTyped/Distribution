package typings.vscodeLanguageclient.libCommonClientMod

import typings.vscode.mod.Diagnostic
import typings.vscode.mod.Uri
import typings.vscodeJsonrpc.libCommonConnectionMod.ProgressToken
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressBegin
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressEnd
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Middleware extends StObject {
  
  var handleDiagnostics: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* uri */ Uri, 
      /* diagnostics */ js.Array[Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      Unit
    ]
  ] = js.undefined
  
  var handleWorkDoneProgress: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* token */ ProgressToken, 
      /* params */ WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd, 
      /* next */ HandleWorkDoneProgressSignature, 
      Unit
    ]
  ] = js.undefined
  
  var window: js.UndefOr[WindowMiddleware] = js.undefined
  
  var workspace: js.UndefOr[WorkspaceMiddleware] = js.undefined
}
object _Middleware {
  
  inline def apply(): _Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Middleware]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _Middleware] (val x: Self) extends AnyVal {
    
    inline def setHandleDiagnostics(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* uri */ Uri, 
          /* diagnostics */ js.Array[Diagnostic], 
          /* next */ HandleDiagnosticsSignature, 
          Unit
        ]
    ): Self = StObject.set(x, "handleDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setHandleDiagnosticsUndefined: Self = StObject.set(x, "handleDiagnostics", js.undefined)
    
    inline def setHandleWorkDoneProgress(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* token */ ProgressToken, 
          /* params */ WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd, 
          /* next */ HandleWorkDoneProgressSignature, 
          Unit
        ]
    ): Self = StObject.set(x, "handleWorkDoneProgress", value.asInstanceOf[js.Any])
    
    inline def setHandleWorkDoneProgressUndefined: Self = StObject.set(x, "handleWorkDoneProgress", js.undefined)
    
    inline def setWindow(value: WindowMiddleware): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    inline def setWorkspace(value: WorkspaceMiddleware): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
  }
}
