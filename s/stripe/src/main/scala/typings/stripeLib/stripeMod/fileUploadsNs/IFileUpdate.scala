package typings
package stripeLib.stripeMod.fileUploadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUpdate
  extends stripeLib.stripeMod.IResourceObject {
  var created: scala.Double
  /**
    * Value is "file_upload"
    */
  @JSName("object")
  var object_IFileUpdate: stripeLib.stripeLibStrings.file_upload
  /**
    * The purpose of the uploaded file. Possible values are "business_logo",
    * "dispute_evidence", "identity_document", "incorporation_article",
    * "incorporation_document".
    */
  var purpose: IPurpose
  /**
    * The size in bytes of the file upload object.
    */
  var size: scala.Double
  /**
    * The type of the file returned. Returns one of the following:
    * pdf, jpg, png.
    */
  var `type`: stripeLib.stripeLibStrings.pdf | stripeLib.stripeLibStrings.jpg | stripeLib.stripeLibStrings.png
  /**
    * A read-only URL where the uploaded file can be accessed. Will be nil
    * unless the uploaded file has one of the following purposes:
    *  business_logo, dispute_evidence, incorporation_document.
    * Also nil if retrieved with the publishable API key.
    */
  var url: java.lang.String
}

object IFileUpdate {
  @scala.inline
  def apply(
    created: scala.Double,
    id: java.lang.String,
    `object`: stripeLib.stripeLibStrings.file_upload,
    purpose: IPurpose,
    size: scala.Double,
    `type`: stripeLib.stripeLibStrings.pdf | stripeLib.stripeLibStrings.jpg | stripeLib.stripeLibStrings.png,
    url: java.lang.String
  ): IFileUpdate = {
    val __obj = js.Dynamic.literal(created = created, id = id, purpose = purpose, size = size, url = url)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUpdate]
  }
}

