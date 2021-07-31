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
  
  @scala.inline
  def apply(buffer: WebGLBuffer, bytesPerElement: Double, `type`: Double, version: Double): BytesPerElement = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesPerElement = bytesPerElement.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesPerElement]
  }
  
  @scala.inline
  implicit class BytesPerElementMutableBuilder[Self <: BytesPerElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: WebGLBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesPerElement(value: Double): Self = StObject.set(x, "bytesPerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
