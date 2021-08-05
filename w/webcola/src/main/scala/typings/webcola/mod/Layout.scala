package typings.webcola.mod

import typings.webcola.anon.X
import typings.webcola.layoutMod.Group
import typings.webcola.layoutMod.Link
import typings.webcola.layoutMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  inline def drag(d: Group, position: X): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drag")(d.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drag(d: Node, position: X): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drag")(d.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dragEnd(d: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dragEnd")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def dragOrigin(d: Group): X = ^.asInstanceOf[js.Dynamic].applyDynamic("dragOrigin")(d.asInstanceOf[js.Any]).asInstanceOf[X]
  inline def dragOrigin(d: Node): X = ^.asInstanceOf[js.Dynamic].applyDynamic("dragOrigin")(d.asInstanceOf[js.Any]).asInstanceOf[X]
  
  inline def dragStart(d: Group): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dragStart")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def dragStart(d: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dragStart")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getSourceIndex(e: Link[Node | Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceIndex")(e.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTargetIndex(e: Link[Node | Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetIndex")(e.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def linkId(e: Link[Node | Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("linkId")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mouseOut(d: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOut")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mouseOver(d: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOver")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLinkLength(link: Link[Node | Double], length: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLinkLength")(link.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("webcola", "Layout.stopNode")
  @js.native
  def stopNode: js.Any = js.native
  inline def stopNode_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopNode")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Layout.storeOffset")
  @js.native
  def storeOffset: js.Any = js.native
  inline def storeOffset_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storeOffset")(x.asInstanceOf[js.Any])
}
