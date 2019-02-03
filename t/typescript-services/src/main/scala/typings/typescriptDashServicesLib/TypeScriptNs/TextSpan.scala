package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TextSpan")
@js.native
class TextSpan protected () extends js.Object {
  def this(start: scala.Double, length: scala.Double) = this()
  var _length: js.Any = js.native
  var _start: js.Any = js.native
  def containsPosition(position: scala.Double): scala.Boolean = js.native
  def containsTextSpan(span: TextSpan): scala.Boolean = js.native
  def end(): scala.Double = js.native
  def intersection(span: TextSpan): TextSpan = js.native
  def intersectsWith(start: scala.Double, length: scala.Double): scala.Boolean = js.native
  def intersectsWithPosition(position: scala.Double): scala.Boolean = js.native
  def intersectsWithTextSpan(span: TextSpan): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def overlap(span: TextSpan): TextSpan = js.native
  def overlapsWith(span: TextSpan): scala.Boolean = js.native
  def start(): scala.Double = js.native
}

/* static members */
@JSGlobal("TypeScript.TextSpan")
@js.native
object TextSpan extends js.Object {
  def fromBounds(start: scala.Double, end: scala.Double): typescriptDashServicesLib.TypeScriptNs.TextSpan = js.native
}

