package typings.umijsRouteUtils.anon

import typings.std.Map
import typings.umijsRouteUtils.typesMod.MenuDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breadcrumb extends js.Object {
  var breadcrumb: Map[String, MenuDataItem]
  var menuData: js.Array[MenuDataItem]
}

object Breadcrumb {
  @scala.inline
  def apply(breadcrumb: Map[String, MenuDataItem], menuData: js.Array[MenuDataItem]): Breadcrumb = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any], menuData = menuData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breadcrumb]
  }
}

