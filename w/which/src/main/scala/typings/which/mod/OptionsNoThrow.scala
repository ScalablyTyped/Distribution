package typings.which.mod

import typings.which.whichBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options that ask to receive null instead of a thrown error */
@js.native
trait OptionsNoThrow extends Options {
  
  @JSName("nothrow")
  var nothrow_OptionsNoThrow: `true` = js.native
}
object OptionsNoThrow {
  
  @scala.inline
  def apply(nothrow: `true`): OptionsNoThrow = {
    val __obj = js.Dynamic.literal(nothrow = nothrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsNoThrow]
  }
  
  @scala.inline
  implicit class OptionsNoThrowOps[Self <: OptionsNoThrow] (val x: Self) extends AnyVal {
    
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
    def setNothrow(value: `true`): Self = this.set("nothrow", value.asInstanceOf[js.Any])
  }
}
