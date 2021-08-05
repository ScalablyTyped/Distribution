package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlId extends StObject {
  
  /** 控件 ID */
  var controlId: Double
}
object ControlId {
  
  inline def apply(controlId: Double): ControlId = {
    val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlId]
  }
  
  extension [Self <: ControlId](x: Self) {
    
    inline def setControlId(value: Double): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
  }
}
