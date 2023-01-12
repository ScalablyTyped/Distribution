package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseY extends StObject {
  
  var baseY: Double
  
  var topY: Double
}
object BaseY {
  
  inline def apply(baseY: Double, topY: Double): BaseY = {
    val __obj = js.Dynamic.literal(baseY = baseY.asInstanceOf[js.Any], topY = topY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseY] (val x: Self) extends AnyVal {
    
    inline def setBaseY(value: Double): Self = StObject.set(x, "baseY", value.asInstanceOf[js.Any])
    
    inline def setTopY(value: Double): Self = StObject.set(x, "topY", value.asInstanceOf[js.Any])
  }
}
