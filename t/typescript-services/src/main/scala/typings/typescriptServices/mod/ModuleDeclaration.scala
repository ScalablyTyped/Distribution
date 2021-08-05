package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ModuleDeclaration")
@js.native
class ModuleDeclaration protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.ModuleDeclaration {
  def this(
    modifiers: js.Array[typings.typescriptServices.TypeScript.PullElementFlags],
    name: typings.typescriptServices.TypeScript.AST,
    stringLiteral: typings.typescriptServices.TypeScript.StringLiteral,
    moduleElements: typings.typescriptServices.TypeScript.ISyntaxList2,
    endingToken: typings.typescriptServices.TypeScript.ASTSpan
  ) = this()
  
  /* private */ /* CompleteClass */
  var _astID: js.Any = js.native
  
  /* CompleteClass */
  var _end: Double = js.native
  
  /* private */ /* CompleteClass */
  var _postComments: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _preComments: js.Any = js.native
  
  /* CompleteClass */
  var _start: Double = js.native
  
  /* CompleteClass */
  var _trailingTriviaWidth: Double = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  var endingToken: typings.typescriptServices.TypeScript.ASTSpan = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  
  /* CompleteClass */
  override def kind(): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  var modifiers: js.Array[typings.typescriptServices.TypeScript.PullElementFlags] = js.native
  
  /* CompleteClass */
  var moduleElements: typings.typescriptServices.TypeScript.ISyntaxList2 = js.native
  
  /* CompleteClass */
  var name: typings.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  var parent: typings.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  override def postComments(): js.Array[typings.typescriptServices.TypeScript.Comment] = js.native
  
  /* CompleteClass */
  override def preComments(): js.Array[typings.typescriptServices.TypeScript.Comment] = js.native
  
  /* CompleteClass */
  override def setPostComments(comments: js.Array[typings.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def setPreComments(comments: js.Array[typings.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
  
  /* CompleteClass */
  var stringLiteral: typings.typescriptServices.TypeScript.StringLiteral = js.native
  
  /* CompleteClass */
  override def structuralEquals(ast: typings.typescriptServices.TypeScript.AST, includingPosition: Boolean): Boolean = js.native
  /* CompleteClass */
  override def structuralEquals(ast: typings.typescriptServices.TypeScript.ModuleDeclaration, includingPosition: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def syntaxID(): Double = js.native
  
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  override def width(): Double = js.native
}
