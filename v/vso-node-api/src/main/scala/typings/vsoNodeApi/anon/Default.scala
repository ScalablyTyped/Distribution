package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: scala.Double
  
  var custom: scala.Double
  
  var upgrade: scala.Double
}
object Default {
  
  inline def apply(custom: scala.Double, default: scala.Double, upgrade: scala.Double): Default = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  extension [Self <: Default](x: Self) {
    
    inline def setCustom(value: scala.Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: scala.Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setUpgrade(value: scala.Double): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
  }
}
