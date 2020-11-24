package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createModuleResolutionCache")
@js.native
object createModuleResolutionCache extends js.Object {
  
  def apply(currentDirectory: String, getCanonicalFileName: js.Function1[/* s */ String, String]): ModuleResolutionCache = js.native
  def apply(
    currentDirectory: String,
    getCanonicalFileName: js.Function1[/* s */ String, String],
    options: CompilerOptions
  ): ModuleResolutionCache = js.native
}
