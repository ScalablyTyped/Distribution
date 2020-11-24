package typings.wiredep.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileObject extends js.Object {
  
  /**
    * type of wiredep block ('js', 'css', etc)
    */
  var block: String = js.native
  
  /**
    * name of file that was updated
    */
  var file: String = js.native
  
  /**
    * path to file that was injected
    */
  var path: String = js.native
}
object FileObject {
  
  @scala.inline
  def apply(block: String, file: String, path: String): FileObject = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileObject]
  }
  
  @scala.inline
  implicit class FileObjectOps[Self <: FileObject] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: String): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
