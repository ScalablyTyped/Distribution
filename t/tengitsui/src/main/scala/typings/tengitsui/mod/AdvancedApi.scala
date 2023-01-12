package typings.tengitsui.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedApi
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[String | Api]] {
  
  var add: js.UndefOr[String | Api] = js.undefined
  
  var edit: js.UndefOr[String | Api] = js.undefined
  
  var list: js.UndefOr[String] = js.undefined
  
  var remove: js.UndefOr[String | Api] = js.undefined
}
object AdvancedApi {
  
  inline def apply(): AdvancedApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedApi] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: String | Api): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setEdit(value: String | Api): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setRemove(value: String | Api): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
