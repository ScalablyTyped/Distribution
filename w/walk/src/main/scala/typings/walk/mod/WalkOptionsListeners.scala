package typings.walk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalkOptionsListeners extends js.Object {
  
  var directories: js.UndefOr[WalkStatArrayEventCallback] = js.native
  
  var directory: js.UndefOr[WalkStatEventCallback] = js.native
  
  var directoryError: js.UndefOr[WalkStatArrayEventCallback] = js.native
  
  var end: js.UndefOr[WalkStatArrayEventCallback] = js.native
  
  var errors: js.UndefOr[WalkStatArrayEventCallback] = js.native
  
  var file: js.UndefOr[WalkStatEventCallback] = js.native
  
  var files: js.UndefOr[WalkStatArrayEventCallback] = js.native
  
  var names: js.UndefOr[WalkNamesEventCallback] = js.native
  
  var nodeError: js.UndefOr[WalkStatArrayEventCallback] = js.native
}
object WalkOptionsListeners {
  
  @scala.inline
  def apply(): WalkOptionsListeners = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkOptionsListeners]
  }
  
  @scala.inline
  implicit class WalkOptionsListenersOps[Self <: WalkOptionsListeners] (val x: Self) extends AnyVal {
    
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
    def setDirectories(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = this.set("directories", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    
    @scala.inline
    def setDirectory(value: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Unit): Self = this.set("directory", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    
    @scala.inline
    def setDirectoryError(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = this.set("directoryError", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDirectoryError: Self = this.set("directoryError", js.undefined)
    
    @scala.inline
    def setEnd(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = this.set("end", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setErrors(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = this.set("errors", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setFile(value: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Unit): Self = this.set("file", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setFiles(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = this.set("files", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setNames(value: (/* base */ String, /* names */ js.Array[String], /* next */ WalkNext) => Unit): Self = this.set("names", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    
    @scala.inline
    def setNodeError(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = this.set("nodeError", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNodeError: Self = this.set("nodeError", js.undefined)
  }
}
