package typings

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tspromise {
  type NodeCallback[T] = js.Function2[/* err */ Error, /* value */ T, Unit]
}
