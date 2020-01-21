package typings.webcola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Layout3D")
@js.native
class Layout3D protected ()
  extends typings.webcola.layout3dMod.Layout3D {
  def this(
    nodes: js.Array[typings.webcola.layout3dMod.Node3D],
    links: js.Array[typings.webcola.layout3dMod.Link3D]
  ) = this()
  def this(
    nodes: js.Array[typings.webcola.layout3dMod.Node3D],
    links: js.Array[typings.webcola.layout3dMod.Link3D],
    idealLinkLength: Double
  ) = this()
}

/* static members */
@JSImport("webcola", "Layout3D")
@js.native
object Layout3D extends js.Object {
  var dims: js.Array[String] = js.native
  var k: Double = js.native
}

