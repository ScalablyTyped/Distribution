package typings
package webcolaLib.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Layout3D")
@js.native
class Layout3D protected ()
  extends webcolaLib.distSrcLayout3dMod.Layout3D {
  def this(nodes: js.Array[webcolaLib.distSrcLayout3dMod.Node3D], links: js.Array[webcolaLib.distSrcLayout3dMod.Link3D]) = this()
  def this(nodes: js.Array[webcolaLib.distSrcLayout3dMod.Node3D], links: js.Array[webcolaLib.distSrcLayout3dMod.Link3D], idealLinkLength: scala.Double) = this()
}

/* static members */
@JSImport("webcola", "Layout3D")
@js.native
object Layout3D extends js.Object {
  var dims: js.Array[java.lang.String] = js.native
  var k: scala.Double = js.native
}

