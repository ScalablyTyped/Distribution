package typings.sweValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: String
    
    var `type`: String
  }
  object Id {
    
    inline def apply(id: String, `type`: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sex extends StObject {
    
    var sex: String
    
    var ssn: String
    
    var `type`: String
  }
  object Sex {
    
    inline def apply(sex: String, ssn: String, `type`: String): Sex = {
      val __obj = js.Dynamic.literal(sex = sex.asInstanceOf[js.Any], ssn = ssn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sex] (val x: Self) extends AnyVal {
      
      inline def setSex(value: String): Self = StObject.set(x, "sex", value.asInstanceOf[js.Any])
      
      inline def setSsn(value: String): Self = StObject.set(x, "ssn", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
