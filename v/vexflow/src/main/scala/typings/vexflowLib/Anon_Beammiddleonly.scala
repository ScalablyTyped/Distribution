package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Beammiddleonly extends js.Object {
  var beam_middle_only: js.UndefOr[scala.Boolean] = js.undefined
  var beam_rests: js.UndefOr[scala.Boolean] = js.undefined
  var groups: js.UndefOr[js.Array[vexflowLib.VexNs.FlowNs.Fraction]] = js.undefined
  var maintain_stem_directions: js.UndefOr[scala.Boolean] = js.undefined
  var show_stemlets: js.UndefOr[scala.Boolean] = js.undefined
  var stem_direction: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Beammiddleonly {
  @scala.inline
  def apply(
    beam_middle_only: js.UndefOr[scala.Boolean] = js.undefined,
    beam_rests: js.UndefOr[scala.Boolean] = js.undefined,
    groups: js.Array[vexflowLib.VexNs.FlowNs.Fraction] = null,
    maintain_stem_directions: js.UndefOr[scala.Boolean] = js.undefined,
    show_stemlets: js.UndefOr[scala.Boolean] = js.undefined,
    stem_direction: scala.Int | scala.Double = null
  ): Anon_Beammiddleonly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beam_middle_only)) __obj.updateDynamic("beam_middle_only")(beam_middle_only)
    if (!js.isUndefined(beam_rests)) __obj.updateDynamic("beam_rests")(beam_rests)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (!js.isUndefined(maintain_stem_directions)) __obj.updateDynamic("maintain_stem_directions")(maintain_stem_directions)
    if (!js.isUndefined(show_stemlets)) __obj.updateDynamic("show_stemlets")(show_stemlets)
    if (stem_direction != null) __obj.updateDynamic("stem_direction")(stem_direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Beammiddleonly]
  }
}

