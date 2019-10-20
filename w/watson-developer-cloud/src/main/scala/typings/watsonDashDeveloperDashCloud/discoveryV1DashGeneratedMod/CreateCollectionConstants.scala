package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `createCollection` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "CreateCollectionConstants")
@js.native
object CreateCollectionConstants extends js.Object {
  @js.native
  sealed trait Language extends js.Object
  
  /** The language of the documents stored in the collection, in the form of an ISO 639-1 language code. */
  @js.native
  object Language extends js.Object {
    @js.native
    sealed trait AR extends Language
    
    @js.native
    sealed trait DE extends Language
    
    @js.native
    sealed trait EN extends Language
    
    @js.native
    sealed trait ES extends Language
    
    @js.native
    sealed trait FR extends Language
    
    @js.native
    sealed trait IT extends Language
    
    @js.native
    sealed trait JA extends Language
    
    @js.native
    sealed trait KO extends Language
    
    @js.native
    sealed trait NL extends Language
    
    @js.native
    sealed trait PT extends Language
    
    @js.native
    sealed trait ZH_CN extends Language
    
    /* "ar" */ val AR: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.AR with String = js.native
    /* "de" */ val DE: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.DE with String = js.native
    /* "en" */ val EN: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.EN with String = js.native
    /* "es" */ val ES: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.ES with String = js.native
    /* "fr" */ val FR: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.FR with String = js.native
    /* "it" */ val IT: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.IT with String = js.native
    /* "ja" */ val JA: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.JA with String = js.native
    /* "ko" */ val KO: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.KO with String = js.native
    /* "nl" */ val NL: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.NL with String = js.native
    /* "pt" */ val PT: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.PT with String = js.native
    /* "zh-CN" */ val ZH_CN: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.ZH_CN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Language with String] = js.native
  }
  
}

