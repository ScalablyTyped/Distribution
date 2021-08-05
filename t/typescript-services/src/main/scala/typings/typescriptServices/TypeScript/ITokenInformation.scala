package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITokenInformation extends StObject {
  
  var nextToken: ISyntaxToken
  
  var previousToken: ISyntaxToken
}
object ITokenInformation {
  
  inline def apply(nextToken: ISyntaxToken, previousToken: ISyntaxToken): ITokenInformation = {
    val __obj = js.Dynamic.literal(nextToken = nextToken.asInstanceOf[js.Any], previousToken = previousToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITokenInformation]
  }
  
  extension [Self <: ITokenInformation](x: Self) {
    
    inline def setNextToken(value: ISyntaxToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setPreviousToken(value: ISyntaxToken): Self = StObject.set(x, "previousToken", value.asInstanceOf[js.Any])
  }
}
