package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.WatchCompilerHostOfConfigFile
import typings.typescript.mod.WatchCompilerHostOfFilesAndCompilerOptions
import typings.typescript.mod.WatchOfConfigFile
import typings.typescript.mod.WatchOfFilesAndCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createWatchProgram")
@js.native
object createWatchProgram extends js.Object {
  /**
    * Creates the watch from the host for config file
    */
  def apply[T /* <: BuilderProgram */](host: WatchCompilerHostOfConfigFile[T]): WatchOfConfigFile[T] = js.native
  /**
    * Creates the watch from the host for root files and compiler options
    */
  def apply[T /* <: BuilderProgram */](host: WatchCompilerHostOfFilesAndCompilerOptions[T]): WatchOfFilesAndCompilerOptions[T] = js.native
}

