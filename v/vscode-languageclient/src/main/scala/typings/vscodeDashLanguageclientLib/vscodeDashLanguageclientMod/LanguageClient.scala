package typings
package vscodeDashLanguageclientLib.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "LanguageClient")
@js.native
class LanguageClient protected ()
  extends vscodeDashLanguageclientLib.libClientMod.BaseLanguageClient {
  def this(name: java.lang.String, serverOptions: ServerOptions, clientOptions: vscodeDashLanguageclientLib.libClientMod.LanguageClientOptions) = this()
  def this(id: java.lang.String, name: java.lang.String, serverOptions: ServerOptions, clientOptions: vscodeDashLanguageclientLib.libClientMod.LanguageClientOptions) = this()
  def this(name: java.lang.String, serverOptions: ServerOptions, clientOptions: vscodeDashLanguageclientLib.libClientMod.LanguageClientOptions, forceDebug: scala.Boolean) = this()
  def this(id: java.lang.String, name: java.lang.String, serverOptions: ServerOptions, clientOptions: vscodeDashLanguageclientLib.libClientMod.LanguageClientOptions, forceDebug: scala.Boolean) = this()
  var _forceDebug: js.Any = js.native
  var _getServerWorkingDir: js.Any = js.native
  var _isDetached: js.Any = js.native
  var _mainGetRootPath: js.Any = js.native
  var _serverOptions: js.Any = js.native
  var _serverProcess: js.Any = js.native
  var checkProcessDied: js.Any = js.native
  var checkVersion: js.Any = js.native
  def registerProposedFeatures(): scala.Unit = js.native
}

