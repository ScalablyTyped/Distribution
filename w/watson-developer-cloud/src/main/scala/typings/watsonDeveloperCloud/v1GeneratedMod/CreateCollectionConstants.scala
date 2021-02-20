package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def apply(value: String): js.UndefOr[Language with String] = js.native
    
    @js.native
    sealed trait AR extends Language
    /* "ar" */ val AR: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.AR with String = js.native
    
    @js.native
    sealed trait DE extends Language
    /* "de" */ val DE: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.DE with String = js.native
    
    @js.native
    sealed trait EN extends Language
    /* "en" */ val EN: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.EN with String = js.native
    
    @js.native
    sealed trait ES extends Language
    /* "es" */ val ES: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.ES with String = js.native
    
    @js.native
    sealed trait FR extends Language
    /* "fr" */ val FR: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.FR with String = js.native
    
    @js.native
    sealed trait IT extends Language
    /* "it" */ val IT: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.IT with String = js.native
    
    @js.native
    sealed trait JA extends Language
    /* "ja" */ val JA: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.JA with String = js.native
    
    @js.native
    sealed trait KO extends Language
    /* "ko" */ val KO: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.KO with String = js.native
    
    @js.native
    sealed trait NL extends Language
    /* "nl" */ val NL: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.NL with String = js.native
    
    @js.native
    sealed trait PT extends Language
    /* "pt" */ val PT: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.PT with String = js.native
    
    @js.native
    sealed trait ZH_CN extends Language
    /* "zh-CN" */ val ZH_CN: typings.watsonDeveloperCloud.v1GeneratedMod.CreateCollectionConstants.Language.ZH_CN with String = js.native
  }
}
