package typings.webpackNodeExternals

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ImportTypeCallback = js.Function1[/* moduleName */ java.lang.String, java.lang.String]
  type WhitelistOption = java.lang.String | typings.std.RegExp
}
