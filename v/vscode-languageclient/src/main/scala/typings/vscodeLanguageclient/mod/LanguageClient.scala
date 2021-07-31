package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.clientMod.LanguageClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "LanguageClient")
@js.native
class LanguageClient protected ()
  extends typings.vscodeLanguageclient.clientMod.BaseLanguageClient {
  def this(name: String, serverOptions: ServerOptions, clientOptions: LanguageClientOptions) = this()
  def this(id: String, name: String, serverOptions: ServerOptions, clientOptions: LanguageClientOptions) = this()
  def this(
    name: String,
    serverOptions: ServerOptions,
    clientOptions: LanguageClientOptions,
    forceDebug: Boolean
  ) = this()
  def this(
    id: String,
    name: String,
    serverOptions: ServerOptions,
    clientOptions: LanguageClientOptions,
    forceDebug: Boolean
  ) = this()
  
  var _forceDebug: js.Any = js.native
  
  var _getServerWorkingDir: js.Any = js.native
  
  var _isDetached: js.Any = js.native
  
  var _mainGetRootPath: js.Any = js.native
  
  var _serverOptions: js.Any = js.native
  
  var _serverProcess: js.Any = js.native
  
  var checkProcessDied: js.Any = js.native
  
  var checkVersion: js.Any = js.native
  
  def registerProposedFeatures(): Unit = js.native
}
