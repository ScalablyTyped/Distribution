package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Describedby extends js.Object {
  /**
    * If this property is added, it will be added to the modal content
    * div as aria-describedby.
    */
  var describedby: js.UndefOr[String] = js.native
  /**
    * If this property is added, it will be added to the modal content
    * div as aria-labelledby. You are encouraged to use this when the
    * modal is visually labelled.
    * @defaultValue "modal-heading"
    */
  var labelledby: js.UndefOr[String] = js.native
}

object Describedby {
  @scala.inline
  def apply(): Describedby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Describedby]
  }
  @scala.inline
  implicit class DescribedbyOps[Self <: Describedby] (val x: Self) extends AnyVal {
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
    def setDescribedby(value: String): Self = this.set("describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescribedby: Self = this.set("describedby", js.undefined)
    @scala.inline
    def setLabelledby(value: String): Self = this.set("labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelledby: Self = this.set("labelledby", js.undefined)
  }
  
}

