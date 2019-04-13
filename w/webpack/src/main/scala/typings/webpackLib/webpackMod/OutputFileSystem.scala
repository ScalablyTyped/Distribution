package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFileSystem extends js.Object {
  def join(paths: java.lang.String*): java.lang.String
  def mkdir(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit
  def mkdirp(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit
  def rmdir(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit
  def unlink(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit
  def writeFile(
    path: java.lang.String,
    data: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit
}

object OutputFileSystem {
  @scala.inline
  def apply(
    join: /* repeated */ java.lang.String => java.lang.String,
    mkdir: (java.lang.String, js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]) => scala.Unit,
    mkdirp: (java.lang.String, js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]) => scala.Unit,
    rmdir: (java.lang.String, js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]) => scala.Unit,
    unlink: (java.lang.String, js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]) => scala.Unit,
    writeFile: (java.lang.String, js.Any, js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]) => scala.Unit
  ): OutputFileSystem = {
    val __obj = js.Dynamic.literal(join = js.Any.fromFunction1(join), mkdir = js.Any.fromFunction2(mkdir), mkdirp = js.Any.fromFunction2(mkdirp), rmdir = js.Any.fromFunction2(rmdir), unlink = js.Any.fromFunction2(unlink), writeFile = js.Any.fromFunction3(writeFile))
  
    __obj.asInstanceOf[OutputFileSystem]
  }
}

