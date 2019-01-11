package typings
package vennLib.vennMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("venn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def VennDiagram(): vennLib.vennMod.VennDiagram = js.native
  def bestInitialLayout(areas: js.Array[vennLib.vennMod.Area], params: vennLib.vennMod.LayoutParameter): js.Array[vennLib.vennMod.Circle] = js.native
  def circleFromPath(path: java.lang.String): vennLib.vennMod.Circle = js.native
  def circleOverlap(r1: scala.Double, r2: scala.Double, d: scala.Double): scala.Double = js.native
  def distance(p1: vennLib.vennMod.Point, p2: vennLib.vennMod.Point): scala.Double = js.native
  def intersectionArea(circles: js.Array[js.Object]): scala.Double = js.native
  def intersectionArea(circles: js.Array[js.Object], stats: js.Object): scala.Double = js.native
  def sortAreas(
    div: d3DashSelectionLib.d3DashSelectionMod.Selection[
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      js.Object, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      js.UndefOr[js.Object]
    ],
    relativeTo: vennLib.vennMod.Area
  ): scala.Unit = js.native
  def venn(areas: js.Array[vennLib.vennMod.Area], parameters: js.Object): js.Array[vennLib.vennMod.Circle] = js.native
}

