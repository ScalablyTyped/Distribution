package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  val x: typings.vegaLite.vegaLiteNumbers.`1`
  
  val y: typings.vegaLite.vegaLiteNumbers.`1`
}
object Y {
  
  @scala.inline
  def apply(): Y = {
    val __obj = js.Dynamic.literal(x = 1, y = 1)
    __obj.asInstanceOf[Y]
  }
  
  @scala.inline
  implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: typings.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: typings.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
