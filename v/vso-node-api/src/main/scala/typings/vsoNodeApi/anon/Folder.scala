package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Folder extends js.Object {
  
  var folder: scala.Double = js.native
  
  var invalid: scala.Double = js.native
  
  var ref: scala.Double = js.native
}
object Folder {
  
  @scala.inline
  def apply(folder: scala.Double, invalid: scala.Double, ref: scala.Double): Folder = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
  
  @scala.inline
  implicit class FolderOps[Self <: Folder] (val x: Self) extends AnyVal {
    
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
    def setFolder(value: scala.Double): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid(value: scala.Double): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: scala.Double): Self = this.set("ref", value.asInstanceOf[js.Any])
  }
}
