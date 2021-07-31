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
    
    @scala.inline
    def apply(customTypes: CustomType): Options = {
      val __obj = js.Dynamic.literal(customTypes = customTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomTypes(value: CustomType): Self = StObject.set(x, "customTypes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TC extends StObject {
    
    var VERSION: String = js.native
    
    def parseType(typeDescription: String): js.Object = js.native
    
    def parsedTypeCheck(parsedType: js.Any, obj: js.Any): Boolean = js.native
    
    def typeCheck(typeDescription: String, inst: js.Any): Boolean = js.native
    def typeCheck(typeDescription: String, inst: js.Any, options: Options): Boolean = js.native
  }
}
