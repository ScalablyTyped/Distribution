package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ModuleBlock
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createModuleBlock")
@js.native
object createModuleBlock extends js.Object {
  
  /** @deprecated Use `factory.createModuleBlock` or the factory supplied by your transformation context instead. */
  def apply(statements: js.Array[Statement]): ModuleBlock = js.native
}
