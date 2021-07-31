package typings.webdriver.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestingbotCapabilities extends StObject {
  
  var public: js.UndefOr[Boolean] = js.undefined
}
object TestingbotCapabilities {
  
  @scala.inline
  def apply(): TestingbotCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingbotCapabilities]
  }
  
  @scala.inline
  implicit class TestingbotCapabilitiesMutableBuilder[Self <: TestingbotCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
  }
}
