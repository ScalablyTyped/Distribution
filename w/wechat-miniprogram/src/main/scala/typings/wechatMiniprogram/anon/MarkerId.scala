package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerId extends StObject {
  
  /** 标记点 ID */
  var markerId: Double
}
object MarkerId {
  
  @scala.inline
  def apply(markerId: Double): MarkerId = {
    val __obj = js.Dynamic.literal(markerId = markerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerId]
  }
  
  @scala.inline
  implicit class MarkerIdMutableBuilder[Self <: MarkerId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
  }
}
