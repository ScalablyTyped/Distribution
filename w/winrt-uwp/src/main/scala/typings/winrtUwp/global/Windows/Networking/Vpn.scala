package typings.winrtUwp.global.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
object Vpn {
  
  /** Specifies the type of AppId understood by the VPN platform. */
  @JSGlobal("Windows.Networking.Vpn.VpnAppIdType")
  @js.native
  object VpnAppIdType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Vpn.VpnAppIdType & Double] = js.native
    
    /* 2 */ val filePath: typings.winrtUwp.Windows.Networking.Vpn.VpnAppIdType.filePath & Double = js.native
    
    /* 1 */ val fullyQualifiedBinaryName: typings.winrtUwp.Windows.Networking.Vpn.VpnAppIdType.fullyQualifiedBinaryName & Double = js.native
    
    /* 0 */ val packageFamilyName: typings.winrtUwp.Windows.Networking.Vpn.VpnAppIdType.packageFamilyName & Double = js.native
  }
  
  /** Specifies the type of authentication methods allowed by the operating system native VPN protocols. */
  @JSGlobal("Windows.Networking.Vpn.VpnAuthenticationMethod")
  @js.native
  object VpnAuthenticationMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Vpn.VpnAuthenticationMethod & Double] = js.native
    
    /* 2 */ val certificate: typings.winrtUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.certificate & Double = js.native
    
    /* 1 */ val eap: typings.winrtUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.eap & Double = js.native
    
    /* 0 */ val mschapv2: typings.winrtUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.mschapv2 & Double = js.native
    
    /* 3 */ val presharedKey: typings.winrtUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.presharedKey & Double = js.native
  }
  
  /** Specifies the type of activity events. */
  @JSGlobal("Windows.Networking.Vpn.VpnChannelActivityEventType")
  @js.native
  object VpnChannelActivityEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Vpn.VpnChannelActivityEventType & Double] = js.native
    
    /* 1 */ val active: typings.winrtUwp.Windows.Networking.Vpn.VpnChannelActivityEventType.active & Double = js.native
    
    /* 0 */ val idle: typings.winrtUwp.Windows.Networking.Vpn.VpnChannelActivityEventType.idle & Double = js.native
  }
  
  /** Specifies the values defining whether a requested credential is a retry case, or should be used for single sign on. */
  @JSGlobal("Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions")
  @js.native
  object VpnChannelRequestCredentialsOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions & Double
      ] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions.none & Double = js.native
    
    /* 1 */ val retrying: typings.winrtUwp.Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions.retrying & Double = js.native
    
    /* 2 */ val useForSingleSignIn: typings.winrtUwp.Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions.useForSingleSignIn & Double = js.native
  }
  
  /** Specifies the types of credentials that can be requested by the VPN platform. */
  @JSGlobal("Windows.Networking.Vpn.VpnCredentialType")
  @js.native
  object VpnCredentialType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Vpn.VpnCredentialType & Double] = js.native
    
    /* 5 */ val protectedCertificate: typings.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.protectedCertificate & Double = js.native
    
    /* 4 */ val smartCard: typings.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.smartCard & Double = js.native
    
    /* 6 */ val unProtectedCertificate: typings.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.unProtectedCertificate & Double = js.native
    
    /* 1 */ val usernameOtpPin: typings.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.usernameOtpPin & Double = js.native
    
    /* 0 */ val usernamePassword: typings.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.usernamePassword & Double = js.native
    
    /* 2 */ val usernamePasswordAndPin: typings.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.usernamePasswordAndPin & Double = js.native
    
    /* 3 */ val usernamePasswordChange: typings.winrtUwp.Windows.Networking.Vpn.VpnCredentialType.usernamePasswordChange & Double = js.native
  }
  
  /** VpnDataPathType is not supported and may be altered or unavailable in the future. */
  @JSGlobal("Windows.Networking.Vpn.VpnDataPathType")
  @js.native
  object VpnDataPathType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Vpn.VpnDataPathType & Double] = js.native
    
    /* 1 */ val receive: typings.winrtUwp.Windows.Networking.Vpn.VpnDataPathType.receive & Double = js.native
    
    /* 0 */ val send: typings.winrtUwp.Windows.Networking.Vpn.VpnDataPathType.send & Double = js.native
  }
  
  /** Describes whether a name is a domain name suffix or a fully qualified domain name. */
  @JSGlobal("Windows.Networking.Vpn.VpnDomainNameType")
  @js.native
  object VpnDomainNameType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Vpn.VpnDomainNameType & Double] = js.native
    
    /* 1 */ val fullyQualified: typings.winrtUwp.Windows.Networking.Vpn.VpnDomainNameType.fullyQualified & Double = js.native
    
    /* 2 */ val reserved: typings.winrtUwp.Windows.Networking.Vpn.VpnDomainNameType.reserved & Double = js.native
    
    /* 0 */ val suffix: typings.winrtUwp.Windows.Networking.Vpn.VpnDomainNameType.suffix & Double = js.native
  }
  
  /** Specifies the IP protocols (numeric values). */
  @JSGlobal("Windows.Networking.Vpn.VpnIPProtocol")
  @js.native
  object VpnIPProtocol extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol & Double] = js.native
    
    /* 3 */ val icmp: typings.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.icmp & Double = js.native
    
    /* 5 */ val igmp: typings.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.igmp & Double = js.native
    
    /* 4 */ val ipv6Icmp: typings.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.ipv6Icmp & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.none & Double = js.native
    
    /* 6 */ val pgm: typings.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.pgm & Double = js.native
    
    /* 1 */ val tcp: typings.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.tcp & Double = js.native
    
    /* 2 */ val udp: typings.winrtUwp.Windows.Networking.Vpn.VpnIPProtocol.udp & Double = js.native
  }
  
  /** Describes the known VPN management errors. */
  @JSGlobal("Windows.Networking.Vpn.VpnManagementErrorStatus")
  @js.native
  object VpnManagementErrorStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus & Double] = js.native
    
    /* 5 */ val accessDenied: typings.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.accessDenied & Double = js.native
    
    /* 2 */ val invalidXmlSyntax: typings.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.invalidXmlSyntax & Double = js.native
    
    /* 0 */ val ok: typings.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.ok & Double = js.native
    
    /* 1 */ val other: typings.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.other & Double = js.native
    
    /* 4 */ val profileInvalidAppId: typings.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.profileInvalidAppId & Double = js.native
    
    /* 3 */ val profileNameTooLong: typings.winrtUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.profileNameTooLong & Double = js.native
  }
  
  /** Specifies the native protocol types. */
  @JSGlobal("Windows.Networking.Vpn.VpnNativeProtocolType")
  @js.native
  object VpnNativeProtocolType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Vpn.VpnNativeProtocolType & Double] = js.native
    
    /* 2 */ val ipsecIkev2: typings.winrtUwp.Windows.Networking.Vpn.VpnNativeProtocolType.ipsecIkev2 & Double = js.native
    
    /* 1 */ val l2tp: typings.winrtUwp.Windows.Networking.Vpn.VpnNativeProtocolType.l2tp & Double = js.native
    
    /* 0 */ val pptp: typings.winrtUwp.Windows.Networking.Vpn.VpnNativeProtocolType.pptp & Double = js.native
  }
  
  /** Describes the possible states of the VPN packet buffer. */
  @JSGlobal("Windows.Networking.Vpn.VpnPacketBufferStatus")
  @js.native
  object VpnPacketBufferStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Vpn.VpnPacketBufferStatus & Double] = js.native
    
    /* 1 */ val invalidBufferSize: typings.winrtUwp.Windows.Networking.Vpn.VpnPacketBufferStatus.invalidBufferSize & Double = js.native
    
    /* 0 */ val ok: typings.winrtUwp.Windows.Networking.Vpn.VpnPacketBufferStatus.ok & Double = js.native
  }
  
  /** Specifies the routing policy type. */
  @JSGlobal("Windows.Networking.Vpn.VpnRoutingPolicyType")
  @js.native
  object VpnRoutingPolicyType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Vpn.VpnRoutingPolicyType & Double] = js.native
    
    /* 1 */ val forceAllTrafficOverVpn: typings.winrtUwp.Windows.Networking.Vpn.VpnRoutingPolicyType.forceAllTrafficOverVpn & Double = js.native
    
    /* 0 */ val splitRouting: typings.winrtUwp.Windows.Networking.Vpn.VpnRoutingPolicyType.splitRouting & Double = js.native
  }
}
