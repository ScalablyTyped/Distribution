package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadBuildProgramHost extends js.Object {
  
  def getCurrentDirectory(): java.lang.String = js.native
  
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String] = js.native
  
  def useCaseSensitiveFileNames(): Boolean = js.native
}
object ReadBuildProgramHost {
  
  @scala.inline
  def apply(
    getCurrentDirectory: () => java.lang.String,
    readFile: java.lang.String => js.UndefOr[java.lang.String],
    useCaseSensitiveFileNames: () => Boolean
  ): ReadBuildProgramHost = {
    val __obj = js.Dynamic.literal(getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), readFile = js.Any.fromFunction1(readFile), useCaseSensitiveFileNames = js.Any.fromFunction0(useCaseSensitiveFileNames))
    __obj.asInstanceOf[ReadBuildProgramHost]
  }
  
  @scala.inline
  implicit class ReadBuildProgramHostOps[Self <: ReadBuildProgramHost] (val x: Self) extends AnyVal {
    
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
    def setGetCurrentDirectory(value: () => java.lang.String): Self = this.set("getCurrentDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadFile(value: java.lang.String => js.UndefOr[java.lang.String]): Self = this.set("readFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUseCaseSensitiveFileNames(value: () => Boolean): Self = this.set("useCaseSensitiveFileNames", js.Any.fromFunction0(value))
  }
}
