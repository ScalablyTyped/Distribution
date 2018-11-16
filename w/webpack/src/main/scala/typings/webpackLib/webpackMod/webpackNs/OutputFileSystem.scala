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

