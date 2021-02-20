package typings.titanium

import typings.titanium.Titanium.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Named parameters for <Titanium.Codec.decodeString>.
  */
@js.native
trait DecodeStringDict extends StObject {
  
  /**
    * Character set to use when encoding this string to bytes.
    */
  var charset: js.UndefOr[String] = js.native
  
  /**
    * Number of bytes to decode.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * Index in the `source` buffer of the first byte of data to decode.
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    * Buffer to decode.
    */
  var source: Buffer = js.native
}
object DecodeStringDict {
  
  @scala.inline
  def apply(source: Buffer): DecodeStringDict = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeStringDict]
  }
  
  @scala.inline
  implicit class DecodeStringDictMutableBuilder[Self <: DecodeStringDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSource(value: Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
