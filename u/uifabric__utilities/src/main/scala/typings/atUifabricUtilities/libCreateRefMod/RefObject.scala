package typings.atUifabricUtilities.libCreateRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefObject[T] extends js.Object {
  var current: T | Null = js.native
  def apply(): Unit = js.native
  def apply(component: T): Unit = js.native
}

