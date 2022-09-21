package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBFField extends StObject {
  
  /** Field Decimal Count */
  var dec: js.UndefOr[Double] = js.undefined
  
  /** Field Length */
  var len: js.UndefOr[Double] = js.undefined
  
  /** Original Field Name */
  var name: js.UndefOr[String] = js.undefined
  
  /** Field Type */
  var `type`: js.UndefOr[String] = js.undefined
}
object DBFField {
  
  inline def apply(): DBFField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBFField]
  }
  
  extension [Self <: DBFField](x: Self) {
    
    inline def setDec(value: Double): Self = StObject.set(x, "dec", value.asInstanceOf[js.Any])
    
    inline def setDecUndefined: Self = StObject.set(x, "dec", js.undefined)
    
    inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
