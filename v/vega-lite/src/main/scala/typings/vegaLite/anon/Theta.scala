package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theta extends StObject {
  
  val radius: typings.vegaLite.vegaLiteNumbers.`1`
  
  val theta: typings.vegaLite.vegaLiteNumbers.`1`
}
object Theta {
  
  @scala.inline
  def apply(): Theta = {
    val __obj = js.Dynamic.literal(radius = 1, theta = 1)
    __obj.asInstanceOf[Theta]
  }
  
  @scala.inline
  implicit class ThetaMutableBuilder[Self <: Theta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: typings.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheta(value: typings.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
  }
}
