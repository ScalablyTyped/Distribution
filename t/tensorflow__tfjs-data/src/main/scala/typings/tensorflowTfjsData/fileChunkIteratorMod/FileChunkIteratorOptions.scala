package typings.tensorflowTfjsData.fileChunkIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileChunkIteratorOptions extends js.Object {
  
  /** The number of bytes to read at a time. Default 1MB. */
  var chunkSize: js.UndefOr[Double] = js.native
  
  /** The byte offset at which to begin reading the File or Blob. Default 0. */
  var offset: js.UndefOr[Double] = js.native
}
object FileChunkIteratorOptions {
  
  @scala.inline
  def apply(): FileChunkIteratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileChunkIteratorOptions]
  }
  
  @scala.inline
  implicit class FileChunkIteratorOptionsOps[Self <: FileChunkIteratorOptions] (val x: Self) extends AnyVal {
    
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
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
