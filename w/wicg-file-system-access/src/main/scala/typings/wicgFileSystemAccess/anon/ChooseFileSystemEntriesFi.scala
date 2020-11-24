package typings.wicgFileSystemAccess.anon

import typings.wicgFileSystemAccess.mod.global.ChooseFileSystemEntriesOptionsAccepts
import typings.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`false`
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.`open-file`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wicg-file-system-access.wicg-file-system-access.<global>.ChooseFileSystemEntriesFileOptions & {  type :'open-file' | undefined,   multiple :false | undefined} */
@js.native
trait ChooseFileSystemEntriesFi extends js.Object {
  
  var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.native
  
  var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
  
  var multiple: js.UndefOr[`false`] = js.native
  
  var `type`: js.UndefOr[`open-file`] = js.native
}
object ChooseFileSystemEntriesFi {
  
  @scala.inline
  def apply(): ChooseFileSystemEntriesFi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseFileSystemEntriesFi]
  }
  
  @scala.inline
  implicit class ChooseFileSystemEntriesFiOps[Self <: ChooseFileSystemEntriesFi] (val x: Self) extends AnyVal {
    
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
    def setAcceptsVarargs(value: ChooseFileSystemEntriesOptionsAccepts*): Self = this.set("accepts", js.Array(value :_*))
    
    @scala.inline
    def setAccepts(value: js.Array[ChooseFileSystemEntriesOptionsAccepts]): Self = this.set("accepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccepts: Self = this.set("accepts", js.undefined)
    
    @scala.inline
    def setExcludeAcceptAllOption(value: Boolean): Self = this.set("excludeAcceptAllOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeAcceptAllOption: Self = this.set("excludeAcceptAllOption", js.undefined)
    
    @scala.inline
    def setMultiple(value: `false`): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setType(value: `open-file`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
