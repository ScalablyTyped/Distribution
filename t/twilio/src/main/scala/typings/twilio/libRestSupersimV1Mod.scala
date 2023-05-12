package typings.twilio

import typings.twilio.libRestSupersimBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestSupersimV1Mod {
  
  @JSImport("twilio/lib/rest/supersim/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Supersim
      *
      * @param domain - The Twilio (Twilio.Supersim) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** esimProfiles - { Twilio.Supersim.V1.EsimProfileListInstance } resource */
    /* protected */ var _esimProfiles: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EsimProfileListInstance */ Any
      ] = js.native
    
    /** fleets - { Twilio.Supersim.V1.FleetListInstance } resource */
    /* protected */ var _fleets: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FleetListInstance */ Any
      ] = js.native
    
    /** ipCommands - { Twilio.Supersim.V1.IpCommandListInstance } resource */
    /* protected */ var _ipCommands: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IpCommandListInstance */ Any
      ] = js.native
    
    /** networkAccessProfiles - { Twilio.Supersim.V1.NetworkAccessProfileListInstance } resource */
    /* protected */ var _networkAccessProfiles: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NetworkAccessProfileListInstance */ Any
      ] = js.native
    
    /** networks - { Twilio.Supersim.V1.NetworkListInstance } resource */
    /* protected */ var _networks: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NetworkListInstance */ Any
      ] = js.native
    
    /** settingsUpdates - { Twilio.Supersim.V1.SettingsUpdateListInstance } resource */
    /* protected */ var _settingsUpdates: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SettingsUpdateListInstance */ Any
      ] = js.native
    
    /** sims - { Twilio.Supersim.V1.SimListInstance } resource */
    /* protected */ var _sims: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimListInstance */ Any
      ] = js.native
    
    /** smsCommands - { Twilio.Supersim.V1.SmsCommandListInstance } resource */
    /* protected */ var _smsCommands: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SmsCommandListInstance */ Any
      ] = js.native
    
    /** usageRecords - { Twilio.Supersim.V1.UsageRecordListInstance } resource */
    /* protected */ var _usageRecords: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsageRecordListInstance */ Any
      ] = js.native
    
    /** Getter for esimProfiles resource */
    def esimProfiles: Any = js.native
    
    /** Getter for fleets resource */
    def fleets: Any = js.native
    
    /** Getter for ipCommands resource */
    def ipCommands: Any = js.native
    
    /** Getter for networkAccessProfiles resource */
    def networkAccessProfiles: Any = js.native
    
    /** Getter for networks resource */
    def networks: Any = js.native
    
    /** Getter for settingsUpdates resource */
    def settingsUpdates: Any = js.native
    
    /** Getter for sims resource */
    def sims: Any = js.native
    
    /** Getter for smsCommands resource */
    def smsCommands: Any = js.native
    
    /** Getter for usageRecords resource */
    def usageRecords: Any = js.native
  }
}
