package typings.umijsRouteUtils.anon

import typings.std.Map
import typings.umijsRouteUtils.typesMod.MenuDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breadcrumb extends js.Object {
  
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
  implicit class BreadcrumbOps[Self <: Breadcrumb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBreadcrumb(value: Map[String, MenuDataItem]): Self = this.set("breadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuDataVarargs(value: MenuDataItem*): Self = this.set("menuData", js.Array(value :_*))
    
    @scala.inline
    def setMenuData(value: js.Array[MenuDataItem]): Self = this.set("menuData", value.asInstanceOf[js.Any])
  }
}
