package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `getPronunciation` operation. */
object GetPronunciationConstants {
  
  @js.native
  sealed trait Format extends StObject
  /** The phoneme format in which to return the pronunciation. Omit the parameter to obtain the pronunciation in the default format. */
  @JSImport("watson-developer-cloud/text-to-speech/v1-generated", "GetPronunciationConstants.Format")
  @js.native
  object Format extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Format & String] = js.native
    
    @js.native
    sealed trait IBM
      extends StObject
         with Format
    /* "ibm" */ val IBM: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Format.IBM & String = js.native
    
    @js.native
    sealed trait IPA
      extends StObject
         with Format
    /* "ipa" */ val IPA: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Format.IPA & String = js.native
  }
  
  @js.native
  sealed trait Voice extends StObject
  /** A voice that specifies the language in which the pronunciation is to be returned. All voices for the same language (for example, `en-US`) return the same translation. */
  @JSImport("watson-developer-cloud/text-to-speech/v1-generated", "GetPronunciationConstants.Voice")
  @js.native
  object Voice extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice & String
      ] = js.native
    
    @js.native
    sealed trait DE_DE_BIRGITV2VOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "de-DE_BirgitV2Voice" */ val DE_DE_BIRGITV2VOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.DE_DE_BIRGITV2VOICE & String = js.native
    
    @js.native
    sealed trait DE_DE_BIRGITVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "de-DE_BirgitVoice" */ val DE_DE_BIRGITVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.DE_DE_BIRGITVOICE & String = js.native
    
    @js.native
    sealed trait DE_DE_DIETERV2VOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "de-DE_DieterV2Voice" */ val DE_DE_DIETERV2VOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.DE_DE_DIETERV2VOICE & String = js.native
    
    @js.native
    sealed trait DE_DE_DIETERVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "de-DE_DieterVoice" */ val DE_DE_DIETERVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.DE_DE_DIETERVOICE & String = js.native
    
    @js.native
    sealed trait EN_GB_KATEVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-GB_KateVoice" */ val EN_GB_KATEVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_GB_KATEVOICE & String = js.native
    
    @js.native
    sealed trait EN_US_ALLISONV2VOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_AllisonV2Voice" */ val EN_US_ALLISONV2VOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_ALLISONV2VOICE & String = js.native
    
    @js.native
    sealed trait EN_US_ALLISONVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_AllisonVoice" */ val EN_US_ALLISONVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_ALLISONVOICE & String = js.native
    
    @js.native
    sealed trait EN_US_LISAV2VOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_LisaV2Voice" */ val EN_US_LISAV2VOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_LISAV2VOICE & String = js.native
    
    @js.native
    sealed trait EN_US_LISAVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_LisaVoice" */ val EN_US_LISAVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_LISAVOICE & String = js.native
    
    @js.native
    sealed trait EN_US_MICHAELV2VOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_MichaelV2Voice" */ val EN_US_MICHAELV2VOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_MICHAELV2VOICE & String = js.native
    
    @js.native
    sealed trait EN_US_MICHAELVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "en-US_MichaelVoice" */ val EN_US_MICHAELVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.EN_US_MICHAELVOICE & String = js.native
    
    @js.native
    sealed trait ES_ES_ENRIQUEVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "es-ES_EnriqueVoice" */ val ES_ES_ENRIQUEVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.ES_ES_ENRIQUEVOICE & String = js.native
    
    @js.native
    sealed trait ES_ES_LAURAVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "es-ES_LauraVoice" */ val ES_ES_LAURAVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.ES_ES_LAURAVOICE & String = js.native
    
    @js.native
    sealed trait ES_LA_SOFIAVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "es-LA_SofiaVoice" */ val ES_LA_SOFIAVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.ES_LA_SOFIAVOICE & String = js.native
    
    @js.native
    sealed trait ES_US_SOFIAVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "es-US_SofiaVoice" */ val ES_US_SOFIAVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.ES_US_SOFIAVOICE & String = js.native
    
    @js.native
    sealed trait FR_FR_RENEEVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "fr-FR_ReneeVoice" */ val FR_FR_RENEEVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.FR_FR_RENEEVOICE & String = js.native
    
    @js.native
    sealed trait IT_IT_FRANCESCAV2VOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "it-IT_FrancescaV2Voice" */ val IT_IT_FRANCESCAV2VOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.IT_IT_FRANCESCAV2VOICE & String = js.native
    
    @js.native
    sealed trait IT_IT_FRANCESCAVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "it-IT_FrancescaVoice" */ val IT_IT_FRANCESCAVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.IT_IT_FRANCESCAVOICE & String = js.native
    
    @js.native
    sealed trait JA_JP_EMIVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "ja-JP_EmiVoice" */ val JA_JP_EMIVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.JA_JP_EMIVOICE & String = js.native
    
    @js.native
    sealed trait PT_BR_ISABELAVOICE
      extends StObject
         with typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice
    /* "pt-BR_IsabelaVoice" */ val PT_BR_ISABELAVOICE: typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants.Voice.PT_BR_ISABELAVOICE & String = js.native
  }
}
