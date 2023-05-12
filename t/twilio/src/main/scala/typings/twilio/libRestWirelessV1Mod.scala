package typings.twilio

import typings.twilio.libRestWirelessBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestWirelessV1Mod {
  
  @JSImport("twilio/lib/rest/wireless/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Wireless
      *
      * @param domain - The Twilio (Twilio.Wireless) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** commands - { Twilio.Wireless.V1.CommandListInstance } resource */
    /* protected */ var _commands: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CommandListInstance */ Any
      ] = js.native
    
    /** ratePlans - { Twilio.Wireless.V1.RatePlanListInstance } resource */
    /* protected */ var _ratePlans: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RatePlanListInstance */ Any
      ] = js.native
    
    /** sims - { Twilio.Wireless.V1.SimListInstance } resource */
    /* protected */ var _sims: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimListInstance */ Any
      ] = js.native
    
    /** usageRecords - { Twilio.Wireless.V1.UsageRecordListInstance } resource */
    /* protected */ var _usageRecords: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsageRecordListInstance */ Any
      ] = js.native
    
    /** Getter for commands resource */
    def commands: Any = js.native
    
    /** Getter for ratePlans resource */
    def ratePlans: Any = js.native
    
    /** Getter for sims resource */
    def sims: Any = js.native
    
    /** Getter for usageRecords resource */
    def usageRecords: Any = js.native
  }
}
