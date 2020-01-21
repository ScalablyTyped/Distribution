package typings.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonDocumentCreateUpdateOptions extends js.Object {
  /**
    * The back of an ID returned by a file upload with a purpose value of identity_document.
    * The uploaded file needs to be a color image (smaller than 8,000px by 8,000px),
    * in JPG or PNG format, and less than 10 MB in size.
    */
  var back: js.UndefOr[String] = js.undefined
  /**
    * The front of an ID returned by a file upload with a purpose value of identity_document.
    * The uploaded file needs to be a color image (smaller than 8,000px by 8,000px),
    * in JPG or PNG format, and less than 10 MB in size.
    */
  var front: js.UndefOr[String] = js.undefined
}

object IPersonDocumentCreateUpdateOptions {
  @scala.inline
  def apply(back: String = null, front: String = null): IPersonDocumentCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (back != null) __obj.updateDynamic("back")(back.asInstanceOf[js.Any])
    if (front != null) __obj.updateDynamic("front")(front.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonDocumentCreateUpdateOptions]
  }
}

