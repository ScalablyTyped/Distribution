package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createIncrementalCompilerHost")
@js.native
object createIncrementalCompilerHost extends js.Object {
  def apply(options: CompilerOptions): CompilerHost = js.native
  def apply(options: CompilerOptions, system: System): CompilerHost = js.native
}

