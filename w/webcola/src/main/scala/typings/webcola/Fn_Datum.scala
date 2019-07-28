package typings.webcola

import typings.d3DashDrag.d3DashDragMod.DragBehavior
import typings.d3DashDrag.d3DashDragMod.DraggedElementBaseType
import typings.d3DashDrag.d3DashDragMod.SubjectPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Datum extends js.Object {
  def apply[GElement /* <: DraggedElementBaseType */, Datum](): DragBehavior[GElement, Datum, Datum | SubjectPosition] = js.native
}

