package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseY extends StObject {
  
  var baseY: Double
  
  var topY: Double
}
object BaseY {
  
  @scala.inline
  def apply(baseY: Double, topY: Double): BaseY = {
    val __obj = js.Dynamic.literal(baseY = baseY.asInstanceOf[js.Any], topY = topY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseY]
  }
  
  @scala.inline
  implicit class BaseYMutableBuilder[Self <: BaseY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseY(value: Double): Self = StObject.set(x, "baseY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopY(value: Double): Self = StObject.set(x, "topY", value.asInstanceOf[js.Any])
  }
}
