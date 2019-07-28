package typings.urlDashParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object urlDashParseMod {
  type QueryParser = js.Function1[/* query */ String, js.Object]
  type StringifyQuery = js.Function1[/* query */ js.Object, String]
}
