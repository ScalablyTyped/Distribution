package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestingbotCapabilities extends StObject {
  
  var build: js.UndefOr[String | Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  var `tunnel-identifier`: js.UndefOr[String] = js.undefined
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
    def setBuild(value: String | Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def `setTunnel-identifier`(value: String): Self = StObject.set(x, "tunnel-identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTunnel-identifierUndefined`: Self = StObject.set(x, "tunnel-identifier", js.undefined)
  }
}
