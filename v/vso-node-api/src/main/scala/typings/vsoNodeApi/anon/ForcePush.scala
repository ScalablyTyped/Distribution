package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForcePush extends js.Object {
  
  var create: scala.Double = js.native
  
  var forcePush: scala.Double = js.native
  
  var push: scala.Double = js.native
  
  var rebase: scala.Double = js.native
  
  var unknown: scala.Double = js.native
}
object ForcePush {
  
  @scala.inline
  def apply(
    create: scala.Double,
    forcePush: scala.Double,
    push: scala.Double,
    rebase: scala.Double,
    unknown: scala.Double
  ): ForcePush = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], forcePush = forcePush.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rebase = rebase.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcePush]
  }
  
  @scala.inline
  implicit class ForcePushOps[Self <: ForcePush] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: scala.Double): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcePush(value: scala.Double): Self = this.set("forcePush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: scala.Double): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebase(value: scala.Double): Self = this.set("rebase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: scala.Double): Self = this.set("unknown", value.asInstanceOf[js.Any])
  }
}
