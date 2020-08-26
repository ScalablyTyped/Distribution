package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information defining an element's subject matter. */
@js.native
trait Category extends js.Object {
  /** The category of the associated element. */
  var label: js.UndefOr[String] = js.native
  /** One or more hashed values that you can send to IBM to provide feedback or receive support. */
  var provenance_ids: js.UndefOr[js.Array[String]] = js.native
}

object Category {
  @scala.inline
  def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
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

