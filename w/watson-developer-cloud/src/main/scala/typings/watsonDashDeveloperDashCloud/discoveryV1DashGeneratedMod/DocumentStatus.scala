package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Status information about a submitted document. */
trait DocumentStatus extends js.Object {
  /** The unique identifier for the configuration. */
  var configuration_id: js.UndefOr[String] = js.undefined
  /** The unique identifier of the document. */
  var document_id: String
  /** The type of the original source file. */
  var file_type: js.UndefOr[String] = js.undefined
  /** Name of the original source file (if available). */
  var filename: js.UndefOr[String] = js.undefined
  /** Array of notices produced by the document-ingestion process. */
  var notices: js.Array[Notice]
  /** The SHA-1 hash of the original source file (formatted as a hexadecimal string). */
  var sha1: js.UndefOr[String] = js.undefined
  /** Status of the document in the ingestion process. */
  var status: String
  /** Description of the document status. */
  var status_description: String
}

object DocumentStatus {
  @scala.inline
  def apply(
    document_id: String,
    notices: js.Array[Notice],
    status: String,
    status_description: String,
    configuration_id: String = null,
    file_type: String = null,
    filename: String = null,
    sha1: String = null
  ): DocumentStatus = {
    val __obj = js.Dynamic.literal(document_id = document_id, notices = notices, status = status, status_description = status_description)
    if (configuration_id != null) __obj.updateDynamic("configuration_id")(configuration_id)
    if (file_type != null) __obj.updateDynamic("file_type")(file_type)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (sha1 != null) __obj.updateDynamic("sha1")(sha1)
    __obj.asInstanceOf[DocumentStatus]
  }
}

