package typings.tengitsui.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedAuth
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[Double | String]] {
  
  var add: js.UndefOr[Double | String] = js.undefined
  
  var edit: js.UndefOr[Double | String] = js.undefined
  
  var list: js.UndefOr[Double | String] = js.undefined
  
  var remove: js.UndefOr[Double | String] = js.undefined
}
object AdvancedAuth {
  
  inline def apply(): AdvancedAuth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedAuth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedAuth] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Double | String): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setEdit(value: Double | String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setList(value: Double | String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setRemove(value: Double | String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
