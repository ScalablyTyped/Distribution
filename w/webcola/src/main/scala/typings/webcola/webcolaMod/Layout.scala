package typings.webcola.webcolaMod

import typings.webcola.Anon_X
import typings.webcola.distSrcLayoutMod.Group
import typings.webcola.distSrcLayoutMod.Link
import typings.webcola.distSrcLayoutMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Layout")
@js.native
class Layout ()
  extends typings.webcola.distSrcLayoutMod.Layout

/* static members */
@JSImport("webcola", "Layout")
@js.native
object Layout extends js.Object {
  var stopNode: js.Any = js.native
  var storeOffset: js.Any = js.native
  def drag(d: Group, position: Anon_X): Unit = js.native
  def drag(d: Node, position: Anon_X): Unit = js.native
  def dragEnd(d: js.Any): Unit = js.native
  def dragOrigin(d: Group): Anon_X = js.native
  def dragOrigin(d: Node): Anon_X = js.native
  def dragStart(d: Group): Unit = js.native
  def dragStart(d: Node): Unit = js.native
  def getSourceIndex(e: Link[Node | Double]): Double = js.native
  def getTargetIndex(e: Link[Node | Double]): Double = js.native
  def linkId(e: Link[Node | Double]): String = js.native
  def mouseOut(d: js.Any): Unit = js.native
  def mouseOver(d: js.Any): Unit = js.native
  def setLinkLength(link: Link[Node | Double], length: Double): Unit = js.native
}

