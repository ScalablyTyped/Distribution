package typings.vueTestUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapperOptions extends js.Object {
  
  var attachedToDocument: js.UndefOr[Boolean] = js.native
}
object WrapperOptions {
  
  @scala.inline
  def apply(): WrapperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrapperOptions]
  }
  
  @scala.inline
  implicit class WrapperOptionsOps[Self <: WrapperOptions] (val x: Self) extends AnyVal {
    
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
    def setAttachedToDocument(value: Boolean): Self = this.set("attachedToDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedToDocument: Self = this.set("attachedToDocument", js.undefined)
  }
}
