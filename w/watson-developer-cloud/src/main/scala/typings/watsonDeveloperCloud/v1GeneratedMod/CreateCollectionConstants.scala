package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createCollection` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "CreateCollectionConstants")
@js.native
object CreateCollectionConstants extends js.Object {
  
  @js.native
  sealed trait Language extends js.Object
  /** The language of the documents stored in the collection, in the form of an ISO 639-1 language code. */
  @js.native
  object Language extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Language with String] = js.native
    
    @js.native
    sealed trait AR extends Language
    /* "ar" */ @js.native
    object AR extends TopLevel[AR with String]
    
    @js.native
    sealed trait DE extends Language
    /* "de" */ @js.native
    object DE extends TopLevel[DE with String]
    
    @js.native
    sealed trait EN extends Language
    /* "en" */ @js.native
    object EN extends TopLevel[EN with String]
    
    @js.native
    sealed trait ES extends Language
    /* "es" */ @js.native
    object ES extends TopLevel[ES with String]
    
    @js.native
    sealed trait FR extends Language
    /* "fr" */ @js.native
    object FR extends TopLevel[FR with String]
    
    @js.native
    sealed trait IT extends Language
    /* "it" */ @js.native
    object IT extends TopLevel[IT with String]
    
    @js.native
    sealed trait JA extends Language
    /* "ja" */ @js.native
    object JA extends TopLevel[JA with String]
    
    @js.native
    sealed trait KO extends Language
    /* "ko" */ @js.native
    object KO extends TopLevel[KO with String]
    
    @js.native
    sealed trait NL extends Language
    /* "nl" */ @js.native
    object NL extends TopLevel[NL with String]
    
    @js.native
    sealed trait PT extends Language
    /* "pt" */ @js.native
    object PT extends TopLevel[PT with String]
    
    @js.native
    sealed trait ZH_CN extends Language
    /* "zh-CN" */ @js.native
    object ZH_CN extends TopLevel[ZH_CN with String]
  }
}
