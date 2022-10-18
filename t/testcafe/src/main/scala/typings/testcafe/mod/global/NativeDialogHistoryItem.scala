package typings.testcafe.mod.global

import typings.testcafe.testcafeStrings.alert
import typings.testcafe.testcafeStrings.beforeunload
import typings.testcafe.testcafeStrings.confirm
import typings.testcafe.testcafeStrings.prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// // 
trait NativeDialogHistoryItem extends StObject {
  
  /**
    * Text of the dialog message.
    */
  var text: String
  
  /**
    * The type of the native dialog.
    */
  var `type`: alert | confirm | beforeunload | prompt
  
  /**
    * The URL of the page that invoked the dialog. Use it to determine if the dialog originated
    * from the main window or an `<iframe>`.
    */
  var url: String
}
object NativeDialogHistoryItem {
  
  inline def apply(text: String, `type`: alert | confirm | beforeunload | prompt, url: String): NativeDialogHistoryItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeDialogHistoryItem]
  }
  
  extension [Self <: NativeDialogHistoryItem](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: alert | confirm | beforeunload | prompt): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
