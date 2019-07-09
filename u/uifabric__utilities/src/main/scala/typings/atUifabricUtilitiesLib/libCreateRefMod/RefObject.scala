package typings
package atUifabricUtilitiesLib.libCreateRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefObject[T] extends js.Object {
  var current: T | scala.Null = js.native
  def apply(): scala.Unit = js.native
  def apply(component: T): scala.Unit = js.native
}

