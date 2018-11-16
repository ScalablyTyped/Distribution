package typings
package vueLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchOptionsWithHandler[T] extends WatchOptions {
  @JSName("handler")
  var handler_Original: WatchHandler[T] = js.native
  def handler(`val`: T, oldVal: T): scala.Unit = js.native
}

