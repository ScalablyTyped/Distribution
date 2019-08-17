package typings.tspromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tspromiseMod {
  import typings.tspromise.Thenable

  type Promise[T] = Thenable[T]
}
