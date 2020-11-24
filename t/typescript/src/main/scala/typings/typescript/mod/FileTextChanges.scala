package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileTextChanges extends js.Object {
  
  var fileName: java.lang.String = js.native
  
  var isNewFile: js.UndefOr[Boolean] = js.native
  
  var textChanges: js.Array[TextChange] = js.native
}
object FileTextChanges {
  
  @scala.inline
  def apply(fileName: java.lang.String, textChanges: js.Array[TextChange]): FileTextChanges = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textChanges = textChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTextChanges]
  }
  
  @scala.inline
  implicit class FileTextChangesOps[Self <: FileTextChanges] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: java.lang.String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextChangesVarargs(value: TextChange*): Self = this.set("textChanges", js.Array(value :_*))
    
    @scala.inline
    def setTextChanges(value: js.Array[TextChange]): Self = this.set("textChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewFile(value: Boolean): Self = this.set("isNewFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNewFile: Self = this.set("isNewFile", js.undefined)
  }
}
