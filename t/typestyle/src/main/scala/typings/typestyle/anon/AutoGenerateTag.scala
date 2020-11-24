package typings.typestyle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoGenerateTag extends js.Object {
  
  var autoGenerateTag: Boolean = js.native
}
object AutoGenerateTag {
  
  @scala.inline
  def apply(autoGenerateTag: Boolean): AutoGenerateTag = {
    val __obj = js.Dynamic.literal(autoGenerateTag = autoGenerateTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoGenerateTag]
  }
  
  @scala.inline
  implicit class AutoGenerateTagOps[Self <: AutoGenerateTag] (val x: Self) extends AnyVal {
    
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
    def setAutoGenerateTag(value: Boolean): Self = this.set("autoGenerateTag", value.asInstanceOf[js.Any])
  }
}
