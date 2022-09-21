package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxElement
import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PositionedNode")
@js.native
open class PositionedNode protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PositionedNode {
  def this(
    parent: typings.typescriptServices.TypeScript.PositionedElement,
    node: typings.typescriptServices.TypeScript.SyntaxNode,
    fullStart: Double
  ) = this()
  
  /* private */ /* CompleteClass */
  var _element: Any = js.native
  
  /* private */ /* CompleteClass */
  var _fullStart: Any = js.native
  
  /* private */ /* CompleteClass */
  var _parent: Any = js.native
  
  /* CompleteClass */
  override def childAt(index: Double): typings.typescriptServices.TypeScript.PositionedElement = js.native
  
  /* CompleteClass */
  override def childCount(): Double = js.native
  
  /* CompleteClass */
  override def childEnd(child: ISyntaxElement): Double = js.native
  
  /* CompleteClass */
  override def childEndAt(index: Double): Double = js.native
  
  /* CompleteClass */
  override def childIndex(child: ISyntaxElement): Double = js.native
  
  /* CompleteClass */
  override def childStart(child: ISyntaxElement): Double = js.native
  
  /* CompleteClass */
  override def childStartAt(index: Double): Double = js.native
  
  /* CompleteClass */
  override def containingNode(): typings.typescriptServices.TypeScript.PositionedNode = js.native
  
  /* CompleteClass */
  override def element(): ISyntaxElement = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  override def fullEnd(): Double = js.native
  
  /* CompleteClass */
  override def fullStart(): Double = js.native
  
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  
  /* CompleteClass */
  override def getPositionedChild(child: ISyntaxElement): typings.typescriptServices.TypeScript.PositionedElement = js.native
  
  /* CompleteClass */
  override def kind(): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  override def node(): typings.typescriptServices.TypeScript.SyntaxNode = js.native
  
  /* CompleteClass */
  override def nodeOrToken(): ISyntaxNodeOrToken = js.native
  
  /* CompleteClass */
  override def parent(): typings.typescriptServices.TypeScript.PositionedElement = js.native
  
  /* CompleteClass */
  override def parentElement(): ISyntaxElement = js.native
  
  /* CompleteClass */
  override def root(): typings.typescriptServices.TypeScript.PositionedNode = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
}
