package typings.yjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestEncoder extends StObject {
  
  var restEncoder: js.typedarray.Uint8Array
  
  var written: Double
}
object RestEncoder {
  
  inline def apply(restEncoder: js.typedarray.Uint8Array, written: Double): RestEncoder = {
    val __obj = js.Dynamic.literal(restEncoder = restEncoder.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestEncoder]
  }
  
  extension [Self <: RestEncoder](x: Self) {
    
    inline def setRestEncoder(value: js.typedarray.Uint8Array): Self = StObject.set(x, "restEncoder", value.asInstanceOf[js.Any])
    
    inline def setWritten(value: Double): Self = StObject.set(x, "written", value.asInstanceOf[js.Any])
  }
}
