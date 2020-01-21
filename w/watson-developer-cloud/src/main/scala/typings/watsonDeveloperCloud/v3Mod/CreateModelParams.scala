package typings.watsonDeveloperCloud.v3Mod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createModel` operation. */
trait CreateModelParams extends js.Object {
  /** The model ID of the model to use as the base for customization. To see available models, use the `List models` method. Usually all IBM provided models are customizable. In addition, all your models that have been created via parallel corpus customization, can be further customized with a forced glossary. */
  var base_model_id: String
  /** A TMX file with your customizations. The customizations in the file completely overwrite the domain translaton data, including high frequency or high confidence phrase translations. You can upload only one glossary with a file size less than 10 MB per call. A forced glossary should contain single words or short phrases. */
  var forced_glossary: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** An optional model name that you can use to identify the model. Valid characters are letters, numbers, dashes, underscores, spaces and apostrophes. The maximum length is 32 characters. */
  var name: js.UndefOr[String] = js.undefined
  /** A TMX file with parallel sentences for source and target language. You can upload multiple parallel_corpus files in one request. All uploaded parallel_corpus files combined, your parallel corpus must contain at least 5,000 parallel sentences to train successfully. */
  var parallel_corpus: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object CreateModelParams {
  @scala.inline
  def apply(
    base_model_id: String,
    forced_glossary: ReadableStream | FileObject | Buffer = null,
    headers: js.Object = null,
    name: String = null,
    parallel_corpus: ReadableStream | FileObject | Buffer = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateModelParams = {
    val __obj = js.Dynamic.literal(base_model_id = base_model_id.asInstanceOf[js.Any])
    if (forced_glossary != null) __obj.updateDynamic("forced_glossary")(forced_glossary.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parallel_corpus != null) __obj.updateDynamic("parallel_corpus")(parallel_corpus.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelParams]
  }
}

