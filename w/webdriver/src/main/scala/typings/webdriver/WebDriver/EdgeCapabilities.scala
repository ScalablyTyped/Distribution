package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeCapabilities extends StObject {
  
  @JSName("ms:extensionPaths")
  var msColonextensionPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("ms:inPrivate")
  var msColoninPrivate: js.UndefOr[Boolean] = js.undefined
  
  @JSName("ms:startPage")
  var msColonstartPage: js.UndefOr[String] = js.undefined
}
object EdgeCapabilities {
  
  @scala.inline
  def apply(): EdgeCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeCapabilities]
  }
  
  @scala.inline
  implicit class EdgeCapabilitiesMutableBuilder[Self <: EdgeCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMsColonextensionPaths(value: js.Array[String]): Self = StObject.set(x, "ms:extensionPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsColonextensionPathsUndefined: Self = StObject.set(x, "ms:extensionPaths", js.undefined)
    
    @scala.inline
    def setMsColonextensionPathsVarargs(value: String*): Self = StObject.set(x, "ms:extensionPaths", js.Array(value :_*))
    
    @scala.inline
    def setMsColoninPrivate(value: Boolean): Self = StObject.set(x, "ms:inPrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsColoninPrivateUndefined: Self = StObject.set(x, "ms:inPrivate", js.undefined)
    
    @scala.inline
    def setMsColonstartPage(value: String): Self = StObject.set(x, "ms:startPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsColonstartPageUndefined: Self = StObject.set(x, "ms:startPage", js.undefined)
  }
}
