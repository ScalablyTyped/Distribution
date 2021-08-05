package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fail extends StObject {
  
  var config: String
  
  var description: String
  
  var fail: Unit
  
  var pass: String
}
object Fail {
  
  inline def apply(config: String, description: String, fail: Unit, pass: String): Fail = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
  
  extension [Self <: Fail](x: Self) {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFail(value: Unit): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
    
    inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
  }
}
