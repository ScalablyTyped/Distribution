package typings.webextensionPolyfill.webRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamFilterEventData extends StObject {
  
  /**
    * Contains a chunk of data read from the input stream.
    */
  var data: js.typedarray.ArrayBuffer
}
object StreamFilterEventData {
  
  inline def apply(data: js.typedarray.ArrayBuffer): StreamFilterEventData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamFilterEventData]
  }
  
  extension [Self <: StreamFilterEventData](x: Self) {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
