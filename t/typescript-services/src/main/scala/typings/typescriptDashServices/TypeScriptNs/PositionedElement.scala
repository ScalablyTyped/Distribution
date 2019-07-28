package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PositionedElement")
@js.native
class PositionedElement protected () extends js.Object {
  def this(parent: PositionedElement, element: ISyntaxElement, fullStart: Double) = this()
  var _element: js.Any = js.native
  var _fullStart: js.Any = js.native
  var _parent: js.Any = js.native
  def childAt(index: Double): PositionedElement = js.native
  def childCount(): Double = js.native
  def childEnd(child: ISyntaxElement): Double = js.native
  def childEndAt(index: Double): Double = js.native
  def childIndex(child: ISyntaxElement): Double = js.native
  def childStart(child: ISyntaxElement): Double = js.native
  def childStartAt(index: Double): Double = js.native
  def containingNode(): PositionedNode = js.native
  def element(): ISyntaxElement = js.native
  def end(): Double = js.native
  def fullEnd(): Double = js.native
  def fullStart(): Double = js.native
  def fullWidth(): Double = js.native
  def getPositionedChild(child: ISyntaxElement): PositionedElement = js.native
  def kind(): SyntaxKind = js.native
  def parent(): PositionedElement = js.native
  def parentElement(): ISyntaxElement = js.native
  def root(): PositionedNode = js.native
  def start(): Double = js.native
}

/* static members */
@JSGlobal("TypeScript.PositionedElement")
@js.native
object PositionedElement extends js.Object {
  def create(parent: PositionedElement, element: ISyntaxElement, fullStart: Double): PositionedElement = js.native
}

