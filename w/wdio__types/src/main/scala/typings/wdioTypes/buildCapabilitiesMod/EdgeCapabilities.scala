package typings.wdioTypes.buildCapabilitiesMod

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
  
  inline def apply(): EdgeCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeCapabilities]
  }
  
  extension [Self <: EdgeCapabilities](x: Self) {
    
    inline def setMsColonextensionPaths(value: js.Array[String]): Self = StObject.set(x, "ms:extensionPaths", value.asInstanceOf[js.Any])
    
    inline def setMsColonextensionPathsUndefined: Self = StObject.set(x, "ms:extensionPaths", js.undefined)
    
    inline def setMsColonextensionPathsVarargs(value: String*): Self = StObject.set(x, "ms:extensionPaths", js.Array(value*))
    
    inline def setMsColoninPrivate(value: Boolean): Self = StObject.set(x, "ms:inPrivate", value.asInstanceOf[js.Any])
    
    inline def setMsColoninPrivateUndefined: Self = StObject.set(x, "ms:inPrivate", js.undefined)
    
    inline def setMsColonstartPage(value: String): Self = StObject.set(x, "ms:startPage", value.asInstanceOf[js.Any])
    
    inline def setMsColonstartPageUndefined: Self = StObject.set(x, "ms:startPage", js.undefined)
  }
}
