package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessLimit extends StObject {
  
  var hard: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var soft: js.UndefOr[Double] = js.undefined
  
  var units: js.UndefOr[String] = js.undefined
}
object ProcessLimit {
  
  inline def apply(name: String): ProcessLimit = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessLimit]
  }
  
  extension [Self <: ProcessLimit](x: Self) {
    
    inline def setHard(value: Double): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
    
    inline def setHardUndefined: Self = StObject.set(x, "hard", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSoft(value: Double): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
    
    inline def setSoftUndefined: Self = StObject.set(x, "soft", js.undefined)
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
