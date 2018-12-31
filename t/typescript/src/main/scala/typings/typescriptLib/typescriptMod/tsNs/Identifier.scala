package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptLib.typescriptMod.tsNs.Declaration because Would inherit conflicting mutable fields List(decorators, end, flags, kind, modifiers, parent, pos))*/
@js.native
trait Identifier extends PrimaryExpression {
  /**
    * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
    * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
    */
  var escapedText: __String = js.native
  var isInJSDocNamespace: js.UndefOr[scala.Boolean] = js.native
  var originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
  val text: java.lang.String = js.native
}

