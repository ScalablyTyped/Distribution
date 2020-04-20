package typings.webpack.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFileSystem extends js.Object {
  def join(paths: String*): String
  def mkdir(path: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit
  def mkdirp(path: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit
  def rmdir(path: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit
  def unlink(path: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit
  def writeFile(path: String, data: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit
}

object OutputFileSystem {
  @scala.inline
  def apply(
    join: /* repeated */ String => String,
    mkdir: (String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit,
    mkdirp: (String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit,
    rmdir: (String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit,
    unlink: (String, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit,
    writeFile: (String, js.Any, js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit
  ): OutputFileSystem = {
    val __obj = js.Dynamic.literal(join = js.Any.fromFunction1(join), mkdir = js.Any.fromFunction2(mkdir), mkdirp = js.Any.fromFunction2(mkdirp), rmdir = js.Any.fromFunction2(rmdir), unlink = js.Any.fromFunction2(unlink), writeFile = js.Any.fromFunction3(writeFile))
    __obj.asInstanceOf[OutputFileSystem]
  }
}

