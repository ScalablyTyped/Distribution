package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object bannerPluginMod {
  
  type BannerFunction = js.Function1[/* data */ typings.webpack.anon.Basename, java.lang.String]
  
  type BannerPluginArgument = typings.webpack.bannerPluginMod.BannerPluginOptions | typings.webpack.bannerPluginMod.BannerFunction | java.lang.String
  
  type Rule = typings.std.RegExp | java.lang.String
  
  type Rules = js.Array[typings.webpack.bannerPluginMod.Rule] | typings.webpack.bannerPluginMod.Rule
}
