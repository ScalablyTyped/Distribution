package typings.triplesec.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arguments extends js.Object {
  
  var data: Buffer = js.native
  
  var key: Buffer = js.native
  
  var progress_hook: js.UndefOr[js.Function1[/* progress */ Progress, Unit]] = js.native
}
object Arguments {
  
  @scala.inline
  def apply(data: Buffer, key: Buffer): Arguments = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  
  @scala.inline
  implicit class ArgumentsOps[Self <: Arguments] (val x: Self) extends AnyVal {
    
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
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress_hook(value: /* progress */ Progress => Unit): Self = this.set("progress_hook", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProgress_hook: Self = this.set("progress_hook", js.undefined)
  }
}
