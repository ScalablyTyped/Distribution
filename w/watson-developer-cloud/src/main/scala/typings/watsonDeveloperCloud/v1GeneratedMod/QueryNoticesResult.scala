package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryNoticesResult. */
trait QueryNoticesResult
  extends /** QueryNoticesResult accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** The internal status code returned by the ingestion subsystem indicating the overall result of ingesting the source document. */
  var code: js.UndefOr[Double] = js.undefined
  /** The collection ID of the collection containing the document for this result. */
  var collection_id: js.UndefOr[String] = js.undefined
  /** The type of the original source file. */
  var file_type: js.UndefOr[String] = js.undefined
  /** Name of the original source file (if available). */
  var filename: js.UndefOr[String] = js.undefined
  /** The unique identifier of the document. */
  var id: js.UndefOr[String] = js.undefined
  /** Metadata of the document. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /** Array of notices for the document. */
  var notices: js.UndefOr[js.Array[Notice]] = js.undefined
  /** Metadata of a query result. */
  var result_metadata: js.UndefOr[QueryResultMetadata] = js.undefined
  /** The SHA-1 hash of the original source file (formatted as a hexadecimal string). */
  var sha1: js.UndefOr[String] = js.undefined
  /** Automatically extracted result title. */
  var title: js.UndefOr[String] = js.undefined
}

object QueryNoticesResult {
  @scala.inline
  def apply(
    StringDictionary: /** QueryNoticesResult accepts additional properties. */
  /* propName */ StringDictionary[js.Any] = null,
    code: Int | Double = null,
    collection_id: String = null,
    file_type: String = null,
    filename: String = null,
    id: String = null,
    metadata: js.Object = null,
    notices: js.Array[Notice] = null,
    result_metadata: QueryResultMetadata = null,
    sha1: String = null,
    title: String = null
  ): QueryNoticesResult = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (collection_id != null) __obj.updateDynamic("collection_id")(collection_id.asInstanceOf[js.Any])
    if (file_type != null) __obj.updateDynamic("file_type")(file_type.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (notices != null) __obj.updateDynamic("notices")(notices.asInstanceOf[js.Any])
    if (result_metadata != null) __obj.updateDynamic("result_metadata")(result_metadata.asInstanceOf[js.Any])
    if (sha1 != null) __obj.updateDynamic("sha1")(sha1.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryNoticesResult]
  }
}

