package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait Identifier
  extends PrimaryExpression
     with BindingName
     with BindingOrAssignmentElementTarget
     with DeclarationName
     with EntityName
     with EntityNameExpression
     with JSDocNamespaceBody
     with JsxTagNameExpression
     with ModuleName
     with PropertyName
     with _BindingOrAssignmentElement {
  var _declarationBrand: js.Any = js.native
  /**
    * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
    * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
    */
  var escapedText: __String = js.native
  var isInJSDocNamespace: js.UndefOr[scala.Boolean] = js.native
  var originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
  val text: java.lang.String = js.native
}

