package typings.twilio

import typings.twilio.libRestPreviewTrustedCommsBrandedChannelMod.BrandedChannelContext
import typings.twilio.libRestPreviewTrustedCommsBrandedChannelMod.BrandedChannelListInstance
import typings.twilio.libRestPreviewTrustedCommsBrandsInformationMod.BrandsInformationContext
import typings.twilio.libRestPreviewTrustedCommsBrandsInformationMod.BrandsInformationListInstance
import typings.twilio.libRestPreviewTrustedCommsCpsMod.CpsContext
import typings.twilio.libRestPreviewTrustedCommsCpsMod.CpsListInstance
import typings.twilio.libRestPreviewTrustedCommsCurrentCallMod.CurrentCallContext
import typings.twilio.libRestPreviewTrustedCommsCurrentCallMod.CurrentCallListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewTrustedCommsMod {
  
  @JSImport("twilio/lib/rest/preview/TrustedComms", JSImport.Namespace)
  @js.native
  open class ^ protected () extends TrustedComms {
    /**
      * Initialize the TrustedComms version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestPreviewMod.^) = this()
  }
  
  @js.native
  trait TrustedComms
    extends typings.twilio.libBaseVersionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def brandedChannels(sid: String): BrandedChannelContext = js.native
    @JSName("brandedChannels")
    val brandedChannels_Original: BrandedChannelListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def brandsInformation(sid: String): BrandsInformationContext = js.native
    @JSName("brandsInformation")
    val brandsInformation_Original: BrandsInformationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def cps(sid: String): CpsContext = js.native
    @JSName("cps")
    val cps_Original: CpsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def currentCalls(sid: String): CurrentCallContext = js.native
    @JSName("currentCalls")
    val currentCalls_Original: CurrentCallListInstance = js.native
  }
}
