package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesWritten extends StObject {
  
  /** Property that should be returned when `allowPartial` is true to indicate the number of bytes starting from address that were successfully written. */
  var bytesWritten: js.UndefOr[Double] = js.undefined
  
  /** Property that should be returned when `allowPartial` is true to indicate the offset of the first byte of data successfully written. Can be negative. */
  var offset: js.UndefOr[Double] = js.undefined
}
object BytesWritten {
  
  inline def apply(): BytesWritten = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BytesWritten]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BytesWritten] (val x: Self) extends AnyVal {
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    
    inline def setBytesWrittenUndefined: Self = StObject.set(x, "bytesWritten", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
