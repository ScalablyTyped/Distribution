package typings.umijsRouteUtils

import org.scalablytyped.runtime.StringDictionary
import typings.umijsRouteUtils.anon.Breadcrumb
import typings.umijsRouteUtils.typesMod.MenuDataItem
import typings.umijsRouteUtils.typesMod.MessageDescriptor
import typings.umijsRouteUtils.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@umijs/route-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFlatMenus(): StringDictionary[MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlatMenus")().asInstanceOf[StringDictionary[MenuDataItem]]
  inline def getFlatMenus(menuData: js.Array[MenuDataItem]): StringDictionary[MenuDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlatMenus")(menuData.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[MenuDataItem]]
  
  inline def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchMenu")(pathname.asInstanceOf[js.Any], menuData.asInstanceOf[js.Any])).asInstanceOf[js.Array[MenuDataItem]]
  inline def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem], fullKeys: Boolean): js.Array[MenuDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchMenu")(pathname.asInstanceOf[js.Any], menuData.asInstanceOf[js.Any], fullKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[MenuDataItem]]
  
  /**
    * @param routes 路由配置
    * @param locale 是否使用国际化
    * @param formatMessage 国际化的程序
    * @param ignoreFilter 是否筛选掉不展示的 menuItem 项，plugin-layout需要所有项目来计算布局样式
    * @returns { breadcrumb, menuData}
    */
  inline def transformRoute(routes: js.Array[Route]): Breadcrumb = ^.asInstanceOf[js.Dynamic].applyDynamic("transformRoute")(routes.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb]
  inline def transformRoute(routes: js.Array[Route], locale: Boolean): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRoute")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def transformRoute(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRoute")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def transformRoute(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRoute")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def transformRoute(routes: js.Array[Route], locale: Boolean, formatMessage: Unit, ignoreFilter: Boolean): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRoute")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def transformRoute(
    routes: js.Array[Route],
    locale: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRoute")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def transformRoute(
    routes: js.Array[Route],
    locale: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRoute")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def transformRoute(routes: js.Array[Route], locale: Unit, formatMessage: Unit, ignoreFilter: Boolean): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRoute")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
}
