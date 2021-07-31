package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `classify` operation. */
object ClassifyConstants {
  
  @js.native
  sealed trait AcceptLanguage extends StObject
  /** The desired language of parts of the response. See the response for details. */
  @JSImport("watson-developer-cloud/visual-recognition/v3-generated", "ClassifyConstants.AcceptLanguage")
  @js.native
  object AcceptLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AcceptLanguage & String] = js.native
    
    @js.native
    sealed trait AR
      extends StObject
         with AcceptLanguage
    /* "ar" */ val AR: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.AR & String = js.native
    
    @js.native
    sealed trait DE
      extends StObject
         with AcceptLanguage
    /* "de" */ val DE: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.DE & String = js.native
    
    @js.native
    sealed trait EN
      extends StObject
         with AcceptLanguage
    /* "en" */ val EN: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.EN & String = js.native
    
    @js.native
    sealed trait ES
      extends StObject
         with AcceptLanguage
    /* "es" */ val ES: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.ES & String = js.native
    
    @js.native
    sealed trait FR
      extends StObject
         with AcceptLanguage
    /* "fr" */ val FR: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.FR & String = js.native
    
    @js.native
    sealed trait IT
      extends StObject
         with AcceptLanguage
    /* "it" */ val IT: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.IT & String = js.native
    
    @js.native
    sealed trait JA
      extends StObject
         with AcceptLanguage
    /* "ja" */ val JA: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.JA & String = js.native
    
    @js.native
    sealed trait KO
      extends StObject
         with AcceptLanguage
    /* "ko" */ val KO: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.KO & String = js.native
    
    @js.native
    sealed trait PT_BR
      extends StObject
         with AcceptLanguage
    /* "pt-br" */ val PT_BR: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.PT_BR & String = js.native
    
    @js.native
    sealed trait ZH_CN
      extends StObject
         with AcceptLanguage
    /* "zh-cn" */ val ZH_CN: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.ZH_CN & String = js.native
    
    @js.native
    sealed trait ZH_TW
      extends StObject
         with AcceptLanguage
    /* "zh-tw" */ val ZH_TW: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.ZH_TW & String = js.native
  }
}
