package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A pair of `nature` and `party` objects. The `nature` object identifies the effect of the element on the identified `party`, and the `party` object identifies the affected party. */
@js.native
trait Label extends js.Object {
  /** The identified `nature` of the element. */
  var nature: String = js.native
  /** The identified `party` of the element. */
  var party: String = js.native
}

object Label {
  @scala.inline
  def apply(nature: String, party: String): Label = {
    val __obj = js.Dynamic.literal(nature = nature.asInstanceOf[js.Any], party = party.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNature(value: String): Self = this.set("nature", value.asInstanceOf[js.Any])
    @scala.inline
    def setParty(value: String): Self = this.set("party", value.asInstanceOf[js.Any])
  }
  
}

