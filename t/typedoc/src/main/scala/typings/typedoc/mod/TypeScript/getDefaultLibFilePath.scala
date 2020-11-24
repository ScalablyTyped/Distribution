package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getDefaultLibFilePath")
@js.native
object getDefaultLibFilePath extends js.Object {
  
  /**
    * Get the path of the default library files (lib.d.ts) as distributed with the typescript
    * node package.
    * The functionality is not supported if the ts module is consumed outside of a node module.
    */
  def apply(options: CompilerOptions): String = js.native
}
