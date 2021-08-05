package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormalTypeParameterInfo extends StObject {
  
  var docComment: String
  
  var limChar: Double
  
  var minChar: Double
  
  var name: String
}
object FormalTypeParameterInfo {
  
  inline def apply(docComment: String, limChar: Double, minChar: Double, name: String): FormalTypeParameterInfo = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormalTypeParameterInfo]
  }
  
  extension [Self <: FormalTypeParameterInfo](x: Self) {
    
    inline def setDocComment(value: String): Self = StObject.set(x, "docComment", value.asInstanceOf[js.Any])
    
    inline def setLimChar(value: Double): Self = StObject.set(x, "limChar", value.asInstanceOf[js.Any])
    
    inline def setMinChar(value: Double): Self = StObject.set(x, "minChar", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
