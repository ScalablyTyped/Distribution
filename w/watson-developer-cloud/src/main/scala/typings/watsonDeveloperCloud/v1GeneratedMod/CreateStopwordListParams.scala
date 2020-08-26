package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createStopwordList` operation. */
@js.native
trait CreateStopwordListParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String = js.native
  /** The ID of the environment. */
  var environment_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The content of the stopword list to ingest. */
  var stopword_file: ReadableStream | FileObject | Buffer = js.native
  /** The filename for stopword_file. */
  var stopword_filename: String = js.native
}

object CreateStopwordListParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    stopword_file: ReadableStream | FileObject | Buffer,
    stopword_filename: String
  ): CreateStopwordListParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], stopword_file = stopword_file.asInstanceOf[js.Any], stopword_filename = stopword_filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStopwordListParams]
  }
  @scala.inline
  implicit class CreateStopwordListParamsOps[Self <: CreateStopwordListParams] (val x: Self) extends AnyVal {
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
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopword_file(value: ReadableStream | FileObject | Buffer): Self = this.set("stopword_file", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopword_filename(value: String): Self = this.set("stopword_filename", value.asInstanceOf[js.Any])
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

