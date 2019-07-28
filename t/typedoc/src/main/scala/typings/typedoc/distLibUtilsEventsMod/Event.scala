package typings.typedoc.distLibUtilsEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/events", "Event")
@js.native
class Event protected () extends js.Object {
  def this(name: String) = this()
  var _isDefaultPrevented: js.Any = js.native
  var _isPropagationStopped: js.Any = js.native
  var _name: js.Any = js.native
  val isDefaultPrevented: Boolean = js.native
  val isPropagationStopped: Boolean = js.native
  val name: String = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

