package typings.twilio

import typings.twilio.libRestMessagingBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMessagingV1Mod {
  
  @JSImport("twilio/lib/rest/messaging/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Messaging
      *
      * @param domain - The Twilio (Twilio.Messaging) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** brandRegistrations - { Twilio.Messaging.V1.BrandRegistrationListInstance } resource */
    /* protected */ var _brandRegistrations: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BrandRegistrationListInstance */ Any
      ] = js.native
    
    /** deactivations - { Twilio.Messaging.V1.DeactivationsListInstance } resource */
    /* protected */ var _deactivations: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeactivationsListInstance */ Any
      ] = js.native
    
    /** domainCerts - { Twilio.Messaging.V1.DomainCertsListInstance } resource */
    /* protected */ var _domainCerts: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainCertsListInstance */ Any
      ] = js.native
    
    /** domainConfig - { Twilio.Messaging.V1.DomainConfigListInstance } resource */
    /* protected */ var _domainConfig: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainConfigListInstance */ Any
      ] = js.native
    
    /** domainConfigMessagingService - { Twilio.Messaging.V1.DomainConfigMessagingServiceListInstance } resource */
    /* protected */ var _domainConfigMessagingService: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainConfigMessagingServiceListInstance */ Any
      ] = js.native
    
    /** externalCampaign - { Twilio.Messaging.V1.ExternalCampaignListInstance } resource */
    /* protected */ var _externalCampaign: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExternalCampaignListInstance */ Any
      ] = js.native
    
    /** linkshorteningMessagingService - { Twilio.Messaging.V1.LinkshorteningMessagingServiceListInstance } resource */
    /* protected */ var _linkshorteningMessagingService: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LinkshorteningMessagingServiceListInstance */ Any
      ] = js.native
    
    /** services - { Twilio.Messaging.V1.ServiceListInstance } resource */
    /* protected */ var _services: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any
      ] = js.native
    
    /** usecases - { Twilio.Messaging.V1.UsecaseListInstance } resource */
    /* protected */ var _usecases: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsecaseListInstance */ Any
      ] = js.native
    
    /** Getter for brandRegistrations resource */
    def brandRegistrations: Any = js.native
    
    /** Getter for deactivations resource */
    def deactivations: Any = js.native
    
    /** Getter for domainCerts resource */
    def domainCerts: Any = js.native
    
    /** Getter for domainConfig resource */
    def domainConfig: Any = js.native
    
    /** Getter for domainConfigMessagingService resource */
    def domainConfigMessagingService: Any = js.native
    
    /** Getter for externalCampaign resource */
    def externalCampaign: Any = js.native
    
    /** Getter for linkshorteningMessagingService resource */
    def linkshorteningMessagingService: Any = js.native
    
    /** Getter for services resource */
    def services: Any = js.native
    
    /** Getter for usecases resource */
    def usecases: Any = js.native
  }
}
