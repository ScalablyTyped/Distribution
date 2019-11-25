package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "SettingMonitor")
@js.native
class SettingMonitor protected () extends js.Object {
  def this(_client: LanguageClient, _setting: String) = this()
  var _client: js.Any = js.native
  var _listeners: js.Any = js.native
  var _setting: js.Any = js.native
  var onDidChangeConfiguration: js.Any = js.native
  def start(): typings.vscode.vscodeMod.Disposable = js.native
}

