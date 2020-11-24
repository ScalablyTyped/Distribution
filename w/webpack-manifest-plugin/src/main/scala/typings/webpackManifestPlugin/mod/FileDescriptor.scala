package typings.webpackManifestPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileDescriptor extends js.Object {
  
  /** Only available is isChunk is true. */
  var chunk: js.UndefOr[Chunk] = js.native
  
  var isAsset: Boolean = js.native
  
  var isChunk: Boolean = js.native
  
  /** Is required to run you app. Cannot be true if isChunk is false. */
  var isInitial: Boolean = js.native
  
  /** Is required by a module. Cannot be true if isAsset is false. */
  var isModuleAsset: Boolean = js.native
  
  var name: String | Null = js.native
  
  var path: String = js.native
}
object FileDescriptor {
  
  @scala.inline
  def apply(isAsset: Boolean, isChunk: Boolean, isInitial: Boolean, isModuleAsset: Boolean, path: String): FileDescriptor = {
    val __obj = js.Dynamic.literal(isAsset = isAsset.asInstanceOf[js.Any], isChunk = isChunk.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isModuleAsset = isModuleAsset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptor]
  }
  
  @scala.inline
  implicit class FileDescriptorOps[Self <: FileDescriptor] (val x: Self) extends AnyVal {
    
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
    def setIsAsset(value: Boolean): Self = this.set("isAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChunk(value: Boolean): Self = this.set("isChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInitial(value: Boolean): Self = this.set("isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModuleAsset(value: Boolean): Self = this.set("isModuleAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunk(value: Chunk): Self = this.set("chunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunk: Self = this.set("chunk", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
}
