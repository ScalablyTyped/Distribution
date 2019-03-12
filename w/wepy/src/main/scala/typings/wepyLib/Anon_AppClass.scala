package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppClass extends js.Object {
  @JSName("$createApp")
  var $createApp: js.UndefOr[
    js.Function2[
      /* appClass */ wepyLib.appMod.AppConstructor, 
      /* appConfig */ wepyLib.appMod.AppConfig, 
      wepyLib.appMod.default
    ]
  ] = js.undefined
  @JSName("$createPage")
  var $createPage: js.UndefOr[
    js.Function2[
      /* pageClass */ wepyLib.pageMod.PageConstructor, 
      /* pagePath */ java.lang.String | scala.Boolean, 
      wepyLib.pageMod.default
    ]
  ] = js.undefined
}

object Anon_AppClass {
  @scala.inline
  def apply(
    $createApp: (/* appClass */ wepyLib.appMod.AppConstructor, /* appConfig */ wepyLib.appMod.AppConfig) => wepyLib.appMod.default = null,
    $createPage: (/* pageClass */ wepyLib.pageMod.PageConstructor, /* pagePath */ java.lang.String | scala.Boolean) => wepyLib.pageMod.default = null
  ): Anon_AppClass = {
    val __obj = js.Dynamic.literal()
    if ($createApp != null) __obj.updateDynamic("$createApp")(js.Any.fromFunction2($createApp))
    if ($createPage != null) __obj.updateDynamic("$createPage")(js.Any.fromFunction2($createPage))
    __obj.asInstanceOf[Anon_AppClass]
  }
}

