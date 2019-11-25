package typings.atTensorflowTfjsDashCore.distIoTypesMod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveResult extends js.Object {
  /**
    * Error messages and related data (if any).
    */
  var errors: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  /**
    * Information about the model artifacts saved.
    */
  var modelArtifactsInfo: ModelArtifactsInfo
  /**
    * HTTP responses from the server that handled the model-saving request (if
    * any). This is applicable only to server-based saving routes.
    */
  var responses: js.UndefOr[js.Array[Response]] = js.undefined
}

object SaveResult {
  @scala.inline
  def apply(
    modelArtifactsInfo: ModelArtifactsInfo,
    errors: js.Array[js.Object | String] = null,
    responses: js.Array[Response] = null
  ): SaveResult = {
    val __obj = js.Dynamic.literal(modelArtifactsInfo = modelArtifactsInfo.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResult]
  }
}

