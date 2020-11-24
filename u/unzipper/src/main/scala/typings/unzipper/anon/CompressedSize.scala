package typings.unzipper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompressedSize extends js.Object {
  
  var compressedSize: Double = js.native
  
  var compressionMethod: Double = js.native
  
  var crc32: Double = js.native
  
  var extraFieldLength: Double = js.native
  
  var fileNameLength: Double = js.native
  
  var flags: Double = js.native
  
  var lastModifiedTime: Double = js.native
  
  var signature: js.UndefOr[Double] = js.native
  
  var versionsNeededToExtract: Double = js.native
}
object CompressedSize {
  
  @scala.inline
  def apply(
    compressedSize: Double,
    compressionMethod: Double,
    crc32: Double,
    extraFieldLength: Double,
    fileNameLength: Double,
    flags: Double,
    lastModifiedTime: Double,
    versionsNeededToExtract: Double
  ): CompressedSize = {
    val __obj = js.Dynamic.literal(compressedSize = compressedSize.asInstanceOf[js.Any], compressionMethod = compressionMethod.asInstanceOf[js.Any], crc32 = crc32.asInstanceOf[js.Any], extraFieldLength = extraFieldLength.asInstanceOf[js.Any], fileNameLength = fileNameLength.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], versionsNeededToExtract = versionsNeededToExtract.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressedSize]
  }
  
  @scala.inline
  implicit class CompressedSizeOps[Self <: CompressedSize] (val x: Self) extends AnyVal {
    
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
    def setCompressedSize(value: Double): Self = this.set("compressedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionMethod(value: Double): Self = this.set("compressionMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrc32(value: Double): Self = this.set("crc32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraFieldLength(value: Double): Self = this.set("extraFieldLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameLength(value: Double): Self = this.set("fileNameLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: Double): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsNeededToExtract(value: Double): Self = this.set("versionsNeededToExtract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: Double): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
}
