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

object flexApiMod {
  
  @JSImport("twilio/lib/rest/FlexApi", JSImport.Namespace)
  @js.native
  open class ^ protected () extends FlexApi {
    /**
      * Initialize flex_api domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait FlexApi
    extends typings.twilio.domainMod.^ {
    
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
    
    val v1: typings.twilio.flexApiV1Mod.^ = js.native
    
    /**
      * @param sid - sid of instance
      */
    def webChannel(sid: String): WebChannelContext = js.native
    @JSName("webChannel")
    val webChannel_Original: WebChannelListInstance = js.native
  }
}
