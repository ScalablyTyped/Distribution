package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextSpan")
@js.native
class TextSpan protected ()
  extends typings.typescriptServices.TypeScript.TextSpan {
  def this(start: Double, length: Double) = this()
  /* CompleteClass */
  override var _length: js.Any = js.native
  /* CompleteClass */
  override var _start: js.Any = js.native
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

/* static members */
@JSImport("typescript-services", "TextSpan")
@js.native
object TextSpan extends js.Object {
  def fromBounds(start: Double, end: Double): typings.typescriptServices.TypeScript.TextSpan = js.native
}

