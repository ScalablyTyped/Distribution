package typings.umijsRouteUtils

import typings.umijsRouteUtils.typesMod.MenuDataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMatchMenuMod {
  
  @JSImport("@umijs/route-utils/dist/getMatchMenu/getMatchMenu", JSImport.Default)
  @js.native
  def default(pathname: String, menuData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = js.native
  @JSImport("@umijs/route-utils/dist/getMatchMenu/getMatchMenu", JSImport.Default)
  @js.native
  def default(pathname: String, menuData: js.Array[MenuDataItem], fullKeys: Boolean): js.Array[MenuDataItem] = js.native
  
  @JSImport("@umijs/route-utils/dist/getMatchMenu/getMatchMenu", "getMatchMenu")
  @js.native
  def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = js.native
  @JSImport("@umijs/route-utils/dist/getMatchMenu/getMatchMenu", "getMatchMenu")
  @js.native
  def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem], fullKeys: Boolean): js.Array[MenuDataItem] = js.native
  
  @JSImport("@umijs/route-utils/dist/getMatchMenu/getMatchMenu", "getMenuMatches")
  @js.native
  def getMenuMatches(flatMenuKeys: js.UndefOr[scala.Nothing], path: String): js.UndefOr[js.Array[String]] = js.native
  @JSImport("@umijs/route-utils/dist/getMatchMenu/getMatchMenu", "getMenuMatches")
  @js.native
  def getMenuMatches(flatMenuKeys: js.Array[String], path: String): js.UndefOr[js.Array[String]] = js.native
}
