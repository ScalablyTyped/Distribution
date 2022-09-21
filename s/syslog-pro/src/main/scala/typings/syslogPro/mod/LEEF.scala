package typings.syslogPro.mod

import org.scalablytyped.runtime.StringDictionary
import typings.syslogPro.mod.LEEF.Attributes
import typings.syslogPro.mod.LEEF.Options
import typings.syslogPro.syslogProBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("syslog-pro", "LEEF")
@js.native
/**
  * Construct a new LEEF formatting object with user options.
  */
open class LEEF ()
  extends StObject
     with Options {
  def this(options: Options) = this()
  
  @JSName("attributes")
  val attributes_LEEF: Attributes = js.native
  
  /**
    * Build a formatted message.
    *
    * @return The formatted message.
    */
  def buildMessage(): String = js.native
  
  @JSName("eventId")
  val eventId_LEEF: String = js.native
  
  @JSName("product")
  val product_LEEF: String = js.native
  
  /**
    * Send a LEEF formatted message.
    *
    * @param syslogOptions Syslog server options that should be used to send messages directly from this class.
    */
  def send(): js.Promise[String] = js.native
  def send(syslogOptions: typings.syslogPro.mod.Syslog.Options): js.Promise[String] = js.native
  @JSName("send")
  def send_false(syslogOptions: `false`): js.Promise[String] = js.native
  
  @JSName("server")
  val server_LEEF: js.UndefOr[Syslog] = js.native
  
  @JSName("syslogHeader")
  val syslogHeader_LEEF: Boolean = js.native
  
  @JSName("vendor")
  val vendor_LEEF: String = js.native
  
  @JSName("version")
  val version_LEEF: String = js.native
}
object LEEF {
  
  trait Attributes
    extends StObject
       with /* attrName */ StringDictionary[js.UndefOr[String | Null]] {
    
    var AttributeLimits: js.UndefOr[String | Null] = js.undefined
    
    var accountName: js.UndefOr[String | Null] = js.undefined
    
    var calCountryOrRegion: js.UndefOr[String | Null] = js.undefined
    
    var calLanguage: js.UndefOr[String | Null] = js.undefined
    
    var cat: js.UndefOr[String | Null] = js.undefined
    
    var devTime: js.UndefOr[String | Null] = js.undefined
    
    var devTimeFormat: js.UndefOr[String | Null] = js.undefined
    
    var domain: js.UndefOr[String | Null] = js.undefined
    
    var dst: js.UndefOr[String | Null] = js.undefined
    
    var dstBytes: js.UndefOr[String | Null] = js.undefined
    
    var dstMAC: js.UndefOr[String | Null] = js.undefined
    
    var dstPackets: js.UndefOr[String | Null] = js.undefined
    
    var dstPort: js.UndefOr[String | Null] = js.undefined
    
    var dstPostNAT: js.UndefOr[String | Null] = js.undefined
    
    var dstPostNATPort: js.UndefOr[String | Null] = js.undefined
    
    var dstPreNAT: js.UndefOr[String | Null] = js.undefined
    
    var dstPreNATPort: js.UndefOr[String | Null] = js.undefined
    
    var groupID: js.UndefOr[String | Null] = js.undefined
    
    var identGrpName: js.UndefOr[String | Null] = js.undefined
    
    var identHostName: js.UndefOr[String | Null] = js.undefined
    
    var identMAC: js.UndefOr[String | Null] = js.undefined
    
    var identNetBios: js.UndefOr[String | Null] = js.undefined
    
    var identSecondlp: js.UndefOr[String | Null] = js.undefined
    
    var identSrc: js.UndefOr[String | Null] = js.undefined
    
    var isLoginEvent: js.UndefOr[String | Null] = js.undefined
    
    var isLogoutEvent: js.UndefOr[String | Null] = js.undefined
    
    var policy: js.UndefOr[String | Null] = js.undefined
    
    var proto: js.UndefOr[String | Null] = js.undefined
    
    var realm: js.UndefOr[String | Null] = js.undefined
    
    var resource: js.UndefOr[String | Null] = js.undefined
    
    var role: js.UndefOr[String | Null] = js.undefined
    
    var sev: js.UndefOr[String | Null] = js.undefined
    
    var src: js.UndefOr[String | Null] = js.undefined
    
    var srcBytes: js.UndefOr[String | Null] = js.undefined
    
    var srcMAC: js.UndefOr[String | Null] = js.undefined
    
    var srcPackets: js.UndefOr[String | Null] = js.undefined
    
    var srcPort: js.UndefOr[String | Null] = js.undefined
    
    var srcPostNAT: js.UndefOr[String | Null] = js.undefined
    
    var srcPostNATPort: js.UndefOr[String | Null] = js.undefined
    
    var srcPreNAT: js.UndefOr[String | Null] = js.undefined
    
    var srcPreNATPort: js.UndefOr[String | Null] = js.undefined
    
    var totalPackets: js.UndefOr[String | Null] = js.undefined
    
    var url: js.UndefOr[String | Null] = js.undefined
    
    var usrName: js.UndefOr[String | Null] = js.undefined
    
    var vSrc: js.UndefOr[String | Null] = js.undefined
    
    var vSrcName: js.UndefOr[String | Null] = js.undefined
  }
  object Attributes {
    
    inline def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
      
      inline def setAccountNameNull: Self = StObject.set(x, "accountName", null)
      
      inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
      
      inline def setAttributeLimits(value: String): Self = StObject.set(x, "AttributeLimits", value.asInstanceOf[js.Any])
      
      inline def setAttributeLimitsNull: Self = StObject.set(x, "AttributeLimits", null)
      
      inline def setAttributeLimitsUndefined: Self = StObject.set(x, "AttributeLimits", js.undefined)
      
      inline def setCalCountryOrRegion(value: String): Self = StObject.set(x, "calCountryOrRegion", value.asInstanceOf[js.Any])
      
      inline def setCalCountryOrRegionNull: Self = StObject.set(x, "calCountryOrRegion", null)
      
      inline def setCalCountryOrRegionUndefined: Self = StObject.set(x, "calCountryOrRegion", js.undefined)
      
      inline def setCalLanguage(value: String): Self = StObject.set(x, "calLanguage", value.asInstanceOf[js.Any])
      
      inline def setCalLanguageNull: Self = StObject.set(x, "calLanguage", null)
      
      inline def setCalLanguageUndefined: Self = StObject.set(x, "calLanguage", js.undefined)
      
      inline def setCat(value: String): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
      
      inline def setCatNull: Self = StObject.set(x, "cat", null)
      
      inline def setCatUndefined: Self = StObject.set(x, "cat", js.undefined)
      
      inline def setDevTime(value: String): Self = StObject.set(x, "devTime", value.asInstanceOf[js.Any])
      
      inline def setDevTimeFormat(value: String): Self = StObject.set(x, "devTimeFormat", value.asInstanceOf[js.Any])
      
      inline def setDevTimeFormatNull: Self = StObject.set(x, "devTimeFormat", null)
      
      inline def setDevTimeFormatUndefined: Self = StObject.set(x, "devTimeFormat", js.undefined)
      
      inline def setDevTimeNull: Self = StObject.set(x, "devTime", null)
      
      inline def setDevTimeUndefined: Self = StObject.set(x, "devTime", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainNull: Self = StObject.set(x, "domain", null)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDst(value: String): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
      
      inline def setDstBytes(value: String): Self = StObject.set(x, "dstBytes", value.asInstanceOf[js.Any])
      
      inline def setDstBytesNull: Self = StObject.set(x, "dstBytes", null)
      
      inline def setDstBytesUndefined: Self = StObject.set(x, "dstBytes", js.undefined)
      
      inline def setDstMAC(value: String): Self = StObject.set(x, "dstMAC", value.asInstanceOf[js.Any])
      
      inline def setDstMACNull: Self = StObject.set(x, "dstMAC", null)
      
      inline def setDstMACUndefined: Self = StObject.set(x, "dstMAC", js.undefined)
      
      inline def setDstNull: Self = StObject.set(x, "dst", null)
      
      inline def setDstPackets(value: String): Self = StObject.set(x, "dstPackets", value.asInstanceOf[js.Any])
      
      inline def setDstPacketsNull: Self = StObject.set(x, "dstPackets", null)
      
      inline def setDstPacketsUndefined: Self = StObject.set(x, "dstPackets", js.undefined)
      
      inline def setDstPort(value: String): Self = StObject.set(x, "dstPort", value.asInstanceOf[js.Any])
      
      inline def setDstPortNull: Self = StObject.set(x, "dstPort", null)
      
      inline def setDstPortUndefined: Self = StObject.set(x, "dstPort", js.undefined)
      
      inline def setDstPostNAT(value: String): Self = StObject.set(x, "dstPostNAT", value.asInstanceOf[js.Any])
      
      inline def setDstPostNATNull: Self = StObject.set(x, "dstPostNAT", null)
      
      inline def setDstPostNATPort(value: String): Self = StObject.set(x, "dstPostNATPort", value.asInstanceOf[js.Any])
      
      inline def setDstPostNATPortNull: Self = StObject.set(x, "dstPostNATPort", null)
      
      inline def setDstPostNATPortUndefined: Self = StObject.set(x, "dstPostNATPort", js.undefined)
      
      inline def setDstPostNATUndefined: Self = StObject.set(x, "dstPostNAT", js.undefined)
      
      inline def setDstPreNAT(value: String): Self = StObject.set(x, "dstPreNAT", value.asInstanceOf[js.Any])
      
      inline def setDstPreNATNull: Self = StObject.set(x, "dstPreNAT", null)
      
      inline def setDstPreNATPort(value: String): Self = StObject.set(x, "dstPreNATPort", value.asInstanceOf[js.Any])
      
      inline def setDstPreNATPortNull: Self = StObject.set(x, "dstPreNATPort", null)
      
      inline def setDstPreNATPortUndefined: Self = StObject.set(x, "dstPreNATPort", js.undefined)
      
      inline def setDstPreNATUndefined: Self = StObject.set(x, "dstPreNAT", js.undefined)
      
      inline def setDstUndefined: Self = StObject.set(x, "dst", js.undefined)
      
      inline def setGroupID(value: String): Self = StObject.set(x, "groupID", value.asInstanceOf[js.Any])
      
      inline def setGroupIDNull: Self = StObject.set(x, "groupID", null)
      
      inline def setGroupIDUndefined: Self = StObject.set(x, "groupID", js.undefined)
      
      inline def setIdentGrpName(value: String): Self = StObject.set(x, "identGrpName", value.asInstanceOf[js.Any])
      
      inline def setIdentGrpNameNull: Self = StObject.set(x, "identGrpName", null)
      
      inline def setIdentGrpNameUndefined: Self = StObject.set(x, "identGrpName", js.undefined)
      
      inline def setIdentHostName(value: String): Self = StObject.set(x, "identHostName", value.asInstanceOf[js.Any])
      
      inline def setIdentHostNameNull: Self = StObject.set(x, "identHostName", null)
      
      inline def setIdentHostNameUndefined: Self = StObject.set(x, "identHostName", js.undefined)
      
      inline def setIdentMAC(value: String): Self = StObject.set(x, "identMAC", value.asInstanceOf[js.Any])
      
      inline def setIdentMACNull: Self = StObject.set(x, "identMAC", null)
      
      inline def setIdentMACUndefined: Self = StObject.set(x, "identMAC", js.undefined)
      
      inline def setIdentNetBios(value: String): Self = StObject.set(x, "identNetBios", value.asInstanceOf[js.Any])
      
      inline def setIdentNetBiosNull: Self = StObject.set(x, "identNetBios", null)
      
      inline def setIdentNetBiosUndefined: Self = StObject.set(x, "identNetBios", js.undefined)
      
      inline def setIdentSecondlp(value: String): Self = StObject.set(x, "identSecondlp", value.asInstanceOf[js.Any])
      
      inline def setIdentSecondlpNull: Self = StObject.set(x, "identSecondlp", null)
      
      inline def setIdentSecondlpUndefined: Self = StObject.set(x, "identSecondlp", js.undefined)
      
      inline def setIdentSrc(value: String): Self = StObject.set(x, "identSrc", value.asInstanceOf[js.Any])
      
      inline def setIdentSrcNull: Self = StObject.set(x, "identSrc", null)
      
      inline def setIdentSrcUndefined: Self = StObject.set(x, "identSrc", js.undefined)
      
      inline def setIsLoginEvent(value: String): Self = StObject.set(x, "isLoginEvent", value.asInstanceOf[js.Any])
      
      inline def setIsLoginEventNull: Self = StObject.set(x, "isLoginEvent", null)
      
      inline def setIsLoginEventUndefined: Self = StObject.set(x, "isLoginEvent", js.undefined)
      
      inline def setIsLogoutEvent(value: String): Self = StObject.set(x, "isLogoutEvent", value.asInstanceOf[js.Any])
      
      inline def setIsLogoutEventNull: Self = StObject.set(x, "isLogoutEvent", null)
      
      inline def setIsLogoutEventUndefined: Self = StObject.set(x, "isLogoutEvent", js.undefined)
      
      inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyNull: Self = StObject.set(x, "policy", null)
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setProto(value: String): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
      
      inline def setProtoNull: Self = StObject.set(x, "proto", null)
      
      inline def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmNull: Self = StObject.set(x, "realm", null)
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceNull: Self = StObject.set(x, "resource", null)
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleNull: Self = StObject.set(x, "role", null)
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSev(value: String): Self = StObject.set(x, "sev", value.asInstanceOf[js.Any])
      
      inline def setSevNull: Self = StObject.set(x, "sev", null)
      
      inline def setSevUndefined: Self = StObject.set(x, "sev", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcBytes(value: String): Self = StObject.set(x, "srcBytes", value.asInstanceOf[js.Any])
      
      inline def setSrcBytesNull: Self = StObject.set(x, "srcBytes", null)
      
      inline def setSrcBytesUndefined: Self = StObject.set(x, "srcBytes", js.undefined)
      
      inline def setSrcMAC(value: String): Self = StObject.set(x, "srcMAC", value.asInstanceOf[js.Any])
      
      inline def setSrcMACNull: Self = StObject.set(x, "srcMAC", null)
      
      inline def setSrcMACUndefined: Self = StObject.set(x, "srcMAC", js.undefined)
      
      inline def setSrcNull: Self = StObject.set(x, "src", null)
      
      inline def setSrcPackets(value: String): Self = StObject.set(x, "srcPackets", value.asInstanceOf[js.Any])
      
      inline def setSrcPacketsNull: Self = StObject.set(x, "srcPackets", null)
      
      inline def setSrcPacketsUndefined: Self = StObject.set(x, "srcPackets", js.undefined)
      
      inline def setSrcPort(value: String): Self = StObject.set(x, "srcPort", value.asInstanceOf[js.Any])
      
      inline def setSrcPortNull: Self = StObject.set(x, "srcPort", null)
      
      inline def setSrcPortUndefined: Self = StObject.set(x, "srcPort", js.undefined)
      
      inline def setSrcPostNAT(value: String): Self = StObject.set(x, "srcPostNAT", value.asInstanceOf[js.Any])
      
      inline def setSrcPostNATNull: Self = StObject.set(x, "srcPostNAT", null)
      
      inline def setSrcPostNATPort(value: String): Self = StObject.set(x, "srcPostNATPort", value.asInstanceOf[js.Any])
      
      inline def setSrcPostNATPortNull: Self = StObject.set(x, "srcPostNATPort", null)
      
      inline def setSrcPostNATPortUndefined: Self = StObject.set(x, "srcPostNATPort", js.undefined)
      
      inline def setSrcPostNATUndefined: Self = StObject.set(x, "srcPostNAT", js.undefined)
      
      inline def setSrcPreNAT(value: String): Self = StObject.set(x, "srcPreNAT", value.asInstanceOf[js.Any])
      
      inline def setSrcPreNATNull: Self = StObject.set(x, "srcPreNAT", null)
      
      inline def setSrcPreNATPort(value: String): Self = StObject.set(x, "srcPreNATPort", value.asInstanceOf[js.Any])
      
      inline def setSrcPreNATPortNull: Self = StObject.set(x, "srcPreNATPort", null)
      
      inline def setSrcPreNATPortUndefined: Self = StObject.set(x, "srcPreNATPort", js.undefined)
      
      inline def setSrcPreNATUndefined: Self = StObject.set(x, "srcPreNAT", js.undefined)
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setTotalPackets(value: String): Self = StObject.set(x, "totalPackets", value.asInstanceOf[js.Any])
      
      inline def setTotalPacketsNull: Self = StObject.set(x, "totalPackets", null)
      
      inline def setTotalPacketsUndefined: Self = StObject.set(x, "totalPackets", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUsrName(value: String): Self = StObject.set(x, "usrName", value.asInstanceOf[js.Any])
      
      inline def setUsrNameNull: Self = StObject.set(x, "usrName", null)
      
      inline def setUsrNameUndefined: Self = StObject.set(x, "usrName", js.undefined)
      
      inline def setVSrc(value: String): Self = StObject.set(x, "vSrc", value.asInstanceOf[js.Any])
      
      inline def setVSrcName(value: String): Self = StObject.set(x, "vSrcName", value.asInstanceOf[js.Any])
      
      inline def setVSrcNameNull: Self = StObject.set(x, "vSrcName", null)
      
      inline def setVSrcNameUndefined: Self = StObject.set(x, "vSrcName", js.undefined)
      
      inline def setVSrcNull: Self = StObject.set(x, "vSrc", null)
      
      inline def setVSrcUndefined: Self = StObject.set(x, "vSrc", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * LEEF message attributes which defaults to all base attributes with null values,
      * new attributes should be added as new elements to this object.
      */
    var attributes: js.UndefOr[Attributes] = js.undefined
    
    /**
      * The eventId of the system that generated the event being reported.
      *
      * @default 'unknown'
      */
    var eventId: js.UndefOr[String] = js.undefined
    
    /**
      * The product name of the system that generated the event being reported.
      *
      * @default 'unknown'
      */
    var product: js.UndefOr[String] = js.undefined
    
    /**
      * A Syslog server connection that should be used to send messages directly from this class.
      *
      * @default false
      */
    var server: js.UndefOr[typings.syslogPro.mod.Syslog.Options | `false`] = js.undefined
    
    /**
      * Should the LEEF message include a Syslog header with Timestamp and source.
      *
      * @default true
      */
    var syslogHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The vendor of the system that generated the event being reported.
      *
      * @default 'unknown'
      */
    var vendor: js.UndefOr[String] = js.undefined
    
    /**
      * The version name of the system that generated the event being reported.
      *
      * @default 'unknown'
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      inline def setServer(value: typings.syslogPro.mod.Syslog.Options | `false`): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setSyslogHeader(value: Boolean): Self = StObject.set(x, "syslogHeader", value.asInstanceOf[js.Any])
      
      inline def setSyslogHeaderUndefined: Self = StObject.set(x, "syslogHeader", js.undefined)
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
