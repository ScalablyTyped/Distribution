package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessAutogroup extends StObject {
  
  var name: String
  
  var nice: Double
}
object ProcessAutogroup {
  
  inline def apply(name: String, nice: Double): ProcessAutogroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessAutogroup]
  }
  
  extension [Self <: ProcessAutogroup](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
  }
}
