package typings.tstl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MODULE extends js.Object {
  
  var __MODULE: js.UndefOr[String] = js.native
  
  var name: String = js.native
}
object MODULE {
  
  @scala.inline
  def apply(name: String): MODULE = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MODULE]
  }
  
  @scala.inline
  implicit class MODULEOps[Self <: MODULE] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__MODULE(value: String): Self = this.set("__MODULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__MODULE: Self = this.set("__MODULE", js.undefined)
  }
}
