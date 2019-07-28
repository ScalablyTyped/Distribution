package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleResolutionHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.undefined
  var getCurrentDirectory: js.UndefOr[js.Function0[String]] = js.undefined
  var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.undefined
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
  var realpath: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  def fileExists(fileName: String): Boolean
  def readFile(fileName: String): js.UndefOr[String]
}

object ModuleResolutionHost {
  @scala.inline
  def apply(
    fileExists: String => Boolean,
    readFile: String => js.UndefOr[String],
    directoryExists: /* directoryName */ String => Boolean = null,
    getCurrentDirectory: () => String = null,
    getDirectories: /* path */ String => js.Array[String] = null,
    realpath: /* path */ String => String = null,
    trace: /* s */ String => Unit = null
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

