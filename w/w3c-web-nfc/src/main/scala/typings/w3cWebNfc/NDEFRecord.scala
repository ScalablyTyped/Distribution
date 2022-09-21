package typings.w3cWebNfc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NDEFRecord extends StObject {
  
  val data: js.UndefOr[js.typedarray.DataView] = js.undefined
  
  val encoding: js.UndefOr[String] = js.undefined
  
  val id: js.UndefOr[String] = js.undefined
  
  val lang: js.UndefOr[String] = js.undefined
  
  val mediaType: js.UndefOr[String] = js.undefined
  
  val recordType: String
  
  var toRecords: js.UndefOr[js.Function0[js.Array[this.type]]] = js.undefined
}
object NDEFRecord {
  
  inline def apply(recordType: String): NDEFRecord = {
    val __obj = js.Dynamic.literal(recordType = recordType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NDEFRecord]
  }
  
  extension [Self <: NDEFRecord](x: Self) {
    
    inline def setData(value: js.typedarray.DataView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    inline def setRecordType(value: String): Self = StObject.set(x, "recordType", value.asInstanceOf[js.Any])
    
    inline def setToRecords(value: () => js.Array[NDEFRecord]): Self = StObject.set(x, "toRecords", js.Any.fromFunction0(value))
    
    inline def setToRecordsUndefined: Self = StObject.set(x, "toRecords", js.undefined)
  }
}
