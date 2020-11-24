package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ModifierSyntaxKind
import typings.typescript.mod.ModifierToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createModifier")
@js.native
object createModifier extends js.Object {
  
  /** @deprecated Use `factory.createModifier` or the factory supplied by your transformation context instead. */
  def apply[T /* <: ModifierSyntaxKind */](kind: T): ModifierToken[T] = js.native
}
