package typings.tmp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileOptions extends TmpNameOptions {
  
  var detachDescriptor: js.UndefOr[Boolean] = js.native
  
  var discardDescriptor: js.UndefOr[Boolean] = js.native
  
  var keep: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[Double] = js.native
}
object FileOptions {
  
  @scala.inline
  def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  
  @scala.inline
  implicit class FileOptionsOps[Self <: FileOptions] (val x: Self) extends AnyVal {
    
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
    def setDetachDescriptor(value: Boolean): Self = this.set("detachDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetachDescriptor: Self = this.set("detachDescriptor", js.undefined)
    
    @scala.inline
    def setDiscardDescriptor(value: Boolean): Self = this.set("discardDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscardDescriptor: Self = this.set("discardDescriptor", js.undefined)
    
    @scala.inline
    def setKeep(value: Boolean): Self = this.set("keep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep: Self = this.set("keep", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
