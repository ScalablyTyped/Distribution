package typings
package webcolaLib.distSrcLinklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/linklengths", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generateDirectedEdgeConstraints[Link](
    n: scala.Double,
    links: js.Array[Link],
    axis: java.lang.String,
    la: webcolaLib.distSrcLinklengthsMod.LinkSepAccessor[Link]
  ): js.Array[webcolaLib.distSrcLinklengthsMod.IConstraint] = js.native
  def jaccardLinkLengths[Link](links: js.Array[Link], la: webcolaLib.distSrcLinklengthsMod.LinkLengthAccessor[Link]): scala.Unit = js.native
  def jaccardLinkLengths[Link](
    links: js.Array[Link],
    la: webcolaLib.distSrcLinklengthsMod.LinkLengthAccessor[Link],
    w: scala.Double
  ): scala.Unit = js.native
  def stronglyConnectedComponents[Link](
    numVertices: scala.Double,
    edges: js.Array[Link],
    la: webcolaLib.distSrcLinklengthsMod.LinkAccessor[Link]
  ): js.Array[js.Array[scala.Double]] = js.native
  def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: webcolaLib.distSrcLinklengthsMod.LinkLengthAccessor[Link]): scala.Unit = js.native
  def symmetricDiffLinkLengths[Link](
    links: js.Array[Link],
    la: webcolaLib.distSrcLinklengthsMod.LinkLengthAccessor[Link],
    w: scala.Double
  ): scala.Unit = js.native
}

