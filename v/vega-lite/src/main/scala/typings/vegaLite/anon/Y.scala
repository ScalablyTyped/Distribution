package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Y extends StObject {
  
  val x: typings.vegaLite.vegaLiteNumbers.`1` = js.native
  
  val y: typings.vegaLite.vegaLiteNumbers.`1` = js.native
}
object Y {
  
  @scala.inline
  def apply(x: typings.vegaLite.vegaLiteNumbers.`1`, y: typings.vegaLite.vegaLiteNumbers.`1`): Y = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
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
