package typings.vueRouter.anon

import typings.std.ScrollBehavior
import typings.vueRouter.routerMod.Position
import typings.vueRouter.routerMod._PositionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Behavior extends _PositionResult {
  
  var behavior: js.UndefOr[ScrollBehavior] = js.native
  
  var offset: js.UndefOr[Position] = js.native
  
  var selector: String = js.native
}
object Behavior {
  
  @scala.inline
  def apply(selector: String): Behavior = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behavior]
  }
  
  @scala.inline
  implicit class BehaviorOps[Self <: Behavior] (val x: Self) extends AnyVal {
    
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
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehavior(value: ScrollBehavior): Self = this.set("behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    
    @scala.inline
    def setOffset(value: Position): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
