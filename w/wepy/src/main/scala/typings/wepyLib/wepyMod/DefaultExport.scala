package typings
package wepyLib.wepyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultExport
  extends wepyLib.wxUnderscoreEnhancedMod.WxEnhances {
  @JSName("$copy")
  var $copy_Original: wepyLib.Anon_Deep = js.native
  @JSName("$createApp")
  var $createApp_Original: js.Function2[
    /* appClass */ wepyLib.appMod.AppConstructor, 
    /* appConfig */ wepyLib.appMod.AppConfig, 
    wepyLib.appMod.default
  ] = js.native
  @JSName("$createPage")
  var $createPage_Original: js.Function2[
    /* pageClass */ wepyLib.pageMod.PageConstructor, 
    /* pagePath */ java.lang.String | scala.Boolean, 
    wepyLib.pageMod.default
  ] = js.native
  @JSName("$extend")
  var $extend_Original: js.Function0[_] = js.native
  @JSName("$has")
  var $has_Original: js.Function2[/* obj */ js.Object, /* path */ java.lang.String, scala.Boolean] = js.native
  @JSName("$isDeepEqual")
  var $isDeepEqual_Original: js.Function4[
    /* a */ js.Any, 
    /* b */ js.Any, 
    /* aStack */ js.UndefOr[js.Array[_]], 
    /* bStack */ js.UndefOr[js.Array[_]], 
    scala.Boolean
  ] = js.native
  @JSName("$isEmpty")
  var $isEmpty_Original: js.Function1[/* obj */ js.Object, scala.Boolean] = js.native
  @JSName("$isEqual")
  var $isEqual_Original: js.Function4[
    /* a */ js.Any, 
    /* b */ js.Any, 
    /* aStack */ js.UndefOr[js.Array[_]], 
    /* bStack */ js.UndefOr[js.Array[_]], 
    scala.Boolean
  ] = js.native
  @JSName("$isPlainObject")
  var $isPlainObject_Original: js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  var app: App = js.native
  var component: Component = js.native
  var event: Event = js.native
  var mixin: Mixin = js.native
  var page: Page = js.native
  @JSName("$copy")
  def $copy[T](obj: T): T = js.native
  @JSName("$copy")
  def $copy[T](obj: T, deep: scala.Boolean): T = js.native
  @JSName("$createApp")
  def $createApp(appClass: wepyLib.appMod.AppConstructor, appConfig: wepyLib.appMod.AppConfig): wepyLib.appMod.default = js.native
  @JSName("$createPage")
  def $createPage(pageClass: wepyLib.pageMod.PageConstructor, pagePath: java.lang.String): wepyLib.pageMod.default = js.native
  @JSName("$createPage")
  def $createPage(pageClass: wepyLib.pageMod.PageConstructor, pagePath: scala.Boolean): wepyLib.pageMod.default = js.native
  @JSName("$extend")
  def $extend(): js.Any = js.native
  @JSName("$has")
  def $has(obj: js.Object, path: java.lang.String): scala.Boolean = js.native
  @JSName("$isDeepEqual")
  def $isDeepEqual(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$isDeepEqual")
  def $isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): scala.Boolean = js.native
  @JSName("$isDeepEqual")
  def $isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): scala.Boolean = js.native
  @JSName("$isEmpty")
  def $isEmpty(obj: js.Object): scala.Boolean = js.native
  @JSName("$isEqual")
  def $isEqual(a: js.Any, b: js.Any): scala.Boolean = js.native
  @JSName("$isEqual")
  def $isEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): scala.Boolean = js.native
  @JSName("$isEqual")
  def $isEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): scala.Boolean = js.native
  @JSName("$isPlainObject")
  def $isPlainObject(obj: js.Any): scala.Boolean = js.native
}

