package typings
package vennLib.vennMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VennDiagram extends js.Object {
  def apply(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      js.Object, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      js.UndefOr[js.Object]
    ]
  ): js.Object = js.native
  def duration(d: scala.Double): VennDiagram = js.native
  def height(h: scala.Double): VennDiagram = js.native
  def layoutFunction(f: js.Function2[/* areas */ js.Array[Area], /* parameters */ LayoutParameter, scala.Unit]): VennDiagram = js.native
  def lossFunction(
    f: js.Function2[
      /* sets */ org.scalablytyped.runtime.StringDictionary[Circle], 
      /* overlaps */ js.Array[Overlap], 
      scala.Double
    ]
  ): VennDiagram = js.native
  def orientationOrder(f: js.Function2[/* a */ vennLib.Anon_Setid, /* b */ vennLib.Anon_Setid, scala.Double]): VennDiagram = js.native
  def width(w: scala.Double): VennDiagram = js.native
}

