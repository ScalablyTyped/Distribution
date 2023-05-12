package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTSupportAndroidIosWindows extends StObject {
  
  var POST: SupportAndroidIosWindows
}
object POSTSupportAndroidIosWindows {
  
  inline def apply(POST: SupportAndroidIosWindows): POSTSupportAndroidIosWindows = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTSupportAndroidIosWindows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTSupportAndroidIosWindows] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: SupportAndroidIosWindows): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
