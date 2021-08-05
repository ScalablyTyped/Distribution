package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `addCorpus` operation. */
trait AddCorpusParams extends StObject {
  
  /** If `true`, the specified corpus overwrites an existing corpus with the same name. If `false`, the request fails if a corpus with the same name already exists. The parameter has no effect if a corpus with the same name does not already exist. */
  var allow_overwrite: js.UndefOr[Boolean] = js.undefined
  
  /** A plain text file that contains the training data for the corpus. Encode the file in UTF-8 if it contains non-ASCII characters; the service assumes UTF-8 encoding if it encounters non-ASCII characters. Make sure that you know the character encoding of the file. You must use that encoding when working with the words in the custom language model. For more information, see [Character encoding](https://cloud.ibm.com/docs/services/speech-to-text/language-resource.html#charEncoding). With the `curl` command, use the `--data-binary` option to upload the file for the request. */
  var corpus_file: ReadableStream | FileObject | Buffer
  
  /** The name of the new corpus for the custom language model. Use a localized name that matches the language of the custom model and reflects the contents of the corpus. * Include a maximum of 128 characters in the name. * Do not include spaces, slashes, or backslashes in the name. * Do not use the name of an existing corpus or grammar that is already defined for the custom model. * Do not use the name `user`, which is reserved by the service to denote custom words that are added or modified by the user. */
  var corpus_name: String
  
  /** The customization ID (GUID) of the custom language model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object AddCorpusParams {
  
  inline def apply(corpus_file: ReadableStream | FileObject | Buffer, corpus_name: String, customization_id: String): AddCorpusParams = {
    val __obj = js.Dynamic.literal(corpus_file = corpus_file.asInstanceOf[js.Any], corpus_name = corpus_name.asInstanceOf[js.Any], customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCorpusParams]
  }
  
  extension [Self <: AddCorpusParams](x: Self) {
    
    inline def setAllow_overwrite(value: Boolean): Self = StObject.set(x, "allow_overwrite", value.asInstanceOf[js.Any])
    
    inline def setAllow_overwriteUndefined: Self = StObject.set(x, "allow_overwrite", js.undefined)
    
    inline def setCorpus_file(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "corpus_file", value.asInstanceOf[js.Any])
    
    inline def setCorpus_name(value: String): Self = StObject.set(x, "corpus_name", value.asInstanceOf[js.Any])
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
