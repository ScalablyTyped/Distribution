package typings.webcola.mod

import typings.webcola.anon.X
import typings.webcola.layoutMod.Group
import typings.webcola.layoutMod.Link
import typings.webcola.layoutMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Layout")
@js.native
class Layout ()
  extends typings.webcola.layoutMod.Layout
/* static members */
object Layout {
  
  @JSImport("webcola", "Layout")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola", "Layout.drag")
  @js.native
  def drag(d: Group, position: X): Unit = js.native
  @JSImport("webcola", "Layout.drag")
  @js.native
  def drag(d: Node, position: X): Unit = js.native
  
  @JSImport("webcola", "Layout.dragEnd")
  @js.native
  def dragEnd(d: js.Any): Unit = js.native
  
  @JSImport("webcola", "Layout.dragOrigin")
  @js.native
  def dragOrigin(d: Group): X = js.native
  @JSImport("webcola", "Layout.dragOrigin")
  @js.native
  def dragOrigin(d: Node): X = js.native
  
  @JSImport("webcola", "Layout.dragStart")
  @js.native
  def dragStart(d: Group): Unit = js.native
  @JSImport("webcola", "Layout.dragStart")
  @js.native
  def dragStart(d: Node): Unit = js.native
  
  @JSImport("webcola", "Layout.getSourceIndex")
  @js.native
  def getSourceIndex(e: Link[Node | Double]): Double = js.native
  
  @JSImport("webcola", "Layout.getTargetIndex")
  @js.native
  def getTargetIndex(e: Link[Node | Double]): Double = js.native
  
  @JSImport("webcola", "Layout.linkId")
  @js.native
  def linkId(e: Link[Node | Double]): String = js.native
  
  @JSImport("webcola", "Layout.mouseOut")
  @js.native
  def mouseOut(d: js.Any): Unit = js.native
  
  @JSImport("webcola", "Layout.mouseOver")
  @js.native
  def mouseOver(d: js.Any): Unit = js.native
  
  @JSImport("webcola", "Layout.setLinkLength")
  @js.native
  def setLinkLength(link: Link[Node | Double], length: Double): Unit = js.native
  
  @JSImport("webcola", "Layout.stopNode")
  @js.native
  def stopNode: js.Any = js.native
  @scala.inline
  def stopNode_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopNode")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Layout.storeOffset")
  @js.native
  def storeOffset: js.Any = js.native
  @scala.inline
  def storeOffset_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storeOffset")(x.asInstanceOf[js.Any])
}
