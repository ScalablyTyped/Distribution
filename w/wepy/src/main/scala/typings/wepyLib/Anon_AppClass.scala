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

