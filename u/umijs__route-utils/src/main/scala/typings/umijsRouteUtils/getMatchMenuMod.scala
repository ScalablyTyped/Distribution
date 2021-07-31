package typings.umijsRouteUtils

import typings.umijsRouteUtils.typesMod.MenuDataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMatchMenuMod {
  
  @JSImport("@umijs/route-utils/dist/getMatchMenu/getMatchMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(pathname: String, menuData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathname.asInstanceOf[js.Any], menuData.asInstanceOf[js.Any])).asInstanceOf[js.Array[MenuDataItem]]
  @scala.inline
  def default(pathname: String, menuData: js.Array[MenuDataItem], fullKeys: Boolean): js.Array[MenuDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathname.asInstanceOf[js.Any], menuData.asInstanceOf[js.Any], fullKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[MenuDataItem]]
  
  @scala.inline
  def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchMenu")(pathname.asInstanceOf[js.Any], menuData.asInstanceOf[js.Any])).asInstanceOf[js.Array[MenuDataItem]]
  @scala.inline
  def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem], fullKeys: Boolean): js.Array[MenuDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchMenu")(pathname.asInstanceOf[js.Any], menuData.asInstanceOf[js.Any], fullKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[MenuDataItem]]
  
  @scala.inline
  def getMenuMatches(flatMenuKeys: js.Array[String], path: String): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuMatches")(flatMenuKeys.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  @scala.inline
  def getMenuMatches(flatMenuKeys: Unit, path: String): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuMatches")(flatMenuKeys.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
}
