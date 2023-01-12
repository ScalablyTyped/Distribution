package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITokenInfo extends StObject {
  
  var leadingTrivia: js.UndefOr[js.Array[ISyntaxTrivia]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var trailingTrivia: js.UndefOr[js.Array[ISyntaxTrivia]] = js.undefined
}
object ITokenInfo {
  
  inline def apply(): ITokenInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITokenInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITokenInfo] (val x: Self) extends AnyVal {
    
    inline def setLeadingTrivia(value: js.Array[ISyntaxTrivia]): Self = StObject.set(x, "leadingTrivia", value.asInstanceOf[js.Any])
    
    inline def setLeadingTriviaUndefined: Self = StObject.set(x, "leadingTrivia", js.undefined)
    
    inline def setLeadingTriviaVarargs(value: ISyntaxTrivia*): Self = StObject.set(x, "leadingTrivia", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTrailingTrivia(value: js.Array[ISyntaxTrivia]): Self = StObject.set(x, "trailingTrivia", value.asInstanceOf[js.Any])
    
    inline def setTrailingTriviaUndefined: Self = StObject.set(x, "trailingTrivia", js.undefined)
    
    inline def setTrailingTriviaVarargs(value: ISyntaxTrivia*): Self = StObject.set(x, "trailingTrivia", js.Array(value*))
  }
}
