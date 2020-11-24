package typings.wicgFileSystemAccess.anon

import typings.wicgFileSystemAccess.mod.global.FilePickerAcceptType
import typings.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wicg-file-system-access.wicg-file-system-access.<global>.OpenFilePickerOptions & {  multiple :false | undefined} */
@js.native
trait OpenFilePickerOptionsmult extends js.Object {
  
  var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
  
  var multiple: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
  
  var types: js.UndefOr[js.Array[FilePickerAcceptType]] = js.native
}
object OpenFilePickerOptionsmult {
  
  @scala.inline
  def apply(multiple: js.UndefOr[Boolean] with js.UndefOr[`false`]): OpenFilePickerOptionsmult = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFilePickerOptionsmult]
  }
  
  @scala.inline
  implicit class OpenFilePickerOptionsmultOps[Self <: OpenFilePickerOptionsmult] (val x: Self) extends AnyVal {
    
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
    def setMultiple(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeAcceptAllOption(value: Boolean): Self = this.set("excludeAcceptAllOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeAcceptAllOption: Self = this.set("excludeAcceptAllOption", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: FilePickerAcceptType*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[FilePickerAcceptType]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
