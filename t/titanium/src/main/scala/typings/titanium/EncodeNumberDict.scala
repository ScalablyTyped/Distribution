package typings.titanium

import typings.titanium.Titanium.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Named parameters for <Titanium.Codec.encodeNumber>.
  */
@js.native
trait EncodeNumberDict extends StObject {
  
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
  implicit class EncodeNumberDictMutableBuilder[Self <: EncodeNumberDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteOrder(value: Double): Self = StObject.set(x, "byteOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteOrderUndefined: Self = StObject.set(x, "byteOrder", js.undefined)
    
    @scala.inline
    def setDest(value: Buffer): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
