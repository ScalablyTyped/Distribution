package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permid extends js.Object {
  
  var permid: js.UndefOr[Double] = js.native
  
  var permsid: js.UndefOr[String] = js.native
  
  var permvalue: Double = js.native
}
object Permid {
  
  @scala.inline
  def apply(permvalue: Double): Permid = {
    val __obj = js.Dynamic.literal(permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permid]
  }
  
  @scala.inline
  implicit class PermidOps[Self <: Permid] (val x: Self) extends AnyVal {
    
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
    def setPermvalue(value: Double): Self = this.set("permvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermid(value: Double): Self = this.set("permid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermid: Self = this.set("permid", js.undefined)
    
    @scala.inline
    def setPermsid(value: String): Self = this.set("permsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermsid: Self = this.set("permsid", js.undefined)
  }
}
