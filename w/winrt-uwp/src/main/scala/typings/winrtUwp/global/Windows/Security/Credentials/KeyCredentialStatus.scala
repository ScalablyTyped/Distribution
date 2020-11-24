package typings.winrtUwp.global.Windows.Security.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the status of a key credential request. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialStatus")
@js.native
object KeyCredentialStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus with Double] = js.native
  
  /* 5 */ val credentialAlreadyExists: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.credentialAlreadyExists with Double = js.native
  
  /* 2 */ val notFound: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.notFound with Double = js.native
  
  /* 6 */ val securityDeviceLocked: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.securityDeviceLocked with Double = js.native
  
  /* 0 */ val success: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.success with Double = js.native
  
  /* 1 */ val unknownError: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.unknownError with Double = js.native
  
  /* 3 */ val userCanceled: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.userCanceled with Double = js.native
  
  /* 4 */ val userPrefersPassword: typings.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus.userPrefersPassword with Double = js.native
}
