package typings.webpackNodeExternals

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ImportTypeCallback = js.Function1[/* moduleName */ java.lang.String, java.lang.String]
  /** a function that accepts the module name and returns whether it should be included */
  type WhitelistFunctionType = js.Function1[/* moduleName */ java.lang.String, scala.Boolean]
  type WhitelistOption = java.lang.String | typings.std.RegExp | typings.webpackNodeExternals.mod.WhitelistFunctionType
}
