package typings.telegramWebApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object describes the native popup for scanning QR codes.
  */
trait ScanQrPopupParams extends StObject {
  
  /**
    * The text to be displayed under the 'Scan QR' heading, 0-64 characters.
    */
  var text: js.UndefOr[String] = js.undefined
}
object ScanQrPopupParams {
  
  inline def apply(): ScanQrPopupParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanQrPopupParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScanQrPopupParams] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
