package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.PositionedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPartiallyWrittenTypeArgumentListInformation extends StObject {
  
  var argumentIndex: Double
  
  var genericIdentifer: PositionedToken
  
  var lessThanToken: PositionedToken
}
object IPartiallyWrittenTypeArgumentListInformation {
  
  inline def apply(argumentIndex: Double, genericIdentifer: PositionedToken, lessThanToken: PositionedToken): IPartiallyWrittenTypeArgumentListInformation = {
    val __obj = js.Dynamic.literal(argumentIndex = argumentIndex.asInstanceOf[js.Any], genericIdentifer = genericIdentifer.asInstanceOf[js.Any], lessThanToken = lessThanToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPartiallyWrittenTypeArgumentListInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPartiallyWrittenTypeArgumentListInformation] (val x: Self) extends AnyVal {
    
    inline def setArgumentIndex(value: Double): Self = StObject.set(x, "argumentIndex", value.asInstanceOf[js.Any])
    
    inline def setGenericIdentifer(value: PositionedToken): Self = StObject.set(x, "genericIdentifer", value.asInstanceOf[js.Any])
    
    inline def setLessThanToken(value: PositionedToken): Self = StObject.set(x, "lessThanToken", value.asInstanceOf[js.Any])
  }
}
