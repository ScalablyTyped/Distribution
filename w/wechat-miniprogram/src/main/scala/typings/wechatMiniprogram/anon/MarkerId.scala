package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerId extends StObject {
  
  /** 标记点 ID */
  var markerId: Double
}
object MarkerId {
  
  inline def apply(markerId: Double): MarkerId = {
    val __obj = js.Dynamic.literal(markerId = markerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerId] (val x: Self) extends AnyVal {
    
    inline def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
  }
}
