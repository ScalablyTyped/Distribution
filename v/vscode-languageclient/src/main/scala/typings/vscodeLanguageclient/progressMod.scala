package typings.vscodeLanguageclient

import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.StaticFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod {
  
  @JSImport("vscode-languageclient/lib/common/progress", "ProgressFeature")
  @js.native
  open class ProgressFeature protected ()
    extends StObject
       with StaticFeature {
    def this(_client: FeatureClient[js.Object, js.Object]) = this()
    
    /* private */ var _client: Any = js.native
    
    /* private */ val activeParts: Any = js.native
    
    def initialize(): Unit = js.native
  }
}
