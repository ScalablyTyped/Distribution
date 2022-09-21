package typings.twilio

import typings.twilio.archivedCallMod.ArchivedCallContext
import typings.twilio.archivedCallMod.ArchivedCallListInstance
import typings.twilio.byocTrunkMod.ByocTrunkContext
import typings.twilio.byocTrunkMod.ByocTrunkListInstance
import typings.twilio.connectionPolicyMod.ConnectionPolicyContext
import typings.twilio.connectionPolicyMod.ConnectionPolicyListInstance
import typings.twilio.dialingPermissionsMod.DialingPermissionsListInstance
import typings.twilio.ipRecordMod.IpRecordContext
import typings.twilio.ipRecordMod.IpRecordListInstance
import typings.twilio.sourceIpMappingMod.SourceIpMappingContext
import typings.twilio.sourceIpMappingMod.SourceIpMappingListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restVoiceMod {
  
  @JSImport("twilio/lib/rest/Voice", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Voice {
    /**
      * Initialize voice domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Voice
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def archivedCalls(sid: String): ArchivedCallContext = js.native
    @JSName("archivedCalls")
    val archivedCalls_Original: ArchivedCallListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def byocTrunks(sid: String): ByocTrunkContext = js.native
    @JSName("byocTrunks")
    val byocTrunks_Original: ByocTrunkListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def connectionPolicies(sid: String): ConnectionPolicyContext = js.native
    @JSName("connectionPolicies")
    val connectionPolicies_Original: ConnectionPolicyListInstance = js.native
    
    val dialingPermissions: DialingPermissionsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def ipRecords(sid: String): IpRecordContext = js.native
    @JSName("ipRecords")
    val ipRecords_Original: IpRecordListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def sourceIpMappings(sid: String): SourceIpMappingContext = js.native
    @JSName("sourceIpMappings")
    val sourceIpMappings_Original: SourceIpMappingListInstance = js.native
    
    val v1: typings.twilio.voiceV1Mod.^ = js.native
  }
}
