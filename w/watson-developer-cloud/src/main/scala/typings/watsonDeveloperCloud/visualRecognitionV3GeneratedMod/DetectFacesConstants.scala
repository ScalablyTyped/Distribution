package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `detectFaces` operation. */
object DetectFacesConstants {
  
  @js.native
  sealed trait AcceptLanguage extends StObject
  /** The desired language of parts of the response. See the response for details. */
  @JSImport("watson-developer-cloud/visual-recognition/v3-generated", "DetectFacesConstants.AcceptLanguage")
  @js.native
  object AcceptLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AcceptLanguage with String] = js.native
    
    @js.native
    sealed trait AR extends AcceptLanguage
    /* "ar" */ val AR: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.AR with String = js.native
    
    @js.native
    sealed trait DE extends AcceptLanguage
    /* "de" */ val DE: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.DE with String = js.native
    
    @js.native
    sealed trait EN extends AcceptLanguage
    /* "en" */ val EN: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.EN with String = js.native
    
    @js.native
    sealed trait ES extends AcceptLanguage
    /* "es" */ val ES: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.ES with String = js.native
    
    @js.native
    sealed trait FR extends AcceptLanguage
    /* "fr" */ val FR: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.FR with String = js.native
    
    @js.native
    sealed trait IT extends AcceptLanguage
    /* "it" */ val IT: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.IT with String = js.native
    
    @js.native
    sealed trait JA extends AcceptLanguage
    /* "ja" */ val JA: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.JA with String = js.native
    
    @js.native
    sealed trait KO extends AcceptLanguage
    /* "ko" */ val KO: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.KO with String = js.native
    
    @js.native
    sealed trait PT_BR extends AcceptLanguage
    /* "pt-br" */ val PT_BR: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.PT_BR with String = js.native
    
    @js.native
    sealed trait ZH_CN extends AcceptLanguage
    /* "zh-cn" */ val ZH_CN: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.ZH_CN with String = js.native
    
    @js.native
    sealed trait ZH_TW extends AcceptLanguage
    /* "zh-tw" */ val ZH_TW: typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.ZH_TW with String = js.native
  }
}
