package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sgid extends js.Object {
  
  var sgid: String = js.native
}
object Sgid {
  
  @scala.inline
  def apply(sgid: String): Sgid = {
    val __obj = js.Dynamic.literal(sgid = sgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sgid]
  }
  
  @scala.inline
  implicit class SgidOps[Self <: Sgid] (val x: Self) extends AnyVal {
    
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
    def setSgid(value: String): Self = this.set("sgid", value.asInstanceOf[js.Any])
  }
}
