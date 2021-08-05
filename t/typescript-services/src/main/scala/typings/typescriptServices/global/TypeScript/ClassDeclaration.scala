package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ClassDeclaration")
@js.native
class ClassDeclaration protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.ClassDeclaration {
  def this(
    modifiers: js.Array[typings.typescriptServices.TypeScript.PullElementFlags],
    identifier: typings.typescriptServices.TypeScript.Identifier,
    typeParameterList: typings.typescriptServices.TypeScript.TypeParameterList,
    heritageClauses: typings.typescriptServices.TypeScript.ISyntaxList2,
    classElements: typings.typescriptServices.TypeScript.ISyntaxList2,
    closeBraceToken: typings.typescriptServices.TypeScript.ASTSpan
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
  var classElements: typings.typescriptServices.TypeScript.ISyntaxList2 = js.native
  
  /* CompleteClass */
  var closeBraceToken: typings.typescriptServices.TypeScript.ASTSpan = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  var heritageClauses: typings.typescriptServices.TypeScript.ISyntaxList2 = js.native
  
  /* CompleteClass */
  var identifier: typings.typescriptServices.TypeScript.Identifier = js.native
  
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  
  /* CompleteClass */
  override def kind(): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  var modifiers: js.Array[typings.typescriptServices.TypeScript.PullElementFlags] = js.native
  
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
  override def structuralEquals(ast: typings.typescriptServices.TypeScript.AST, includingPosition: Boolean): Boolean = js.native
  /* CompleteClass */
  override def structuralEquals(ast: typings.typescriptServices.TypeScript.ClassDeclaration, includingPosition: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def syntaxID(): Double = js.native
  
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  var typeParameterList: typings.typescriptServices.TypeScript.TypeParameterList = js.native
  
  /* CompleteClass */
  override def width(): Double = js.native
}
