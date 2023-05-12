package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTSupportIosXCUITest extends StObject {
  
  var POST: SupportIosXCUITest
}
object POSTSupportIosXCUITest {
  
  inline def apply(POST: SupportIosXCUITest): POSTSupportIosXCUITest = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTSupportIosXCUITest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTSupportIosXCUITest] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: SupportIosXCUITest): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
