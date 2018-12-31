package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Host to create watch with root files and options
  */
@js.native
trait WatchCompilerHostOfFilesAndCompilerOptions[T /* <: BuilderProgram */] extends WatchCompilerHost[T] {
  /** Compiler options */
  var options: CompilerOptions = js.native
  /** Project References */
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  /** root files to use to generate program */
  var rootFiles: js.Array[java.lang.String] = js.native
}

