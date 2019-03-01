package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFileSystem extends js.Object {
  def join(paths: java.lang.String*): java.lang.String
  def mkdir(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit
  def mkdirp(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit
  def rmdir(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit
  def unlink(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit
  def writeFile(
    path: java.lang.String,
    data: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit
}

object OutputFileSystem {
  @scala.inline
  def apply(
    join: js.Function1[/* repeated */ java.lang.String, java.lang.String],
    mkdir: js.Function2[
      java.lang.String, 
      js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ],
    mkdirp: js.Function2[
      java.lang.String, 
      js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ],
    rmdir: js.Function2[
      java.lang.String, 
      js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ],
    unlink: js.Function2[
      java.lang.String, 
      js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ],
    writeFile: js.Function3[
      java.lang.String, 
      js.Any, 
      js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ): OutputFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("join")(join)
    __obj.updateDynamic("mkdir")(mkdir)
    __obj.updateDynamic("mkdirp")(mkdirp)
    __obj.updateDynamic("rmdir")(rmdir)
    __obj.updateDynamic("unlink")(unlink)
    __obj.updateDynamic("writeFile")(writeFile)
    __obj.asInstanceOf[OutputFileSystem]
  }
}

