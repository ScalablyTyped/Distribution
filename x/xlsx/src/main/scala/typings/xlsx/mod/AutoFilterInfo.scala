package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFilterInfo
  extends StObject
     with _WSKeys {
  
  /** Range of the AutoFilter table */
  var ref: String
}
object AutoFilterInfo {
  
  inline def apply(ref: String): AutoFilterInfo = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFilterInfo]
  }
  
  extension [Self <: AutoFilterInfo](x: Self) {
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
