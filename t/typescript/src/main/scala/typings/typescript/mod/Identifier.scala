package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identifier
  extends StObject
     with PrimaryExpression
     with Declaration
     with JSDocContainer
     with FlowContainer
     with AssertionKey
     with BindingName
     with BindingOrAssignmentElementTarget
     with EntityName
     with EntityNameExpression
     with HasJSDoc
     with JSDocNamespaceBody
     with JsxAttributeName
     with JsxTagNameExpression
     with MemberName
     with ModuleName
     with PropertyName
     with PropertyNameLiteral
     with _ArrayBindingOrAssignmentElement {
  
  /**
    * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
    * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
    */
  val escapedText: String = js.native
  
  /** @deprecated Use `.parent` or the surrounding context to determine this instead. */
  val isInJSDocNamespace: js.UndefOr[Boolean] = js.native
  
  @JSName("kind")
  val kind_Identifier: typings.typescript.mod.SyntaxKind.Identifier = js.native
  
  /** @deprecated Use `idKeyword(identifier)` instead. */
  val originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
  
  val text: java.lang.String = js.native
}
