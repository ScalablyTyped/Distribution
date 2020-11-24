package typings.xar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TOCHeader extends js.Object {
  
  var cksumAlg: Double = js.native
  
  var size: Double = js.native
  
  var tocLengthCompressed: Double = js.native
  
  var tocLengthUncompressed: Double = js.native
  
  var version: Double = js.native
}
object TOCHeader {
  
  @scala.inline
  def apply(
    cksumAlg: Double,
    size: Double,
    tocLengthCompressed: Double,
    tocLengthUncompressed: Double,
    version: Double
  ): TOCHeader = {
    val __obj = js.Dynamic.literal(cksumAlg = cksumAlg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tocLengthCompressed = tocLengthCompressed.asInstanceOf[js.Any], tocLengthUncompressed = tocLengthUncompressed.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TOCHeader]
  }
  
  @scala.inline
  implicit class TOCHeaderOps[Self <: TOCHeader] (val x: Self) extends AnyVal {
    
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
    def setCksumAlg(value: Double): Self = this.set("cksumAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocLengthCompressed(value: Double): Self = this.set("tocLengthCompressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocLengthUncompressed(value: Double): Self = this.set("tocLengthUncompressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
