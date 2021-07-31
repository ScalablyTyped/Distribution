package typings.umijsRouteUtils

import org.scalablytyped.runtime.StringDictionary
import typings.umijsRouteUtils.typesMod.MenuDataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFlatMenusMod {
  
  @JSImport("@umijs/route-utils/dist/getFlatMenus/getFlatMenus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): StringDictionary[MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[StringDictionary[MenuDataItem]]
  @scala.inline
  def default(menuData: js.Array[MenuDataItem]): StringDictionary[MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(menuData.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[MenuDataItem]]
  
  @scala.inline
  def getFlatMenus(): StringDictionary[MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlatMenus")().asInstanceOf[StringDictionary[MenuDataItem]]
  @scala.inline
  def getFlatMenus(menuData: js.Array[MenuDataItem]): StringDictionary[MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlatMenus")(menuData.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[MenuDataItem]]
}
