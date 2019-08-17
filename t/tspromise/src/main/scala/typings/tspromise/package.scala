package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tspromise {
  import typings.std.Error

  type NodeCallback[T] = js.Function2[/* err */ Error, /* value */ T, Unit]
}
