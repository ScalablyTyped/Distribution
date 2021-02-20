package typings.vscodeLanguageclient

import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.StaticFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod {
  
  @JSImport("vscode-languageclient/lib/progress", "ProgressFeature")
  @js.native
  class ProgressFeature protected () extends StaticFeature {
    def this(_client: BaseLanguageClient) = this()
    
    var _client: js.Any = js.native
    
    def initialize(): Unit = js.native
  }
}
