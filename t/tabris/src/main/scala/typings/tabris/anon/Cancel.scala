package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var neutral: js.UndefOr[String] = js.undefined
  
  var ok: js.UndefOr[String] = js.undefined
}
object Cancel {
  
  inline def apply(): Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setNeutral(value: String): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setNeutralUndefined: Self = StObject.set(x, "neutral", js.undefined)
    
    inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
  }
}
