package typings.sweetalert.deprecationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionReplacement extends js.Object {
  
  var link: js.UndefOr[String] = js.native
  
  var onlyRename: js.UndefOr[Boolean] = js.native
  
  var replacement: js.UndefOr[String] = js.native
  
  var subOption: js.UndefOr[String] = js.native
}
object OptionReplacement {
  
  @scala.inline
  def apply(): OptionReplacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionReplacement]
  }
  
  @scala.inline
  implicit class OptionReplacementOps[Self <: OptionReplacement] (val x: Self) extends AnyVal {
    
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
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setOnlyRename(value: Boolean): Self = this.set("onlyRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyRename: Self = this.set("onlyRename", js.undefined)
    
    @scala.inline
    def setReplacement(value: String): Self = this.set("replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacement: Self = this.set("replacement", js.undefined)
    
    @scala.inline
    def setSubOption(value: String): Self = this.set("subOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubOption: Self = this.set("subOption", js.undefined)
  }
}
