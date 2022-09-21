package typings.w3cWebNfc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NDEFRecordInit extends StObject {
  
  var data: js.UndefOr[NDEFRecordDataSource] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var mediaType: js.UndefOr[String] = js.undefined
  
  var recordType: String
}
object NDEFRecordInit {
  
  inline def apply(recordType: String): NDEFRecordInit = {
    val __obj = js.Dynamic.literal(recordType = recordType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NDEFRecordInit]
  }
  
  extension [Self <: NDEFRecordInit](x: Self) {
    
    inline def setData(value: NDEFRecordDataSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
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
  }
}
