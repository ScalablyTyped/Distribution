package typings.stripe.mod

import typings.stripe.stripeStrings.application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applications {
  
  trait IApplication
    extends StObject
       with IResourceObject {
    
    /**
      * String representing the application’s name.
      */
    var name: String
    
    /**
      * String representing the object’s type. Objects of the same type share the same value.
      */
    @JSName("object")
    var object_IApplication: application
  }
  object IApplication {
    
    inline def apply(id: String, name: String): IApplication = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("application")
      __obj.asInstanceOf[IApplication]
    }
    
    extension [Self <: IApplication](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObject(value: application): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
}
