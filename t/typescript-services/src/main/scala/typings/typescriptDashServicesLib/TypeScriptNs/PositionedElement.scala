package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PositionedElement")
@js.native
class PositionedElement protected () extends js.Object {
  def this(parent: PositionedElement, element: ISyntaxElement, fullStart: scala.Double) = this()
  var _element: js.Any = js.native
  var _fullStart: js.Any = js.native
  var _parent: js.Any = js.native
  def childAt(index: scala.Double): PositionedElement = js.native
  def childCount(): scala.Double = js.native
  def childEnd(child: ISyntaxElement): scala.Double = js.native
  def childEndAt(index: scala.Double): scala.Double = js.native
  def childIndex(child: ISyntaxElement): scala.Double = js.native
  def childStart(child: ISyntaxElement): scala.Double = js.native
  def childStartAt(index: scala.Double): scala.Double = js.native
  def containingNode(): PositionedNode = js.native
  def element(): ISyntaxElement = js.native
  def end(): scala.Double = js.native
  def fullEnd(): scala.Double = js.native
  def fullStart(): scala.Double = js.native
  def fullWidth(): scala.Double = js.native
  def getPositionedChild(child: ISyntaxElement): PositionedElement = js.native
  def kind(): SyntaxKind = js.native
  def parent(): PositionedElement = js.native
  def parentElement(): ISyntaxElement = js.native
  def root(): PositionedNode = js.native
  def start(): scala.Double = js.native
}

/* static members */
@JSGlobal("TypeScript.PositionedElement")
@js.native
object PositionedElement extends js.Object {
  def create(
    parent: typescriptDashServicesLib.TypeScriptNs.PositionedElement,
    element: typescriptDashServicesLib.TypeScriptNs.ISyntaxElement,
    fullStart: scala.Double
  ): typescriptDashServicesLib.TypeScriptNs.PositionedElement = js.native
}

