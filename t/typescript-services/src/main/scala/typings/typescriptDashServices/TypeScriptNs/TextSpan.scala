package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TextSpan")
@js.native
class TextSpan protected () extends js.Object {
  def this(start: Double, length: Double) = this()
  var _length: js.Any = js.native
  var _start: js.Any = js.native
  def containsPosition(position: Double): Boolean = js.native
  def containsTextSpan(span: TextSpan): Boolean = js.native
  def end(): Double = js.native
  def intersection(span: TextSpan): TextSpan = js.native
  def intersectsWith(start: Double, length: Double): Boolean = js.native
  def intersectsWithPosition(position: Double): Boolean = js.native
  def intersectsWithTextSpan(span: TextSpan): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def length(): Double = js.native
  def overlap(span: TextSpan): TextSpan = js.native
  def overlapsWith(span: TextSpan): Boolean = js.native
  def start(): Double = js.native
}

/* static members */
@JSGlobal("TypeScript.TextSpan")
@js.native
object TextSpan extends js.Object {
  def fromBounds(start: Double, end: Double): TextSpan = js.native
}

