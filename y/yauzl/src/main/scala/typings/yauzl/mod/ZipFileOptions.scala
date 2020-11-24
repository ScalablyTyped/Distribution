package typings.yauzl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZipFileOptions extends js.Object {
  
  var decompress: Boolean | Null = js.native
  
  var decrypt: Boolean | Null = js.native
  
  var end: Double | Null = js.native
  
  var start: Double | Null = js.native
}
object ZipFileOptions {
  
  @scala.inline
  def apply(): ZipFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipFileOptions]
  }
  
  @scala.inline
  implicit class ZipFileOptionsOps[Self <: ZipFileOptions] (val x: Self) extends AnyVal {
    
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
    def setDecompress(value: Boolean): Self = this.set("decompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecompressNull: Self = this.set("decompress", null)
    
    @scala.inline
    def setDecrypt(value: Boolean): Self = this.set("decrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecryptNull: Self = this.set("decrypt", null)
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndNull: Self = this.set("end", null)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNull: Self = this.set("start", null)
  }
}
