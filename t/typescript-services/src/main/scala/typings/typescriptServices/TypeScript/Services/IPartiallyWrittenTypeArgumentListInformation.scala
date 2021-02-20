package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.PositionedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPartiallyWrittenTypeArgumentListInformation extends StObject {
  
  var argumentIndex: Double = js.native
  
  var genericIdentifer: PositionedToken = js.native
  
  var lessThanToken: PositionedToken = js.native
}
object IPartiallyWrittenTypeArgumentListInformation {
  
  @scala.inline
  def apply(argumentIndex: Double, genericIdentifer: PositionedToken, lessThanToken: PositionedToken): IPartiallyWrittenTypeArgumentListInformation = {
    val __obj = js.Dynamic.literal(argumentIndex = argumentIndex.asInstanceOf[js.Any], genericIdentifer = genericIdentifer.asInstanceOf[js.Any], lessThanToken = lessThanToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPartiallyWrittenTypeArgumentListInformation]
  }
  
  @scala.inline
  implicit class IPartiallyWrittenTypeArgumentListInformationMutableBuilder[Self <: IPartiallyWrittenTypeArgumentListInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgumentIndex(value: Double): Self = StObject.set(x, "argumentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericIdentifer(value: PositionedToken): Self = StObject.set(x, "genericIdentifer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLessThanToken(value: PositionedToken): Self = StObject.set(x, "lessThanToken", value.asInstanceOf[js.Any])
  }
}
