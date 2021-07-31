package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueArray extends StObject {
  
  /** value 为数组，表示 picker-view 内的 picker-view-column 当前选择的是第几项 (下标从 0 开始)  */
  var value: js.Array[Double]
}
object ValueArray {
  
  @scala.inline
  def apply(value: js.Array[Double]): ValueArray = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueArray]
  }
  
  @scala.inline
  implicit class ValueArrayMutableBuilder[Self <: ValueArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
