package typings.urlParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type QueryParser = js.Function1[/* query */ java.lang.String, js.Object]
  type StringifyQuery = js.Function1[/* query */ js.Object, java.lang.String]
}
