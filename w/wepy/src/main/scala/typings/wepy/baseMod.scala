package typings.wepy

import typings.wepy.appMod.AppConfig
import typings.wepy.appMod.AppConstructor
import typings.wepy.pageMod.PageConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wepy/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    @JSName("$createApp")
    var $createApp: js.UndefOr[
        js.Function2[
          /* appClass */ AppConstructor, 
          /* appConfig */ AppConfig, 
          typings.wepy.appMod.default
        ]
      ] = js.native
    
    @JSName("$createPage")
    var $createPage: js.UndefOr[
        js.Function2[
          /* pageClass */ PageConstructor, 
          /* pagePath */ String | Boolean, 
          typings.wepy.pageMod.default
        ]
      ] = js.native
  }
}
