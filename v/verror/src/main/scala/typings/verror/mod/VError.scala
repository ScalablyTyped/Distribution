package typings.verror.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VError extends Error {
  
  def cause(): js.UndefOr[Error] = js.native
}
object VError {
  
  @scala.inline
  def apply(cause: () => js.UndefOr[Error], message: String, name: String): VError = {
    val __obj = js.Dynamic.literal(cause = js.Any.fromFunction0(cause), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VError]
  }
  
  @scala.inline
  implicit class VErrorOps[Self <: VError] (val x: Self) extends AnyVal {
    
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
    def setCause(value: () => js.UndefOr[Error]): Self = this.set("cause", js.Any.fromFunction0(value))
  }
}
