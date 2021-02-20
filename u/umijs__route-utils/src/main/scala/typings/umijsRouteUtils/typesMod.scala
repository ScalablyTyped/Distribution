package typings.umijsRouteUtils

import org.scalablytyped.runtime.StringDictionary
import typings.umijsRouteUtils.umijsRouteUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MenuDataItem
    extends /* key */ StringDictionary[js.Any] {
    
    var children: js.UndefOr[js.Array[MenuDataItem]] = js.native
    
    var hideChildrenInMenu: js.UndefOr[Boolean] = js.native
    
    var hideInMenu: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[js.Any] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[String | `false`] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var parentKeys: js.UndefOr[js.Array[String]] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var pro_layout_parentKeys: js.UndefOr[js.Array[String]] = js.native
  }
  object MenuDataItem {
    
    @scala.inline
    def apply(): MenuDataItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuDataItem]
    }
    
    @scala.inline
    implicit class MenuDataItemMutableBuilder[Self <: MenuDataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[MenuDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: MenuDataItem*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setHideChildrenInMenu(value: Boolean): Self = StObject.set(x, "hideChildrenInMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideChildrenInMenuUndefined: Self = StObject.set(x, "hideChildrenInMenu", js.undefined)
      
      @scala.inline
      def setHideInMenu(value: Boolean): Self = StObject.set(x, "hideInMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideInMenuUndefined: Self = StObject.set(x, "hideInMenu", js.undefined)
      
      @scala.inline
      def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParentKeys(value: js.Array[String]): Self = StObject.set(x, "parentKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentKeysUndefined: Self = StObject.set(x, "parentKeys", js.undefined)
      
      @scala.inline
      def setParentKeysVarargs(value: String*): Self = StObject.set(x, "parentKeys", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPro_layout_parentKeys(value: js.Array[String]): Self = StObject.set(x, "pro_layout_parentKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPro_layout_parentKeysUndefined: Self = StObject.set(x, "pro_layout_parentKeys", js.undefined)
      
      @scala.inline
      def setPro_layout_parentKeysVarargs(value: String*): Self = StObject.set(x, "pro_layout_parentKeys", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MessageDescriptor extends StObject {
    
    var defaultMessage: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var id: js.Any = js.native
  }
  object MessageDescriptor {
    
    @scala.inline
    def apply(id: js.Any): MessageDescriptor = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageDescriptor]
    }
    
    @scala.inline
    implicit class MessageDescriptorMutableBuilder[Self <: MessageDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Route extends MenuDataItem {
    
    var routes: js.UndefOr[js.Array[Route]] = js.native
  }
  object Route {
    
    @scala.inline
    def apply(): Route = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
}
