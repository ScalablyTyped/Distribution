package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddGrammarConstants.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `addGrammar` operation. */
@js.native
trait AddGrammarParams extends js.Object {
  
  /** If `true`, the specified grammar overwrites an existing grammar with the same name. If `false`, the request fails if a grammar with the same name already exists. The parameter has no effect if a grammar with the same name does not already exist. */
  var allow_overwrite: js.UndefOr[Boolean] = js.native
  
  /** The format (MIME type) of the grammar file: * `application/srgs` for Augmented Backus-Naur Form (ABNF), which uses a plain-text representation that is similar to traditional BNF grammars. * `application/srgs+xml` for XML Form, which uses XML elements to represent the grammar. */
  var content_type: ContentType | String = js.native
  
  /** The customization ID (GUID) of the custom language model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String = js.native
  
  /** A plain text file that contains the grammar in the format specified by the `Content-Type` header. Encode the file in UTF-8 (ASCII is a subset of UTF-8). Using any other encoding can lead to issues when compiling the grammar or to unexpected results in decoding. The service ignores an encoding that is specified in the header of the grammar. */
  var grammar_file: String = js.native
  
  /** The name of the new grammar for the custom language model. Use a localized name that matches the language of the custom model and reflects the contents of the grammar. * Include a maximum of 128 characters in the name. * Do not include spaces, slashes, or backslashes in the name. * Do not use the name of an existing grammar or corpus that is already defined for the custom model. * Do not use the name `user`, which is reserved by the service to denote custom words that are added or modified by the user. */
  var grammar_name: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object AddGrammarParams {
  
  @scala.inline
  def apply(
    content_type: ContentType | String,
    customization_id: String,
    grammar_file: String,
    grammar_name: String
  ): AddGrammarParams = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], customization_id = customization_id.asInstanceOf[js.Any], grammar_file = grammar_file.asInstanceOf[js.Any], grammar_name = grammar_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddGrammarParams]
  }
  
  @scala.inline
  implicit class AddGrammarParamsOps[Self <: AddGrammarParams] (val x: Self) extends AnyVal {
    
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
    def setContent_type(value: ContentType | String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomization_id(value: String): Self = this.set("customization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrammar_file(value: String): Self = this.set("grammar_file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrammar_name(value: String): Self = this.set("grammar_name", value.asInstanceOf[js.Any])
    
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
