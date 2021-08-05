package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PiiTokenOptions extends StObject {
  
  var personal_id_number: String
}
object PiiTokenOptions {
  
  inline def apply(personal_id_number: String): PiiTokenOptions = {
    val __obj = js.Dynamic.literal(personal_id_number = personal_id_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiiTokenOptions]
  }
  
  extension [Self <: PiiTokenOptions](x: Self) {
    
    inline def setPersonal_id_number(value: String): Self = StObject.set(x, "personal_id_number", value.asInstanceOf[js.Any])
  }
}
