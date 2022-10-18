package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createCollection` operation. */
object CreateCollectionConstants {
  
  @js.native
  sealed trait Language extends StObject
  /** The language of the documents stored in the collection, in the form of an ISO 639-1 language code. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "CreateCollectionConstants.Language")
  @js.native
  object Language extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Language & String] = js.native
    
    @js.native
    sealed trait AR
      extends StObject
         with Language
    /* "ar" */ val AR: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCollectionConstants.Language.AR & String = js.native
    
    @js.native
    sealed trait DE
      extends StObject
         with Language
    /* "de" */ val DE: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCollectionConstants.Language.DE & String = js.native
    
    @js.native
    sealed trait EN
      extends StObject
         with Language
    /* "en" */ val EN: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCollectionConstants.Language.EN & String = js.native
    
    @js.native
    sealed trait ES
      extends StObject
         with Language
    /* "es" */ val ES: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCollectionConstants.Language.ES & String = js.native
    
    @js.native
    sealed trait FR
      extends StObject
         with Language
    /* "fr" */ val FR: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCollectionConstants.Language.FR & String = js.native
    
    @js.native
    sealed trait IT
      extends StObject
         with Language
    /* "it" */ val IT: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCollectionConstants.Language.IT & String = js.native
    
    @js.native
    sealed trait JA
      extends StObject
         with Language
    /* "ja" */ val JA: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCollectionConstants.Language.JA & String = js.native
    
    @js.native
    sealed trait KO
      extends StObject
         with Language
    /* "ko" */ val KO: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCollectionConstants.Language.KO & String = js.native
    
    @js.native
    sealed trait NL
      extends StObject
         with Language
    /* "nl" */ val NL: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCollectionConstants.Language.NL & String = js.native
    
    @js.native
    sealed trait PT
      extends StObject
         with Language
    /* "pt" */ val PT: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCollectionConstants.Language.PT & String = js.native
    
    @js.native
    sealed trait ZH_CN
      extends StObject
         with Language
    /* "zh-CN" */ val ZH_CN: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateCollectionConstants.Language.ZH_CN & String = js.native
  }
}
