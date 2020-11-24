package typings.wepy.pageMod

import org.scalablytyped.runtime.StringDictionary
import typings.wepy.anon.Delta
import typings.wepy.componentMod.component
import typings.wepy.wepyStrings.navigateTo
import typings.wepy.wepyStrings.redirectTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait page extends component {
  
  @JSName("$back")
  def $back(delta: Double): js.Any = js.native
  @JSName("$back")
  def $back(delta: Delta): js.Any = js.native
  
  @JSName("$init")
  def $init(wxpage: js.Any, $parent: js.Any): js.Any = js.native
  
  @JSName("$preload")
  def $preload(key: String, data: js.Any): js.Any = js.native
  @JSName("$preload")
  def $preload(key: StringDictionary[js.Any], data: js.Any): js.Any = js.native
  
  @JSName("$preloadData")
  var $preloadData: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  @JSName("$redirect")
  def $redirect(url: String): js.Any = js.native
  @JSName("$redirect")
  def $redirect(url: String, params: js.Object): js.Any = js.native
  
  @JSName("$route")
  def $route_navigateTo(`type`: navigateTo, url: String): js.Any = js.native
  @JSName("$route")
  def $route_navigateTo(`type`: navigateTo, url: String, params: StringDictionary[js.Any]): js.Any = js.native
  @JSName("$route")
  def $route_navigateTo(`type`: navigateTo, url: UrlParam): js.Any = js.native
  @JSName("$route")
  def $route_navigateTo(`type`: navigateTo, url: UrlParam, params: StringDictionary[js.Any]): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(`type`: redirectTo, url: String): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(`type`: redirectTo, url: String, params: StringDictionary[js.Any]): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(`type`: redirectTo, url: UrlParam): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(`type`: redirectTo, url: UrlParam, params: StringDictionary[js.Any]): js.Any = js.native
  
  @JSName("$switch")
  def $switch(url: String): js.Any = js.native
  @JSName("$switch")
  def $switch(url: UrlParam): js.Any = js.native
  
  var config: js.UndefOr[PageConfig] = js.native
}
