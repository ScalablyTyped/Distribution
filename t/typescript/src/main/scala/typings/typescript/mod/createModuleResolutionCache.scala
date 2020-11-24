package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createModuleResolutionCache")
@js.native
object createModuleResolutionCache extends js.Object {
  
  def apply(
    currentDirectory: java.lang.String,
    getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String]
  ): ModuleResolutionCache = js.native
  def apply(
    currentDirectory: java.lang.String,
    getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String],
    options: CompilerOptions
  ): ModuleResolutionCache = js.native
}
