package typings.winrtUwp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */ var buffer: js.Array[Double]
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */ var bytesWritten: Double
}
object Buffer {
  
  @scala.inline
  def apply(buffer: js.Array[Double], bytesWritten: Double): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: js.Array[Double]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferVarargs(value: Double*): Self = StObject.set(x, "buffer", js.Array(value :_*))
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
