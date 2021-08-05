package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Me extends StObject {
  
  var all: scala.Double
  
  var me: scala.Double
  
  var none: scala.Double
}
object Me {
  
  inline def apply(all: scala.Double, me: scala.Double, none: scala.Double): Me = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], me = me.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Me]
  }
  
  extension [Self <: Me](x: Self) {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setMe(value: scala.Double): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
