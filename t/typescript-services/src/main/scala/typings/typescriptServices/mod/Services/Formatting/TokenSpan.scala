package typings.typescriptServices.mod.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxKind
import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.TokenSpan")
@js.native
class TokenSpan protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.TokenSpan {
  def this(kind: SyntaxKind, start: Double, length: Double) = this()
  /* CompleteClass */
  override var _kind: js.Any = js.native
  /* CompleteClass */
  override var _length: js.Any = js.native
  /* CompleteClass */
  override var _start: js.Any = js.native
  /* CompleteClass */
  override def containsPosition(position: Double): Boolean = js.native
  /* CompleteClass */
  override def containsTextSpan(span: TextSpan): Boolean = js.native
  /* CompleteClass */
  override def end(): Double = js.native
  /* CompleteClass */
  override def intersection(span: TextSpan): TextSpan = js.native
  /* CompleteClass */
  override def intersectsWith(start: Double, length: Double): Boolean = js.native
  /* CompleteClass */
  override def intersectsWithPosition(position: Double): Boolean = js.native
  /* CompleteClass */
  override def intersectsWithTextSpan(span: TextSpan): Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def kind(): SyntaxKind = js.native
  /* CompleteClass */
  override def length(): Double = js.native
  /* CompleteClass */
  override def overlap(span: TextSpan): TextSpan = js.native
  /* CompleteClass */
  override def overlapsWith(span: TextSpan): Boolean = js.native
  /* CompleteClass */
  override def start(): Double = js.native
}

