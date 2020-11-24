package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionWithTypeArguments
  extends NodeWithTypeArguments
     with TypeReferenceType {
  
  val expression: LeftHandSideExpression = js.native
  
  @JSName("kind")
  val kind_ExpressionWithTypeArguments: typings.typescript.mod.SyntaxKind.ExpressionWithTypeArguments = js.native
  
  @JSName("parent")
  val parent_ExpressionWithTypeArguments: HeritageClause | JSDocAugmentsTag | JSDocImplementsTag = js.native
}
