package typings.titanium

import typings.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Named parameters for <Titanium.Codec.encodeString>.
  */
@js.native
trait EncodeStringDict extends js.Object {
  
  /**
    * Character encoding to use when encoding this string to bytes.
    */
  var charset: js.UndefOr[String] = js.native
  
  /**
    * Destination buffer.
    */
  var dest: Buffer = js.native
  
  /**
    * Index in the `dest` buffer of the first byte of the encoded string.
    */
  var destPosition: js.UndefOr[Double] = js.native
  
  /**
    * Source string to encode.
    */
  var source: String = js.native
  
  /**
    * Number of characters in `source` to encode.
    */
  var sourceLength: js.UndefOr[Double] = js.native
  
  /**
    * Position in `source` to start encoding.
    */
  var sourcePosition: js.UndefOr[Double] = js.native
}
object EncodeStringDict {
  
  @scala.inline
  def apply(dest: Buffer, source: String): EncodeStringDict = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeStringDict]
  }
  
  @scala.inline
  implicit class EncodeStringDictOps[Self <: EncodeStringDict] (val x: Self) extends AnyVal {
    
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setDestPosition(value: Double): Self = this.set("destPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestPosition: Self = this.set("destPosition", js.undefined)
    
    @scala.inline
    def setSourceLength(value: Double): Self = this.set("sourceLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLength: Self = this.set("sourceLength", js.undefined)
    
    @scala.inline
    def setSourcePosition(value: Double): Self = this.set("sourcePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePosition: Self = this.set("sourcePosition", js.undefined)
  }
}
