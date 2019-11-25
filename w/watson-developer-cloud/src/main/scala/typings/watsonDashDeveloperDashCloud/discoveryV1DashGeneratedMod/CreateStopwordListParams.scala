package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.ibmDashCloudDashSdkDashCore.libHelperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createStopwordList` operation. */
trait CreateStopwordListParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String
  /** The ID of the environment. */
  var environment_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The content of the stopword list to ingest. */
  var stopword_file: ReadableStream | FileObject | Buffer
  /** The filename for stopword_file. */
  var stopword_filename: String
}

object CreateStopwordListParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    stopword_file: ReadableStream | FileObject | Buffer,
    stopword_filename: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateStopwordListParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], stopword_file = stopword_file.asInstanceOf[js.Any], stopword_filename = stopword_filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStopwordListParams]
  }
}

