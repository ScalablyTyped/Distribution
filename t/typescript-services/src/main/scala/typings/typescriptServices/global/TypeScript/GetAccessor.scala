package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IASTToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.GetAccessor")
@js.native
class GetAccessor protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.GetAccessor {
  def this(
    modifiers: js.Array[typings.typescriptServices.TypeScript.PullElementFlags],
    propertyName: IASTToken,
    parameterList: typings.typescriptServices.TypeScript.ParameterList,
    typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotation,
    block: typings.typescriptServices.TypeScript.Block
  ) = this()
  
  /* CompleteClass */
  var _astID: js.Any = js.native
  
  /* CompleteClass */
  var _end: Double = js.native
  
  /* CompleteClass */
  var _postComments: js.Any = js.native
  
  /* CompleteClass */
  var _preComments: js.Any = js.native
  
  /* CompleteClass */
  var _start: Double = js.native
  
  /* CompleteClass */
  var _trailingTriviaWidth: Double = js.native
  
  /* CompleteClass */
  var block: typings.typescriptServices.TypeScript.Block = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  
  /* CompleteClass */
  override def kind(): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  var modifiers: js.Array[typings.typescriptServices.TypeScript.PullElementFlags] = js.native
  
  /* CompleteClass */
  var parameterList: typings.typescriptServices.TypeScript.ParameterList = js.native
  
  /* CompleteClass */
  var parent: typings.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  override def postComments(): js.Array[typings.typescriptServices.TypeScript.Comment] = js.native
  
  /* CompleteClass */
  override def preComments(): js.Array[typings.typescriptServices.TypeScript.Comment] = js.native
  
  /* CompleteClass */
  var propertyName: IASTToken = js.native
  
  /* CompleteClass */
  override def setPostComments(comments: js.Array[typings.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def setPreComments(comments: js.Array[typings.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
  
  /* CompleteClass */
  override def structuralEquals(ast: typings.typescriptServices.TypeScript.AST, includingPosition: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def syntaxID(): Double = js.native
  
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  var typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotation = js.native
  
  /* CompleteClass */
  override def width(): Double = js.native
}
