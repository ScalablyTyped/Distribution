package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTSupportAndroidUiAutomator extends StObject {
  
  var POST: SupportAndroidUiAutomator
}
object POSTSupportAndroidUiAutomator {
  
  inline def apply(POST: SupportAndroidUiAutomator): POSTSupportAndroidUiAutomator = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTSupportAndroidUiAutomator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTSupportAndroidUiAutomator] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: SupportAndroidUiAutomator): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
