package typings
package typedocLib.distLibUtilsEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/events", "Event")
@js.native
class Event protected () extends js.Object {
  def this(name: java.lang.String) = this()
  var _isDefaultPrevented: js.Any = js.native
  var _isPropagationStopped: js.Any = js.native
  var _name: js.Any = js.native
  val isDefaultPrevented: scala.Boolean = js.native
  val isPropagationStopped: scala.Boolean = js.native
  val name: java.lang.String = js.native
  def preventDefault(): scala.Unit = js.native
  def stopPropagation(): scala.Unit = js.native
}

