package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspendUnprocessed extends js.Object {
  
  var none: scala.Double = js.native
  
  var suspendUnprocessed: scala.Double = js.native
}
object SuspendUnprocessed {
  
  @scala.inline
  def apply(none: scala.Double, suspendUnprocessed: scala.Double): SuspendUnprocessed = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], suspendUnprocessed = suspendUnprocessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendUnprocessed]
  }
  
  @scala.inline
  implicit class SuspendUnprocessedOps[Self <: SuspendUnprocessed] (val x: Self) extends AnyVal {
    
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
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendUnprocessed(value: scala.Double): Self = this.set("suspendUnprocessed", value.asInstanceOf[js.Any])
  }
}
