package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BreakStatement
import typings.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createBreak")
@js.native
object createBreak extends js.Object {
  
  /** @deprecated Use `factory.createBreak` or the factory supplied by your transformation context instead. */
  def apply(): BreakStatement = js.native
  def apply(label: String): BreakStatement = js.native
  def apply(label: Identifier): BreakStatement = js.native
}
