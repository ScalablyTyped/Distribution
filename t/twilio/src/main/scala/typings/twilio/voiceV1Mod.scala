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

object voiceV1Mod {
  
  @JSImport("twilio/lib/rest/voice/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Voice
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.restVoiceMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
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
  }
}
