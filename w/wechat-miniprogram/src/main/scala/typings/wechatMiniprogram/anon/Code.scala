package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  /** 统计用区划代码 当 mode = region 时有效 (最低基础库: 1.4.0) */
  var code: js.Tuple3[String, String, String]
  
  /** 邮政编码 当 mode = region 时有效 (最低基础库: 1.4.0) */
  var postcode: String
  
  /**
    * 当 mode = selector 时, 返回当前选择的 value
    *
    * 当 mode = multiSelector 时, 返回一个索引数组
    *
    * 当 mode = time | date 时, 返回 `"12:01"` | `"2016-09-01"`
    *
    * 当 mode = region 时, 返回 `["广东省", "广州市", "海珠区"]`
    */
  var value: String | js.Array[Double] | (js.Tuple3[String, String, String])
}
object Code {
  
  inline def apply(
    code: js.Tuple3[String, String, String],
    postcode: String,
    value: String | js.Array[Double] | (js.Tuple3[String, String, String])
  ): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: js.Tuple3[String, String, String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | js.Array[Double] | (js.Tuple3[String, String, String])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
