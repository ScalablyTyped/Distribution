package typings.watsonDeveloperCloud.v3Mod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createModel` operation. */
@js.native
trait CreateModelParams extends js.Object {
  /** The model ID of the model to use as the base for customization. To see available models, use the `List models` method. Usually all IBM provided models are customizable. In addition, all your models that have been created via parallel corpus customization, can be further customized with a forced glossary. */
  var base_model_id: String = js.native
  /** A TMX file with your customizations. The customizations in the file completely overwrite the domain translaton data, including high frequency or high confidence phrase translations. You can upload only one glossary with a file size less than 10 MB per call. A forced glossary should contain single words or short phrases. */
  var forced_glossary: js.UndefOr[ReadableStream | FileObject | Buffer] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** An optional model name that you can use to identify the model. Valid characters are letters, numbers, dashes, underscores, spaces and apostrophes. The maximum length is 32 characters. */
  var name: js.UndefOr[String] = js.native
  /** A TMX file with parallel sentences for source and target language. You can upload multiple parallel_corpus files in one request. All uploaded parallel_corpus files combined, your parallel corpus must contain at least 5,000 parallel sentences to train successfully. */
  var parallel_corpus: js.UndefOr[ReadableStream | FileObject | Buffer] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object CreateModelParams {
  @scala.inline
  def apply(base_model_id: String): CreateModelParams = {
    val __obj = js.Dynamic.literal(base_model_id = base_model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelParams]
  }
  @scala.inline
  implicit class CreateModelParamsOps[Self <: CreateModelParams] (val x: Self) extends AnyVal {
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
    def setBase_model_id(value: String): Self = this.set("base_model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setForced_glossary(value: ReadableStream | FileObject | Buffer): Self = this.set("forced_glossary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForced_glossary: Self = this.set("forced_glossary", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParallel_corpus(value: ReadableStream | FileObject | Buffer): Self = this.set("parallel_corpus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallel_corpus: Self = this.set("parallel_corpus", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

