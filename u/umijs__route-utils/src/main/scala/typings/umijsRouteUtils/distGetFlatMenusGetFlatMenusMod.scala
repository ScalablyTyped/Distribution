package typings.umijsRouteUtils

import typings.std.Record
import typings.umijsRouteUtils.distTypesMod.MenuDataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGetFlatMenusGetFlatMenusMod {
  
  @JSImport("@umijs/route-utils/dist/getFlatMenus/getFlatMenus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Record[String, MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Record[String, MenuDataItem]]
  inline def default(menuData: js.Array[MenuDataItem]): Record[String, MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(menuData.asInstanceOf[js.Any]).asInstanceOf[Record[String, MenuDataItem]]
  
  inline def getFlatMenus(): Record[String, MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlatMenus")().asInstanceOf[Record[String, MenuDataItem]]
  inline def getFlatMenus(menuData: js.Array[MenuDataItem]): Record[String, MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlatMenus")(menuData.asInstanceOf[js.Any]).asInstanceOf[Record[String, MenuDataItem]]
}
