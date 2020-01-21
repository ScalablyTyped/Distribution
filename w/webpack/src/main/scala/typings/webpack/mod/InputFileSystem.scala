package typings.webpack.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputFileSystem extends js.Object {
  var purge: js.UndefOr[js.Function0[Unit]] = js.undefined
  def readFile(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* contents */ Buffer, Unit]
  ): Unit
  def readFileSync(path: String): Buffer
  def readlink(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* linkString */ String, Unit]
  ): Unit
  def readlinkSync(path: String): String
  def stat(path: String, callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* stats */ js.Any, Unit]): Unit
  def statSync(path: String): js.Any
}

object InputFileSystem {
  @scala.inline
  def apply(
    readFile: (String, js.Function2[/* err */ js.UndefOr[Error | Null], /* contents */ Buffer, Unit]) => Unit,
    readFileSync: String => Buffer,
    readlink: (String, js.Function2[/* err */ js.UndefOr[Error | Null], /* linkString */ String, Unit]) => Unit,
    readlinkSync: String => String,
    stat: (String, js.Function2[/* err */ js.UndefOr[Error | Null], /* stats */ js.Any, Unit]) => Unit,
    statSync: String => js.Any,
    purge: () => Unit = null
  ): InputFileSystem = {
    val __obj = js.Dynamic.literal(readFile = js.Any.fromFunction2(readFile), readFileSync = js.Any.fromFunction1(readFileSync), readlink = js.Any.fromFunction2(readlink), readlinkSync = js.Any.fromFunction1(readlinkSync), stat = js.Any.fromFunction2(stat), statSync = js.Any.fromFunction1(statSync))
    if (purge != null) __obj.updateDynamic("purge")(js.Any.fromFunction0(purge))
    __obj.asInstanceOf[InputFileSystem]
  }
}

