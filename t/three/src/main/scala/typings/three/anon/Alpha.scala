package typings.three.anon

import typings.three.nodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alpha extends StObject {
  
  var alpha: default
  
  var dotNH: default
}
object Alpha {
  
  inline def apply(alpha: default, dotNH: default): Alpha = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], dotNH = dotNH.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
  
  extension [Self <: Alpha](x: Self) {
    
    inline def setAlpha(value: default): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setDotNH(value: default): Self = StObject.set(x, "dotNH", value.asInstanceOf[js.Any])
  }
}
