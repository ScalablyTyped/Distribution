package typings.twilio

import typings.twilio.esimProfileMod.EsimProfileContext
import typings.twilio.esimProfileMod.EsimProfileListInstance
import typings.twilio.ipCommandMod.IpCommandContext
import typings.twilio.ipCommandMod.IpCommandListInstance
import typings.twilio.networkAccessProfileMod.NetworkAccessProfileContext
import typings.twilio.networkAccessProfileMod.NetworkAccessProfileListInstance
import typings.twilio.networkMod.NetworkContext
import typings.twilio.networkMod.NetworkListInstance
import typings.twilio.smsCommandMod.SmsCommandContext
import typings.twilio.smsCommandMod.SmsCommandListInstance
import typings.twilio.usageRecordMod.UsageRecordListInstance
import typings.twilio.v1FleetMod.FleetContext
import typings.twilio.v1FleetMod.FleetListInstance
import typings.twilio.v1SimMod.SimContext
import typings.twilio.v1SimMod.SimListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object supersimV1Mod {
  
  @JSImport("twilio/lib/rest/supersim/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Supersim
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.supersimMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def esimProfiles(sid: String): EsimProfileContext = js.native
    @JSName("esimProfiles")
    val esimProfiles_Original: EsimProfileListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def fleets(sid: String): FleetContext = js.native
    @JSName("fleets")
    val fleets_Original: FleetListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def ipCommands(sid: String): IpCommandContext = js.native
    @JSName("ipCommands")
    val ipCommands_Original: IpCommandListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def networkAccessProfiles(sid: String): NetworkAccessProfileContext = js.native
    @JSName("networkAccessProfiles")
    val networkAccessProfiles_Original: NetworkAccessProfileListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def networks(sid: String): NetworkContext = js.native
    @JSName("networks")
    val networks_Original: NetworkListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def sims(sid: String): SimContext = js.native
    @JSName("sims")
    val sims_Original: SimListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def smsCommands(sid: String): SmsCommandContext = js.native
    @JSName("smsCommands")
    val smsCommands_Original: SmsCommandListInstance = js.native
    
    val usageRecords: UsageRecordListInstance = js.native
  }
}
