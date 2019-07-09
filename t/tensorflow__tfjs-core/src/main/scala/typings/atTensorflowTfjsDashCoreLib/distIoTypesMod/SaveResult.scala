package typings
package atTensorflowTfjsDashCoreLib.distIoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveResult extends js.Object {
  /**
    * Error messages and related data (if any).
    */
  var errors: js.UndefOr[js.Array[js.Object | java.lang.String]] = js.undefined
  /**
    * Information about the model artifacts saved.
    */
  var modelArtifactsInfo: ModelArtifactsInfo
  /**
    * HTTP responses from the server that handled the model-saving request (if
    * any). This is applicable only to server-based saving routes.
    */
  var responses: js.UndefOr[js.Array[stdLib.Response]] = js.undefined
}

object SaveResult {
  @scala.inline
  def apply(
    modelArtifactsInfo: ModelArtifactsInfo,
    errors: js.Array[js.Object | java.lang.String] = null,
    responses: js.Array[stdLib.Response] = null
  ): SaveResult = {
    val __obj = js.Dynamic.literal(modelArtifactsInfo = modelArtifactsInfo)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (responses != null) __obj.updateDynamic("responses")(responses)
    __obj.asInstanceOf[SaveResult]
  }
}

