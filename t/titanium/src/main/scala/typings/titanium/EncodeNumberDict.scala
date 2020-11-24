package typings.titanium

import typings.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Named parameters for <Titanium.Codec.encodeNumber>.
  */
@js.native
trait EncodeNumberDict extends js.Object {
  
  /**
    * Byte order to encode with.
    */
  var byteOrder: js.UndefOr[Double] = js.native
  
  /**
    * Destination buffer.
    */
  var dest: Buffer = js.native
  
  /**
    * Index in the `dest` buffer of the first byte of encoded data.
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    * Number to encode.
    */
  var source: Double = js.native
  
  /**
    * Encoding type to use.
    */
  var `type`: String = js.native
}
object EncodeNumberDict {
  
  @scala.inline
  def apply(dest: Buffer, source: Double, `type`: String): EncodeNumberDict = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeNumberDict]
  }
  
  @scala.inline
  implicit class EncodeNumberDictOps[Self <: EncodeNumberDict] (val x: Self) extends AnyVal {
    
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
    def setDest(value: Buffer): Self = this.set("dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Double): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteOrder(value: Double): Self = this.set("byteOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteOrder: Self = this.set("byteOrder", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
