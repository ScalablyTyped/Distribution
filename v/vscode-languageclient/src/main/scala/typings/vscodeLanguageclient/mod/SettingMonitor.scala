package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "SettingMonitor")
@js.native
class SettingMonitor protected () extends StObject {
  def this(_client: LanguageClient, _setting: String) = this()
  
  /* private */ var _client: js.Any = js.native
  
  /* private */ var _listeners: js.Any = js.native
  
  /* private */ var _setting: js.Any = js.native
  
  /* private */ var onDidChangeConfiguration: js.Any = js.native
  
  def start(): typings.vscode.mod.Disposable = js.native
}
