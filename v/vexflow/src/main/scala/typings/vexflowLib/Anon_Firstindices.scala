package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Firstindices extends js.Object {
  var first_indices: js.Array[scala.Double]
  var first_note: vexflowLib.VexNs.FlowNs.Note
  var last_indices: js.Array[scala.Double]
  var last_note: vexflowLib.VexNs.FlowNs.Note
}

object Anon_Firstindices {
  @scala.inline
  def apply(
    first_indices: js.Array[scala.Double],
    first_note: vexflowLib.VexNs.FlowNs.Note,
    last_indices: js.Array[scala.Double],
    last_note: vexflowLib.VexNs.FlowNs.Note
  ): Anon_Firstindices = {
    val __obj = js.Dynamic.literal(first_indices = first_indices, first_note = first_note, last_indices = last_indices, last_note = last_note)
  
    __obj.asInstanceOf[Anon_Firstindices]
  }
}

