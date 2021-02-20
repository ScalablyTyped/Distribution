package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createCollection` operation. */
@js.native
trait CreateCollectionParams extends StObject {
  
  /** The ID of the configuration in which the collection is to be created. */
  var configuration_id: js.UndefOr[String] = js.native
  
  /** A description of the collection. */
  var description: js.UndefOr[String] = js.native
  
  /** The ID of the environment. */
  var environment_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The language of the documents stored in the collection, in the form of an ISO 639-1 language code. */
  var language: js.UndefOr[Language | String] = js.native
  
  /** The name of the collection to be created. */
  var name: String = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object CreateCollectionParams {
  
  @scala.inline
  def apply(environment_id: String, name: String): CreateCollectionParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionParams]
  }
  
  @scala.inline
  implicit class CreateCollectionParamsMutableBuilder[Self <: CreateCollectionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration_id(value: String): Self = StObject.set(x, "configuration_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration_idUndefined: Self = StObject.set(x, "configuration_id", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setLanguage(value: Language | String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
