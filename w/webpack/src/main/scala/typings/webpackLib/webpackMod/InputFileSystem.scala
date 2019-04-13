package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputFileSystem extends js.Object {
  var purge: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def readFile(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[stdLib.Error | scala.Null], 
      /* contents */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit
  def readFileSync(path: java.lang.String): nodeLib.Buffer
  def readlink(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[stdLib.Error | scala.Null], 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit
  def readlinkSync(path: java.lang.String): java.lang.String
  def stat(
    path: java.lang.String,
    callback: js.Function2[/* err */ js.UndefOr[stdLib.Error | scala.Null], /* stats */ js.Any, scala.Unit]
  ): scala.Unit
  def statSync(path: java.lang.String): js.Any
}

object InputFileSystem {
  @scala.inline
  def apply(
    readFile: (java.lang.String, js.Function2[
      /* err */ js.UndefOr[stdLib.Error | scala.Null], 
      /* contents */ nodeLib.Buffer, 
      scala.Unit
    ]) => scala.Unit,
    readFileSync: java.lang.String => nodeLib.Buffer,
    readlink: (java.lang.String, js.Function2[
      /* err */ js.UndefOr[stdLib.Error | scala.Null], 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]) => scala.Unit,
    readlinkSync: java.lang.String => java.lang.String,
    stat: (java.lang.String, js.Function2[/* err */ js.UndefOr[stdLib.Error | scala.Null], /* stats */ js.Any, scala.Unit]) => scala.Unit,
    statSync: java.lang.String => js.Any,
    purge: () => scala.Unit = null
  ): InputFileSystem = {
    val __obj = js.Dynamic.literal(readFile = js.Any.fromFunction2(readFile), readFileSync = js.Any.fromFunction1(readFileSync), readlink = js.Any.fromFunction2(readlink), readlinkSync = js.Any.fromFunction1(readlinkSync), stat = js.Any.fromFunction2(stat), statSync = js.Any.fromFunction1(statSync))
    if (purge != null) __obj.updateDynamic("purge")(js.Any.fromFunction0(purge))
    __obj.asInstanceOf[InputFileSystem]
  }
}

