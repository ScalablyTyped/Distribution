package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleResolutionHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, scala.Boolean]] = js.undefined
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var getDirectories: js.UndefOr[js.Function1[/* path */ java.lang.String, js.Array[java.lang.String]]] = js.undefined
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.undefined
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, scala.Unit]] = js.undefined
  def fileExists(fileName: java.lang.String): scala.Boolean
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String]
}

object ModuleResolutionHost {
  @scala.inline
  def apply(
    fileExists: js.Function1[java.lang.String, scala.Boolean],
    readFile: js.Function1[java.lang.String, js.UndefOr[java.lang.String]],
    directoryExists: js.Function1[/* directoryName */ java.lang.String, scala.Boolean] = null,
    getCurrentDirectory: js.Function0[java.lang.String] = null,
    getDirectories: js.Function1[/* path */ java.lang.String, js.Array[java.lang.String]] = null,
    realpath: js.Function1[/* path */ java.lang.String, java.lang.String] = null,
    trace: js.Function1[/* s */ java.lang.String, scala.Unit] = null
  ): ModuleResolutionHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileExists")(fileExists)
    __obj.updateDynamic("readFile")(readFile)
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(directoryExists)
    if (getCurrentDirectory != null) __obj.updateDynamic("getCurrentDirectory")(getCurrentDirectory)
    if (getDirectories != null) __obj.updateDynamic("getDirectories")(getDirectories)
    if (realpath != null) __obj.updateDynamic("realpath")(realpath)
    if (trace != null) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[ModuleResolutionHost]
  }
}

