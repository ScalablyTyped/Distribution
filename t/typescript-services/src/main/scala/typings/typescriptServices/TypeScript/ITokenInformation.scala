package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITokenInformation extends StObject {
  
  var nextToken: ISyntaxToken = js.native
  
  var previousToken: ISyntaxToken = js.native
}
object ITokenInformation {
  
  @scala.inline
  def apply(nextToken: ISyntaxToken, previousToken: ISyntaxToken): ITokenInformation = {
    val __obj = js.Dynamic.literal(nextToken = nextToken.asInstanceOf[js.Any], previousToken = previousToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITokenInformation]
  }
  
  @scala.inline
  implicit class ITokenInformationMutableBuilder[Self <: ITokenInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: ISyntaxToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousToken(value: ISyntaxToken): Self = StObject.set(x, "previousToken", value.asInstanceOf[js.Any])
  }
}
