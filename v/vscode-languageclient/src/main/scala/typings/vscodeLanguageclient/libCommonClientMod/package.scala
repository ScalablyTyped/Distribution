package typings.vscodeLanguageclient.libCommonClientMod

import typings.vscode.mod.Diagnostic
import typings.vscode.mod.Uri
import typings.vscodeJsonrpc.libCommonConnectionMod.ProgressToken
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressBegin
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressEnd
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressReport
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.FileEvent
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeError
import typings.vscodeLanguageserverProtocol.mod.ResponseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DidChangeWatchedFileSignature = js.ThisFunction1[/* this */ Unit, /* event */ FileEvent, js.Promise[Unit]]

type HandleDiagnosticsSignature = js.ThisFunction2[/* this */ Unit, /* uri */ Uri, /* diagnostics */ js.Array[Diagnostic], Unit]

type HandleWorkDoneProgressSignature = js.ThisFunction2[
/* this */ Unit, 
/* token */ ProgressToken, 
/* params */ WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd, 
Unit]

type InitializationFailedHandler = /**
  * @param error The error returned from the server
  * @returns if true is returned the client tries to reinitialize the server.
  *  Implementors of a handler are responsible to not initialize the server
  *  infinitely. Return false if initialization should stop and an error
  *  should be reported.
  */
js.Function1[/* error */ ResponseError[InitializeError] | js.Error | Any, Boolean]

type WindowMiddleware = _WindowMiddleware
