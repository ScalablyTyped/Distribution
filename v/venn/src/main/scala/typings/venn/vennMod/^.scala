package typings.venn.vennMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("venn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def VennDiagram(): typings.venn.vennMod.VennDiagram = js.native
  def bestInitialLayout(areas: js.Array[Area], params: LayoutParameter): js.Array[Circle] = js.native
  def circleFromPath(path: String): Circle = js.native
  def circleOverlap(r1: Double, r2: Double, d: Double): Double = js.native
  def distance(p1: Point, p2: Point): Double = js.native
  def intersectionArea(circles: js.Array[js.Object]): Double = js.native
  def intersectionArea(circles: js.Array[js.Object], stats: js.Object): Double = js.native
  def sortAreas(div: Selection[BaseType, js.Object, BaseType, js.UndefOr[js.Object]], relativeTo: Area): Unit = js.native
  def venn(areas: js.Array[Area], parameters: js.Object): js.Array[Circle] = js.native
}

