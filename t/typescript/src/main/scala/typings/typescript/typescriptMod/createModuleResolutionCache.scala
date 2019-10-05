package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createModuleResolutionCache")
@js.native
object createModuleResolutionCache extends js.Object {
  def apply(currentDirectory: String, getCanonicalFileName: js.Function1[/* s */ String, String]): ModuleResolutionCache = js.native
  def apply(
    currentDirectory: String,
    getCanonicalFileName: js.Function1[/* s */ String, String],
    options: CompilerOptions
  ): ModuleResolutionCache = js.native
}

