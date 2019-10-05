package typings.webcola.webcolaMod

import typings.webcola.distSrcLinklengthsMod.IConstraint
import typings.webcola.distSrcLinklengthsMod.LinkSepAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "generateDirectedEdgeConstraints")
@js.native
object generateDirectedEdgeConstraints extends js.Object {
  def apply[Link](n: Double, links: js.Array[Link], axis: String, la: LinkSepAccessor[Link]): js.Array[IConstraint] = js.native
}

