package typings.winjs.WinJS.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion Properties
//#region Interfaces
trait ILogOptions extends StObject {
  
  var action: js.UndefOr[js.Function3[/* message */ String, /* tags */ String, /* type */ String, Unit]] = js.undefined
  
  var excludeTags: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ILogOptions {
  
  inline def apply(): ILogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILogOptions]
  }
  
  extension [Self <: ILogOptions](x: Self) {
    
    inline def setAction(value: (/* message */ String, /* tags */ String, /* type */ String) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction3(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setExcludeTags(value: String): Self = StObject.set(x, "excludeTags", value.asInstanceOf[js.Any])
    
    inline def setExcludeTagsUndefined: Self = StObject.set(x, "excludeTags", js.undefined)
    
    inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
