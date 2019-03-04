package typings
package tracebackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Traceback extends js.Object {
   // | The line number in the file
  var col: scala.Double
   // | The absolute path of the file defining the function
  var file: java.lang.String
   // | The byte position in the file
  var fun: js.Any
   // | Boolean indicating whether the function is native
  var is_ctor: scala.Boolean
   // | Boolean indicating whether the function was called with a global this
  var is_eval: scala.Boolean
   // | Boolean indicating whether the function comes from an eval() call
  var is_native: scala.Boolean
   // | The CallSite that ran eval(), if this frame is an eval
  var is_top: scala.Boolean
   // | The basename of the path file ("example.js")
  var line: scala.Double
   // | The function itself
  var method: java.lang.String
  var name: java.lang.String
   // | The type of this; the name of the constructor function (Object, ReadStream, etc.)
  var origin: js.Any
   // | The function name
  var path: java.lang.String
   // | The column number in the file
  var pos: scala.Double
   // | If this function was called as a method, the name it is stored as
  var `this`: js.Any
   // | The object bound to the label this in the function
  var `type`: java.lang.String
}

object Traceback {
  @scala.inline
  def apply(
    col: scala.Double,
    file: java.lang.String,
    fun: js.Any,
    is_ctor: scala.Boolean,
    is_eval: scala.Boolean,
    is_native: scala.Boolean,
    is_top: scala.Boolean,
    line: scala.Double,
    method: java.lang.String,
    name: java.lang.String,
    origin: js.Any,
    path: java.lang.String,
    pos: scala.Double,
    `this`: js.Any,
    `type`: java.lang.String
  ): Traceback = {
    val __obj = js.Dynamic.literal(col = col, file = file, fun = fun, is_ctor = is_ctor, is_eval = is_eval, is_native = is_native, is_top = is_top, line = line, method = method, name = name, origin = origin, path = path, pos = pos)
    __obj.updateDynamic("this")(`this`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Traceback]
  }
}

