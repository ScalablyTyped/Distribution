package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vuexLib {
  type ActionHandler[S, R] = js.Function2[/* injectee */ js.Any, /* payload */ js.Any, js.Any]
}
