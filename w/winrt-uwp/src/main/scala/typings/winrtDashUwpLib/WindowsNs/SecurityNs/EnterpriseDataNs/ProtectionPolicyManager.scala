package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages enterprise-protection policy on protected content. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager")
@js.native
abstract class ProtectionPolicyManager () extends js.Object {
  /** Gets or sets the enterprise identity. */
  var identity: java.lang.String = js.native
}

/* static members */
@JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager")
@js.native
object ProtectionPolicyManager extends js.Object {
  /** Use this property to determine whether enterprise data protection (EDP) is enabled on the device. */
  var isProtectionEnabled: scala.Boolean = js.native
  /** An event that is raised in response to changes in enterprise data protection (EDP) policy managed by the Policy CSP. */
  @JSName("onpolicychanged")
  var onpolicychanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event with which the app registers to receive notification that protection has been resumed. */
  @JSName("onprotectedaccessresumed")
  var onprotectedaccessresumed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event with which the app registers to receive notification that protection is to be suspended. */
  @JSName("onprotectedaccesssuspending")
  var onprotectedaccesssuspending_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Event with which the app registers to receive notification that protection is to be revoked. When the app receives this event, it should determine from ProtectedContentRevokedEventArgs.Identities which enterprise entities have had protection revoked, and call RevokeContent as well as delete any metadata associated with the identity. */
  @JSName("onprotectedcontentrevoked")
  var onprotectedcontentrevoked_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_policychanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.policychanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_protectedaccessresumed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.protectedaccessresumed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_protectedaccesssuspending(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.protectedaccesssuspending,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_protectedcontentrevoked(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.protectedcontentrevoked,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
    * Request if access to enterprise-protected content is available to an identity.
    * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to check if an email address or domain is managed.
    * @param targetIdentity The enterprise identity you want to check has access to the protected content.
    * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the query.
    */
  def checkAccess(sourceIdentity: java.lang.String, targetIdentity: java.lang.String): winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectionPolicyEvaluationResult = js.native
  /**
    * Perform enterprise-protection policy evaluation for a data transfer between your app and a specific target app.
    * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to check if an email address or domain is managed.
    * @param appPackageFamilyName The package family name of the app you want to check has access to the protected content.
    * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the query.
    */
  def checkAccessForApp(sourceIdentity: java.lang.String, appPackageFamilyName: java.lang.String): winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectionPolicyEvaluationResult = js.native
  /** Clear UI policy enforcement for an enterprise identity. The app calls this method before it displays non-enterprise-protected content. */
  def clearProcessUIPolicy(): scala.Unit = js.native
  /**
    * Creates a ThreadNetworkContext protected to an enterprise identity. The creation of the context tags all network connections made thereafter on the current thread with the identity, and allows access to enterprise resources that are access controlled by the enterprise's policy.
    * @param identity The enterprise identity. This is an email address or domain that is managed. This may be returned from GetPrimaryManagedIdentityForNetworkEndpoint ; otherwise your app should use IsIdentityManaged to confirm that an email address or domain is managed.
    * @return The protected network context. The app must call ThreadNetworkContext.Close after access to the resource is completed.
    */
  def createCurrentThreadNetworkContext(identity: java.lang.String): winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ThreadNetworkContext = js.native
  /**
    * You can use this method to determine the current enterprise data protection (EDP) enforcement level. EDP enforcement level is one aspect of mobile device management (MDM) policy configuration.
    * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
    * @return A value of the EnforcementLevel enumeration.
    */
  def getEnforcementLevel(identity: java.lang.String): winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.EnforcementLevel = js.native
  /**
    * Returns the ProtectionPolicyManager object associated with the current app window.
    * @return The ProtectionPolicyManager object associated with the current app window.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectionPolicyManager = js.native
  /**
    * Returns the enterprise identity of a network resource if the resource is on an enterprise-policy-managed endpoint.
    * @param endpointHost The host name or IP address of the network resource.
    * @return The enterprise identity.
    */
  def getPrimaryManagedIdentityForNetworkEndpointAsync(endpointHost: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Use this method to check whether access to protected data has been revoked since a specified date and time, or is still accessible.
    * @param identity The enterprise identity protecting the data. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
    * @param since The date and time from which point forward you want to include in the check.
    * @return true if access has been revoked since the specified date and time, otherwise false.
    */
  def hasContentBeenRevokedSince(identity: java.lang.String, since: stdLib.Date): scala.Boolean = js.native
  /**
    * Determines if an enterprise entity is managed by an enterprise policy.
    * @param identity The enterprise identity. This is an email address or domain.
    * @return true if the enterprise identity is managed, or false if it is not.
    */
  def isIdentityManaged(identity: java.lang.String): scala.Boolean = js.native
  /**
    * Use this property to determine the value of the ProtectionUnderLockConfigRequired enterprise data protection (EDP) policy.
    * @param identity The enterprise identity you want to check has ProtectionUnderLockConfigRequired policy set.
    * @return true if ProtectionUnderLockConfigRequired policy is set for the identity, otherwise false.
    */
  def isProtectionUnderLockRequired(identity: java.lang.String): scala.Boolean = js.native
  /**
    * Use this property to determine whether decryption of files protected by enterprise data protection (EDP) is allowed.
    * @param identity The enterprise identity you want to check has access to the protected content.
    * @return true if decryption of files protected by EDP is allowed, otherwise false.
    */
  def isUserDecryptionAllowed(identity: java.lang.String): scala.Boolean = js.native
  /** An event that is raised in response to changes in enterprise data protection (EDP) policy managed by the Policy CSP. */
  def onpolicychanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event with which the app registers to receive notification that protection has been resumed. */
  def onprotectedaccessresumed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event with which the app registers to receive notification that protection is to be suspended. */
  def onprotectedaccesssuspending(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Event with which the app registers to receive notification that protection is to be revoked. When the app receives this event, it should determine from ProtectedContentRevokedEventArgs.Identities which enterprise entities have had protection revoked, and call RevokeContent as well as delete any metadata associated with the identity. */
  def onprotectedcontentrevoked(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_policychanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.policychanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_protectedaccessresumed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.protectedaccessresumed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_protectedaccesssuspending(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.protectedaccesssuspending,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_protectedcontentrevoked(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.protectedcontentrevoked,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
    * Request access to enterprise protected content for an identity.
    * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
    * @param targetIdentity The target enterprise identity to which the content is protected.
    * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the request.
    */
  def requestAccessAsync(sourceIdentity: java.lang.String, targetIdentity: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectionPolicyEvaluationResult
  ] = js.native
  /**
    * Request access to enterprise-protected content for a specific target app.
    * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
    * @param appPackageFamilyName The package family name of the app you want to check has access to the protected content.
    * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the query.
    */
  def requestAccessForAppAsync(sourceIdentity: java.lang.String, appPackageFamilyName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectionPolicyEvaluationResult
  ] = js.native
  /**
    * Revoke the keys required to access all content protected to the specified enterprise identity.
    * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
    */
  def revokeContent(identity: java.lang.String): scala.Unit = js.native
  /**
    * Enables UI policy enforcement for an enterprise identity. When an app is about to display a protected file (such as a PDF) or resource (buffer or stream) on its UI, it must enable UI policy enforcement based on the identity the file is protected to. A call to TryApplyProcessUIPolicy ensures that the OS knows about the current context of the app.
    * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
    * @return true if the identity is being managed by an enterprise policy, or false if it is not.
    */
  def tryApplyProcessUIPolicy(identity: java.lang.String): scala.Boolean = js.native
}

