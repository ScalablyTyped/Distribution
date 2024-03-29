package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoNotRun extends StObject {
  
  var doNotRun: scala.Double
  
  var none: scala.Double
}
object DoNotRun {
  
  inline def apply(doNotRun: scala.Double, none: scala.Double): DoNotRun = {
    val __obj = js.Dynamic.literal(doNotRun = doNotRun.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoNotRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoNotRun] (val x: Self) extends AnyVal {
    
    inline def setDoNotRun(value: scala.Double): Self = StObject.set(x, "doNotRun", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
