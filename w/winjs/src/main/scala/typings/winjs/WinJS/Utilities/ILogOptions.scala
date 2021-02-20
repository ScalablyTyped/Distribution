package typings.winjs.WinJS.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion Properties
//#region Interfaces
@js.native
trait ILogOptions extends StObject {
  
  var action: js.UndefOr[js.Function3[/* message */ String, /* tags */ String, /* type */ String, Unit]] = js.native
  
  var excludeTags: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ILogOptions {
  
  @scala.inline
  def apply(): ILogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILogOptions]
  }
  
  @scala.inline
  implicit class ILogOptionsMutableBuilder[Self <: ILogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: (/* message */ String, /* tags */ String, /* type */ String) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction3(value))
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setExcludeTags(value: String): Self = StObject.set(x, "excludeTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeTagsUndefined: Self = StObject.set(x, "excludeTags", js.undefined)
    
    @scala.inline
    def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
