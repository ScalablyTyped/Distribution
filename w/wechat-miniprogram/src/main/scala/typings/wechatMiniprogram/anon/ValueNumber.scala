package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueNumber extends StObject {
  
  /** slider 的数值 0 - 100 */
  var value: Double
}
object ValueNumber {
  
  inline def apply(value: Double): ValueNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueNumber] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
