package typings.umijsRouteUtils

import typings.umijsRouteUtils.typesMod.MenuDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@umijs/route-utils/dist/getMatchMenu/getMatchMenu", JSImport.Namespace)
@js.native
object getMatchMenuMod extends js.Object {
  
  def default(pathname: String, menuData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = js.native
  def default(pathname: String, menuData: js.Array[MenuDataItem], fullKeys: Boolean): js.Array[MenuDataItem] = js.native
  
  def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = js.native
  def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem], fullKeys: Boolean): js.Array[MenuDataItem] = js.native
  
  def getMenuMatches(flatMenuKeys: js.UndefOr[scala.Nothing], path: String): js.UndefOr[js.Array[String]] = js.native
  def getMenuMatches(flatMenuKeys: js.Array[String], path: String): js.UndefOr[js.Array[String]] = js.native
}
