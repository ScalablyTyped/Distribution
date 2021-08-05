package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Personalidnumber extends StObject {
  
  /**
    * The personal_id_number for PII in string form.
    */
  var personal_id_number: String
}
object Personalidnumber {
  
  inline def apply(personal_id_number: String): Personalidnumber = {
    val __obj = js.Dynamic.literal(personal_id_number = personal_id_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Personalidnumber]
  }
  
  extension [Self <: Personalidnumber](x: Self) {
    
    inline def setPersonal_id_number(value: String): Self = StObject.set(x, "personal_id_number", value.asInstanceOf[js.Any])
  }
}
