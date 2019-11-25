package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryResult. */
trait QueryResult
  extends /** QueryResult accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** The collection ID of the collection containing the document for this result. */
  var collection_id: js.UndefOr[String] = js.undefined
  /** The unique identifier of the document. */
  var id: js.UndefOr[String] = js.undefined
  /** Metadata of the document. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /** Metadata of a query result. */
  var result_metadata: js.UndefOr[QueryResultMetadata] = js.undefined
  /** Automatically extracted result title. */
  var title: js.UndefOr[String] = js.undefined
}

object QueryResult {
  @scala.inline
  def apply(
    StringDictionary: /** QueryResult accepts additional properties. */
  /* propName */ StringDictionary[js.Any] = null,
    collection_id: String = null,
    id: String = null,
    metadata: js.Object = null,
    result_metadata: QueryResultMetadata = null,
    title: String = null
  ): QueryResult = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collection_id != null) __obj.updateDynamic("collection_id")(collection_id.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (result_metadata != null) __obj.updateDynamic("result_metadata")(result_metadata.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
}

