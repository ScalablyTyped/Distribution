package typings.stripe.mod

import typings.stripe.stripeStrings.application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applications {
  
  @js.native
  trait IApplication extends IResourceObject {
    
    /**
      * String representing the application’s name.
      */
    var name: String = js.native
    
    /**
      * String representing the object’s type. Objects of the same type share the same value.
      */
    @JSName("object")
    var object_IApplication: application = js.native
  }
  object IApplication {
    
    @scala.inline
    def apply(id: String, name: String, `object`: application): IApplication = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IApplication]
    }
    
    @scala.inline
    implicit class IApplicationMutableBuilder[Self <: IApplication] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: application): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
}
