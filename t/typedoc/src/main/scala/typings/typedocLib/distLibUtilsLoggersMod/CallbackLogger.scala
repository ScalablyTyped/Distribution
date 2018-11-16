package typings
package typedocLib.distLibUtilsLoggersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/loggers", "CallbackLogger")
@js.native
class CallbackLogger protected () extends Logger {
  def this(callback: js.Function) = this()
  var callback: js.Function = js.native
}

