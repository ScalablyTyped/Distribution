package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grant extends js.Object {
  
  def toPayload(): GrantPayload = js.native
}
object Grant {
  
  @scala.inline
  def apply(toPayload: () => GrantPayload): Grant = {
    val __obj = js.Dynamic.literal(toPayload = js.Any.fromFunction0(toPayload))
    __obj.asInstanceOf[Grant]
  }
  
  @scala.inline
  implicit class GrantOps[Self <: Grant] (val x: Self) extends AnyVal {
    
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
    def setToPayload(value: () => GrantPayload): Self = this.set("toPayload", js.Any.fromFunction0(value))
  }
}
