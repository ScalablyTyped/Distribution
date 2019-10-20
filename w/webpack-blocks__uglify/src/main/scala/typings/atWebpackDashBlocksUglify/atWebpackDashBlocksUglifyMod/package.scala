package typings.atWebpackDashBlocksUglify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atWebpackDashBlocksUglifyMod {
  import typings.std.RegExp

  type ExtractCommentsFunction = js.Function2[/* node */ js.Any, /* comment */ js.Any, Boolean | ExtractCommentsObject]
  type FileNameFunction = js.Function1[/* file */ String, String]
  type TestType = String | RegExp
}
