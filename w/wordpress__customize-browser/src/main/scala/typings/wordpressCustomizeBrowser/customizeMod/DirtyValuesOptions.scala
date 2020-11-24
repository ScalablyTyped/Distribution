package typings.wordpressCustomizeBrowser.customizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirtyValuesOptions extends js.Object {
  
  var unsaved: js.UndefOr[Boolean] = js.native
}
object DirtyValuesOptions {
  
  @scala.inline
  def apply(): DirtyValuesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirtyValuesOptions]
  }
  
  @scala.inline
  implicit class DirtyValuesOptionsOps[Self <: DirtyValuesOptions] (val x: Self) extends AnyVal {
    
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
    def setUnsaved(value: Boolean): Self = this.set("unsaved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsaved: Self = this.set("unsaved", js.undefined)
  }
}
