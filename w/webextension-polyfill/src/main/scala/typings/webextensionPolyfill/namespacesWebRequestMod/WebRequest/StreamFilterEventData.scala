package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamFilterEventData] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
