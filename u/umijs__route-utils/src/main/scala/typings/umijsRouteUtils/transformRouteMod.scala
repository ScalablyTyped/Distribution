package typings.umijsRouteUtils

import typings.umijsRouteUtils.anon.Breadcrumb
import typings.umijsRouteUtils.typesMod.MenuDataItem
import typings.umijsRouteUtils.typesMod.MessageDescriptor
import typings.umijsRouteUtils.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformRouteMod {
  
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param routes 路由配置
    * @param locale 是否使用国际化
    * @param formatMessage 国际化的程序
    * @param ignoreFilter 是否筛选掉不展示的 menuItem 项，plugin-layout需要所有项目来计算布局样式
    * @returns { breadcrumb, menuData}
    */
  @scala.inline
  def default(routes: js.Array[Route]): Breadcrumb = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb]
  @scala.inline
  def default(routes: js.Array[Route], locale: Boolean): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  @scala.inline
  def default(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  @scala.inline
  def default(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  @scala.inline
  def default(routes: js.Array[Route], locale: Boolean, formatMessage: Unit, ignoreFilter: Boolean): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  @scala.inline
  def default(
    routes: js.Array[Route],
    locale: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  @scala.inline
  def default(
    routes: js.Array[Route],
    locale: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  @scala.inline
  def default(routes: js.Array[Route], locale: Unit, formatMessage: Unit, ignoreFilter: Boolean): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  
  @scala.inline
  def getKeyByPath(item: MenuDataItem): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyByPath")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def isUrl(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def stripQueryStringAndHashFromPath(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripQueryStringAndHashFromPath")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
