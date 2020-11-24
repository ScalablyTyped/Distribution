package typings.wechatMiniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buffered extends js.Object {
  
  /** 百分比 */
  var buffered: Double = js.native
}
object Buffered {
  
  @scala.inline
  def apply(buffered: Double): Buffered = {
    val __obj = js.Dynamic.literal(buffered = buffered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffered]
  }
  
  @scala.inline
  implicit class BufferedOps[Self <: Buffered] (val x: Self) extends AnyVal {
    
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
    def setBuffered(value: Double): Self = this.set("buffered", value.asInstanceOf[js.Any])
  }
}
