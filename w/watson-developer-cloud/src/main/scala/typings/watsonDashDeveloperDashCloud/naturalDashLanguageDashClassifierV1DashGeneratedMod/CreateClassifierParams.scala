package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashClassifierV1DashGeneratedMod

import typings.ibmDashCloudDashSdkDashCore.libHelperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createClassifier` operation. */
trait CreateClassifierParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Metadata in JSON format. The metadata identifies the language of the data, and an optional name to identify the classifier. Specify the language with the 2-letter primary language code as assigned in ISO standard 639. Supported languages are English (`en`), Arabic (`ar`), French (`fr`), German, (`de`), Italian (`it`), Japanese (`ja`), Korean (`ko`), Brazilian Portuguese (`pt`), and Spanish (`es`). */
  var metadata: ReadableStream | FileObject | Buffer
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Training data in CSV format. Each text value must have at least one class. The data can include up to 3,000 classes and 20,000 records. For details, see [Data preparation](https://cloud.ibm.com/docs/services/natural-language-classifier/using-your-data.html). */
  var training_data: ReadableStream | FileObject | Buffer
}

object CreateClassifierParams {
  @scala.inline
  def apply(
    metadata: ReadableStream | FileObject | Buffer,
    training_data: ReadableStream | FileObject | Buffer,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateClassifierParams = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], training_data = training_data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[CreateClassifierParams]
  }
}

