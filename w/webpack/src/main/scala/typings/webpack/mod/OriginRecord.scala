package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginRecord extends StObject {
  
  var loc: DependencyLocation
  
  var module: Module
  
  var request: String
}
object OriginRecord {
  
  inline def apply(loc: DependencyLocation, module: Module, request: String): OriginRecord = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginRecord] (val x: Self) extends AnyVal {
    
    inline def setLoc(value: DependencyLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
