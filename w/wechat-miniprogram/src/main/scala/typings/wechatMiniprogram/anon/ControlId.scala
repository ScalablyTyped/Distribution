package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlId extends StObject {
  
  /** 控件 ID */
  var controlId: Double
}
object ControlId {
  
  @scala.inline
  def apply(controlId: Double): ControlId = {
    val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlId]
  }
  
  @scala.inline
  implicit class ControlIdMutableBuilder[Self <: ControlId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlId(value: Double): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
  }
}
