package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CancellationStrategy {
  
  @JSImport("vscode-languageserver", "CancellationStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageserver", "CancellationStrategy.Message")
  @js.native
  val Message: typings.vscodeJsonrpc.libCommonConnectionMod.CancellationStrategy = js.native
  
  inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.CancellationStrategy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.CancellationStrategy */ Boolean]
}
