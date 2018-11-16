package typings
package yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemFsEditor extends js.Object {
  def commit(callback: yeomanDashGeneratorLib.Callback): scala.Unit = js.native
  def commit(filters: js.Array[_], callback: yeomanDashGeneratorLib.Callback): scala.Unit = js.native
  def copy(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
  def copy(from: java.lang.String, to: java.lang.String, options: js.Object): scala.Unit = js.native
  def copyTpl(from: java.lang.String, to: java.lang.String, context: js.Object): scala.Unit = js.native
  def copyTpl(from: java.lang.String, to: java.lang.String, context: js.Object, templateOptions: js.Object): scala.Unit = js.native
  def copyTpl(
    from: java.lang.String,
    to: java.lang.String,
    context: js.Object,
    templateOptions: js.Object,
    copyOptions: js.Object
  ): scala.Unit = js.native
  def delete(filepath: java.lang.String): scala.Unit = js.native
  def delete(filepath: java.lang.String, options: js.Object): scala.Unit = js.native
  def exists(filepath: java.lang.String): scala.Boolean = js.native
  def extendJSON(filepath: java.lang.String, contents: js.Object): scala.Unit = js.native
  def extendJSON(
    filepath: java.lang.String,
    contents: js.Object,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]
  ): scala.Unit = js.native
  def extendJSON(
    filepath: java.lang.String,
    contents: js.Object,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: scala.Double
  ): scala.Unit = js.native
  def move(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
  def move(from: java.lang.String, to: java.lang.String, options: js.Object): scala.Unit = js.native
  def read(filepath: java.lang.String): java.lang.String = js.native
  def read(filepath: java.lang.String, options: js.Object): java.lang.String = js.native
  def readJSON(filepath: java.lang.String): js.Any = js.native
  def readJSON(filepath: java.lang.String, defaults: js.Object): js.Any = js.native
  def write(filepath: java.lang.String, contents: java.lang.String): scala.Unit = js.native
  def writeJSON(filepath: java.lang.String, contents: js.Object): scala.Unit = js.native
  def writeJSON(
    filepath: java.lang.String,
    contents: js.Object,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]
  ): scala.Unit = js.native
  def writeJSON(
    filepath: java.lang.String,
    contents: js.Object,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: scala.Double
  ): scala.Unit = js.native
}

