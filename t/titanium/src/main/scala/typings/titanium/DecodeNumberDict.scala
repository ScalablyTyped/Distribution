package typings.titanium

import typings.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Named parameters for <Titanium.Codec.decodeNumber>.
  */
@js.native
trait DecodeNumberDict extends js.Object {
  
  /**
    * byte order to decode with.
    */
  var byteOrder: js.UndefOr[Double] = js.native
  
  /**
    * Index in the `source` buffer of the first byte of data to decode.
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    * Buffer to decode.
    */
  var source: Buffer = js.native
  
  /**
    * The encoding type to use.
    */
  var `type`: String = js.native
}
object DecodeNumberDict {
  
  @scala.inline
  def apply(source: Buffer, `type`: String): DecodeNumberDict = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeNumberDict]
  }
  
  @scala.inline
  implicit class DecodeNumberDictOps[Self <: DecodeNumberDict] (val x: Self) extends AnyVal {
    
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
    def setSource(value: Buffer): Self = this.set("source", value.asInstanceOf[js.Any])
    
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
