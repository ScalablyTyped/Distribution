package typings.titanium

import typings.titanium.Titanium.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Named parameters for <Titanium.Codec.decodeNumber>.
  */
@js.native
trait DecodeNumberDict extends StObject {
  
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
  implicit class DecodeNumberDictMutableBuilder[Self <: DecodeNumberDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteOrder(value: Double): Self = StObject.set(x, "byteOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteOrderUndefined: Self = StObject.set(x, "byteOrder", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSource(value: Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
