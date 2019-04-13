package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wepy/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  @js.native
  object default extends js.Object {
    @JSName("$createApp")
    var $createApp: js.UndefOr[
        js.Function2[
          /* appClass */ wepyLib.appMod.AppConstructor, 
          /* appConfig */ wepyLib.appMod.AppConfig, 
          wepyLib.appMod.default
        ]
      ] = js.native
    @JSName("$createPage")
    var $createPage: js.UndefOr[
        js.Function2[
          /* pageClass */ wepyLib.pageMod.PageConstructor, 
          /* pagePath */ java.lang.String | scala.Boolean, 
          wepyLib.pageMod.default
        ]
      ] = js.native
  }
  
}

