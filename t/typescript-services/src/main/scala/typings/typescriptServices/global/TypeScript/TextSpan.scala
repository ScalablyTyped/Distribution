package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.TextSpan")
@js.native
open class TextSpan protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.TextSpan {
  def this(start: Double, length: Double) = this()
  
  /* private */ /* CompleteClass */
  var _length: Any = js.native
  
  /* private */ /* CompleteClass */
  var _start: Any = js.native
  
  /* CompleteClass */
  override def containsPosition(position: Double): Boolean = js.native
  
  /* CompleteClass */
  override def containsTextSpan(span: typings.typescriptServices.TypeScript.TextSpan): Boolean = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  override def intersection(span: typings.typescriptServices.TypeScript.TextSpan): typings.typescriptServices.TypeScript.TextSpan = js.native
  
  /* CompleteClass */
  override def intersectsWith(start: Double, length: Double): Boolean = js.native
  
  /* CompleteClass */
  override def intersectsWithPosition(position: Double): Boolean = js.native
  
  /* CompleteClass */
  override def intersectsWithTextSpan(span: typings.typescriptServices.TypeScript.TextSpan): Boolean = js.native
  
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  
  /* CompleteClass */
  override def length(): Double = js.native
  
  /* CompleteClass */
  override def overlap(span: typings.typescriptServices.TypeScript.TextSpan): typings.typescriptServices.TypeScript.TextSpan = js.native
  
  /* CompleteClass */
  override def overlapsWith(span: typings.typescriptServices.TypeScript.TextSpan): Boolean = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
}
object TextSpan {
  
  @JSGlobal("TypeScript.TextSpan")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromBounds(start: Double, end: Double): typings.typescriptServices.TypeScript.TextSpan = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBounds")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.TextSpan]
}
