package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAccelerometerChangeSuccess extends StObject {
  
  /**
    * X 轴
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Y 轴
    */
  var y: js.UndefOr[Double] = js.undefined
  
  /**
    * Z 轴
    */
  var z: js.UndefOr[Double] = js.undefined
}
object OnAccelerometerChangeSuccess {
  
  @scala.inline
  def apply(): OnAccelerometerChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnAccelerometerChangeSuccess]
  }
  
  @scala.inline
  implicit class OnAccelerometerChangeSuccessMutableBuilder[Self <: OnAccelerometerChangeSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
