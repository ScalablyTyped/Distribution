package typings.umijsRouteUtils

import org.scalablytyped.runtime.StringDictionary
import typings.umijsRouteUtils.anon.Breadcrumb
import typings.umijsRouteUtils.typesMod.MenuDataItem
import typings.umijsRouteUtils.typesMod.MessageDescriptor
import typings.umijsRouteUtils.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@umijs/route-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getFlatMenus(): StringDictionary[MenuDataItem] = js.native
  def getFlatMenus(menuData: js.Array[MenuDataItem]): StringDictionary[MenuDataItem] = js.native
  def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = js.native
  /**
    * @param routes 路由配置
    * @param locale 是否使用国际化
    * @param formatMessage 国际化的程序
    * @param ignoreFilter 是否筛选掉不展示的 menuItem 项，plugin-layout需要所有项目来计算布局样式
    * @returns { breadcrumb, menuData}
    */
  def transformRoute(routes: js.Array[Route]): Breadcrumb = js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
  def transformRoute(routes: js.Array[Route], locale: Boolean): Breadcrumb = js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.UndefOr[scala.Nothing],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
}

