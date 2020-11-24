package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocUnknownTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocTag")
@js.native
object createJSDocTag extends js.Object {
  
  /** @deprecated Use `factory.createJSDocUnknownTag` or the factory supplied by your transformation context instead. */
  def apply(tagName: Identifier): JSDocUnknownTag = js.native
  def apply(tagName: Identifier, comment: String): JSDocUnknownTag = js.native
}
