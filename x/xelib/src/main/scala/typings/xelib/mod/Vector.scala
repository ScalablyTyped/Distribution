package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector extends StObject {
  
  var X: js.UndefOr[Double] = js.native
  
  var Y: js.UndefOr[Double] = js.native
  
  var Z: js.UndefOr[Double] = js.native
}
object Vector {
  
  @scala.inline
  def apply(): Vector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vector]
  }
  
  @scala.inline
  implicit class VectorMutableBuilder[Self <: Vector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "X", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "Y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "Z", js.undefined)
  }
}
