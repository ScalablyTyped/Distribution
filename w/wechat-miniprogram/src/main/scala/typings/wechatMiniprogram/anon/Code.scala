package typings.wechatMiniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Code extends js.Object {
  
  /** 统计用区划代码 当 mode = region 时有效 (最低基础库: 1.4.0) */
  var code: js.Tuple3[String, String, String] = js.native
  
  /** 邮政编码 当 mode = region 时有效 (最低基础库: 1.4.0) */
  var postcode: String = js.native
  
  /**
    * 当 mode = selector 时, 返回当前选择的 value
    *
    * 当 mode = multiSelector 时, 返回一个索引数组
    *
    * 当 mode = time | date 时, 返回 `"12:01"` | `"2016-09-01"`
    *
    * 当 mode = region 时, 返回 `["广东省", "广州市", "海珠区"]`
    */
  var value: String | js.Array[Double] | (js.Tuple3[String, String, String]) = js.native
}
object Code {
  
  @scala.inline
  def apply(
    code: js.Tuple3[String, String, String],
    postcode: String,
    value: String | js.Array[Double] | (js.Tuple3[String, String, String])
  ): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: js.Tuple3[String, String, String]): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostcode(value: String): Self = this.set("postcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | js.Array[Double] | (js.Tuple3[String, String, String])): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
