package typings.sucrase

import typings.sucrase.stateMod.Scope
import typings.sucrase.tokenizerMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("sucrase/dist/types/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sucrase/dist/types/parser", "File")
  @js.native
  open class File protected () extends StObject {
    def this(tokens: js.Array[Token], scopes: js.Array[Scope]) = this()
    
    var scopes: js.Array[Scope] = js.native
    
    var tokens: js.Array[Token] = js.native
  }
  
  inline def parse(input: String, isJSXEnabled: Boolean, isTypeScriptEnabled: Boolean, isFlowEnabled: Boolean): File = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], isJSXEnabled.asInstanceOf[js.Any], isTypeScriptEnabled.asInstanceOf[js.Any], isFlowEnabled.asInstanceOf[js.Any])).asInstanceOf[File]
}
