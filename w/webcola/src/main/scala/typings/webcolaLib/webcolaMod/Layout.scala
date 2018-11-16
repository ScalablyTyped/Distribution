package typings
package webcolaLib.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Layout")
@js.native
class Layout ()
  extends webcolaLib.distSrcLayoutMod.Layout

@JSImport("webcola", "Layout")
@js.native
object Layout extends js.Object {
  def drag(d: webcolaLib.distSrcLayoutMod.Group, position: webcolaLib.Anon_Y): scala.Unit = js.native
  def drag(d: webcolaLib.distSrcLayoutMod.Node, position: webcolaLib.Anon_Y): scala.Unit = js.native
  def dragEnd(d: js.Any): scala.Unit = js.native
  def dragOrigin(d: webcolaLib.distSrcLayoutMod.Group): webcolaLib.Anon_Y = js.native
  def dragOrigin(d: webcolaLib.distSrcLayoutMod.Node): webcolaLib.Anon_Y = js.native
  def dragStart(d: webcolaLib.distSrcLayoutMod.Group): scala.Unit = js.native
  def dragStart(d: webcolaLib.distSrcLayoutMod.Node): scala.Unit = js.native
  def getSourceIndex(e: webcolaLib.distSrcLayoutMod.Link[webcolaLib.distSrcLayoutMod.Node | scala.Double]): scala.Double = js.native
  def getTargetIndex(e: webcolaLib.distSrcLayoutMod.Link[webcolaLib.distSrcLayoutMod.Node | scala.Double]): scala.Double = js.native
  def linkId(e: webcolaLib.distSrcLayoutMod.Link[webcolaLib.distSrcLayoutMod.Node | scala.Double]): java.lang.String = js.native
  def mouseOut(d: js.Any): scala.Unit = js.native
  def mouseOver(d: js.Any): scala.Unit = js.native
  def setLinkLength(
    link: webcolaLib.distSrcLayoutMod.Link[webcolaLib.distSrcLayoutMod.Node | scala.Double],
    length: scala.Double
  ): scala.Unit = js.native
  /* private */ def stopNode(v: js.Any): js.Any = js.native
  /* private */ def storeOffset(d: js.Any, origin: js.Any): js.Any = js.native
}

