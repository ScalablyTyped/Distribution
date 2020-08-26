package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleResolutionHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, Boolean]] = js.native
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.native
  var getDirectories: js.UndefOr[js.Function1[/* path */ java.lang.String, js.Array[java.lang.String]]] = js.native
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.native
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  def fileExists(fileName: java.lang.String): Boolean = js.native
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

object ModuleResolutionHost {
  @scala.inline
  def apply(
    fileExists: java.lang.String => Boolean,
    readFile: java.lang.String => js.UndefOr[java.lang.String]
  ): ModuleResolutionHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), readFile = js.Any.fromFunction1(readFile))
    __obj.asInstanceOf[ModuleResolutionHost]
  }
  @scala.inline
  implicit class ModuleResolutionHostOps[Self <: ModuleResolutionHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileExists(value: java.lang.String => Boolean): Self = this.set("fileExists", js.Any.fromFunction1(value))
    @scala.inline
    def setReadFile(value: java.lang.String => js.UndefOr[java.lang.String]): Self = this.set("readFile", js.Any.fromFunction1(value))
    @scala.inline
    def setDirectoryExists(value: /* directoryName */ java.lang.String => Boolean): Self = this.set("directoryExists", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDirectoryExists: Self = this.set("directoryExists", js.undefined)
    @scala.inline
    def setGetCurrentDirectory(value: () => java.lang.String): Self = this.set("getCurrentDirectory", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCurrentDirectory: Self = this.set("getCurrentDirectory", js.undefined)
    @scala.inline
    def setGetDirectories(value: /* path */ java.lang.String => js.Array[java.lang.String]): Self = this.set("getDirectories", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDirectories: Self = this.set("getDirectories", js.undefined)
    @scala.inline
    def setRealpath(value: /* path */ java.lang.String => java.lang.String): Self = this.set("realpath", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRealpath: Self = this.set("realpath", js.undefined)
    @scala.inline
    def setTrace(value: /* s */ java.lang.String => Unit): Self = this.set("trace", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
  }
  
}

