package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStandardDataFormatsStatics extends StObject {
  
  var bitmap: String
  
  var html: String
  
  var rtf: String
  
  var storageItems: String
  
  var text: String
  
  var uri: String
}
object IStandardDataFormatsStatics {
  
  inline def apply(bitmap: String, html: String, rtf: String, storageItems: String, text: String, uri: String): IStandardDataFormatsStatics = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], rtf = rtf.asInstanceOf[js.Any], storageItems = storageItems.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStandardDataFormatsStatics]
  }
  
  extension [Self <: IStandardDataFormatsStatics](x: Self) {
    
    inline def setBitmap(value: String): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setRtf(value: String): Self = StObject.set(x, "rtf", value.asInstanceOf[js.Any])
    
    inline def setStorageItems(value: String): Self = StObject.set(x, "storageItems", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
