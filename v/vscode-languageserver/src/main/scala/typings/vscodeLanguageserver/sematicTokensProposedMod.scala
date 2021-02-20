package typings.vscodeLanguageserver

import typings.vscodeLanguageserver.anon.On
import typings.vscodeLanguageserver.mod.Feature
import typings.vscodeLanguageserver.mod._Languages
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEdits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sematicTokensProposedMod {
  
  @JSImport("vscode-languageserver/lib/sematicTokens.proposed", "SemanticTokensBuilder")
  @js.native
  class SemanticTokensBuilder () extends StObject {
    
    var _data: js.Any = js.native
    
    var _dataLen: js.Any = js.native
    
    var _id: js.Any = js.native
    
    var _prevChar: js.Any = js.native
    
    var _prevData: js.Any = js.native
    
    var _prevLine: js.Any = js.native
    
    def build(): typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokens = js.native
    
    def buildEdits(): typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokens | SemanticTokensEdits = js.native
    
    def canBuildEdits(): Boolean = js.native
    
    def id: String = js.native
    
    var initialize: js.Any = js.native
    
    def previousResult(id: String): Unit = js.native
    
    def push(line: Double, char: Double, length: Double, tokenType: Double, tokenModifiers: Double): Unit = js.native
  }
  
  @JSImport("vscode-languageserver/lib/sematicTokens.proposed", "SemanticTokensFeature")
  @js.native
  val SemanticTokensFeature: Feature[_Languages, SemanticTokens] = js.native
  
  @js.native
  trait SemanticTokens extends StObject {
    
    var semanticTokens: On = js.native
  }
  object SemanticTokens {
    
    @scala.inline
    def apply(semanticTokens: On): SemanticTokens = {
      val __obj = js.Dynamic.literal(semanticTokens = semanticTokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokens]
    }
    
    @scala.inline
    implicit class SemanticTokensMutableBuilder[Self <: SemanticTokens] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSemanticTokens(value: On): Self = StObject.set(x, "semanticTokens", value.asInstanceOf[js.Any])
    }
  }
}
