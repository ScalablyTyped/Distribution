package typings.w3cWebNfc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NDEFMessage extends StObject {
  
  var records: js.Array[NDEFRecord]
}
object NDEFMessage {
  
  inline def apply(records: js.Array[NDEFRecord]): NDEFMessage = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[NDEFMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NDEFMessage] (val x: Self) extends AnyVal {
    
    inline def setRecords(value: js.Array[NDEFRecord]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsVarargs(value: NDEFRecord*): Self = StObject.set(x, "records", js.Array(value*))
  }
}
