package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createClassifier` operation. */
@js.native
trait CreateClassifierParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.native
  /** Metadata in JSON format. The metadata identifies the language of the data, and an optional name to identify the classifier. Specify the language with the 2-letter primary language code as assigned in ISO standard 639. Supported languages are English (`en`), Arabic (`ar`), French (`fr`), German, (`de`), Italian (`it`), Japanese (`ja`), Korean (`ko`), Brazilian Portuguese (`pt`), and Spanish (`es`). */
  var metadata: ReadableStream | FileObject | Buffer = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Training data in CSV format. Each text value must have at least one class. The data can include up to 3,000 classes and 20,000 records. For details, see [Data preparation](https://cloud.ibm.com/docs/services/natural-language-classifier/using-your-data.html). */
  var training_data: ReadableStream | FileObject | Buffer = js.native
}

object CreateClassifierParams {
  @scala.inline
  def apply(
    metadata: ReadableStream | FileObject | Buffer,
    training_data: ReadableStream | FileObject | Buffer
  ): CreateClassifierParams = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], training_data = training_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClassifierParams]
  }
  @scala.inline
  implicit class CreateClassifierParamsOps[Self <: CreateClassifierParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetadata(value: ReadableStream | FileObject | Buffer): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraining_data(value: ReadableStream | FileObject | Buffer): Self = this.set("training_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

