package typings.useragent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Family extends js.Object {
  
  var family: String = js.native
  
  var major: js.UndefOr[String] = js.native
  
  var minor: js.UndefOr[String] = js.native
  
  var patch: js.UndefOr[String] = js.native
}
object Family {
  
  @scala.inline
  def apply(family: String): Family = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
    __obj.asInstanceOf[Family]
  }
  
  @scala.inline
  implicit class FamilyOps[Self <: Family] (val x: Self) extends AnyVal {
    
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: String): Self = this.set("major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    
    @scala.inline
    def setMinor(value: String): Self = this.set("minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
    
    @scala.inline
    def setPatch(value: String): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
  }
}
