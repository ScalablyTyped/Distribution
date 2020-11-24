package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `addCorpus` operation. */
@js.native
trait AddCorpusParams extends js.Object {
  
  /** If `true`, the specified corpus overwrites an existing corpus with the same name. If `false`, the request fails if a corpus with the same name already exists. The parameter has no effect if a corpus with the same name does not already exist. */
  var allow_overwrite: js.UndefOr[Boolean] = js.native
  
  /** A plain text file that contains the training data for the corpus. Encode the file in UTF-8 if it contains non-ASCII characters; the service assumes UTF-8 encoding if it encounters non-ASCII characters. Make sure that you know the character encoding of the file. You must use that encoding when working with the words in the custom language model. For more information, see [Character encoding](https://cloud.ibm.com/docs/services/speech-to-text/language-resource.html#charEncoding). With the `curl` command, use the `--data-binary` option to upload the file for the request. */
  var corpus_file: ReadableStream | FileObject | Buffer = js.native
  
  /** The name of the new corpus for the custom language model. Use a localized name that matches the language of the custom model and reflects the contents of the corpus. * Include a maximum of 128 characters in the name. * Do not include spaces, slashes, or backslashes in the name. * Do not use the name of an existing corpus or grammar that is already defined for the custom model. * Do not use the name `user`, which is reserved by the service to denote custom words that are added or modified by the user. */
  var corpus_name: String = js.native
  
  /** The customization ID (GUID) of the custom language model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object AddCorpusParams {
  
  @scala.inline
  def apply(corpus_file: ReadableStream | FileObject | Buffer, corpus_name: String, customization_id: String): AddCorpusParams = {
    val __obj = js.Dynamic.literal(corpus_file = corpus_file.asInstanceOf[js.Any], corpus_name = corpus_name.asInstanceOf[js.Any], customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCorpusParams]
  }
  
  @scala.inline
  implicit class AddCorpusParamsOps[Self <: AddCorpusParams] (val x: Self) extends AnyVal {
    
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
    def setCorpus_file(value: ReadableStream | FileObject | Buffer): Self = this.set("corpus_file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorpus_name(value: String): Self = this.set("corpus_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomization_id(value: String): Self = this.set("customization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_overwrite(value: Boolean): Self = this.set("allow_overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_overwrite: Self = this.set("allow_overwrite", js.undefined)
    
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
