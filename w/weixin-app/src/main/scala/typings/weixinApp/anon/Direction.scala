package typings.weixinApp.anon

import typings.weixinApp.weixinAppNumbers.`-90`
import typings.weixinApp.weixinAppNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direction extends js.Object {
  
  var direction: typings.weixinApp.weixinAppNumbers.`0` | `90` | `-90` = js.native
}
object Direction {
  
  @scala.inline
  def apply(direction: typings.weixinApp.weixinAppNumbers.`0` | `90` | `-90`): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: typings.weixinApp.weixinAppNumbers.`0` | `90` | `-90`): Self = this.set("direction", value.asInstanceOf[js.Any])
  }
}
