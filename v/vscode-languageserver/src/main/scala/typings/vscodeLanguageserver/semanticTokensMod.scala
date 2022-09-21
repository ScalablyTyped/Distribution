package typings.vscodeLanguageserver

import typings.vscodeLanguageserver.anon.OnDelta
import typings.vscodeLanguageserver.serverMod.Feature
import typings.vscodeLanguageserver.serverMod._Languages
import typings.vscodeLanguageserverTypes.mod.SemanticTokens
import typings.vscodeLanguageserverTypes.mod.SemanticTokensDelta
import typings.vscodeLanguageserverTypes.mod.SemanticTokensEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semanticTokensMod {
  
  @JSImport("vscode-languageserver/lib/common/semanticTokens", "SemanticTokensBuilder")
  @js.native
  open class SemanticTokensBuilder () extends StObject {
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _dataLen: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _prevChar: Any = js.native
    
    /* private */ var _prevData: Any = js.native
    
    /* private */ var _prevLine: Any = js.native
    
    def build(): SemanticTokens = js.native
    
    def buildEdits(): SemanticTokens | SemanticTokensDelta = js.native
    
    def canBuildEdits(): Boolean = js.native
    
    def id: String = js.native
    
    /* private */ var initialize: Any = js.native
    
    def previousResult(id: String): Unit = js.native
    
    def push(line: Double, char: Double, length: Double, tokenType: Double, tokenModifiers: Double): Unit = js.native
  }
  
  @JSImport("vscode-languageserver/lib/common/semanticTokens", "SemanticTokensDiff")
  @js.native
  open class SemanticTokensDiff protected () extends StObject {
    def this(originalSequence: js.Array[Double], modifiedSequence: js.Array[Double]) = this()
    
    def computeDiff(): js.Array[SemanticTokensEdit] = js.native
    
    /* private */ val modifiedSequence: Any = js.native
    
    /* private */ val originalSequence: Any = js.native
  }
  
  @JSImport("vscode-languageserver/lib/common/semanticTokens", "SemanticTokensFeature")
  @js.native
  val SemanticTokensFeature: Feature[_Languages, SemanticTokensFeatureShape] = js.native
  
  trait SemanticTokensFeatureShape extends StObject {
    
    var semanticTokens: OnDelta
  }
  object SemanticTokensFeatureShape {
    
    inline def apply(semanticTokens: OnDelta): SemanticTokensFeatureShape = {
      val __obj = js.Dynamic.literal(semanticTokens = semanticTokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokensFeatureShape]
    }
    
    extension [Self <: SemanticTokensFeatureShape](x: Self) {
      
      inline def setSemanticTokens(value: OnDelta): Self = StObject.set(x, "semanticTokens", value.asInstanceOf[js.Any])
    }
  }
}
