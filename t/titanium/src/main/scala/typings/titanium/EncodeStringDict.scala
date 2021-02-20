package typings.titanium

import typings.titanium.Titanium.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Named parameters for <Titanium.Codec.encodeString>.
  */
@js.native
trait EncodeStringDict extends StObject {
  
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
  implicit class EncodeStringDictMutableBuilder[Self <: EncodeStringDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    @scala.inline
    def setDest(value: Buffer): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestPosition(value: Double): Self = StObject.set(x, "destPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestPositionUndefined: Self = StObject.set(x, "destPosition", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLength(value: Double): Self = StObject.set(x, "sourceLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLengthUndefined: Self = StObject.set(x, "sourceLength", js.undefined)
    
    @scala.inline
    def setSourcePosition(value: Double): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePositionUndefined: Self = StObject.set(x, "sourcePosition", js.undefined)
  }
}
