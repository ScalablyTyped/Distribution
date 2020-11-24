package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings._empty
import typings.wechatMiniprogram.wechatMiniprogramStrings.`out-of-bounds`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`touch-out-of-bounds`
import typings.wechatMiniprogram.wechatMiniprogramStrings.friction
import typings.wechatMiniprogram.wechatMiniprogramStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends js.Object {
  
  /**
    * 产生移动的原因
    *
    * - `touch` 拖动
    * - `touch-out-of-bounds` 超出移动范围
    * - `out-of-bounds` 超出移动范围后的回弹
    * - `friction` 惯性
    * - `空字符串` setData
    */
  var source: touch | `touch-out-of-bounds` | `out-of-bounds` | friction | _empty = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Source {
  
  @scala.inline
  def apply(source: touch | `touch-out-of-bounds` | `out-of-bounds` | friction | _empty, x: Double, y: Double): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    
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
    def setSource(value: touch | `touch-out-of-bounds` | `out-of-bounds` | friction | _empty): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
