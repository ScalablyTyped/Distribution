package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theta extends StObject {
  
  val radius: typings.vegaLite.vegaLiteInts.`1`
  
  val theta: typings.vegaLite.vegaLiteInts.`1`
}
object Theta {
  
  inline def apply(): Theta = {
    val __obj = js.Dynamic.literal(radius = 1, theta = 1)
    __obj.asInstanceOf[Theta]
  }
  
  extension [Self <: Theta](x: Self) {
    
    inline def setRadius(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setTheta(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
  }
}
