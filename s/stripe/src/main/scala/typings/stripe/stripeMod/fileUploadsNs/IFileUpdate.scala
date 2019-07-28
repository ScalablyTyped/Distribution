package typings.stripe.stripeMod.fileUploadsNs

import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeStrings.file_upload
import typings.stripe.stripeStrings.jpg
import typings.stripe.stripeStrings.pdf
import typings.stripe.stripeStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUpdate extends IResourceObject {
  var created: Double
  /**
    * Value is "file_upload"
    */
  @JSName("object")
  var object_IFileUpdate: file_upload
  /**
    * The purpose of the uploaded file. Possible values are "business_logo",
    * "dispute_evidence", "identity_document", "incorporation_article",
    * "incorporation_document".
    */
  var purpose: IPurpose
  /**
    * The size in bytes of the file upload object.
    */
  var size: Double
  /**
    * The type of the file returned. Returns one of the following:
    * pdf, jpg, png.
    */
  var `type`: pdf | jpg | png
  /**
    * A read-only URL where the uploaded file can be accessed. Will be nil
    * unless the uploaded file has one of the following purposes:
    *  business_logo, dispute_evidence, incorporation_document.
    * Also nil if retrieved with the publishable API key.
    */
  var url: String
}

object IFileUpdate {
  @scala.inline
  def apply(
    created: Double,
    id: String,
    `object`: file_upload,
    purpose: IPurpose,
    size: Double,
    `type`: pdf | jpg | png,
    url: String
  ): IFileUpdate = {
    val __obj = js.Dynamic.literal(created = created, id = id, purpose = purpose, size = size, url = url)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUpdate]
  }
}

