package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tspromiseLib {
  type NodeCallback[T] = js.Function2[/* err */ stdLib.Error, /* value */ T, scala.Unit]
}
