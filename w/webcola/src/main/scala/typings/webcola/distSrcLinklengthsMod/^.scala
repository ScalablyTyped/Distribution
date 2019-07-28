package typings.webcola.distSrcLinklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/linklengths", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generateDirectedEdgeConstraints[Link](n: Double, links: js.Array[Link], axis: String, la: LinkSepAccessor[Link]): js.Array[IConstraint] = js.native
  def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = js.native
  def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = js.native
  def stronglyConnectedComponents[Link](numVertices: Double, edges: js.Array[Link], la: LinkAccessor[Link]): js.Array[js.Array[Double]] = js.native
  def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = js.native
  def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = js.native
}

