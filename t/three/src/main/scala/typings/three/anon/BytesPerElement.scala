package typings.three.anon

import typings.std.WebGLBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesPerElement extends StObject {
  
  var buffer: WebGLBuffer
  
  var bytesPerElement: Double
  
  var `type`: Double
  
  var version: Double
}
object BytesPerElement {
  
  inline def apply(buffer: WebGLBuffer, bytesPerElement: Double, `type`: Double, version: Double): BytesPerElement = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesPerElement = bytesPerElement.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesPerElement]
  }
  
  extension [Self <: BytesPerElement](x: Self) {
    
    inline def setBuffer(value: WebGLBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesPerElement(value: Double): Self = StObject.set(x, "bytesPerElement", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
