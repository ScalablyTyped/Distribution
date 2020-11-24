package typings.wechatMiniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurPercent extends js.Object {
  
  var curPercent: Double = js.native
}
object CurPercent {
  
  @scala.inline
  def apply(curPercent: Double): CurPercent = {
    val __obj = js.Dynamic.literal(curPercent = curPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurPercent]
  }
  
  @scala.inline
  implicit class CurPercentOps[Self <: CurPercent] (val x: Self) extends AnyVal {
    
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
    def setCurPercent(value: Double): Self = this.set("curPercent", value.asInstanceOf[js.Any])
  }
}
