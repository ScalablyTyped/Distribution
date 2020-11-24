package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates the watch that generates program using the root files and compiler options
  */
@js.native
trait WatchOfFilesAndCompilerOptions[T] extends Watch[T] {
  
  /** Updates the root files in the program, only if this is not config file compilation */
  def updateRootFileNames(fileNames: js.Array[java.lang.String]): Unit = js.native
}
object WatchOfFilesAndCompilerOptions {
  
  @scala.inline
  def apply[T](close: () => Unit, getProgram: () => T, updateRootFileNames: js.Array[java.lang.String] => Unit): WatchOfFilesAndCompilerOptions[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getProgram = js.Any.fromFunction0(getProgram), updateRootFileNames = js.Any.fromFunction1(updateRootFileNames))
    __obj.asInstanceOf[WatchOfFilesAndCompilerOptions[T]]
  }
  
  @scala.inline
  implicit class WatchOfFilesAndCompilerOptionsOps[Self <: WatchOfFilesAndCompilerOptions[_], T] (val x: Self with WatchOfFilesAndCompilerOptions[T]) extends AnyVal {
    
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
    def setUpdateRootFileNames(value: js.Array[java.lang.String] => Unit): Self = this.set("updateRootFileNames", js.Any.fromFunction1(value))
  }
}
