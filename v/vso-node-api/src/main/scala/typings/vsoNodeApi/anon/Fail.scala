package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fail extends StObject {
  
  var fail: scala.Double
  
  var omit: scala.Double
}
object Fail {
  
  inline def apply(fail: scala.Double, omit: scala.Double): Fail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], omit = omit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
  
  extension [Self <: Fail](x: Self) {
    
    inline def setFail(value: scala.Double): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
    
    inline def setOmit(value: scala.Double): Self = StObject.set(x, "omit", value.asInstanceOf[js.Any])
  }
}
