package typings.twilio

import typings.twilio.libRestMicrovisorBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMicrovisorV1Mod {
  
  @JSImport("twilio/lib/rest/microvisor/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Microvisor
      *
      * @param domain - The Twilio (Twilio.Microvisor) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** accountConfigs - { Twilio.Microvisor.V1.AccountConfigListInstance } resource */
    /* protected */ var _accountConfigs: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AccountConfigListInstance */ Any
      ] = js.native
    
    /** accountSecrets - { Twilio.Microvisor.V1.AccountSecretListInstance } resource */
    /* protected */ var _accountSecrets: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AccountSecretListInstance */ Any
      ] = js.native
    
    /** apps - { Twilio.Microvisor.V1.AppListInstance } resource */
    /* protected */ var _apps: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppListInstance */ Any
      ] = js.native
    
    /** devices - { Twilio.Microvisor.V1.DeviceListInstance } resource */
    /* protected */ var _devices: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceListInstance */ Any
      ] = js.native
    
    /** Getter for accountConfigs resource */
    def accountConfigs: Any = js.native
    
    /** Getter for accountSecrets resource */
    def accountSecrets: Any = js.native
    
    /** Getter for apps resource */
    def apps: Any = js.native
    
    /** Getter for devices resource */
    def devices: Any = js.native
  }
}
