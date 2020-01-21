package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleResolutionHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, Boolean]] = js.undefined
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var getDirectories: js.UndefOr[js.Function1[/* path */ java.lang.String, js.Array[java.lang.String]]] = js.undefined
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.undefined
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.undefined
  def fileExists(fileName: java.lang.String): Boolean
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String]
}

object ModuleResolutionHost {
  @scala.inline
  def apply(
    fileExists: java.lang.String => Boolean,
    readFile: java.lang.String => js.UndefOr[java.lang.String],
    directoryExists: /* directoryName */ java.lang.String => Boolean = null,
    getCurrentDirectory: () => java.lang.String = null,
    getDirectories: /* path */ java.lang.String => js.Array[java.lang.String] = null,
    realpath: /* path */ java.lang.String => java.lang.String = null,
    trace: /* s */ java.lang.String => Unit = null
  ): ModuleResolutionHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), readFile = js.Any.fromFunction1(readFile))
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(js.Any.fromFunction1(directoryExists))
    if (getCurrentDirectory != null) __obj.updateDynamic("getCurrentDirectory")(js.Any.fromFunction0(getCurrentDirectory))
    if (getDirectories != null) __obj.updateDynamic("getDirectories")(js.Any.fromFunction1(getDirectories))
    if (realpath != null) __obj.updateDynamic("realpath")(js.Any.fromFunction1(realpath))
    if (trace != null) __obj.updateDynamic("trace")(js.Any.fromFunction1(trace))
    __obj.asInstanceOf[ModuleResolutionHost]
  }
}

