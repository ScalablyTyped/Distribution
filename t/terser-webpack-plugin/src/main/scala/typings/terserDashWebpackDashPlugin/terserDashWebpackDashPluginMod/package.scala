package typings.terserDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object terserDashWebpackDashPluginMod {
  import typings.webpack.webpackMod.Plugin

  type ExtractCommentFn = js.Function2[/* node */ js.Any, /* comment */ js.Any, Boolean | js.Object]
  type FormatFn = js.Function1[/* input */ String, String]
  type TerserPlugin = Plugin
}
