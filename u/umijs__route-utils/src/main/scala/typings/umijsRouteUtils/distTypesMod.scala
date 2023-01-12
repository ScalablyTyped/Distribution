package typings.umijsRouteUtils

import org.scalablytyped.runtime.StringDictionary
import typings.umijsRouteUtils.umijsRouteUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait MenuDataItem
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var children: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
    
    var hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined
    
    var hideInMenu: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[Any] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String | `false`] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var parentKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pro_layout_parentKeys: js.UndefOr[js.Array[String]] = js.undefined
  }
  object MenuDataItem {
    
    inline def apply(): MenuDataItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuDataItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuDataItem] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[MenuDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: MenuDataItem*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setHideChildrenInMenu(value: Boolean): Self = StObject.set(x, "hideChildrenInMenu", value.asInstanceOf[js.Any])
      
      inline def setHideChildrenInMenuUndefined: Self = StObject.set(x, "hideChildrenInMenu", js.undefined)
      
      inline def setHideInMenu(value: Boolean): Self = StObject.set(x, "hideInMenu", value.asInstanceOf[js.Any])
      
      inline def setHideInMenuUndefined: Self = StObject.set(x, "hideInMenu", js.undefined)
      
      inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentKeys(value: js.Array[String]): Self = StObject.set(x, "parentKeys", value.asInstanceOf[js.Any])
      
      inline def setParentKeysUndefined: Self = StObject.set(x, "parentKeys", js.undefined)
      
      inline def setParentKeysVarargs(value: String*): Self = StObject.set(x, "parentKeys", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPro_layout_parentKeys(value: js.Array[String]): Self = StObject.set(x, "pro_layout_parentKeys", value.asInstanceOf[js.Any])
      
      inline def setPro_layout_parentKeysUndefined: Self = StObject.set(x, "pro_layout_parentKeys", js.undefined)
      
      inline def setPro_layout_parentKeysVarargs(value: String*): Self = StObject.set(x, "pro_layout_parentKeys", js.Array(value*))
    }
  }
  
  trait MessageDescriptor extends StObject {
    
    var defaultMessage: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var id: Any
  }
  object MessageDescriptor {
    
    inline def apply(id: Any): MessageDescriptor = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageDescriptor] (val x: Self) extends AnyVal {
      
      inline def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
      
      inline def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Route
    extends StObject
       with MenuDataItem {
    
    var routes: js.UndefOr[js.Array[Route]] = js.undefined
  }
  object Route {
    
    inline def apply(): Route = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      inline def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
}
