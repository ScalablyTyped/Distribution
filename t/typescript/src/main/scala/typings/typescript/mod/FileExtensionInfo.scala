package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileExtensionInfo extends js.Object {
  
  var extension: java.lang.String = js.native
  
  var isMixedContent: Boolean = js.native
  
  var scriptKind: js.UndefOr[ScriptKind] = js.native
}
object FileExtensionInfo {
  
  @scala.inline
  def apply(extension: java.lang.String, isMixedContent: Boolean): FileExtensionInfo = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], isMixedContent = isMixedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileExtensionInfo]
  }
  
  @scala.inline
  implicit class FileExtensionInfoOps[Self <: FileExtensionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtension(value: java.lang.String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMixedContent(value: Boolean): Self = this.set("isMixedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptKind(value: ScriptKind): Self = this.set("scriptKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptKind: Self = this.set("scriptKind", js.undefined)
  }
}
