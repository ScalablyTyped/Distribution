package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings._empty
import typings.wechatMiniprogram.wechatMiniprogramStrings.autoplay
import typings.wechatMiniprogram.wechatMiniprogramStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Current extends js.Object {
  
  var current: Double = js.native
  
  /** 该 swiper-item 的标识符 */
  var currentItemId: String = js.native
  
  /**
    * 表示导致变更的原因
    *
    * - `autoplay` 自动播放导致 swiper 变化；
    * - `touch` 用户划动引起 swiper 变化；
    * - 其它原因将用空字符串表示。
    *
    * 最低基础库: 1.4.0
    */
  var source: _empty | autoplay | touch = js.native
}
object Current {
  
  @scala.inline
  def apply(current: Double, currentItemId: String, source: _empty | autoplay | touch): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], currentItemId = currentItemId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentItemId(value: String): Self = this.set("currentItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: _empty | autoplay | touch): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
