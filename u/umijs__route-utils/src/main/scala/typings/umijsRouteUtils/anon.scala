package typings.umijsRouteUtils

import typings.std.Map
import typings.umijsRouteUtils.typesMod.MenuDataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Breadcrumb extends StObject {
    
    var breadcrumb: Map[String, MenuDataItem] = js.native
    
    var menuData: js.Array[MenuDataItem] = js.native
  }
  object Breadcrumb {
    
    @scala.inline
    def apply(breadcrumb: Map[String, MenuDataItem], menuData: js.Array[MenuDataItem]): Breadcrumb = {
      val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any], menuData = menuData.asInstanceOf[js.Any])
      __obj.asInstanceOf[Breadcrumb]
    }
    
    @scala.inline
    implicit class BreadcrumbMutableBuilder[Self <: Breadcrumb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumb(value: Map[String, MenuDataItem]): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuData(value: js.Array[MenuDataItem]): Self = StObject.set(x, "menuData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuDataVarargs(value: MenuDataItem*): Self = StObject.set(x, "menuData", js.Array(value :_*))
    }
  }
}
