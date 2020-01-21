package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createIncrementalCompilerHost")
@js.native
object createIncrementalCompilerHost extends js.Object {
  def apply(options: CompilerOptions): CompilerHost = js.native
  def apply(options: CompilerOptions, system: System): CompilerHost = js.native
}

