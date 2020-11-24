package typings.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchOptionsWithHandler[T] extends WatchOptions {
  
  def handler(`val`: T, oldVal: T): Unit = js.native
  @JSName("handler")
  var handler_Original: WatchHandler[T] = js.native
}
