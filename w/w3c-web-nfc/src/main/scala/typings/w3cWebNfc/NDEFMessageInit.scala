package typings.w3cWebNfc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NDEFMessageInit extends StObject {
  
  var records: js.Array[NDEFRecordInit]
}
object NDEFMessageInit {
  
  inline def apply(records: js.Array[NDEFRecordInit]): NDEFMessageInit = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[NDEFMessageInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NDEFMessageInit] (val x: Self) extends AnyVal {
    
    inline def setRecords(value: js.Array[NDEFRecordInit]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsVarargs(value: NDEFRecordInit*): Self = StObject.set(x, "records", js.Array(value*))
  }
}
