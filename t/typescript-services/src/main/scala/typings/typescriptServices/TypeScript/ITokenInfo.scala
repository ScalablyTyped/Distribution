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
  
  @scala.inline
  def apply(): ITokenInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITokenInfo]
  }
  
  @scala.inline
  implicit class ITokenInfoMutableBuilder[Self <: ITokenInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeadingTrivia(value: js.Array[ISyntaxTrivia]): Self = StObject.set(x, "leadingTrivia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingTriviaUndefined: Self = StObject.set(x, "leadingTrivia", js.undefined)
    
    @scala.inline
    def setLeadingTriviaVarargs(value: ISyntaxTrivia*): Self = StObject.set(x, "leadingTrivia", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTrailingTrivia(value: js.Array[ISyntaxTrivia]): Self = StObject.set(x, "trailingTrivia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingTriviaUndefined: Self = StObject.set(x, "trailingTrivia", js.undefined)
    
    @scala.inline
    def setTrailingTriviaVarargs(value: ISyntaxTrivia*): Self = StObject.set(x, "trailingTrivia", js.Array(value :_*))
  }
}
