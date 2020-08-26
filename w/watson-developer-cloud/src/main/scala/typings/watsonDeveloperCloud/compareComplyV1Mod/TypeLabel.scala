package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identification of a specific type. */
@js.native
trait TypeLabel extends js.Object {
  /** A pair of `nature` and `party` objects. The `nature` object identifies the effect of the element on the identified `party`, and the `party` object identifies the affected party. */
  var label: js.UndefOr[Label] = js.native
  /** One or more hash values that you can send to IBM to provide feedback or receive support. */
  var provenance_ids: js.UndefOr[js.Array[String]] = js.native
}

object TypeLabel {
  @scala.inline
  def apply(): TypeLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeLabel]
  }
  @scala.inline
  implicit class TypeLabelOps[Self <: TypeLabel] (val x: Self) extends AnyVal {
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
    def setLabel(value: Label): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setProvenance_idsVarargs(value: String*): Self = this.set("provenance_ids", js.Array(value :_*))
    @scala.inline
    def setProvenance_ids(value: js.Array[String]): Self = this.set("provenance_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvenance_ids: Self = this.set("provenance_ids", js.undefined)
  }
  
}

