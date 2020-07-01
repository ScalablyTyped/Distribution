package typings.terserWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtractCommentFn = js.Function2[/* astNode */ js.Any, /* comment */ js.Any, scala.Boolean | js.Object]
  type FilenameFn = js.Function1[/* fileData */ typings.terserWebpackPlugin.mod.FileData, java.lang.String]
  type FormatFn = js.Function1[/* input */ java.lang.String, java.lang.String]
  type TerserPlugin = typings.webpack.mod.Plugin
}
