package typings.watsonDeveloperCloud.v3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response payload for models. */
@js.native
trait TranslationModel extends StObject {
  
  /** Model ID of the base model that was used to customize the model. If the model is not a custom model, this will be an empty string. */
  var base_model_id: js.UndefOr[String] = js.native
  
  /** Whether this model can be used as a base for customization. Customized models are not further customizable, and some base models are not customizable. */
  var customizable: js.UndefOr[Boolean] = js.native
  
  /** Whether or not the model is a default model. A default model is the model for a given language pair that will be used when that language pair is specified in the source and target parameters. */
  var default_model: js.UndefOr[Boolean] = js.native
  
  /** The domain of the translation model. */
  var domain: js.UndefOr[String] = js.native
  
  /** A globally unique string that identifies the underlying model that is used for translation. */
  var model_id: String = js.native
  
  /** Optional name that can be specified when the model is created. */
  var name: js.UndefOr[String] = js.native
  
  /** Either an empty string, indicating the model is not a custom model, or the ID of the service instance that created the model. */
  var owner: js.UndefOr[String] = js.native
  
  /** Translation source language code. */
  var source: js.UndefOr[String] = js.native
  
  /** Availability of a model. */
  var status: js.UndefOr[String] = js.native
  
  /** Translation target language code. */
  var target: js.UndefOr[String] = js.native
}
object TranslationModel {
  
  @scala.inline
  def apply(model_id: String): TranslationModel = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationModel]
  }
  
  @scala.inline
  implicit class TranslationModelMutableBuilder[Self <: TranslationModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase_model_id(value: String): Self = StObject.set(x, "base_model_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_model_idUndefined: Self = StObject.set(x, "base_model_id", js.undefined)
    
    @scala.inline
    def setCustomizable(value: Boolean): Self = StObject.set(x, "customizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizableUndefined: Self = StObject.set(x, "customizable", js.undefined)
    
    @scala.inline
    def setDefault_model(value: Boolean): Self = StObject.set(x, "default_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_modelUndefined: Self = StObject.set(x, "default_model", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
