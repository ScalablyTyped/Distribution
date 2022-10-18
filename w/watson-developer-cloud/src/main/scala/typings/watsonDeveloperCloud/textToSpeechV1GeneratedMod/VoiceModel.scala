package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** VoiceModel. */
trait VoiceModel extends StObject {
  
  /** The date and time in Coordinated Universal Time (UTC) at which the custom voice model was created. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). */
  var created: js.UndefOr[String] = js.undefined
  
  /** The customization ID (GUID) of the custom voice model. The **Create a custom model** method returns only this field. It does not not return the other fields of this object. */
  var customization_id: String
  
  /** The description of the custom voice model. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The language identifier of the custom voice model (for example, `en-US`). */
  var language: js.UndefOr[String] = js.undefined
  
  /** The date and time in Coordinated Universal Time (UTC) at which the custom voice model was last modified. Equals `created` when a new voice model is first added but has yet to be updated. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). */
  var last_modified: js.UndefOr[String] = js.undefined
  
  /** The name of the custom voice model. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The GUID of the service credentials for the instance of the service that owns the custom voice model. */
  var owner: js.UndefOr[String] = js.undefined
  
  /** An array of `Word` objects that lists the words and their translations from the custom voice model. The words are listed in alphabetical order, with uppercase letters listed before lowercase letters. The array is empty if the custom model contains no words. This field is returned only by the **Get a voice** method and only when you specify the customization ID of a custom voice model. */
  var words: js.UndefOr[js.Array[Word]] = js.undefined
}
object VoiceModel {
  
  inline def apply(customization_id: String): VoiceModel = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceModel]
  }
  
  extension [Self <: VoiceModel](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLast_modified(value: String): Self = StObject.set(x, "last_modified", value.asInstanceOf[js.Any])
    
    inline def setLast_modifiedUndefined: Self = StObject.set(x, "last_modified", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
