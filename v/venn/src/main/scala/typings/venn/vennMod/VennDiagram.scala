package typings.venn.vennMod

import org.scalablytyped.runtime.StringDictionary
import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.venn.Anon_Setid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VennDiagram extends js.Object {
  def apply(selection: Selection[BaseType, js.Object, BaseType, js.UndefOr[js.Object]]): js.Object = js.native
  def duration(d: Double): VennDiagram = js.native
  def height(h: Double): VennDiagram = js.native
  def layoutFunction(f: js.Function2[/* areas */ js.Array[Area], /* parameters */ LayoutParameter, Unit]): VennDiagram = js.native
  def lossFunction(f: js.Function2[/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap], Double]): VennDiagram = js.native
  def orientationOrder(f: js.Function2[/* a */ Anon_Setid, /* b */ Anon_Setid, Double]): VennDiagram = js.native
  def width(w: Double): VennDiagram = js.native
}

