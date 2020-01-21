package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
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
  var escapedText: String = js.native
  var isInJSDocNamespace: js.UndefOr[Boolean] = js.native
  @JSName("kind")
  var kind_Identifier: typings.typescript.mod.SyntaxKind.Identifier = js.native
  var originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
  val text: java.lang.String = js.native
}

