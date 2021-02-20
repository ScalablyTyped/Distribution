package typings.sweValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var `type`: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, `type`: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Sex extends StObject {
    
    var sex: String = js.native
    
    var ssn: String = js.native
    
    var `type`: String = js.native
  }
  object Sex {
    
    @scala.inline
    def apply(sex: String, ssn: String, `type`: String): Sex = {
      val __obj = js.Dynamic.literal(sex = sex.asInstanceOf[js.Any], ssn = ssn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sex]
    }
    
    @scala.inline
    implicit class SexMutableBuilder[Self <: Sex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSex(value: String): Self = StObject.set(x, "sex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsn(value: String): Self = StObject.set(x, "ssn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
