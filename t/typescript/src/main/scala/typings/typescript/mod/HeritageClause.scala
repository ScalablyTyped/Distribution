package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.ExtendsKeyword
import typings.typescript.mod.SyntaxKind.ImplementsKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeritageClause extends Node {
  
  @JSName("kind")
  val kind_HeritageClause: typings.typescript.mod.SyntaxKind.HeritageClause = js.native
  
  @JSName("parent")
  val parent_HeritageClause: InterfaceDeclaration | ClassLikeDeclaration = js.native
  
  val token: ExtendsKeyword | ImplementsKeyword = js.native
  
  val types: NodeArray[ExpressionWithTypeArguments] = js.native
}
