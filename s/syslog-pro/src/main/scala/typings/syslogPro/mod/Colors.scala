package typings.syslogPro.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  /**
    * A RGB Hex coded color in the form of #FFFFFF or as the ANSI color code number
    * (30-37 Standard & 0-255 Extended).
    */
  var alertColor: js.UndefOr[String | Double] = js.undefined
  
  /**
    * A RGB Hex coded color in the form of #FFFFFF or as the ANSI color code number
    * (30-37 Standard & 0-255 Extended).
    */
  var criticalColor: js.UndefOr[String | Double] = js.undefined
  
  /**
    * A RGB Hex coded color in the form of #FFFFFF or as the ANSI color code number
    * (30-37 Standard & 0-255 Extended).
    */
  var debugColor: js.UndefOr[String | Double] = js.undefined
  
  /**
    * A RGB Hex coded color in the form of #FFFFFF or as the ANSI color code number
    * (30-37 Standard & 0-255 Extended).
    */
  var emergencyColor: js.UndefOr[String | Double] = js.undefined
  
  /**
    * A RGB Hex coded color in the form of #FFFFFF or as the ANSI color code number
    * (30-37 Standard & 0-255 Extended).
    */
  var errorColor: js.UndefOr[String | Double] = js.undefined
  
  /**
    * A RGB Hex coded color in the form of #FFFFFF or as the ANSI color code number
    * (30-37 Standard & 0-255 Extended).
    */
  var informationalColor: js.UndefOr[String | Double] = js.undefined
  
  /**
    * A RGB Hex coded color in the form of #FFFFFF or as the ANSI color code number
    * (30-37 Standard & 0-255 Extended).
    */
  var noticeColor: js.UndefOr[String | Double] = js.undefined
  
  /**
    * A RGB Hex coded color in the form of #FFFFFF or as the ANSI color code number
    * (30-37 Standard & 0-255 Extended).
    */
  var warningColor: js.UndefOr[String | Double] = js.undefined
}
object Colors {
  
  inline def apply(): Colors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
    
    inline def setAlertColor(value: String | Double): Self = StObject.set(x, "alertColor", value.asInstanceOf[js.Any])
    
    inline def setAlertColorUndefined: Self = StObject.set(x, "alertColor", js.undefined)
    
    inline def setCriticalColor(value: String | Double): Self = StObject.set(x, "criticalColor", value.asInstanceOf[js.Any])
    
    inline def setCriticalColorUndefined: Self = StObject.set(x, "criticalColor", js.undefined)
    
    inline def setDebugColor(value: String | Double): Self = StObject.set(x, "debugColor", value.asInstanceOf[js.Any])
    
    inline def setDebugColorUndefined: Self = StObject.set(x, "debugColor", js.undefined)
    
    inline def setEmergencyColor(value: String | Double): Self = StObject.set(x, "emergencyColor", value.asInstanceOf[js.Any])
    
    inline def setEmergencyColorUndefined: Self = StObject.set(x, "emergencyColor", js.undefined)
    
    inline def setErrorColor(value: String | Double): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
    
    inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
    
    inline def setInformationalColor(value: String | Double): Self = StObject.set(x, "informationalColor", value.asInstanceOf[js.Any])
    
    inline def setInformationalColorUndefined: Self = StObject.set(x, "informationalColor", js.undefined)
    
    inline def setNoticeColor(value: String | Double): Self = StObject.set(x, "noticeColor", value.asInstanceOf[js.Any])
    
    inline def setNoticeColorUndefined: Self = StObject.set(x, "noticeColor", js.undefined)
    
    inline def setWarningColor(value: String | Double): Self = StObject.set(x, "warningColor", value.asInstanceOf[js.Any])
    
    inline def setWarningColorUndefined: Self = StObject.set(x, "warningColor", js.undefined)
  }
}
