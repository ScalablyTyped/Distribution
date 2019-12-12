package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.AR
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.DE
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.EN
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.ES
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.FR
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.IT
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.JA
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.KO
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.NL
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.PT
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateCollectionConstants.Language.ZH_CN
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Language with String] = js.native
    /* "ar" */ @js.native
    object AR extends TopLevel[AR with String]
    
    /* "de" */ @js.native
    object DE extends TopLevel[DE with String]
    
    /* "en" */ @js.native
    object EN extends TopLevel[EN with String]
    
    /* "es" */ @js.native
    object ES extends TopLevel[ES with String]
    
    /* "fr" */ @js.native
    object FR extends TopLevel[FR with String]
    
    /* "it" */ @js.native
    object IT extends TopLevel[IT with String]
    
    /* "ja" */ @js.native
    object JA extends TopLevel[JA with String]
    
    /* "ko" */ @js.native
    object KO extends TopLevel[KO with String]
    
    /* "nl" */ @js.native
    object NL extends TopLevel[NL with String]
    
    /* "pt" */ @js.native
    object PT extends TopLevel[PT with String]
    
    /* "zh-CN" */ @js.native
    object ZH_CN extends TopLevel[ZH_CN with String]
    
  }
  
}

