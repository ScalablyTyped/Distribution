package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokens extends StObject {
  
  /**
    * The actual tokens.
    */
  var data: js.Array[uinteger]
  
  /**
    * An optional result id. If provided and clients support delta updating
    * the client will include the result id in the next semantic token request.
    * A server can then instead of computing all semantic tokens again simply
    * send a delta.
    */
  var resultId: js.UndefOr[String] = js.undefined
}
object SemanticTokens {
  
  inline def apply(data: js.Array[uinteger]): SemanticTokens = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokens]
  }
  
  @JSImport("vscode-languageserver-types", "SemanticTokens")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.SemanticTokens */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.SemanticTokens */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SemanticTokens] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[uinteger]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: uinteger*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
    
    inline def setResultIdUndefined: Self = StObject.set(x, "resultId", js.undefined)
  }
}
