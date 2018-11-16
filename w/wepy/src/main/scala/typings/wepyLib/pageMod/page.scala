package typings
package wepyLib.pageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait page
  extends wepyLib.componentMod.default {
  @JSName("$preloadData")
  var $preloadData: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.native
  var config: js.UndefOr[PageConfig] = js.native
  @JSName("$back")
  def $back(delta: scala.Double): js.Any = js.native
  @JSName("$back")
  def $back(delta: wepyLib.Anon_Delta): js.Any = js.native
  @JSName("$init")
  def $init(wxpage: js.Any, $parent: js.Any): js.Any = js.native
  @JSName("$preload")
  def $preload(key: ScalablyTyped.runtime.StringDictionary[js.Any], data: js.Any): js.Any = js.native
  @JSName("$preload")
  def $preload(key: java.lang.String, data: js.Any): js.Any = js.native
  @JSName("$redirect")
  def $redirect(url: java.lang.String): js.Any = js.native
  @JSName("$redirect")
  def $redirect(url: java.lang.String, params: js.Object): js.Any = js.native
  @JSName("$route")
  def $route_navigateTo(`type`: wepyLib.wepyLibStrings.navigateTo, url: java.lang.String): js.Any = js.native
  @JSName("$route")
  def $route_navigateTo(
    `type`: wepyLib.wepyLibStrings.navigateTo,
    url: java.lang.String,
    params: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  @JSName("$route")
  def $route_navigateTo(`type`: wepyLib.wepyLibStrings.navigateTo, url: UrlParam): js.Any = js.native
  @JSName("$route")
  def $route_navigateTo(
    `type`: wepyLib.wepyLibStrings.navigateTo,
    url: UrlParam,
    params: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(`type`: wepyLib.wepyLibStrings.redirectTo, url: java.lang.String): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(
    `type`: wepyLib.wepyLibStrings.redirectTo,
    url: java.lang.String,
    params: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(`type`: wepyLib.wepyLibStrings.redirectTo, url: UrlParam): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(
    `type`: wepyLib.wepyLibStrings.redirectTo,
    url: UrlParam,
    params: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): js.Any = js.native
  @JSName("$switch")
  def $switch(url: java.lang.String): js.Any = js.native
  @JSName("$switch")
  def $switch(url: UrlParam): js.Any = js.native
}

