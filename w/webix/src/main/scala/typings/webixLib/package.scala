package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webixLib {
  type WebixCallback = js.Function1[/* repeated */ js.Any, js.Any]
  type WebixTemplate = js.Function1[/* repeated */ js.Any, java.lang.String]
}
