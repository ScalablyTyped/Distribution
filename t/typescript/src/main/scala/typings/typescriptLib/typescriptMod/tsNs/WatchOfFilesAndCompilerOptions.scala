package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates the watch that generates program using the root files and compiler options
  */
trait WatchOfFilesAndCompilerOptions[T] extends Watch[T] {
  /** Updates the root files in the program, only if this is not config file compilation */
  def updateRootFileNames(fileNames: js.Array[java.lang.String]): scala.Unit
}

object WatchOfFilesAndCompilerOptions {
  @scala.inline
  def apply[T](
    getProgram: js.Function0[T],
    updateRootFileNames: js.Function1[js.Array[java.lang.String], scala.Unit]
  ): WatchOfFilesAndCompilerOptions[T] = {
    val __obj = js.Dynamic.literal(getProgram = getProgram, updateRootFileNames = updateRootFileNames)
  
    __obj.asInstanceOf[WatchOfFilesAndCompilerOptions[T]]
  }
}

