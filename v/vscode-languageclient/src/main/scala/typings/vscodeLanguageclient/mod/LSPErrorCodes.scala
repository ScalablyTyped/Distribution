package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LSPErrorCodes {
  
  /**
    * The server detected that the content of a document got
    * modified outside normal conditions. A server should
    * NOT send this error code if it detects a content change
    * in it unprocessed messages. The result even computed
    * on an older state might still be useful for the client.
    *
    * If a client decides that a result is not of any use anymore
    * the client should cancel the request.
    */
  @JSImport("vscode-languageclient", "LSPErrorCodes.ContentModified")
  @js.native
  val ContentModified: typings.vscodeLanguageserverTypes.mod.integer = js.native
  
  /**
    * The client has canceled a request and a server as detected
    * the cancel.
    */
  @JSImport("vscode-languageclient", "LSPErrorCodes.RequestCancelled")
  @js.native
  val RequestCancelled: typings.vscodeLanguageserverTypes.mod.integer = js.native
  
  /**
    * A request failed but it was syntactically correct, e.g the
    * method name was known and the parameters were valid. The error
    * message should contain human readable information about why
    * the request failed.
    *
    * @since 3.17.0
    */
  @JSImport("vscode-languageclient", "LSPErrorCodes.RequestFailed")
  @js.native
  val RequestFailed: typings.vscodeLanguageserverTypes.mod.integer = js.native
  
  /**
    * The server cancelled the request. This error code should
    * only be used for requests that explicitly support being
    * server cancellable.
    *
    * @since 3.17.0
    */
  @JSImport("vscode-languageclient", "LSPErrorCodes.ServerCancelled")
  @js.native
  val ServerCancelled: typings.vscodeLanguageserverTypes.mod.integer = js.native
  
  /**
    * This is the end range of LSP reserved error codes.
    * It doesn't denote a real error code.
    *
    * @since 3.16.0
    */
  @JSImport("vscode-languageclient", "LSPErrorCodes.lspReservedErrorRangeEnd")
  @js.native
  val lspReservedErrorRangeEnd: typings.vscodeLanguageserverTypes.mod.integer = js.native
  
  /**
    * This is the start range of LSP reserved error codes.
    * It doesn't denote a real error code.
    *
    * @since 3.16.0
    */
  @JSImport("vscode-languageclient", "LSPErrorCodes.lspReservedErrorRangeStart")
  @js.native
  val lspReservedErrorRangeStart: typings.vscodeLanguageserverTypes.mod.integer = js.native
}
