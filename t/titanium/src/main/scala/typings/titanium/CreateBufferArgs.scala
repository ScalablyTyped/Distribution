package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments to be passed to createBuffer
  */
@js.native
trait CreateBufferArgs extends StObject {
  
  /**
    * The byte order of this buffer.
    */
  var byteOrder: js.UndefOr[Double] = js.native
  
  /**
    * The length of the buffer.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * The type of data encoding to use with `value`.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * An initial value which will be encoded and placed in the buffer. If value is a Number, type must also be set. (this is simply a convenient way of calling <Titanium.Codec.encodeString> or <Titanium.Codec.encodeNumber> and placing the encoded value in the returned buffer.)
    */
  var value: js.UndefOr[String | Double] = js.native
}
object CreateBufferArgs {
  
  @scala.inline
  def apply(): CreateBufferArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBufferArgs]
  }
  
  @scala.inline
  implicit class CreateBufferArgsMutableBuilder[Self <: CreateBufferArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteOrder(value: Double): Self = StObject.set(x, "byteOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteOrderUndefined: Self = StObject.set(x, "byteOrder", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
