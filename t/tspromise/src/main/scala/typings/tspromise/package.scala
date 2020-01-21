package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tspromise {
  type NodeCallback[T] = js.Function2[/* err */ typings.std.Error, /* value */ T, scala.Unit]
}
