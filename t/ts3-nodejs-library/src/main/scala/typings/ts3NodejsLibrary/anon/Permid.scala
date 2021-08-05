package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permid extends StObject {
  
  var permid: js.UndefOr[Double] = js.undefined
  
  var permsid: js.UndefOr[String] = js.undefined
  
  var permvalue: Double
}
object Permid {
  
  inline def apply(permvalue: Double): Permid = {
    val __obj = js.Dynamic.literal(permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permid]
  }
  
  extension [Self <: Permid](x: Self) {
    
    inline def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    inline def setPermidUndefined: Self = StObject.set(x, "permid", js.undefined)
    
    inline def setPermsid(value: String): Self = StObject.set(x, "permsid", value.asInstanceOf[js.Any])
    
    inline def setPermsidUndefined: Self = StObject.set(x, "permsid", js.undefined)
    
    inline def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
  }
}
