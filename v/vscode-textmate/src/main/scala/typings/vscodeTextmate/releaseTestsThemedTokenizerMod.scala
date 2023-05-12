package typings.vscodeTextmate

import typings.vscodeTextmate.mod.IGrammar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseTestsThemedTokenizerMod {
  
  @JSImport("vscode-textmate/release/tests/themedTokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tokenizeWithTheme(colorMap: js.Array[String], fileContents: String, grammar: IGrammar): js.Array[IThemedToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizeWithTheme")(colorMap.asInstanceOf[js.Any], fileContents.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any])).asInstanceOf[js.Array[IThemedToken]]
  
  trait IThemedToken extends StObject {
    
    var color: String
    
    var content: String
  }
  object IThemedToken {
    
    inline def apply(color: String, content: String): IThemedToken = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[IThemedToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IThemedToken] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
