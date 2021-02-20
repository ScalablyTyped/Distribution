package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnCompassChangeSuccess extends StObject {
  
  /**
    * 面对的方向度数
    */
  var direction: js.UndefOr[Double] = js.native
}
object OnCompassChangeSuccess {
  
  @scala.inline
  def apply(): OnCompassChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnCompassChangeSuccess]
  }
  
  @scala.inline
  implicit class OnCompassChangeSuccessMutableBuilder[Self <: OnCompassChangeSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
