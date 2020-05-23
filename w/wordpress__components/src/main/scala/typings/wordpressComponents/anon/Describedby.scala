package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Describedby extends js.Object {
  /**
    * If this property is added, it will be added to the modal content
    * div as aria-describedby.
    */
  var describedby: js.UndefOr[String] = js.undefined
  /**
    * If this property is added, it will be added to the modal content
    * div as aria-labelledby. You are encouraged to use this when the
    * modal is visually labelled.
    * @defaultValue "modal-heading"
    */
  var labelledby: js.UndefOr[String] = js.undefined
}

object Describedby {
  @scala.inline
  def apply(describedby: String = null, labelledby: String = null): Describedby = {
    val __obj = js.Dynamic.literal()
    if (describedby != null) __obj.updateDynamic("describedby")(describedby.asInstanceOf[js.Any])
    if (labelledby != null) __obj.updateDynamic("labelledby")(labelledby.asInstanceOf[js.Any])
    __obj.asInstanceOf[Describedby]
  }
}

