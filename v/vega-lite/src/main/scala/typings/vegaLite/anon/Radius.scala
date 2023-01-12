package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radius extends StObject {
  
  val radius: typings.vegaLite.vegaLiteInts.`1`
  
  val radius2: typings.vegaLite.vegaLiteInts.`1`
  
  val theta: typings.vegaLite.vegaLiteInts.`1`
  
  val theta2: typings.vegaLite.vegaLiteInts.`1`
}
object Radius {
  
  inline def apply(): Radius = {
    val __obj = js.Dynamic.literal(radius = 1, radius2 = 1, theta = 1, theta2 = 1)
    __obj.asInstanceOf[Radius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Radius] (val x: Self) extends AnyVal {
    
    inline def setRadius(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadius2(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
    
    inline def setTheta(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    inline def setTheta2(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
  }
}
