package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTimePickerConstants extends StObject {
  
  val AmPmStrings: Capitalized
  
  val BLANK: /* "--" */ String
  
  val NULL_TIME: String
}
object TypeofTimePickerConstants {
  
  inline def apply(AmPmStrings: Capitalized, BLANK: /* "--" */ String, NULL_TIME: String): TypeofTimePickerConstants = {
    val __obj = js.Dynamic.literal(AmPmStrings = AmPmStrings.asInstanceOf[js.Any], BLANK = BLANK.asInstanceOf[js.Any], NULL_TIME = NULL_TIME.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTimePickerConstants]
  }
  
  extension [Self <: TypeofTimePickerConstants](x: Self) {
    
    inline def setAmPmStrings(value: Capitalized): Self = StObject.set(x, "AmPmStrings", value.asInstanceOf[js.Any])
    
    inline def setBLANK(value: /* "--" */ String): Self = StObject.set(x, "BLANK", value.asInstanceOf[js.Any])
    
    inline def setNULL_TIME(value: String): Self = StObject.set(x, "NULL_TIME", value.asInstanceOf[js.Any])
  }
}
