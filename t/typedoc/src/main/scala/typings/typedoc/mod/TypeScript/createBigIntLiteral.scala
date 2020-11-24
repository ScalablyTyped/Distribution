package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BigIntLiteral
import typings.typescript.mod.PseudoBigInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createBigIntLiteral")
@js.native
object createBigIntLiteral extends js.Object {
  
  /** @deprecated Use `factory.createBigIntLiteral` or the factory supplied by your transformation context instead. */
  def apply(value: String): BigIntLiteral = js.native
  def apply(value: PseudoBigInt): BigIntLiteral = js.native
}
