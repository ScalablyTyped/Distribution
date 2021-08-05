package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies how to parse data in the buffer. */
trait Printing3DBufferDescription extends StObject {
  
  /** Specifies the format used by the buffer. */
  var format: Printing3DBufferFormat
  
  /** Specifies how far to move the pointer forward to find the next unit of data. */
  var stride: Double
}
object Printing3DBufferDescription {
  
  inline def apply(format: Printing3DBufferFormat, stride: Double): Printing3DBufferDescription = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DBufferDescription]
  }
  
  extension [Self <: Printing3DBufferDescription](x: Self) {
    
    inline def setFormat(value: Printing3DBufferFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setStride(value: Double): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
  }
}
