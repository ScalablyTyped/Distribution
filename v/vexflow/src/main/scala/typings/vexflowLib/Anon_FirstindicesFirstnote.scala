package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstindicesFirstnote extends js.Object {
  var first_indices: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var first_note: vexflowLib.VexNs.FlowNs.Note
  var last_indices: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var last_note: vexflowLib.VexNs.FlowNs.Note
}

object Anon_FirstindicesFirstnote {
  @scala.inline
  def apply(
    first_note: vexflowLib.VexNs.FlowNs.Note,
    last_note: vexflowLib.VexNs.FlowNs.Note,
    first_indices: js.Array[scala.Double] = null,
    last_indices: js.Array[scala.Double] = null
  ): Anon_FirstindicesFirstnote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("first_note")(first_note)
    __obj.updateDynamic("last_note")(last_note)
    if (first_indices != null) __obj.updateDynamic("first_indices")(first_indices)
    if (last_indices != null) __obj.updateDynamic("last_indices")(last_indices)
    __obj.asInstanceOf[Anon_FirstindicesFirstnote]
  }
}

