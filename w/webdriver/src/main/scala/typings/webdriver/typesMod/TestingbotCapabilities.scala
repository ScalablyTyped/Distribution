package typings.webdriver.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestingbotCapabilities extends StObject {
  
  var public: js.UndefOr[Boolean] = js.undefined
}
object TestingbotCapabilities {
  
  inline def apply(): TestingbotCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingbotCapabilities]
  }
  
  extension [Self <: TestingbotCapabilities](x: Self) {
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
  }
}
