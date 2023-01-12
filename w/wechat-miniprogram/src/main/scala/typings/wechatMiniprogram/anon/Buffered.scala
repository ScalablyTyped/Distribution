package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffered extends StObject {
  
  /** 百分比 */
  var buffered: Double
}
object Buffered {
  
  inline def apply(buffered: Double): Buffered = {
    val __obj = js.Dynamic.literal(buffered = buffered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buffered] (val x: Self) extends AnyVal {
    
    inline def setBuffered(value: Double): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
  }
}
