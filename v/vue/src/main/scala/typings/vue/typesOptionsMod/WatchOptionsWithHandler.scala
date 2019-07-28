package typings.vue.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchOptionsWithHandler[T] extends WatchOptions {
  @JSName("handler")
  var handler_Original: WatchHandler[T] = js.native
  def handler(`val`: T, oldVal: T): Unit = js.native
}

