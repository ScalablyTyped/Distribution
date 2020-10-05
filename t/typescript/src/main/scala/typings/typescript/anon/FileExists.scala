package typings.typescript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileExists extends js.Object {
  def fileExists(fileName: String): Boolean = js.native
  def getExecutingFilePath(): String = js.native
  def readFile(fileName: String): js.UndefOr[String] = js.native
  def resolvePath(path: String): String = js.native
}

object FileExists {
  @scala.inline
  def apply(
    fileExists: String => Boolean,
    getExecutingFilePath: () => String,
    readFile: String => js.UndefOr[String],
    resolvePath: String => String
  ): FileExists = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getExecutingFilePath = js.Any.fromFunction0(getExecutingFilePath), readFile = js.Any.fromFunction1(readFile), resolvePath = js.Any.fromFunction1(resolvePath))
    __obj.asInstanceOf[FileExists]
  }
  @scala.inline
  implicit class FileExistsOps[Self <: FileExists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileExists(value: String => Boolean): Self = this.set("fileExists", js.Any.fromFunction1(value))
    @scala.inline
    def setGetExecutingFilePath(value: () => String): Self = this.set("getExecutingFilePath", js.Any.fromFunction0(value))
    @scala.inline
    def setReadFile(value: String => js.UndefOr[String]): Self = this.set("readFile", js.Any.fromFunction1(value))
    @scala.inline
    def setResolvePath(value: String => String): Self = this.set("resolvePath", js.Any.fromFunction1(value))
  }
  
}

