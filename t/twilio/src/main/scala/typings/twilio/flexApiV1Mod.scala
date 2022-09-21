package typings.twilio

import typings.twilio.flexFlowMod.FlexFlowContext
import typings.twilio.flexFlowMod.FlexFlowListInstance
import typings.twilio.interactionMod.InteractionContext
import typings.twilio.interactionMod.InteractionListInstance
import typings.twilio.v1ChannelMod.ChannelContext
import typings.twilio.v1ChannelMod.ChannelListInstance
import typings.twilio.v1ConfigurationMod.ConfigurationContext
import typings.twilio.v1ConfigurationMod.ConfigurationListInstance
import typings.twilio.webChannelMod.WebChannelContext
import typings.twilio.webChannelMod.WebChannelListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexApiV1Mod {
  
  @JSImport("twilio/lib/rest/flexApi/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of FlexApi
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.flexApiMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def channel(sid: String): ChannelContext = js.native
    @JSName("channel")
    val channel_Original: ChannelListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def configuration(sid: String): ConfigurationContext = js.native
    @JSName("configuration")
    val configuration_Original: ConfigurationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def flexFlow(sid: String): FlexFlowContext = js.native
    @JSName("flexFlow")
    val flexFlow_Original: FlexFlowListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def interaction(sid: String): InteractionContext = js.native
    @JSName("interaction")
    val interaction_Original: InteractionListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def webChannel(sid: String): WebChannelContext = js.native
    @JSName("webChannel")
    val webChannel_Original: WebChannelListInstance = js.native
  }
}
