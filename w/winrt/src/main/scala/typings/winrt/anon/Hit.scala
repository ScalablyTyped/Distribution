package typings.winrt.anon

import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hit extends js.Object {
  
  var hit: Double = js.native
  
  var rect: Rect = js.native
}
object Hit {
  
  @scala.inline
  def apply(hit: Double, rect: Rect): Hit = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit]
  }
  
  @scala.inline
  implicit class HitOps[Self <: Hit] (val x: Self) extends AnyVal {
    
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
    def setHit(value: Double): Self = this.set("hit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRect(value: Rect): Self = this.set("rect", value.asInstanceOf[js.Any])
  }
}
