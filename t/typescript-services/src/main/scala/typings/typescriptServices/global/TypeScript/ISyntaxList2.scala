package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ISyntaxList2")
@js.native
class ISyntaxList2 protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.ISyntaxList2 {
  def this(_fileName: String, members: js.Array[typings.typescriptServices.TypeScript.AST]) = this()
  
  /* private */ /* CompleteClass */
  var _astID: js.Any = js.native
  
  /* CompleteClass */
  var _end: Double = js.native
  
  /* private */ /* CompleteClass */
  var _fileName: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _postComments: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _preComments: js.Any = js.native
  
  /* CompleteClass */
  var _start: Double = js.native
  
  /* CompleteClass */
  var _trailingTriviaWidth: Double = js.native
  
  /* CompleteClass */
  override def any(func: js.Function1[/* v */ typings.typescriptServices.TypeScript.AST, Boolean]): Boolean = js.native
  
  /* CompleteClass */
  override def childAt(index: Double): typings.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  override def childCount(): Double = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  override def firstOrDefault(func: js.Function2[/* v */ typings.typescriptServices.TypeScript.AST, /* index */ Double, Boolean]): typings.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  
  /* CompleteClass */
  override def kind(): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  override def lastOrDefault(func: js.Function2[/* v */ typings.typescriptServices.TypeScript.AST, /* index */ Double, Boolean]): typings.typescriptServices.TypeScript.AST = js.native
  
  /* private */ /* CompleteClass */
  var members: js.Any = js.native
  
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
  override def structuralEquals(ast: typings.typescriptServices.TypeScript.ISyntaxList2, includingPosition: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def syntaxID(): Double = js.native
  
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  override def width(): Double = js.native
}
