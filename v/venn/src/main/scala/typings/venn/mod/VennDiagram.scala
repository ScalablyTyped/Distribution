package typings.venn.mod

import org.scalablytyped.runtime.StringDictionary
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.venn.anon.Setid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VennDiagram extends js.Object {
  
  def apply(selection: Selection_[BaseType, js.Object, BaseType, js.UndefOr[js.Object]]): js.Object = js.native
  
  def duration(d: Double): VennDiagram = js.native
  
  def height(h: Double): VennDiagram = js.native
  
  def layoutFunction(f: js.Function2[/* areas */ js.Array[Area], /* parameters */ LayoutParameter, Unit]): VennDiagram = js.native
  
  def lossFunction(f: js.Function2[/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap], Double]): VennDiagram = js.native
  
  def orientationOrder(f: js.Function2[/* a */ Setid, /* b */ Setid, Double]): VennDiagram = js.native
  
  def width(w: Double): VennDiagram = js.native
}
@JSImport("venn", "VennDiagram")
@js.native
object VennDiagram extends js.Object {
  
  def apply(): VennDiagram = js.native
}
