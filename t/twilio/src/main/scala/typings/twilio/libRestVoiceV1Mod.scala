package typings.twilio

import typings.twilio.libRestVoiceBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVoiceV1Mod {
  
  @JSImport("twilio/lib/rest/voice/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Voice
      *
      * @param domain - The Twilio (Twilio.Voice) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** archivedCalls - { Twilio.Voice.V1.ArchivedCallListInstance } resource */
    /* protected */ var _archivedCalls: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArchivedCallListInstance */ Any
      ] = js.native
    
    /** byocTrunks - { Twilio.Voice.V1.ByocTrunkListInstance } resource */
    /* protected */ var _byocTrunks: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByocTrunkListInstance */ Any
      ] = js.native
    
    /** connectionPolicies - { Twilio.Voice.V1.ConnectionPolicyListInstance } resource */
    /* protected */ var _connectionPolicies: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConnectionPolicyListInstance */ Any
      ] = js.native
    
    /** dialingPermissions - { Twilio.Voice.V1.DialingPermissionsListInstance } resource */
    /* protected */ var _dialingPermissions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DialingPermissionsListInstance */ Any
      ] = js.native
    
    /** ipRecords - { Twilio.Voice.V1.IpRecordListInstance } resource */
    /* protected */ var _ipRecords: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IpRecordListInstance */ Any
      ] = js.native
    
    /** sourceIpMappings - { Twilio.Voice.V1.SourceIpMappingListInstance } resource */
    /* protected */ var _sourceIpMappings: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SourceIpMappingListInstance */ Any
      ] = js.native
    
    /** Getter for archivedCalls resource */
    def archivedCalls: Any = js.native
    
    /** Getter for byocTrunks resource */
    def byocTrunks: Any = js.native
    
    /** Getter for connectionPolicies resource */
    def connectionPolicies: Any = js.native
    
    /** Getter for dialingPermissions resource */
    def dialingPermissions: Any = js.native
    
    /** Getter for ipRecords resource */
    def ipRecords: Any = js.native
    
    /** Getter for sourceIpMappings resource */
    def sourceIpMappings: Any = js.native
  }
}
