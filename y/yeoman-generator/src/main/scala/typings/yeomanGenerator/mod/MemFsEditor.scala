package typings.yeomanGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemFsEditor extends js.Object {
  def commit(callback: Callback): Unit = js.native
  def commit(filters: js.Array[_], callback: Callback): Unit = js.native
  def copy(from: String, to: String): Unit = js.native
  def copy(
    from: String,
    to: String,
    options: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    templateOptions: js.Object
  ): Unit = js.native
  def copy(from: String, to: String, options: js.UndefOr[scala.Nothing], context: js.Object): Unit = js.native
  def copy(
    from: String,
    to: String,
    options: js.UndefOr[scala.Nothing],
    context: js.Object,
    templateOptions: js.Object
  ): Unit = js.native
  def copy(from: String, to: String, options: js.Object): Unit = js.native
  def copy(
    from: String,
    to: String,
    options: js.Object,
    context: js.UndefOr[scala.Nothing],
    templateOptions: js.Object
  ): Unit = js.native
  def copy(from: String, to: String, options: js.Object, context: js.Object): Unit = js.native
  def copy(from: String, to: String, options: js.Object, context: js.Object, templateOptions: js.Object): Unit = js.native
  def copyTpl(from: String, to: String, context: js.Object): Unit = js.native
  def copyTpl(
    from: String,
    to: String,
    context: js.Object,
    templateOptions: js.UndefOr[scala.Nothing],
    copyOptions: js.Object
  ): Unit = js.native
  def copyTpl(from: String, to: String, context: js.Object, templateOptions: js.Object): Unit = js.native
  def copyTpl(from: String, to: String, context: js.Object, templateOptions: js.Object, copyOptions: js.Object): Unit = js.native
  def delete(filepath: String): Unit = js.native
  def delete(filepath: String, options: js.Object): Unit = js.native
  def exists(filepath: String): Boolean = js.native
  def extendJSON(filepath: String, contents: js.Object): Unit = js.native
  def extendJSON(filepath: String, contents: js.Object, replacer: js.UndefOr[scala.Nothing], space: Double): Unit = js.native
  def extendJSON(
    filepath: String,
    contents: js.Object,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _]
  ): Unit = js.native
  def extendJSON(
    filepath: String,
    contents: js.Object,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
    space: Double
  ): Unit = js.native
  def move(from: String, to: String): Unit = js.native
  def move(from: String, to: String, options: js.Object): Unit = js.native
  def read(filepath: String): String = js.native
  def read(filepath: String, options: js.Object): String = js.native
  def readJSON(filepath: String): js.Any = js.native
  def readJSON(filepath: String, defaults: js.Object): js.Any = js.native
  def write(filepath: String, contents: String): Unit = js.native
  def writeJSON(filepath: String, contents: js.Object): Unit = js.native
  def writeJSON(filepath: String, contents: js.Object, replacer: js.UndefOr[scala.Nothing], space: Double): Unit = js.native
  def writeJSON(
    filepath: String,
    contents: js.Object,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _]
  ): Unit = js.native
  def writeJSON(
    filepath: String,
    contents: js.Object,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
    space: Double
  ): Unit = js.native
}

