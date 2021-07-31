package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxTrivia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Comment")
@js.native
class Comment protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Comment {
  def this(_trivia: ISyntaxTrivia, endsLine: Boolean, _start: Double, _end: Double) = this()
  
  /* CompleteClass */
  var _end: Double = js.native
  
  /* CompleteClass */
  var _start: Double = js.native
  
  /* CompleteClass */
  var _trivia: js.Any = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  var endsLine: Boolean = js.native
  
  /* CompleteClass */
  override def fullText(): String = js.native
  
  /* CompleteClass */
  override def kind(): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
  
  /* CompleteClass */
  override def structuralEquals(ast: typings.typescriptServices.TypeScript.Comment, includingPosition: Boolean): Boolean = js.native
}
