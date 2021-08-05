package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddGrammarConstants.ContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `addGrammar` operation. */
trait AddGrammarParams extends StObject {
  
  /** If `true`, the specified grammar overwrites an existing grammar with the same name. If `false`, the request fails if a grammar with the same name already exists. The parameter has no effect if a grammar with the same name does not already exist. */
  var allow_overwrite: js.UndefOr[Boolean] = js.undefined
  
  /** The format (MIME type) of the grammar file: * `application/srgs` for Augmented Backus-Naur Form (ABNF), which uses a plain-text representation that is similar to traditional BNF grammars. * `application/srgs+xml` for XML Form, which uses XML elements to represent the grammar. */
  var content_type: ContentType | String
  
  /** The customization ID (GUID) of the custom language model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  
  /** A plain text file that contains the grammar in the format specified by the `Content-Type` header. Encode the file in UTF-8 (ASCII is a subset of UTF-8). Using any other encoding can lead to issues when compiling the grammar or to unexpected results in decoding. The service ignores an encoding that is specified in the header of the grammar. */
  var grammar_file: String
  
  /** The name of the new grammar for the custom language model. Use a localized name that matches the language of the custom model and reflects the contents of the grammar. * Include a maximum of 128 characters in the name. * Do not include spaces, slashes, or backslashes in the name. * Do not use the name of an existing grammar or corpus that is already defined for the custom model. * Do not use the name `user`, which is reserved by the service to denote custom words that are added or modified by the user. */
  var grammar_name: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object AddGrammarParams {
  
  inline def apply(
    content_type: ContentType | String,
    customization_id: String,
    grammar_file: String,
    grammar_name: String
  ): AddGrammarParams = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], customization_id = customization_id.asInstanceOf[js.Any], grammar_file = grammar_file.asInstanceOf[js.Any], grammar_name = grammar_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddGrammarParams]
  }
  
  extension [Self <: AddGrammarParams](x: Self) {
    
    inline def setAllow_overwrite(value: Boolean): Self = StObject.set(x, "allow_overwrite", value.asInstanceOf[js.Any])
    
    inline def setAllow_overwriteUndefined: Self = StObject.set(x, "allow_overwrite", js.undefined)
    
    inline def setContent_type(value: ContentType | String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setGrammar_file(value: String): Self = StObject.set(x, "grammar_file", value.asInstanceOf[js.Any])
    
    inline def setGrammar_name(value: String): Self = StObject.set(x, "grammar_name", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
