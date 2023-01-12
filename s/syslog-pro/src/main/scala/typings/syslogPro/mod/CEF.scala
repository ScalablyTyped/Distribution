package typings.syslogPro.mod

import org.scalablytyped.runtime.StringDictionary
import typings.syslogPro.mod.CEF.Extensions
import typings.syslogPro.mod.CEF.Options
import typings.syslogPro.mod.CEF.Severity
import typings.syslogPro.syslogProBooleans.`false`
import typings.syslogPro.syslogProBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("syslog-pro", "CEF")
@js.native
/**
  * Construct a new CEF formatting object with user options.
  */
open class CEF ()
  extends StObject
     with Options {
  def this(options: Options) = this()
  
  /**
    * Build a CEF formatted string.
    *
    * @return String with formatted message.
    */
  def buildMessage(): String = js.native
  
  @JSName("deviceEventClassId")
  val deviceEventClassId_CEF: String = js.native
  
  @JSName("deviceProduct")
  val deviceProduct_CEF: String = js.native
  
  @JSName("deviceVendor")
  val deviceVendor_CEF: String = js.native
  
  @JSName("deviceVersion")
  val deviceVersion_CEF: String = js.native
  
  @JSName("extensions")
  val extensions_CEF: Extensions = js.native
  
  @JSName("name")
  val name_CEF: String = js.native
  
  /**
    * Send a CEF formatted message.
    *
    * @param syslogOptions Syslog server options that should be used to send messages directly from this class.
    */
  def send(): js.Promise[String] = js.native
  def send(syslogOptions: typings.syslogPro.mod.Syslog.Options): js.Promise[String] = js.native
  @JSName("send")
  def send_false(syslogOptions: `false`): js.Promise[String] = js.native
  
  @JSName("server")
  val server_CEF: js.UndefOr[Syslog] = js.native
  
  @JSName("severity")
  val severity_CEF: Severity = js.native
  
  /**
    * Validate this CEF object.
    *
    * @throws First element to fail validation.
    */
  def validate(): `true` = js.native
}
object CEF {
  
  /* Rewritten from type alias, can be one of: 
    - typings.syslogPro.syslogProInts.`0`
    - typings.syslogPro.syslogProInts.`1`
    - typings.syslogPro.syslogProInts.`2`
    - typings.syslogPro.syslogProInts.`3`
  */
  trait ExtensionType extends StObject
  object ExtensionType {
    
    inline def `0`: typings.syslogPro.syslogProInts.`0` = 0.asInstanceOf[typings.syslogPro.syslogProInts.`0`]
    
    inline def `1`: typings.syslogPro.syslogProInts.`1` = 1.asInstanceOf[typings.syslogPro.syslogProInts.`1`]
    
    inline def `2`: typings.syslogPro.syslogProInts.`2` = 2.asInstanceOf[typings.syslogPro.syslogProInts.`2`]
    
    inline def `3`: typings.syslogPro.syslogProInts.`3` = 3.asInstanceOf[typings.syslogPro.syslogProInts.`3`]
  }
  
  trait Extensions
    extends StObject
       with /* extension */ StringDictionary[js.UndefOr[String | Double | Null]] {
    
    var DeviceCustomNumber2: js.UndefOr[Double | Null] = js.undefined
    
    var Reason: js.UndefOr[String | Null] = js.undefined
    
    var agentAddress: js.UndefOr[String | Null] = js.undefined
    
    var agentDnsDomain: js.UndefOr[String | Null] = js.undefined
    
    var agentHostName: js.UndefOr[String | Null] = js.undefined
    
    var agentId: js.UndefOr[String | Null] = js.undefined
    
    var agentMacAddress: js.UndefOr[String | Null] = js.undefined
    
    var agentNtDomain: js.UndefOr[String | Null] = js.undefined
    
    var agentReceiptTime: js.UndefOr[String | Null] = js.undefined
    
    var agentTimeZone: js.UndefOr[String | Null] = js.undefined
    
    var agentTranslatedAddress: js.UndefOr[String | Null] = js.undefined
    
    var `agentTranslatedZone ExternalID`: js.UndefOr[String | Null] = js.undefined
    
    var agentTranslatedZoneURI: js.UndefOr[String | Null] = js.undefined
    
    var agentType: js.UndefOr[String | Null] = js.undefined
    
    var agentVersion: js.UndefOr[String | Null] = js.undefined
    
    var agentZoneExternalID: js.UndefOr[String | Null] = js.undefined
    
    var agentZoneURI: js.UndefOr[String | Null] = js.undefined
    
    var applicationProtocol: js.UndefOr[String | Null] = js.undefined
    
    var baseEventCount: js.UndefOr[Double | Null] = js.undefined
    
    var bytesIn: js.UndefOr[Double | Null] = js.undefined
    
    var bytesOut: js.UndefOr[Double | Null] = js.undefined
    
    var customerExternalID: js.UndefOr[String | Null] = js.undefined
    
    var customerURI: js.UndefOr[String | Null] = js.undefined
    
    var destinationAddress: js.UndefOr[String | Null] = js.undefined
    
    var destinationDnsDomain: js.UndefOr[String | Null] = js.undefined
    
    var destinationGeoLatitude: js.UndefOr[Double | Null] = js.undefined
    
    var destinationGeoLongitude: js.UndefOr[Double | Null] = js.undefined
    
    var destinationHostName: js.UndefOr[String | Null] = js.undefined
    
    var destinationMacAddress: js.UndefOr[String | Null] = js.undefined
    
    var destinationNtDomain: js.UndefOr[String | Null] = js.undefined
    
    var destinationPort: js.UndefOr[Double | Null] = js.undefined
    
    var destinationProcessId: js.UndefOr[Double | Null] = js.undefined
    
    var destinationProcessName: js.UndefOr[String | Null] = js.undefined
    
    var destinationServiceName: js.UndefOr[String | Null] = js.undefined
    
    var `destinationTranslated Address`: js.UndefOr[String | Null] = js.undefined
    
    var `destinationTranslated ZoneExternalID`: js.UndefOr[String | Null] = js.undefined
    
    var `destinationTranslated ZoneURI`: js.UndefOr[String | Null] = js.undefined
    
    var destinationTranslatedPort: js.UndefOr[String | Null] = js.undefined
    
    var destinationUserId: js.UndefOr[String | Null] = js.undefined
    
    var destinationUserName: js.UndefOr[String | Null] = js.undefined
    
    var destinationUserPrivileges: js.UndefOr[String | Null] = js.undefined
    
    var destinationZoneExternalID: js.UndefOr[String | Null] = js.undefined
    
    var destinationZoneURI: js.UndefOr[String | Null] = js.undefined
    
    var deviceAction: js.UndefOr[String | Null] = js.undefined
    
    var deviceAddress: js.UndefOr[String | Null] = js.undefined
    
    var `deviceCustom FloatingPoint1Label`: js.UndefOr[String | Null] = js.undefined
    
    var `deviceCustom FloatingPoint3Label`: js.UndefOr[String | Null] = js.undefined
    
    var `deviceCustom FloatingPoint4Label`: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomDate1: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomDate1Label: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomDate2: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomDate2Label: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomFloatingPoint1: js.UndefOr[Double | Null] = js.undefined
    
    var deviceCustomFloatingPoint2: js.UndefOr[Double | Null] = js.undefined
    
    var `deviceCustomFloatingPoint2 Label`: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomFloatingPoint3: js.UndefOr[Double | Null] = js.undefined
    
    var deviceCustomFloatingPoint4: js.UndefOr[Double | Null] = js.undefined
    
    var `deviceCustomIPv6 Address1Label`: js.UndefOr[String | Null] = js.undefined
    
    var `deviceCustomIPv6 Address4`: js.UndefOr[String | Null] = js.undefined
    
    var `deviceCustomIPv6 Address4Label`: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomIPv6Address1: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomIPv6Address3: js.UndefOr[String | Null] = js.undefined
    
    var `deviceCustomIPv6Address3 Label`: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomNumber1: js.UndefOr[Double | Null] = js.undefined
    
    var deviceCustomNumber1Label: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomNumber2Label: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomNumber3: js.UndefOr[Double | Null] = js.undefined
    
    var deviceCustomNumber3Label: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString1: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString1Label: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString2: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString2Label: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString3: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString3Label: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString4: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString4Label: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString5: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString5Label: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString6: js.UndefOr[String | Null] = js.undefined
    
    var deviceCustomString6Label: js.UndefOr[String | Null] = js.undefined
    
    var deviceDirection: js.UndefOr[Double | Null] = js.undefined
    
    var deviceDnsDomain: js.UndefOr[String | Null] = js.undefined
    
    var deviceEventCategory: js.UndefOr[String | Null] = js.undefined
    
    var deviceExternalId: js.UndefOr[String | Null] = js.undefined
    
    var deviceFacility: js.UndefOr[String | Null] = js.undefined
    
    var deviceHostName: js.UndefOr[String | Null] = js.undefined
    
    var deviceInboundInterface: js.UndefOr[String | Null] = js.undefined
    
    var deviceMacAddress: js.UndefOr[String | Null] = js.undefined
    
    var deviceNtDomain: js.UndefOr[String | Null] = js.undefined
    
    var deviceOutboundInterface: js.UndefOr[String | Null] = js.undefined
    
    var devicePayloadId: js.UndefOr[String | Null] = js.undefined
    
    var deviceProcessId: js.UndefOr[Double | Null] = js.undefined
    
    var deviceProcessName: js.UndefOr[String | Null] = js.undefined
    
    var deviceReceiptTime: js.UndefOr[String | Null] = js.undefined
    
    var deviceTimeZone: js.UndefOr[String | Null] = js.undefined
    
    var deviceTranslatedAddress: js.UndefOr[String | Null] = js.undefined
    
    var `deviceTranslatedZone ExternalID`: js.UndefOr[String | Null] = js.undefined
    
    var deviceTranslatedZoneURI: js.UndefOr[String | Null] = js.undefined
    
    var deviceZoneExternalID: js.UndefOr[String | Null] = js.undefined
    
    var deviceZoneURI: js.UndefOr[String | Null] = js.undefined
    
    var endTime: js.UndefOr[String | Null] = js.undefined
    
    var eventId: js.UndefOr[Double | Null] = js.undefined
    
    var eventOutcome: js.UndefOr[String | Null] = js.undefined
    
    var externalId: js.UndefOr[String | Null] = js.undefined
    
    var fileCreateTime: js.UndefOr[String | Null] = js.undefined
    
    var fileHash: js.UndefOr[String | Null] = js.undefined
    
    var fileId: js.UndefOr[String | Null] = js.undefined
    
    var fileModificationTime: js.UndefOr[String | Null] = js.undefined
    
    var filePath: js.UndefOr[String | Null] = js.undefined
    
    var filePermission: js.UndefOr[String | Null] = js.undefined
    
    var fileSize: js.UndefOr[Double | Null] = js.undefined
    
    var fileType: js.UndefOr[String | Null] = js.undefined
    
    var filename: js.UndefOr[String | Null] = js.undefined
    
    var flexDate1: js.UndefOr[String | Null] = js.undefined
    
    var flexDate1Label: js.UndefOr[String | Null] = js.undefined
    
    var flexString1: js.UndefOr[String | Null] = js.undefined
    
    var flexString1Label: js.UndefOr[String | Null] = js.undefined
    
    var flexString2: js.UndefOr[String | Null] = js.undefined
    
    var flexString2Label: js.UndefOr[String | Null] = js.undefined
    
    var message: js.UndefOr[String | Null] = js.undefined
    
    var oldFileCreateTime: js.UndefOr[String | Null] = js.undefined
    
    var oldFileHash: js.UndefOr[String | Null] = js.undefined
    
    var oldFileId: js.UndefOr[String | Null] = js.undefined
    
    var oldFileModificationTime: js.UndefOr[String | Null] = js.undefined
    
    var oldFileName: js.UndefOr[String | Null] = js.undefined
    
    var oldFilePath: js.UndefOr[String | Null] = js.undefined
    
    var oldFileSize: js.UndefOr[Double | Null] = js.undefined
    
    var oldFileType: js.UndefOr[String | Null] = js.undefined
    
    var rawEvent: js.UndefOr[String | Null] = js.undefined
    
    var requestClientApplication: js.UndefOr[String | Null] = js.undefined
    
    var requestContext: js.UndefOr[String | Null] = js.undefined
    
    var requestCookies: js.UndefOr[String | Null] = js.undefined
    
    var requestMethod: js.UndefOr[String | Null] = js.undefined
    
    var requestUrl: js.UndefOr[String | Null] = js.undefined
    
    var sourceAddress: js.UndefOr[String | Null] = js.undefined
    
    var sourceDnsDomain: js.UndefOr[String | Null] = js.undefined
    
    var sourceGeoLatitude: js.UndefOr[Double | Null] = js.undefined
    
    var sourceGeoLongitude: js.UndefOr[Double | Null] = js.undefined
    
    var sourceHostName: js.UndefOr[String | Null] = js.undefined
    
    var sourceMacAddress: js.UndefOr[String | Null] = js.undefined
    
    var sourceNtDomain: js.UndefOr[String | Null] = js.undefined
    
    var sourcePort: js.UndefOr[Double | Null] = js.undefined
    
    var sourceProcessId: js.UndefOr[Double | Null] = js.undefined
    
    var sourceProcessName: js.UndefOr[String | Null] = js.undefined
    
    var sourceServiceName: js.UndefOr[String | Null] = js.undefined
    
    var sourceTranslatedAddress: js.UndefOr[String | Null] = js.undefined
    
    var sourceTranslatedPort: js.UndefOr[Double | Null] = js.undefined
    
    var `sourceTranslatedZone ExternalID`: js.UndefOr[String | Null] = js.undefined
    
    var sourceTranslatedZoneURI: js.UndefOr[String | Null] = js.undefined
    
    var sourceUserId: js.UndefOr[String | Null] = js.undefined
    
    var sourceUserName: js.UndefOr[String | Null] = js.undefined
    
    var sourceUserPrivileges: js.UndefOr[String | Null] = js.undefined
    
    var sourceZoneExternalID: js.UndefOr[String | Null] = js.undefined
    
    var sourceZoneURI: js.UndefOr[String | Null] = js.undefined
    
    var startTime: js.UndefOr[String | Null] = js.undefined
    
    var transportProtocol: js.UndefOr[String | Null] = js.undefined
    
    var `type`: js.UndefOr[ExtensionType | Null] = js.undefined
  }
  object Extensions {
    
    inline def apply(): Extensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
      
      inline def setAgentAddress(value: String): Self = StObject.set(x, "agentAddress", value.asInstanceOf[js.Any])
      
      inline def setAgentAddressNull: Self = StObject.set(x, "agentAddress", null)
      
      inline def setAgentAddressUndefined: Self = StObject.set(x, "agentAddress", js.undefined)
      
      inline def setAgentDnsDomain(value: String): Self = StObject.set(x, "agentDnsDomain", value.asInstanceOf[js.Any])
      
      inline def setAgentDnsDomainNull: Self = StObject.set(x, "agentDnsDomain", null)
      
      inline def setAgentDnsDomainUndefined: Self = StObject.set(x, "agentDnsDomain", js.undefined)
      
      inline def setAgentHostName(value: String): Self = StObject.set(x, "agentHostName", value.asInstanceOf[js.Any])
      
      inline def setAgentHostNameNull: Self = StObject.set(x, "agentHostName", null)
      
      inline def setAgentHostNameUndefined: Self = StObject.set(x, "agentHostName", js.undefined)
      
      inline def setAgentId(value: String): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
      
      inline def setAgentIdNull: Self = StObject.set(x, "agentId", null)
      
      inline def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
      
      inline def setAgentMacAddress(value: String): Self = StObject.set(x, "agentMacAddress", value.asInstanceOf[js.Any])
      
      inline def setAgentMacAddressNull: Self = StObject.set(x, "agentMacAddress", null)
      
      inline def setAgentMacAddressUndefined: Self = StObject.set(x, "agentMacAddress", js.undefined)
      
      inline def setAgentNtDomain(value: String): Self = StObject.set(x, "agentNtDomain", value.asInstanceOf[js.Any])
      
      inline def setAgentNtDomainNull: Self = StObject.set(x, "agentNtDomain", null)
      
      inline def setAgentNtDomainUndefined: Self = StObject.set(x, "agentNtDomain", js.undefined)
      
      inline def setAgentReceiptTime(value: String): Self = StObject.set(x, "agentReceiptTime", value.asInstanceOf[js.Any])
      
      inline def setAgentReceiptTimeNull: Self = StObject.set(x, "agentReceiptTime", null)
      
      inline def setAgentReceiptTimeUndefined: Self = StObject.set(x, "agentReceiptTime", js.undefined)
      
      inline def setAgentTimeZone(value: String): Self = StObject.set(x, "agentTimeZone", value.asInstanceOf[js.Any])
      
      inline def setAgentTimeZoneNull: Self = StObject.set(x, "agentTimeZone", null)
      
      inline def setAgentTimeZoneUndefined: Self = StObject.set(x, "agentTimeZone", js.undefined)
      
      inline def setAgentTranslatedAddress(value: String): Self = StObject.set(x, "agentTranslatedAddress", value.asInstanceOf[js.Any])
      
      inline def setAgentTranslatedAddressNull: Self = StObject.set(x, "agentTranslatedAddress", null)
      
      inline def setAgentTranslatedAddressUndefined: Self = StObject.set(x, "agentTranslatedAddress", js.undefined)
      
      inline def `setAgentTranslatedZone ExternalID`(value: String): Self = StObject.set(x, "agentTranslatedZone ExternalID", value.asInstanceOf[js.Any])
      
      inline def `setAgentTranslatedZone ExternalIDNull`: Self = StObject.set(x, "agentTranslatedZone ExternalID", null)
      
      inline def `setAgentTranslatedZone ExternalIDUndefined`: Self = StObject.set(x, "agentTranslatedZone ExternalID", js.undefined)
      
      inline def setAgentTranslatedZoneURI(value: String): Self = StObject.set(x, "agentTranslatedZoneURI", value.asInstanceOf[js.Any])
      
      inline def setAgentTranslatedZoneURINull: Self = StObject.set(x, "agentTranslatedZoneURI", null)
      
      inline def setAgentTranslatedZoneURIUndefined: Self = StObject.set(x, "agentTranslatedZoneURI", js.undefined)
      
      inline def setAgentType(value: String): Self = StObject.set(x, "agentType", value.asInstanceOf[js.Any])
      
      inline def setAgentTypeNull: Self = StObject.set(x, "agentType", null)
      
      inline def setAgentTypeUndefined: Self = StObject.set(x, "agentType", js.undefined)
      
      inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
      
      inline def setAgentVersionNull: Self = StObject.set(x, "agentVersion", null)
      
      inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
      
      inline def setAgentZoneExternalID(value: String): Self = StObject.set(x, "agentZoneExternalID", value.asInstanceOf[js.Any])
      
      inline def setAgentZoneExternalIDNull: Self = StObject.set(x, "agentZoneExternalID", null)
      
      inline def setAgentZoneExternalIDUndefined: Self = StObject.set(x, "agentZoneExternalID", js.undefined)
      
      inline def setAgentZoneURI(value: String): Self = StObject.set(x, "agentZoneURI", value.asInstanceOf[js.Any])
      
      inline def setAgentZoneURINull: Self = StObject.set(x, "agentZoneURI", null)
      
      inline def setAgentZoneURIUndefined: Self = StObject.set(x, "agentZoneURI", js.undefined)
      
      inline def setApplicationProtocol(value: String): Self = StObject.set(x, "applicationProtocol", value.asInstanceOf[js.Any])
      
      inline def setApplicationProtocolNull: Self = StObject.set(x, "applicationProtocol", null)
      
      inline def setApplicationProtocolUndefined: Self = StObject.set(x, "applicationProtocol", js.undefined)
      
      inline def setBaseEventCount(value: Double): Self = StObject.set(x, "baseEventCount", value.asInstanceOf[js.Any])
      
      inline def setBaseEventCountNull: Self = StObject.set(x, "baseEventCount", null)
      
      inline def setBaseEventCountUndefined: Self = StObject.set(x, "baseEventCount", js.undefined)
      
      inline def setBytesIn(value: Double): Self = StObject.set(x, "bytesIn", value.asInstanceOf[js.Any])
      
      inline def setBytesInNull: Self = StObject.set(x, "bytesIn", null)
      
      inline def setBytesInUndefined: Self = StObject.set(x, "bytesIn", js.undefined)
      
      inline def setBytesOut(value: Double): Self = StObject.set(x, "bytesOut", value.asInstanceOf[js.Any])
      
      inline def setBytesOutNull: Self = StObject.set(x, "bytesOut", null)
      
      inline def setBytesOutUndefined: Self = StObject.set(x, "bytesOut", js.undefined)
      
      inline def setCustomerExternalID(value: String): Self = StObject.set(x, "customerExternalID", value.asInstanceOf[js.Any])
      
      inline def setCustomerExternalIDNull: Self = StObject.set(x, "customerExternalID", null)
      
      inline def setCustomerExternalIDUndefined: Self = StObject.set(x, "customerExternalID", js.undefined)
      
      inline def setCustomerURI(value: String): Self = StObject.set(x, "customerURI", value.asInstanceOf[js.Any])
      
      inline def setCustomerURINull: Self = StObject.set(x, "customerURI", null)
      
      inline def setCustomerURIUndefined: Self = StObject.set(x, "customerURI", js.undefined)
      
      inline def setDestinationAddress(value: String): Self = StObject.set(x, "destinationAddress", value.asInstanceOf[js.Any])
      
      inline def setDestinationAddressNull: Self = StObject.set(x, "destinationAddress", null)
      
      inline def setDestinationAddressUndefined: Self = StObject.set(x, "destinationAddress", js.undefined)
      
      inline def setDestinationDnsDomain(value: String): Self = StObject.set(x, "destinationDnsDomain", value.asInstanceOf[js.Any])
      
      inline def setDestinationDnsDomainNull: Self = StObject.set(x, "destinationDnsDomain", null)
      
      inline def setDestinationDnsDomainUndefined: Self = StObject.set(x, "destinationDnsDomain", js.undefined)
      
      inline def setDestinationGeoLatitude(value: Double): Self = StObject.set(x, "destinationGeoLatitude", value.asInstanceOf[js.Any])
      
      inline def setDestinationGeoLatitudeNull: Self = StObject.set(x, "destinationGeoLatitude", null)
      
      inline def setDestinationGeoLatitudeUndefined: Self = StObject.set(x, "destinationGeoLatitude", js.undefined)
      
      inline def setDestinationGeoLongitude(value: Double): Self = StObject.set(x, "destinationGeoLongitude", value.asInstanceOf[js.Any])
      
      inline def setDestinationGeoLongitudeNull: Self = StObject.set(x, "destinationGeoLongitude", null)
      
      inline def setDestinationGeoLongitudeUndefined: Self = StObject.set(x, "destinationGeoLongitude", js.undefined)
      
      inline def setDestinationHostName(value: String): Self = StObject.set(x, "destinationHostName", value.asInstanceOf[js.Any])
      
      inline def setDestinationHostNameNull: Self = StObject.set(x, "destinationHostName", null)
      
      inline def setDestinationHostNameUndefined: Self = StObject.set(x, "destinationHostName", js.undefined)
      
      inline def setDestinationMacAddress(value: String): Self = StObject.set(x, "destinationMacAddress", value.asInstanceOf[js.Any])
      
      inline def setDestinationMacAddressNull: Self = StObject.set(x, "destinationMacAddress", null)
      
      inline def setDestinationMacAddressUndefined: Self = StObject.set(x, "destinationMacAddress", js.undefined)
      
      inline def setDestinationNtDomain(value: String): Self = StObject.set(x, "destinationNtDomain", value.asInstanceOf[js.Any])
      
      inline def setDestinationNtDomainNull: Self = StObject.set(x, "destinationNtDomain", null)
      
      inline def setDestinationNtDomainUndefined: Self = StObject.set(x, "destinationNtDomain", js.undefined)
      
      inline def setDestinationPort(value: Double): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
      
      inline def setDestinationPortNull: Self = StObject.set(x, "destinationPort", null)
      
      inline def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
      
      inline def setDestinationProcessId(value: Double): Self = StObject.set(x, "destinationProcessId", value.asInstanceOf[js.Any])
      
      inline def setDestinationProcessIdNull: Self = StObject.set(x, "destinationProcessId", null)
      
      inline def setDestinationProcessIdUndefined: Self = StObject.set(x, "destinationProcessId", js.undefined)
      
      inline def setDestinationProcessName(value: String): Self = StObject.set(x, "destinationProcessName", value.asInstanceOf[js.Any])
      
      inline def setDestinationProcessNameNull: Self = StObject.set(x, "destinationProcessName", null)
      
      inline def setDestinationProcessNameUndefined: Self = StObject.set(x, "destinationProcessName", js.undefined)
      
      inline def setDestinationServiceName(value: String): Self = StObject.set(x, "destinationServiceName", value.asInstanceOf[js.Any])
      
      inline def setDestinationServiceNameNull: Self = StObject.set(x, "destinationServiceName", null)
      
      inline def setDestinationServiceNameUndefined: Self = StObject.set(x, "destinationServiceName", js.undefined)
      
      inline def `setDestinationTranslated Address`(value: String): Self = StObject.set(x, "destinationTranslated Address", value.asInstanceOf[js.Any])
      
      inline def `setDestinationTranslated AddressNull`: Self = StObject.set(x, "destinationTranslated Address", null)
      
      inline def `setDestinationTranslated AddressUndefined`: Self = StObject.set(x, "destinationTranslated Address", js.undefined)
      
      inline def `setDestinationTranslated ZoneExternalID`(value: String): Self = StObject.set(x, "destinationTranslated ZoneExternalID", value.asInstanceOf[js.Any])
      
      inline def `setDestinationTranslated ZoneExternalIDNull`: Self = StObject.set(x, "destinationTranslated ZoneExternalID", null)
      
      inline def `setDestinationTranslated ZoneExternalIDUndefined`: Self = StObject.set(x, "destinationTranslated ZoneExternalID", js.undefined)
      
      inline def `setDestinationTranslated ZoneURI`(value: String): Self = StObject.set(x, "destinationTranslated ZoneURI", value.asInstanceOf[js.Any])
      
      inline def `setDestinationTranslated ZoneURINull`: Self = StObject.set(x, "destinationTranslated ZoneURI", null)
      
      inline def `setDestinationTranslated ZoneURIUndefined`: Self = StObject.set(x, "destinationTranslated ZoneURI", js.undefined)
      
      inline def setDestinationTranslatedPort(value: String): Self = StObject.set(x, "destinationTranslatedPort", value.asInstanceOf[js.Any])
      
      inline def setDestinationTranslatedPortNull: Self = StObject.set(x, "destinationTranslatedPort", null)
      
      inline def setDestinationTranslatedPortUndefined: Self = StObject.set(x, "destinationTranslatedPort", js.undefined)
      
      inline def setDestinationUserId(value: String): Self = StObject.set(x, "destinationUserId", value.asInstanceOf[js.Any])
      
      inline def setDestinationUserIdNull: Self = StObject.set(x, "destinationUserId", null)
      
      inline def setDestinationUserIdUndefined: Self = StObject.set(x, "destinationUserId", js.undefined)
      
      inline def setDestinationUserName(value: String): Self = StObject.set(x, "destinationUserName", value.asInstanceOf[js.Any])
      
      inline def setDestinationUserNameNull: Self = StObject.set(x, "destinationUserName", null)
      
      inline def setDestinationUserNameUndefined: Self = StObject.set(x, "destinationUserName", js.undefined)
      
      inline def setDestinationUserPrivileges(value: String): Self = StObject.set(x, "destinationUserPrivileges", value.asInstanceOf[js.Any])
      
      inline def setDestinationUserPrivilegesNull: Self = StObject.set(x, "destinationUserPrivileges", null)
      
      inline def setDestinationUserPrivilegesUndefined: Self = StObject.set(x, "destinationUserPrivileges", js.undefined)
      
      inline def setDestinationZoneExternalID(value: String): Self = StObject.set(x, "destinationZoneExternalID", value.asInstanceOf[js.Any])
      
      inline def setDestinationZoneExternalIDNull: Self = StObject.set(x, "destinationZoneExternalID", null)
      
      inline def setDestinationZoneExternalIDUndefined: Self = StObject.set(x, "destinationZoneExternalID", js.undefined)
      
      inline def setDestinationZoneURI(value: String): Self = StObject.set(x, "destinationZoneURI", value.asInstanceOf[js.Any])
      
      inline def setDestinationZoneURINull: Self = StObject.set(x, "destinationZoneURI", null)
      
      inline def setDestinationZoneURIUndefined: Self = StObject.set(x, "destinationZoneURI", js.undefined)
      
      inline def setDeviceAction(value: String): Self = StObject.set(x, "deviceAction", value.asInstanceOf[js.Any])
      
      inline def setDeviceActionNull: Self = StObject.set(x, "deviceAction", null)
      
      inline def setDeviceActionUndefined: Self = StObject.set(x, "deviceAction", js.undefined)
      
      inline def setDeviceAddress(value: String): Self = StObject.set(x, "deviceAddress", value.asInstanceOf[js.Any])
      
      inline def setDeviceAddressNull: Self = StObject.set(x, "deviceAddress", null)
      
      inline def setDeviceAddressUndefined: Self = StObject.set(x, "deviceAddress", js.undefined)
      
      inline def `setDeviceCustom FloatingPoint1Label`(value: String): Self = StObject.set(x, "deviceCustom FloatingPoint1Label", value.asInstanceOf[js.Any])
      
      inline def `setDeviceCustom FloatingPoint1LabelNull`: Self = StObject.set(x, "deviceCustom FloatingPoint1Label", null)
      
      inline def `setDeviceCustom FloatingPoint1LabelUndefined`: Self = StObject.set(x, "deviceCustom FloatingPoint1Label", js.undefined)
      
      inline def `setDeviceCustom FloatingPoint3Label`(value: String): Self = StObject.set(x, "deviceCustom FloatingPoint3Label", value.asInstanceOf[js.Any])
      
      inline def `setDeviceCustom FloatingPoint3LabelNull`: Self = StObject.set(x, "deviceCustom FloatingPoint3Label", null)
      
      inline def `setDeviceCustom FloatingPoint3LabelUndefined`: Self = StObject.set(x, "deviceCustom FloatingPoint3Label", js.undefined)
      
      inline def `setDeviceCustom FloatingPoint4Label`(value: String): Self = StObject.set(x, "deviceCustom FloatingPoint4Label", value.asInstanceOf[js.Any])
      
      inline def `setDeviceCustom FloatingPoint4LabelNull`: Self = StObject.set(x, "deviceCustom FloatingPoint4Label", null)
      
      inline def `setDeviceCustom FloatingPoint4LabelUndefined`: Self = StObject.set(x, "deviceCustom FloatingPoint4Label", js.undefined)
      
      inline def setDeviceCustomDate1(value: String): Self = StObject.set(x, "deviceCustomDate1", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomDate1Label(value: String): Self = StObject.set(x, "deviceCustomDate1Label", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomDate1LabelNull: Self = StObject.set(x, "deviceCustomDate1Label", null)
      
      inline def setDeviceCustomDate1LabelUndefined: Self = StObject.set(x, "deviceCustomDate1Label", js.undefined)
      
      inline def setDeviceCustomDate1Null: Self = StObject.set(x, "deviceCustomDate1", null)
      
      inline def setDeviceCustomDate1Undefined: Self = StObject.set(x, "deviceCustomDate1", js.undefined)
      
      inline def setDeviceCustomDate2(value: String): Self = StObject.set(x, "deviceCustomDate2", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomDate2Label(value: String): Self = StObject.set(x, "deviceCustomDate2Label", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomDate2LabelNull: Self = StObject.set(x, "deviceCustomDate2Label", null)
      
      inline def setDeviceCustomDate2LabelUndefined: Self = StObject.set(x, "deviceCustomDate2Label", js.undefined)
      
      inline def setDeviceCustomDate2Null: Self = StObject.set(x, "deviceCustomDate2", null)
      
      inline def setDeviceCustomDate2Undefined: Self = StObject.set(x, "deviceCustomDate2", js.undefined)
      
      inline def setDeviceCustomFloatingPoint1(value: Double): Self = StObject.set(x, "deviceCustomFloatingPoint1", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomFloatingPoint1Null: Self = StObject.set(x, "deviceCustomFloatingPoint1", null)
      
      inline def setDeviceCustomFloatingPoint1Undefined: Self = StObject.set(x, "deviceCustomFloatingPoint1", js.undefined)
      
      inline def setDeviceCustomFloatingPoint2(value: Double): Self = StObject.set(x, "deviceCustomFloatingPoint2", value.asInstanceOf[js.Any])
      
      inline def `setDeviceCustomFloatingPoint2 Label`(value: String): Self = StObject.set(x, "deviceCustomFloatingPoint2 Label", value.asInstanceOf[js.Any])
      
      inline def `setDeviceCustomFloatingPoint2 LabelNull`: Self = StObject.set(x, "deviceCustomFloatingPoint2 Label", null)
      
      inline def `setDeviceCustomFloatingPoint2 LabelUndefined`: Self = StObject.set(x, "deviceCustomFloatingPoint2 Label", js.undefined)
      
      inline def setDeviceCustomFloatingPoint2Null: Self = StObject.set(x, "deviceCustomFloatingPoint2", null)
      
      inline def setDeviceCustomFloatingPoint2Undefined: Self = StObject.set(x, "deviceCustomFloatingPoint2", js.undefined)
      
      inline def setDeviceCustomFloatingPoint3(value: Double): Self = StObject.set(x, "deviceCustomFloatingPoint3", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomFloatingPoint3Null: Self = StObject.set(x, "deviceCustomFloatingPoint3", null)
      
      inline def setDeviceCustomFloatingPoint3Undefined: Self = StObject.set(x, "deviceCustomFloatingPoint3", js.undefined)
      
      inline def setDeviceCustomFloatingPoint4(value: Double): Self = StObject.set(x, "deviceCustomFloatingPoint4", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomFloatingPoint4Null: Self = StObject.set(x, "deviceCustomFloatingPoint4", null)
      
      inline def setDeviceCustomFloatingPoint4Undefined: Self = StObject.set(x, "deviceCustomFloatingPoint4", js.undefined)
      
      inline def `setDeviceCustomIPv6 Address1Label`(value: String): Self = StObject.set(x, "deviceCustomIPv6 Address1Label", value.asInstanceOf[js.Any])
      
      inline def `setDeviceCustomIPv6 Address1LabelNull`: Self = StObject.set(x, "deviceCustomIPv6 Address1Label", null)
      
      inline def `setDeviceCustomIPv6 Address1LabelUndefined`: Self = StObject.set(x, "deviceCustomIPv6 Address1Label", js.undefined)
      
      inline def `setDeviceCustomIPv6 Address4`(value: String): Self = StObject.set(x, "deviceCustomIPv6 Address4", value.asInstanceOf[js.Any])
      
      inline def `setDeviceCustomIPv6 Address4Label`(value: String): Self = StObject.set(x, "deviceCustomIPv6 Address4Label", value.asInstanceOf[js.Any])
      
      inline def `setDeviceCustomIPv6 Address4LabelNull`: Self = StObject.set(x, "deviceCustomIPv6 Address4Label", null)
      
      inline def `setDeviceCustomIPv6 Address4LabelUndefined`: Self = StObject.set(x, "deviceCustomIPv6 Address4Label", js.undefined)
      
      inline def `setDeviceCustomIPv6 Address4Null`: Self = StObject.set(x, "deviceCustomIPv6 Address4", null)
      
      inline def `setDeviceCustomIPv6 Address4Undefined`: Self = StObject.set(x, "deviceCustomIPv6 Address4", js.undefined)
      
      inline def setDeviceCustomIPv6Address1(value: String): Self = StObject.set(x, "deviceCustomIPv6Address1", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomIPv6Address1Null: Self = StObject.set(x, "deviceCustomIPv6Address1", null)
      
      inline def setDeviceCustomIPv6Address1Undefined: Self = StObject.set(x, "deviceCustomIPv6Address1", js.undefined)
      
      inline def setDeviceCustomIPv6Address3(value: String): Self = StObject.set(x, "deviceCustomIPv6Address3", value.asInstanceOf[js.Any])
      
      inline def `setDeviceCustomIPv6Address3 Label`(value: String): Self = StObject.set(x, "deviceCustomIPv6Address3 Label", value.asInstanceOf[js.Any])
      
      inline def `setDeviceCustomIPv6Address3 LabelNull`: Self = StObject.set(x, "deviceCustomIPv6Address3 Label", null)
      
      inline def `setDeviceCustomIPv6Address3 LabelUndefined`: Self = StObject.set(x, "deviceCustomIPv6Address3 Label", js.undefined)
      
      inline def setDeviceCustomIPv6Address3Null: Self = StObject.set(x, "deviceCustomIPv6Address3", null)
      
      inline def setDeviceCustomIPv6Address3Undefined: Self = StObject.set(x, "deviceCustomIPv6Address3", js.undefined)
      
      inline def setDeviceCustomNumber1(value: Double): Self = StObject.set(x, "deviceCustomNumber1", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomNumber1Label(value: String): Self = StObject.set(x, "deviceCustomNumber1Label", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomNumber1LabelNull: Self = StObject.set(x, "deviceCustomNumber1Label", null)
      
      inline def setDeviceCustomNumber1LabelUndefined: Self = StObject.set(x, "deviceCustomNumber1Label", js.undefined)
      
      inline def setDeviceCustomNumber1Null: Self = StObject.set(x, "deviceCustomNumber1", null)
      
      inline def setDeviceCustomNumber1Undefined: Self = StObject.set(x, "deviceCustomNumber1", js.undefined)
      
      inline def setDeviceCustomNumber2(value: Double): Self = StObject.set(x, "DeviceCustomNumber2", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomNumber2Label(value: String): Self = StObject.set(x, "deviceCustomNumber2Label", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomNumber2LabelNull: Self = StObject.set(x, "deviceCustomNumber2Label", null)
      
      inline def setDeviceCustomNumber2LabelUndefined: Self = StObject.set(x, "deviceCustomNumber2Label", js.undefined)
      
      inline def setDeviceCustomNumber2Null: Self = StObject.set(x, "DeviceCustomNumber2", null)
      
      inline def setDeviceCustomNumber2Undefined: Self = StObject.set(x, "DeviceCustomNumber2", js.undefined)
      
      inline def setDeviceCustomNumber3(value: Double): Self = StObject.set(x, "deviceCustomNumber3", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomNumber3Label(value: String): Self = StObject.set(x, "deviceCustomNumber3Label", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomNumber3LabelNull: Self = StObject.set(x, "deviceCustomNumber3Label", null)
      
      inline def setDeviceCustomNumber3LabelUndefined: Self = StObject.set(x, "deviceCustomNumber3Label", js.undefined)
      
      inline def setDeviceCustomNumber3Null: Self = StObject.set(x, "deviceCustomNumber3", null)
      
      inline def setDeviceCustomNumber3Undefined: Self = StObject.set(x, "deviceCustomNumber3", js.undefined)
      
      inline def setDeviceCustomString1(value: String): Self = StObject.set(x, "deviceCustomString1", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString1Label(value: String): Self = StObject.set(x, "deviceCustomString1Label", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString1LabelNull: Self = StObject.set(x, "deviceCustomString1Label", null)
      
      inline def setDeviceCustomString1LabelUndefined: Self = StObject.set(x, "deviceCustomString1Label", js.undefined)
      
      inline def setDeviceCustomString1Null: Self = StObject.set(x, "deviceCustomString1", null)
      
      inline def setDeviceCustomString1Undefined: Self = StObject.set(x, "deviceCustomString1", js.undefined)
      
      inline def setDeviceCustomString2(value: String): Self = StObject.set(x, "deviceCustomString2", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString2Label(value: String): Self = StObject.set(x, "deviceCustomString2Label", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString2LabelNull: Self = StObject.set(x, "deviceCustomString2Label", null)
      
      inline def setDeviceCustomString2LabelUndefined: Self = StObject.set(x, "deviceCustomString2Label", js.undefined)
      
      inline def setDeviceCustomString2Null: Self = StObject.set(x, "deviceCustomString2", null)
      
      inline def setDeviceCustomString2Undefined: Self = StObject.set(x, "deviceCustomString2", js.undefined)
      
      inline def setDeviceCustomString3(value: String): Self = StObject.set(x, "deviceCustomString3", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString3Label(value: String): Self = StObject.set(x, "deviceCustomString3Label", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString3LabelNull: Self = StObject.set(x, "deviceCustomString3Label", null)
      
      inline def setDeviceCustomString3LabelUndefined: Self = StObject.set(x, "deviceCustomString3Label", js.undefined)
      
      inline def setDeviceCustomString3Null: Self = StObject.set(x, "deviceCustomString3", null)
      
      inline def setDeviceCustomString3Undefined: Self = StObject.set(x, "deviceCustomString3", js.undefined)
      
      inline def setDeviceCustomString4(value: String): Self = StObject.set(x, "deviceCustomString4", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString4Label(value: String): Self = StObject.set(x, "deviceCustomString4Label", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString4LabelNull: Self = StObject.set(x, "deviceCustomString4Label", null)
      
      inline def setDeviceCustomString4LabelUndefined: Self = StObject.set(x, "deviceCustomString4Label", js.undefined)
      
      inline def setDeviceCustomString4Null: Self = StObject.set(x, "deviceCustomString4", null)
      
      inline def setDeviceCustomString4Undefined: Self = StObject.set(x, "deviceCustomString4", js.undefined)
      
      inline def setDeviceCustomString5(value: String): Self = StObject.set(x, "deviceCustomString5", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString5Label(value: String): Self = StObject.set(x, "deviceCustomString5Label", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString5LabelNull: Self = StObject.set(x, "deviceCustomString5Label", null)
      
      inline def setDeviceCustomString5LabelUndefined: Self = StObject.set(x, "deviceCustomString5Label", js.undefined)
      
      inline def setDeviceCustomString5Null: Self = StObject.set(x, "deviceCustomString5", null)
      
      inline def setDeviceCustomString5Undefined: Self = StObject.set(x, "deviceCustomString5", js.undefined)
      
      inline def setDeviceCustomString6(value: String): Self = StObject.set(x, "deviceCustomString6", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString6Label(value: String): Self = StObject.set(x, "deviceCustomString6Label", value.asInstanceOf[js.Any])
      
      inline def setDeviceCustomString6LabelNull: Self = StObject.set(x, "deviceCustomString6Label", null)
      
      inline def setDeviceCustomString6LabelUndefined: Self = StObject.set(x, "deviceCustomString6Label", js.undefined)
      
      inline def setDeviceCustomString6Null: Self = StObject.set(x, "deviceCustomString6", null)
      
      inline def setDeviceCustomString6Undefined: Self = StObject.set(x, "deviceCustomString6", js.undefined)
      
      inline def setDeviceDirection(value: Double): Self = StObject.set(x, "deviceDirection", value.asInstanceOf[js.Any])
      
      inline def setDeviceDirectionNull: Self = StObject.set(x, "deviceDirection", null)
      
      inline def setDeviceDirectionUndefined: Self = StObject.set(x, "deviceDirection", js.undefined)
      
      inline def setDeviceDnsDomain(value: String): Self = StObject.set(x, "deviceDnsDomain", value.asInstanceOf[js.Any])
      
      inline def setDeviceDnsDomainNull: Self = StObject.set(x, "deviceDnsDomain", null)
      
      inline def setDeviceDnsDomainUndefined: Self = StObject.set(x, "deviceDnsDomain", js.undefined)
      
      inline def setDeviceEventCategory(value: String): Self = StObject.set(x, "deviceEventCategory", value.asInstanceOf[js.Any])
      
      inline def setDeviceEventCategoryNull: Self = StObject.set(x, "deviceEventCategory", null)
      
      inline def setDeviceEventCategoryUndefined: Self = StObject.set(x, "deviceEventCategory", js.undefined)
      
      inline def setDeviceExternalId(value: String): Self = StObject.set(x, "deviceExternalId", value.asInstanceOf[js.Any])
      
      inline def setDeviceExternalIdNull: Self = StObject.set(x, "deviceExternalId", null)
      
      inline def setDeviceExternalIdUndefined: Self = StObject.set(x, "deviceExternalId", js.undefined)
      
      inline def setDeviceFacility(value: String): Self = StObject.set(x, "deviceFacility", value.asInstanceOf[js.Any])
      
      inline def setDeviceFacilityNull: Self = StObject.set(x, "deviceFacility", null)
      
      inline def setDeviceFacilityUndefined: Self = StObject.set(x, "deviceFacility", js.undefined)
      
      inline def setDeviceHostName(value: String): Self = StObject.set(x, "deviceHostName", value.asInstanceOf[js.Any])
      
      inline def setDeviceHostNameNull: Self = StObject.set(x, "deviceHostName", null)
      
      inline def setDeviceHostNameUndefined: Self = StObject.set(x, "deviceHostName", js.undefined)
      
      inline def setDeviceInboundInterface(value: String): Self = StObject.set(x, "deviceInboundInterface", value.asInstanceOf[js.Any])
      
      inline def setDeviceInboundInterfaceNull: Self = StObject.set(x, "deviceInboundInterface", null)
      
      inline def setDeviceInboundInterfaceUndefined: Self = StObject.set(x, "deviceInboundInterface", js.undefined)
      
      inline def setDeviceMacAddress(value: String): Self = StObject.set(x, "deviceMacAddress", value.asInstanceOf[js.Any])
      
      inline def setDeviceMacAddressNull: Self = StObject.set(x, "deviceMacAddress", null)
      
      inline def setDeviceMacAddressUndefined: Self = StObject.set(x, "deviceMacAddress", js.undefined)
      
      inline def setDeviceNtDomain(value: String): Self = StObject.set(x, "deviceNtDomain", value.asInstanceOf[js.Any])
      
      inline def setDeviceNtDomainNull: Self = StObject.set(x, "deviceNtDomain", null)
      
      inline def setDeviceNtDomainUndefined: Self = StObject.set(x, "deviceNtDomain", js.undefined)
      
      inline def setDeviceOutboundInterface(value: String): Self = StObject.set(x, "deviceOutboundInterface", value.asInstanceOf[js.Any])
      
      inline def setDeviceOutboundInterfaceNull: Self = StObject.set(x, "deviceOutboundInterface", null)
      
      inline def setDeviceOutboundInterfaceUndefined: Self = StObject.set(x, "deviceOutboundInterface", js.undefined)
      
      inline def setDevicePayloadId(value: String): Self = StObject.set(x, "devicePayloadId", value.asInstanceOf[js.Any])
      
      inline def setDevicePayloadIdNull: Self = StObject.set(x, "devicePayloadId", null)
      
      inline def setDevicePayloadIdUndefined: Self = StObject.set(x, "devicePayloadId", js.undefined)
      
      inline def setDeviceProcessId(value: Double): Self = StObject.set(x, "deviceProcessId", value.asInstanceOf[js.Any])
      
      inline def setDeviceProcessIdNull: Self = StObject.set(x, "deviceProcessId", null)
      
      inline def setDeviceProcessIdUndefined: Self = StObject.set(x, "deviceProcessId", js.undefined)
      
      inline def setDeviceProcessName(value: String): Self = StObject.set(x, "deviceProcessName", value.asInstanceOf[js.Any])
      
      inline def setDeviceProcessNameNull: Self = StObject.set(x, "deviceProcessName", null)
      
      inline def setDeviceProcessNameUndefined: Self = StObject.set(x, "deviceProcessName", js.undefined)
      
      inline def setDeviceReceiptTime(value: String): Self = StObject.set(x, "deviceReceiptTime", value.asInstanceOf[js.Any])
      
      inline def setDeviceReceiptTimeNull: Self = StObject.set(x, "deviceReceiptTime", null)
      
      inline def setDeviceReceiptTimeUndefined: Self = StObject.set(x, "deviceReceiptTime", js.undefined)
      
      inline def setDeviceTimeZone(value: String): Self = StObject.set(x, "deviceTimeZone", value.asInstanceOf[js.Any])
      
      inline def setDeviceTimeZoneNull: Self = StObject.set(x, "deviceTimeZone", null)
      
      inline def setDeviceTimeZoneUndefined: Self = StObject.set(x, "deviceTimeZone", js.undefined)
      
      inline def setDeviceTranslatedAddress(value: String): Self = StObject.set(x, "deviceTranslatedAddress", value.asInstanceOf[js.Any])
      
      inline def setDeviceTranslatedAddressNull: Self = StObject.set(x, "deviceTranslatedAddress", null)
      
      inline def setDeviceTranslatedAddressUndefined: Self = StObject.set(x, "deviceTranslatedAddress", js.undefined)
      
      inline def `setDeviceTranslatedZone ExternalID`(value: String): Self = StObject.set(x, "deviceTranslatedZone ExternalID", value.asInstanceOf[js.Any])
      
      inline def `setDeviceTranslatedZone ExternalIDNull`: Self = StObject.set(x, "deviceTranslatedZone ExternalID", null)
      
      inline def `setDeviceTranslatedZone ExternalIDUndefined`: Self = StObject.set(x, "deviceTranslatedZone ExternalID", js.undefined)
      
      inline def setDeviceTranslatedZoneURI(value: String): Self = StObject.set(x, "deviceTranslatedZoneURI", value.asInstanceOf[js.Any])
      
      inline def setDeviceTranslatedZoneURINull: Self = StObject.set(x, "deviceTranslatedZoneURI", null)
      
      inline def setDeviceTranslatedZoneURIUndefined: Self = StObject.set(x, "deviceTranslatedZoneURI", js.undefined)
      
      inline def setDeviceZoneExternalID(value: String): Self = StObject.set(x, "deviceZoneExternalID", value.asInstanceOf[js.Any])
      
      inline def setDeviceZoneExternalIDNull: Self = StObject.set(x, "deviceZoneExternalID", null)
      
      inline def setDeviceZoneExternalIDUndefined: Self = StObject.set(x, "deviceZoneExternalID", js.undefined)
      
      inline def setDeviceZoneURI(value: String): Self = StObject.set(x, "deviceZoneURI", value.asInstanceOf[js.Any])
      
      inline def setDeviceZoneURINull: Self = StObject.set(x, "deviceZoneURI", null)
      
      inline def setDeviceZoneURIUndefined: Self = StObject.set(x, "deviceZoneURI", js.undefined)
      
      inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setEventIdNull: Self = StObject.set(x, "eventId", null)
      
      inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
      
      inline def setEventOutcome(value: String): Self = StObject.set(x, "eventOutcome", value.asInstanceOf[js.Any])
      
      inline def setEventOutcomeNull: Self = StObject.set(x, "eventOutcome", null)
      
      inline def setEventOutcomeUndefined: Self = StObject.set(x, "eventOutcome", js.undefined)
      
      inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
      
      inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
      
      inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
      
      inline def setFileCreateTime(value: String): Self = StObject.set(x, "fileCreateTime", value.asInstanceOf[js.Any])
      
      inline def setFileCreateTimeNull: Self = StObject.set(x, "fileCreateTime", null)
      
      inline def setFileCreateTimeUndefined: Self = StObject.set(x, "fileCreateTime", js.undefined)
      
      inline def setFileHash(value: String): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
      
      inline def setFileHashNull: Self = StObject.set(x, "fileHash", null)
      
      inline def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
      
      inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
      
      inline def setFileIdNull: Self = StObject.set(x, "fileId", null)
      
      inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
      
      inline def setFileModificationTime(value: String): Self = StObject.set(x, "fileModificationTime", value.asInstanceOf[js.Any])
      
      inline def setFileModificationTimeNull: Self = StObject.set(x, "fileModificationTime", null)
      
      inline def setFileModificationTimeUndefined: Self = StObject.set(x, "fileModificationTime", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setFilePermission(value: String): Self = StObject.set(x, "filePermission", value.asInstanceOf[js.Any])
      
      inline def setFilePermissionNull: Self = StObject.set(x, "filePermission", null)
      
      inline def setFilePermissionUndefined: Self = StObject.set(x, "filePermission", js.undefined)
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeNull: Self = StObject.set(x, "fileSize", null)
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setFileTypeNull: Self = StObject.set(x, "fileType", null)
      
      inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFlexDate1(value: String): Self = StObject.set(x, "flexDate1", value.asInstanceOf[js.Any])
      
      inline def setFlexDate1Label(value: String): Self = StObject.set(x, "flexDate1Label", value.asInstanceOf[js.Any])
      
      inline def setFlexDate1LabelNull: Self = StObject.set(x, "flexDate1Label", null)
      
      inline def setFlexDate1LabelUndefined: Self = StObject.set(x, "flexDate1Label", js.undefined)
      
      inline def setFlexDate1Null: Self = StObject.set(x, "flexDate1", null)
      
      inline def setFlexDate1Undefined: Self = StObject.set(x, "flexDate1", js.undefined)
      
      inline def setFlexString1(value: String): Self = StObject.set(x, "flexString1", value.asInstanceOf[js.Any])
      
      inline def setFlexString1Label(value: String): Self = StObject.set(x, "flexString1Label", value.asInstanceOf[js.Any])
      
      inline def setFlexString1LabelNull: Self = StObject.set(x, "flexString1Label", null)
      
      inline def setFlexString1LabelUndefined: Self = StObject.set(x, "flexString1Label", js.undefined)
      
      inline def setFlexString1Null: Self = StObject.set(x, "flexString1", null)
      
      inline def setFlexString1Undefined: Self = StObject.set(x, "flexString1", js.undefined)
      
      inline def setFlexString2(value: String): Self = StObject.set(x, "flexString2", value.asInstanceOf[js.Any])
      
      inline def setFlexString2Label(value: String): Self = StObject.set(x, "flexString2Label", value.asInstanceOf[js.Any])
      
      inline def setFlexString2LabelNull: Self = StObject.set(x, "flexString2Label", null)
      
      inline def setFlexString2LabelUndefined: Self = StObject.set(x, "flexString2Label", js.undefined)
      
      inline def setFlexString2Null: Self = StObject.set(x, "flexString2", null)
      
      inline def setFlexString2Undefined: Self = StObject.set(x, "flexString2", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOldFileCreateTime(value: String): Self = StObject.set(x, "oldFileCreateTime", value.asInstanceOf[js.Any])
      
      inline def setOldFileCreateTimeNull: Self = StObject.set(x, "oldFileCreateTime", null)
      
      inline def setOldFileCreateTimeUndefined: Self = StObject.set(x, "oldFileCreateTime", js.undefined)
      
      inline def setOldFileHash(value: String): Self = StObject.set(x, "oldFileHash", value.asInstanceOf[js.Any])
      
      inline def setOldFileHashNull: Self = StObject.set(x, "oldFileHash", null)
      
      inline def setOldFileHashUndefined: Self = StObject.set(x, "oldFileHash", js.undefined)
      
      inline def setOldFileId(value: String): Self = StObject.set(x, "oldFileId", value.asInstanceOf[js.Any])
      
      inline def setOldFileIdNull: Self = StObject.set(x, "oldFileId", null)
      
      inline def setOldFileIdUndefined: Self = StObject.set(x, "oldFileId", js.undefined)
      
      inline def setOldFileModificationTime(value: String): Self = StObject.set(x, "oldFileModificationTime", value.asInstanceOf[js.Any])
      
      inline def setOldFileModificationTimeNull: Self = StObject.set(x, "oldFileModificationTime", null)
      
      inline def setOldFileModificationTimeUndefined: Self = StObject.set(x, "oldFileModificationTime", js.undefined)
      
      inline def setOldFileName(value: String): Self = StObject.set(x, "oldFileName", value.asInstanceOf[js.Any])
      
      inline def setOldFileNameNull: Self = StObject.set(x, "oldFileName", null)
      
      inline def setOldFileNameUndefined: Self = StObject.set(x, "oldFileName", js.undefined)
      
      inline def setOldFilePath(value: String): Self = StObject.set(x, "oldFilePath", value.asInstanceOf[js.Any])
      
      inline def setOldFilePathNull: Self = StObject.set(x, "oldFilePath", null)
      
      inline def setOldFilePathUndefined: Self = StObject.set(x, "oldFilePath", js.undefined)
      
      inline def setOldFileSize(value: Double): Self = StObject.set(x, "oldFileSize", value.asInstanceOf[js.Any])
      
      inline def setOldFileSizeNull: Self = StObject.set(x, "oldFileSize", null)
      
      inline def setOldFileSizeUndefined: Self = StObject.set(x, "oldFileSize", js.undefined)
      
      inline def setOldFileType(value: String): Self = StObject.set(x, "oldFileType", value.asInstanceOf[js.Any])
      
      inline def setOldFileTypeNull: Self = StObject.set(x, "oldFileType", null)
      
      inline def setOldFileTypeUndefined: Self = StObject.set(x, "oldFileType", js.undefined)
      
      inline def setRawEvent(value: String): Self = StObject.set(x, "rawEvent", value.asInstanceOf[js.Any])
      
      inline def setRawEventNull: Self = StObject.set(x, "rawEvent", null)
      
      inline def setRawEventUndefined: Self = StObject.set(x, "rawEvent", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
      
      inline def setReasonNull: Self = StObject.set(x, "Reason", null)
      
      inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
      
      inline def setRequestClientApplication(value: String): Self = StObject.set(x, "requestClientApplication", value.asInstanceOf[js.Any])
      
      inline def setRequestClientApplicationNull: Self = StObject.set(x, "requestClientApplication", null)
      
      inline def setRequestClientApplicationUndefined: Self = StObject.set(x, "requestClientApplication", js.undefined)
      
      inline def setRequestContext(value: String): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      inline def setRequestContextNull: Self = StObject.set(x, "requestContext", null)
      
      inline def setRequestContextUndefined: Self = StObject.set(x, "requestContext", js.undefined)
      
      inline def setRequestCookies(value: String): Self = StObject.set(x, "requestCookies", value.asInstanceOf[js.Any])
      
      inline def setRequestCookiesNull: Self = StObject.set(x, "requestCookies", null)
      
      inline def setRequestCookiesUndefined: Self = StObject.set(x, "requestCookies", js.undefined)
      
      inline def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
      
      inline def setRequestMethodNull: Self = StObject.set(x, "requestMethod", null)
      
      inline def setRequestMethodUndefined: Self = StObject.set(x, "requestMethod", js.undefined)
      
      inline def setRequestUrl(value: String): Self = StObject.set(x, "requestUrl", value.asInstanceOf[js.Any])
      
      inline def setRequestUrlNull: Self = StObject.set(x, "requestUrl", null)
      
      inline def setRequestUrlUndefined: Self = StObject.set(x, "requestUrl", js.undefined)
      
      inline def setSourceAddress(value: String): Self = StObject.set(x, "sourceAddress", value.asInstanceOf[js.Any])
      
      inline def setSourceAddressNull: Self = StObject.set(x, "sourceAddress", null)
      
      inline def setSourceAddressUndefined: Self = StObject.set(x, "sourceAddress", js.undefined)
      
      inline def setSourceDnsDomain(value: String): Self = StObject.set(x, "sourceDnsDomain", value.asInstanceOf[js.Any])
      
      inline def setSourceDnsDomainNull: Self = StObject.set(x, "sourceDnsDomain", null)
      
      inline def setSourceDnsDomainUndefined: Self = StObject.set(x, "sourceDnsDomain", js.undefined)
      
      inline def setSourceGeoLatitude(value: Double): Self = StObject.set(x, "sourceGeoLatitude", value.asInstanceOf[js.Any])
      
      inline def setSourceGeoLatitudeNull: Self = StObject.set(x, "sourceGeoLatitude", null)
      
      inline def setSourceGeoLatitudeUndefined: Self = StObject.set(x, "sourceGeoLatitude", js.undefined)
      
      inline def setSourceGeoLongitude(value: Double): Self = StObject.set(x, "sourceGeoLongitude", value.asInstanceOf[js.Any])
      
      inline def setSourceGeoLongitudeNull: Self = StObject.set(x, "sourceGeoLongitude", null)
      
      inline def setSourceGeoLongitudeUndefined: Self = StObject.set(x, "sourceGeoLongitude", js.undefined)
      
      inline def setSourceHostName(value: String): Self = StObject.set(x, "sourceHostName", value.asInstanceOf[js.Any])
      
      inline def setSourceHostNameNull: Self = StObject.set(x, "sourceHostName", null)
      
      inline def setSourceHostNameUndefined: Self = StObject.set(x, "sourceHostName", js.undefined)
      
      inline def setSourceMacAddress(value: String): Self = StObject.set(x, "sourceMacAddress", value.asInstanceOf[js.Any])
      
      inline def setSourceMacAddressNull: Self = StObject.set(x, "sourceMacAddress", null)
      
      inline def setSourceMacAddressUndefined: Self = StObject.set(x, "sourceMacAddress", js.undefined)
      
      inline def setSourceNtDomain(value: String): Self = StObject.set(x, "sourceNtDomain", value.asInstanceOf[js.Any])
      
      inline def setSourceNtDomainNull: Self = StObject.set(x, "sourceNtDomain", null)
      
      inline def setSourceNtDomainUndefined: Self = StObject.set(x, "sourceNtDomain", js.undefined)
      
      inline def setSourcePort(value: Double): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
      
      inline def setSourcePortNull: Self = StObject.set(x, "sourcePort", null)
      
      inline def setSourcePortUndefined: Self = StObject.set(x, "sourcePort", js.undefined)
      
      inline def setSourceProcessId(value: Double): Self = StObject.set(x, "sourceProcessId", value.asInstanceOf[js.Any])
      
      inline def setSourceProcessIdNull: Self = StObject.set(x, "sourceProcessId", null)
      
      inline def setSourceProcessIdUndefined: Self = StObject.set(x, "sourceProcessId", js.undefined)
      
      inline def setSourceProcessName(value: String): Self = StObject.set(x, "sourceProcessName", value.asInstanceOf[js.Any])
      
      inline def setSourceProcessNameNull: Self = StObject.set(x, "sourceProcessName", null)
      
      inline def setSourceProcessNameUndefined: Self = StObject.set(x, "sourceProcessName", js.undefined)
      
      inline def setSourceServiceName(value: String): Self = StObject.set(x, "sourceServiceName", value.asInstanceOf[js.Any])
      
      inline def setSourceServiceNameNull: Self = StObject.set(x, "sourceServiceName", null)
      
      inline def setSourceServiceNameUndefined: Self = StObject.set(x, "sourceServiceName", js.undefined)
      
      inline def setSourceTranslatedAddress(value: String): Self = StObject.set(x, "sourceTranslatedAddress", value.asInstanceOf[js.Any])
      
      inline def setSourceTranslatedAddressNull: Self = StObject.set(x, "sourceTranslatedAddress", null)
      
      inline def setSourceTranslatedAddressUndefined: Self = StObject.set(x, "sourceTranslatedAddress", js.undefined)
      
      inline def setSourceTranslatedPort(value: Double): Self = StObject.set(x, "sourceTranslatedPort", value.asInstanceOf[js.Any])
      
      inline def setSourceTranslatedPortNull: Self = StObject.set(x, "sourceTranslatedPort", null)
      
      inline def setSourceTranslatedPortUndefined: Self = StObject.set(x, "sourceTranslatedPort", js.undefined)
      
      inline def `setSourceTranslatedZone ExternalID`(value: String): Self = StObject.set(x, "sourceTranslatedZone ExternalID", value.asInstanceOf[js.Any])
      
      inline def `setSourceTranslatedZone ExternalIDNull`: Self = StObject.set(x, "sourceTranslatedZone ExternalID", null)
      
      inline def `setSourceTranslatedZone ExternalIDUndefined`: Self = StObject.set(x, "sourceTranslatedZone ExternalID", js.undefined)
      
      inline def setSourceTranslatedZoneURI(value: String): Self = StObject.set(x, "sourceTranslatedZoneURI", value.asInstanceOf[js.Any])
      
      inline def setSourceTranslatedZoneURINull: Self = StObject.set(x, "sourceTranslatedZoneURI", null)
      
      inline def setSourceTranslatedZoneURIUndefined: Self = StObject.set(x, "sourceTranslatedZoneURI", js.undefined)
      
      inline def setSourceUserId(value: String): Self = StObject.set(x, "sourceUserId", value.asInstanceOf[js.Any])
      
      inline def setSourceUserIdNull: Self = StObject.set(x, "sourceUserId", null)
      
      inline def setSourceUserIdUndefined: Self = StObject.set(x, "sourceUserId", js.undefined)
      
      inline def setSourceUserName(value: String): Self = StObject.set(x, "sourceUserName", value.asInstanceOf[js.Any])
      
      inline def setSourceUserNameNull: Self = StObject.set(x, "sourceUserName", null)
      
      inline def setSourceUserNameUndefined: Self = StObject.set(x, "sourceUserName", js.undefined)
      
      inline def setSourceUserPrivileges(value: String): Self = StObject.set(x, "sourceUserPrivileges", value.asInstanceOf[js.Any])
      
      inline def setSourceUserPrivilegesNull: Self = StObject.set(x, "sourceUserPrivileges", null)
      
      inline def setSourceUserPrivilegesUndefined: Self = StObject.set(x, "sourceUserPrivileges", js.undefined)
      
      inline def setSourceZoneExternalID(value: String): Self = StObject.set(x, "sourceZoneExternalID", value.asInstanceOf[js.Any])
      
      inline def setSourceZoneExternalIDNull: Self = StObject.set(x, "sourceZoneExternalID", null)
      
      inline def setSourceZoneExternalIDUndefined: Self = StObject.set(x, "sourceZoneExternalID", js.undefined)
      
      inline def setSourceZoneURI(value: String): Self = StObject.set(x, "sourceZoneURI", value.asInstanceOf[js.Any])
      
      inline def setSourceZoneURINull: Self = StObject.set(x, "sourceZoneURI", null)
      
      inline def setSourceZoneURIUndefined: Self = StObject.set(x, "sourceZoneURI", js.undefined)
      
      inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setTransportProtocol(value: String): Self = StObject.set(x, "transportProtocol", value.asInstanceOf[js.Any])
      
      inline def setTransportProtocolNull: Self = StObject.set(x, "transportProtocol", null)
      
      inline def setTransportProtocolUndefined: Self = StObject.set(x, "transportProtocol", js.undefined)
      
      inline def setType(value: ExtensionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * The eventId of the system that generated the event being reported.
      *
      * @default 'Unknown'
      */
    var deviceEventClassId: js.UndefOr[String] = js.undefined
    
    /**
      * The product name of the system that generated the event being reported.
      *
      * @default 'Unknown'
      */
    var deviceProduct: js.UndefOr[String] = js.undefined
    
    /**
      * The vendor of the system that generated the event being reported.
      *
      * @default 'Unknown'
      */
    var deviceVendor: js.UndefOr[String] = js.undefined
    
    /**
      * The version name of the system that generated the event being reported.
      *
      * @default 'Unknown'
      */
    var deviceVersion: js.UndefOr[String] = js.undefined
    
    /**
      * Any CEF Key=Value extensions.
      *
      * @default {}
      */
    var extensions: js.UndefOr[Extensions] = js.undefined
    
    /**
      * Name of the service generating the notice.
      *
      * @default 'Unknown'
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A Syslog server connection that should be used to send messages directly from this class.
      *
      * @default false
      */
    var server: js.UndefOr[typings.syslogPro.mod.Syslog.Options | `false`] = js.undefined
    
    /**
      * Severity of the notification.
      *
      * @default 'Unknown'
      */
    var severity: js.UndefOr[Severity] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDeviceEventClassId(value: String): Self = StObject.set(x, "deviceEventClassId", value.asInstanceOf[js.Any])
      
      inline def setDeviceEventClassIdUndefined: Self = StObject.set(x, "deviceEventClassId", js.undefined)
      
      inline def setDeviceProduct(value: String): Self = StObject.set(x, "deviceProduct", value.asInstanceOf[js.Any])
      
      inline def setDeviceProductUndefined: Self = StObject.set(x, "deviceProduct", js.undefined)
      
      inline def setDeviceVendor(value: String): Self = StObject.set(x, "deviceVendor", value.asInstanceOf[js.Any])
      
      inline def setDeviceVendorUndefined: Self = StObject.set(x, "deviceVendor", js.undefined)
      
      inline def setDeviceVersion(value: String): Self = StObject.set(x, "deviceVersion", value.asInstanceOf[js.Any])
      
      inline def setDeviceVersionUndefined: Self = StObject.set(x, "deviceVersion", js.undefined)
      
      inline def setExtensions(value: Extensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setServer(value: typings.syslogPro.mod.Syslog.Options | `false`): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.syslogPro.syslogProInts.`0`
    - typings.syslogPro.syslogProInts.`1`
    - typings.syslogPro.syslogProInts.`2`
    - typings.syslogPro.syslogProInts.`3`
    - typings.syslogPro.syslogProInts.`4`
    - typings.syslogPro.syslogProInts.`5`
    - typings.syslogPro.syslogProInts.`6`
    - typings.syslogPro.syslogProInts.`7`
    - typings.syslogPro.syslogProInts.`8`
    - typings.syslogPro.syslogProInts.`9`
    - typings.syslogPro.syslogProInts.`10`
    - typings.syslogPro.syslogProStrings.Unknown
    - typings.syslogPro.syslogProStrings.Low
    - typings.syslogPro.syslogProStrings.Medium
    - typings.syslogPro.syslogProStrings.High
    - typings.syslogPro.syslogProStrings.`Very-High`
  */
  trait Severity extends StObject
  object Severity {
    
    inline def `0`: typings.syslogPro.syslogProInts.`0` = 0.asInstanceOf[typings.syslogPro.syslogProInts.`0`]
    
    inline def `1`: typings.syslogPro.syslogProInts.`1` = 1.asInstanceOf[typings.syslogPro.syslogProInts.`1`]
    
    inline def `10`: typings.syslogPro.syslogProInts.`10` = 10.asInstanceOf[typings.syslogPro.syslogProInts.`10`]
    
    inline def `2`: typings.syslogPro.syslogProInts.`2` = 2.asInstanceOf[typings.syslogPro.syslogProInts.`2`]
    
    inline def `3`: typings.syslogPro.syslogProInts.`3` = 3.asInstanceOf[typings.syslogPro.syslogProInts.`3`]
    
    inline def `4`: typings.syslogPro.syslogProInts.`4` = 4.asInstanceOf[typings.syslogPro.syslogProInts.`4`]
    
    inline def `5`: typings.syslogPro.syslogProInts.`5` = 5.asInstanceOf[typings.syslogPro.syslogProInts.`5`]
    
    inline def `6`: typings.syslogPro.syslogProInts.`6` = 6.asInstanceOf[typings.syslogPro.syslogProInts.`6`]
    
    inline def `7`: typings.syslogPro.syslogProInts.`7` = 7.asInstanceOf[typings.syslogPro.syslogProInts.`7`]
    
    inline def `8`: typings.syslogPro.syslogProInts.`8` = 8.asInstanceOf[typings.syslogPro.syslogProInts.`8`]
    
    inline def `9`: typings.syslogPro.syslogProInts.`9` = 9.asInstanceOf[typings.syslogPro.syslogProInts.`9`]
    
    inline def High: typings.syslogPro.syslogProStrings.High = "High".asInstanceOf[typings.syslogPro.syslogProStrings.High]
    
    inline def Low: typings.syslogPro.syslogProStrings.Low = "Low".asInstanceOf[typings.syslogPro.syslogProStrings.Low]
    
    inline def Medium: typings.syslogPro.syslogProStrings.Medium = "Medium".asInstanceOf[typings.syslogPro.syslogProStrings.Medium]
    
    inline def Unknown: typings.syslogPro.syslogProStrings.Unknown = "Unknown".asInstanceOf[typings.syslogPro.syslogProStrings.Unknown]
    
    inline def `Very-High`: typings.syslogPro.syslogProStrings.`Very-High` = "Very-High".asInstanceOf[typings.syslogPro.syslogProStrings.`Very-High`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.syslogPro.syslogProInts.`0`
    - typings.syslogPro.syslogProInts.`1`
    - typings.syslogPro.syslogProInts.`2`
    - typings.syslogPro.syslogProInts.`3`
    - typings.syslogPro.syslogProInts.`4`
    - typings.syslogPro.syslogProInts.`5`
    - typings.syslogPro.syslogProInts.`6`
    - typings.syslogPro.syslogProInts.`7`
    - typings.syslogPro.syslogProInts.`8`
    - typings.syslogPro.syslogProInts.`9`
    - typings.syslogPro.syslogProInts.`10`
  */
  trait SeverityNumber extends StObject
  object SeverityNumber {
    
    inline def `0`: typings.syslogPro.syslogProInts.`0` = 0.asInstanceOf[typings.syslogPro.syslogProInts.`0`]
    
    inline def `1`: typings.syslogPro.syslogProInts.`1` = 1.asInstanceOf[typings.syslogPro.syslogProInts.`1`]
    
    inline def `10`: typings.syslogPro.syslogProInts.`10` = 10.asInstanceOf[typings.syslogPro.syslogProInts.`10`]
    
    inline def `2`: typings.syslogPro.syslogProInts.`2` = 2.asInstanceOf[typings.syslogPro.syslogProInts.`2`]
    
    inline def `3`: typings.syslogPro.syslogProInts.`3` = 3.asInstanceOf[typings.syslogPro.syslogProInts.`3`]
    
    inline def `4`: typings.syslogPro.syslogProInts.`4` = 4.asInstanceOf[typings.syslogPro.syslogProInts.`4`]
    
    inline def `5`: typings.syslogPro.syslogProInts.`5` = 5.asInstanceOf[typings.syslogPro.syslogProInts.`5`]
    
    inline def `6`: typings.syslogPro.syslogProInts.`6` = 6.asInstanceOf[typings.syslogPro.syslogProInts.`6`]
    
    inline def `7`: typings.syslogPro.syslogProInts.`7` = 7.asInstanceOf[typings.syslogPro.syslogProInts.`7`]
    
    inline def `8`: typings.syslogPro.syslogProInts.`8` = 8.asInstanceOf[typings.syslogPro.syslogProInts.`8`]
    
    inline def `9`: typings.syslogPro.syslogProInts.`9` = 9.asInstanceOf[typings.syslogPro.syslogProInts.`9`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.syslogPro.syslogProStrings.Unknown
    - typings.syslogPro.syslogProStrings.Low
    - typings.syslogPro.syslogProStrings.Medium
    - typings.syslogPro.syslogProStrings.High
    - typings.syslogPro.syslogProStrings.`Very-High`
  */
  trait SeverityString extends StObject
  object SeverityString {
    
    inline def High: typings.syslogPro.syslogProStrings.High = "High".asInstanceOf[typings.syslogPro.syslogProStrings.High]
    
    inline def Low: typings.syslogPro.syslogProStrings.Low = "Low".asInstanceOf[typings.syslogPro.syslogProStrings.Low]
    
    inline def Medium: typings.syslogPro.syslogProStrings.Medium = "Medium".asInstanceOf[typings.syslogPro.syslogProStrings.Medium]
    
    inline def Unknown: typings.syslogPro.syslogProStrings.Unknown = "Unknown".asInstanceOf[typings.syslogPro.syslogProStrings.Unknown]
    
    inline def `Very-High`: typings.syslogPro.syslogProStrings.`Very-High` = "Very-High".asInstanceOf[typings.syslogPro.syslogProStrings.`Very-High`]
  }
}
