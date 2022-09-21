package typings.whoisJson

import typings.whoisJson.mod.Whois.Options
import typings.whoisJson.mod.Whois.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Perform a WHOIS lookup.
    *
    * @param domainName - The domain name on which to perform the lookup.
    * @param options - Options to tweak the behavior of a WHOIS lookup.
    */
  inline def apply(domainName: String): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(domainName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  inline def apply(domainName: String, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(domainName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @JSImport("whois-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Whois {
    
    /**
      * A network endpoint.
      */
    trait Endpoint extends StObject {
      
      /** The hostname of the endpoint. */
      var host: String
      
      /** The port number of the endpoint. */
      var port: Double
    }
    object Endpoint {
      
      inline def apply(host: String, port: Double): Endpoint = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[Endpoint]
      }
      
      extension [Self <: Endpoint](x: Self) {
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Options to tweak the behavior of a WHOIS lookup.
      */
    trait Options extends StObject {
      
      /** bind to a local IP address */
      var bind: js.UndefOr[String] = js.undefined
      
      /** number of times to follow redirects */
      var follow: js.UndefOr[Double] = js.undefined
      
      /** SOCKS proxy */
      var proxy: js.UndefOr[String | SocksProxy] = js.undefined
      
      /** WHOIS server */
      var server: js.UndefOr[String | Endpoint] = js.undefined
      
      /** socket timeout in milliseconds */
      var timeout: js.UndefOr[Double] = js.undefined
      
      /** show verbose results */
      var verbose: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setBind(value: String): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
        
        inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
        
        inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
        
        inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
        
        inline def setProxy(value: String | SocksProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
        
        inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
        
        inline def setServer(value: String | Endpoint): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
        
        inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
        
        inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      }
    }
    
    trait RegistrationData extends StObject {
      
      var adminCity: js.UndefOr[String] = js.undefined
      
      var adminCountry: js.UndefOr[String] = js.undefined
      
      var adminEmail: js.UndefOr[String] = js.undefined
      
      var adminName: js.UndefOr[String] = js.undefined
      
      var adminOrganization: js.UndefOr[String] = js.undefined
      
      var adminPhone: js.UndefOr[String] = js.undefined
      
      var adminPostalCode: js.UndefOr[String] = js.undefined
      
      var adminStateProvince: js.UndefOr[String] = js.undefined
      
      var adminStreet: js.UndefOr[String] = js.undefined
      
      var creationDate: js.UndefOr[String] = js.undefined
      
      var dnssec: js.UndefOr[String] = js.undefined
      
      var domainName: js.UndefOr[String] = js.undefined
      
      var domainStatus: js.UndefOr[String] = js.undefined
      
      var lastUpdateOfWhoisDatabase: js.UndefOr[String] = js.undefined
      
      var nameServer: js.UndefOr[String] = js.undefined
      
      var registrantCity: js.UndefOr[String] = js.undefined
      
      var registrantCountry: js.UndefOr[String] = js.undefined
      
      var registrantEmail: js.UndefOr[String] = js.undefined
      
      var registrantName: js.UndefOr[String] = js.undefined
      
      var registrantOrganization: js.UndefOr[String] = js.undefined
      
      var registrantPhone: js.UndefOr[String] = js.undefined
      
      var registrantPostalCode: js.UndefOr[String] = js.undefined
      
      var registrantStateProvince: js.UndefOr[String] = js.undefined
      
      var registrantStreet: js.UndefOr[String] = js.undefined
      
      var registrar: js.UndefOr[String] = js.undefined
      
      var registrarAbuseContactEmail: js.UndefOr[String] = js.undefined
      
      var registrarAbuseContactPhone: js.UndefOr[String] = js.undefined
      
      var registrarIanaId: js.UndefOr[String] = js.undefined
      
      var registrarRegistrationExpirationDate: js.UndefOr[String] = js.undefined
      
      var registrarUrl: js.UndefOr[String] = js.undefined
      
      var registrarWhoisServer: js.UndefOr[String] = js.undefined
      
      var registryDomainId: js.UndefOr[String] = js.undefined
      
      var techCity: js.UndefOr[String] = js.undefined
      
      var techCountry: js.UndefOr[String] = js.undefined
      
      var techEmail: js.UndefOr[String] = js.undefined
      
      var techName: js.UndefOr[String] = js.undefined
      
      var techOrganization: js.UndefOr[String] = js.undefined
      
      var techPhone: js.UndefOr[String] = js.undefined
      
      var techPostalCode: js.UndefOr[String] = js.undefined
      
      var techStateProvince: js.UndefOr[String] = js.undefined
      
      var techStreet: js.UndefOr[String] = js.undefined
      
      var updatedDate: js.UndefOr[String] = js.undefined
      
      var urlOfTheIcannWhoisDataProblemReportingSystem: js.UndefOr[String] = js.undefined
    }
    object RegistrationData {
      
      inline def apply(): RegistrationData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RegistrationData]
      }
      
      extension [Self <: RegistrationData](x: Self) {
        
        inline def setAdminCity(value: String): Self = StObject.set(x, "adminCity", value.asInstanceOf[js.Any])
        
        inline def setAdminCityUndefined: Self = StObject.set(x, "adminCity", js.undefined)
        
        inline def setAdminCountry(value: String): Self = StObject.set(x, "adminCountry", value.asInstanceOf[js.Any])
        
        inline def setAdminCountryUndefined: Self = StObject.set(x, "adminCountry", js.undefined)
        
        inline def setAdminEmail(value: String): Self = StObject.set(x, "adminEmail", value.asInstanceOf[js.Any])
        
        inline def setAdminEmailUndefined: Self = StObject.set(x, "adminEmail", js.undefined)
        
        inline def setAdminName(value: String): Self = StObject.set(x, "adminName", value.asInstanceOf[js.Any])
        
        inline def setAdminNameUndefined: Self = StObject.set(x, "adminName", js.undefined)
        
        inline def setAdminOrganization(value: String): Self = StObject.set(x, "adminOrganization", value.asInstanceOf[js.Any])
        
        inline def setAdminOrganizationUndefined: Self = StObject.set(x, "adminOrganization", js.undefined)
        
        inline def setAdminPhone(value: String): Self = StObject.set(x, "adminPhone", value.asInstanceOf[js.Any])
        
        inline def setAdminPhoneUndefined: Self = StObject.set(x, "adminPhone", js.undefined)
        
        inline def setAdminPostalCode(value: String): Self = StObject.set(x, "adminPostalCode", value.asInstanceOf[js.Any])
        
        inline def setAdminPostalCodeUndefined: Self = StObject.set(x, "adminPostalCode", js.undefined)
        
        inline def setAdminStateProvince(value: String): Self = StObject.set(x, "adminStateProvince", value.asInstanceOf[js.Any])
        
        inline def setAdminStateProvinceUndefined: Self = StObject.set(x, "adminStateProvince", js.undefined)
        
        inline def setAdminStreet(value: String): Self = StObject.set(x, "adminStreet", value.asInstanceOf[js.Any])
        
        inline def setAdminStreetUndefined: Self = StObject.set(x, "adminStreet", js.undefined)
        
        inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
        
        inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
        
        inline def setDnssec(value: String): Self = StObject.set(x, "dnssec", value.asInstanceOf[js.Any])
        
        inline def setDnssecUndefined: Self = StObject.set(x, "dnssec", js.undefined)
        
        inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
        
        inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
        
        inline def setDomainStatus(value: String): Self = StObject.set(x, "domainStatus", value.asInstanceOf[js.Any])
        
        inline def setDomainStatusUndefined: Self = StObject.set(x, "domainStatus", js.undefined)
        
        inline def setLastUpdateOfWhoisDatabase(value: String): Self = StObject.set(x, "lastUpdateOfWhoisDatabase", value.asInstanceOf[js.Any])
        
        inline def setLastUpdateOfWhoisDatabaseUndefined: Self = StObject.set(x, "lastUpdateOfWhoisDatabase", js.undefined)
        
        inline def setNameServer(value: String): Self = StObject.set(x, "nameServer", value.asInstanceOf[js.Any])
        
        inline def setNameServerUndefined: Self = StObject.set(x, "nameServer", js.undefined)
        
        inline def setRegistrantCity(value: String): Self = StObject.set(x, "registrantCity", value.asInstanceOf[js.Any])
        
        inline def setRegistrantCityUndefined: Self = StObject.set(x, "registrantCity", js.undefined)
        
        inline def setRegistrantCountry(value: String): Self = StObject.set(x, "registrantCountry", value.asInstanceOf[js.Any])
        
        inline def setRegistrantCountryUndefined: Self = StObject.set(x, "registrantCountry", js.undefined)
        
        inline def setRegistrantEmail(value: String): Self = StObject.set(x, "registrantEmail", value.asInstanceOf[js.Any])
        
        inline def setRegistrantEmailUndefined: Self = StObject.set(x, "registrantEmail", js.undefined)
        
        inline def setRegistrantName(value: String): Self = StObject.set(x, "registrantName", value.asInstanceOf[js.Any])
        
        inline def setRegistrantNameUndefined: Self = StObject.set(x, "registrantName", js.undefined)
        
        inline def setRegistrantOrganization(value: String): Self = StObject.set(x, "registrantOrganization", value.asInstanceOf[js.Any])
        
        inline def setRegistrantOrganizationUndefined: Self = StObject.set(x, "registrantOrganization", js.undefined)
        
        inline def setRegistrantPhone(value: String): Self = StObject.set(x, "registrantPhone", value.asInstanceOf[js.Any])
        
        inline def setRegistrantPhoneUndefined: Self = StObject.set(x, "registrantPhone", js.undefined)
        
        inline def setRegistrantPostalCode(value: String): Self = StObject.set(x, "registrantPostalCode", value.asInstanceOf[js.Any])
        
        inline def setRegistrantPostalCodeUndefined: Self = StObject.set(x, "registrantPostalCode", js.undefined)
        
        inline def setRegistrantStateProvince(value: String): Self = StObject.set(x, "registrantStateProvince", value.asInstanceOf[js.Any])
        
        inline def setRegistrantStateProvinceUndefined: Self = StObject.set(x, "registrantStateProvince", js.undefined)
        
        inline def setRegistrantStreet(value: String): Self = StObject.set(x, "registrantStreet", value.asInstanceOf[js.Any])
        
        inline def setRegistrantStreetUndefined: Self = StObject.set(x, "registrantStreet", js.undefined)
        
        inline def setRegistrar(value: String): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
        
        inline def setRegistrarAbuseContactEmail(value: String): Self = StObject.set(x, "registrarAbuseContactEmail", value.asInstanceOf[js.Any])
        
        inline def setRegistrarAbuseContactEmailUndefined: Self = StObject.set(x, "registrarAbuseContactEmail", js.undefined)
        
        inline def setRegistrarAbuseContactPhone(value: String): Self = StObject.set(x, "registrarAbuseContactPhone", value.asInstanceOf[js.Any])
        
        inline def setRegistrarAbuseContactPhoneUndefined: Self = StObject.set(x, "registrarAbuseContactPhone", js.undefined)
        
        inline def setRegistrarIanaId(value: String): Self = StObject.set(x, "registrarIanaId", value.asInstanceOf[js.Any])
        
        inline def setRegistrarIanaIdUndefined: Self = StObject.set(x, "registrarIanaId", js.undefined)
        
        inline def setRegistrarRegistrationExpirationDate(value: String): Self = StObject.set(x, "registrarRegistrationExpirationDate", value.asInstanceOf[js.Any])
        
        inline def setRegistrarRegistrationExpirationDateUndefined: Self = StObject.set(x, "registrarRegistrationExpirationDate", js.undefined)
        
        inline def setRegistrarUndefined: Self = StObject.set(x, "registrar", js.undefined)
        
        inline def setRegistrarUrl(value: String): Self = StObject.set(x, "registrarUrl", value.asInstanceOf[js.Any])
        
        inline def setRegistrarUrlUndefined: Self = StObject.set(x, "registrarUrl", js.undefined)
        
        inline def setRegistrarWhoisServer(value: String): Self = StObject.set(x, "registrarWhoisServer", value.asInstanceOf[js.Any])
        
        inline def setRegistrarWhoisServerUndefined: Self = StObject.set(x, "registrarWhoisServer", js.undefined)
        
        inline def setRegistryDomainId(value: String): Self = StObject.set(x, "registryDomainId", value.asInstanceOf[js.Any])
        
        inline def setRegistryDomainIdUndefined: Self = StObject.set(x, "registryDomainId", js.undefined)
        
        inline def setTechCity(value: String): Self = StObject.set(x, "techCity", value.asInstanceOf[js.Any])
        
        inline def setTechCityUndefined: Self = StObject.set(x, "techCity", js.undefined)
        
        inline def setTechCountry(value: String): Self = StObject.set(x, "techCountry", value.asInstanceOf[js.Any])
        
        inline def setTechCountryUndefined: Self = StObject.set(x, "techCountry", js.undefined)
        
        inline def setTechEmail(value: String): Self = StObject.set(x, "techEmail", value.asInstanceOf[js.Any])
        
        inline def setTechEmailUndefined: Self = StObject.set(x, "techEmail", js.undefined)
        
        inline def setTechName(value: String): Self = StObject.set(x, "techName", value.asInstanceOf[js.Any])
        
        inline def setTechNameUndefined: Self = StObject.set(x, "techName", js.undefined)
        
        inline def setTechOrganization(value: String): Self = StObject.set(x, "techOrganization", value.asInstanceOf[js.Any])
        
        inline def setTechOrganizationUndefined: Self = StObject.set(x, "techOrganization", js.undefined)
        
        inline def setTechPhone(value: String): Self = StObject.set(x, "techPhone", value.asInstanceOf[js.Any])
        
        inline def setTechPhoneUndefined: Self = StObject.set(x, "techPhone", js.undefined)
        
        inline def setTechPostalCode(value: String): Self = StObject.set(x, "techPostalCode", value.asInstanceOf[js.Any])
        
        inline def setTechPostalCodeUndefined: Self = StObject.set(x, "techPostalCode", js.undefined)
        
        inline def setTechStateProvince(value: String): Self = StObject.set(x, "techStateProvince", value.asInstanceOf[js.Any])
        
        inline def setTechStateProvinceUndefined: Self = StObject.set(x, "techStateProvince", js.undefined)
        
        inline def setTechStreet(value: String): Self = StObject.set(x, "techStreet", value.asInstanceOf[js.Any])
        
        inline def setTechStreetUndefined: Self = StObject.set(x, "techStreet", js.undefined)
        
        inline def setUpdatedDate(value: String): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
        
        inline def setUpdatedDateUndefined: Self = StObject.set(x, "updatedDate", js.undefined)
        
        inline def setUrlOfTheIcannWhoisDataProblemReportingSystem(value: String): Self = StObject.set(x, "urlOfTheIcannWhoisDataProblemReportingSystem", value.asInstanceOf[js.Any])
        
        inline def setUrlOfTheIcannWhoisDataProblemReportingSystemUndefined: Self = StObject.set(x, "urlOfTheIcannWhoisDataProblemReportingSystem", js.undefined)
      }
    }
    
    /**
      * The result of a WHOIS lookup. This can be either a single object of registration data,
      * or an array of multiple registration data paired with their originating server.
      */
    type Result = js.Array[ResultArrayElement] | RegistrationData
    
    trait ResultArrayElement extends StObject {
      
      var data: RegistrationData
      
      var server: String
    }
    object ResultArrayElement {
      
      inline def apply(data: RegistrationData, server: String): ResultArrayElement = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
        __obj.asInstanceOf[ResultArrayElement]
      }
      
      extension [Self <: ResultArrayElement](x: Self) {
        
        inline def setData(value: RegistrationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The version of SOCKS protocol to exchange network packets between a client and server through a proxy server.
      * @example 4 (The SOCKS4 protocol)
      * @example 5 (The SOCKS5 protocol, defined in RFC 1928)
      */
    /* Rewritten from type alias, can be one of: 
      - typings.whoisJson.whoisJsonNumbers.`4`
      - typings.whoisJson.whoisJsonNumbers.`5`
    */
    trait SocksProtocolVersion extends StObject
    object SocksProtocolVersion {
      
      inline def `4`: typings.whoisJson.whoisJsonNumbers.`4` = 4.asInstanceOf[typings.whoisJson.whoisJsonNumbers.`4`]
      
      inline def `5`: typings.whoisJson.whoisJsonNumbers.`5` = 5.asInstanceOf[typings.whoisJson.whoisJsonNumbers.`5`]
    }
    
    /**
      * SOCKS proxy.
      */
    trait SocksProxy
      extends StObject
         with Endpoint {
      
      var `type`: SocksProtocolVersion
    }
    object SocksProxy {
      
      inline def apply(host: String, port: Double, `type`: SocksProtocolVersion): SocksProxy = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[SocksProxy]
      }
      
      extension [Self <: SocksProxy](x: Self) {
        
        inline def setType(value: SocksProtocolVersion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
