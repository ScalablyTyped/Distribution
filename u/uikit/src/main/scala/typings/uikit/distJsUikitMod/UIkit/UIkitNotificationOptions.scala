package typings.uikit.distJsUikitMod.UIkit

import typings.uikit.uikitStrings.`bottom-center`
import typings.uikit.uikitStrings.`bottom-left`
import typings.uikit.uikitStrings.`bottom-right`
import typings.uikit.uikitStrings.`top-center`
import typings.uikit.uikitStrings.`top-left`
import typings.uikit.uikitStrings.`top-right`
import typings.uikit.uikitStrings.danger
import typings.uikit.uikitStrings.primary
import typings.uikit.uikitStrings.success
import typings.uikit.uikitStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitNotificationOptions extends StObject {
  
  var group: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var pos: js.UndefOr[
    `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`
  ] = js.undefined
  
  var status: js.UndefOr[primary | success | warning | danger] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object UIkitNotificationOptions {
  
  inline def apply(): UIkitNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitNotificationOptions]
  }
  
  extension [Self <: UIkitNotificationOptions](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPos(value: `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    
    inline def setStatus(value: primary | success | warning | danger): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
