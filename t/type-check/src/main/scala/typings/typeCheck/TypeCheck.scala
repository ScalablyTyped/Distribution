package typings.typeCheck

import org.scalablytyped.runtime.StringDictionary
import typings.typeCheck.anon.TypeOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeCheck {
  
  type CustomType = StringDictionary[TypeOf]
  
  trait Options extends StObject {
    
    var customTypes: CustomType
  }
  object Options {
    
    inline def apply(customTypes: CustomType): Options = {
      val __obj = js.Dynamic.literal(customTypes = customTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCustomTypes(value: CustomType): Self = StObject.set(x, "customTypes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TC extends StObject {
    
    var VERSION: String = js.native
    
    def parseType(typeDescription: String): js.Object = js.native
    
    def parsedTypeCheck(parsedType: Any, obj: Any): Boolean = js.native
    
    def typeCheck(typeDescription: String, inst: Any): Boolean = js.native
    def typeCheck(typeDescription: String, inst: Any, options: Options): Boolean = js.native
  }
}
