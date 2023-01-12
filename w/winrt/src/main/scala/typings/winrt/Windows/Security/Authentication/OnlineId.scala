package typings.winrt.Windows.Security.Authentication

import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncInfo
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.anon.CompletedGetResults
import typings.winrt.anon.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnlineId {
  
  @js.native
  sealed trait CredentialPromptType extends StObject
  @JSGlobal("Windows.Security.Authentication.OnlineId.CredentialPromptType")
  @js.native
  object CredentialPromptType extends StObject {
    
    @js.native
    sealed trait doNotPrompt
      extends StObject
         with CredentialPromptType
    
    @js.native
    sealed trait promptIfNeeded
      extends StObject
         with CredentialPromptType
    
    @js.native
    sealed trait retypeCredentials
      extends StObject
         with CredentialPromptType
  }
  
  @js.native
  trait IOnlineIdAuthenticator extends StObject {
    
    var applicationId: String = js.native
    
    def authenticateUserAsync(requests: IIterable[OnlineIdServiceTicketRequest], credentialPromptType: CredentialPromptType): UserAuthenticationOperation = js.native
    def authenticateUserAsync(request: OnlineIdServiceTicketRequest): UserAuthenticationOperation = js.native
    
    var authenticatedSafeCustomerId: String = js.native
    
    var canSignOut: Boolean = js.native
    
    def signOutUserAsync(): SignOutUserOperation = js.native
  }
  
  trait IOnlineIdServiceTicket extends StObject {
    
    var errorCode: Double
    
    var request: OnlineIdServiceTicketRequest
    
    var value: String
  }
  object IOnlineIdServiceTicket {
    
    inline def apply(errorCode: Double, request: OnlineIdServiceTicketRequest, value: String): IOnlineIdServiceTicket = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOnlineIdServiceTicket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOnlineIdServiceTicket] (val x: Self) extends AnyVal {
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: OnlineIdServiceTicketRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOnlineIdServiceTicketRequest extends StObject {
    
    var policy: String
    
    var service: String
  }
  object IOnlineIdServiceTicketRequest {
    
    inline def apply(policy: String, service: String): IOnlineIdServiceTicketRequest = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOnlineIdServiceTicketRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOnlineIdServiceTicketRequest] (val x: Self) extends AnyVal {
      
      inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOnlineIdServiceTicketRequestFactory extends StObject {
    
    def createOnlineIdServiceTicketRequest(service: String): OnlineIdServiceTicketRequest = js.native
    def createOnlineIdServiceTicketRequest(service: String, policy: String): OnlineIdServiceTicketRequest = js.native
  }
  
  trait IUserIdentity extends StObject {
    
    var firstName: String
    
    var id: String
    
    var isBetaAccount: Boolean
    
    var isConfirmedPC: Boolean
    
    var lastName: String
    
    var safeCustomerId: String
    
    var signInName: String
    
    var tickets: IVectorView[OnlineIdServiceTicket]
  }
  object IUserIdentity {
    
    inline def apply(
      firstName: String,
      id: String,
      isBetaAccount: Boolean,
      isConfirmedPC: Boolean,
      lastName: String,
      safeCustomerId: String,
      signInName: String,
      tickets: IVectorView[OnlineIdServiceTicket]
    ): IUserIdentity = {
      val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBetaAccount = isBetaAccount.asInstanceOf[js.Any], isConfirmedPC = isConfirmedPC.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], safeCustomerId = safeCustomerId.asInstanceOf[js.Any], signInName = signInName.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUserIdentity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IUserIdentity] (val x: Self) extends AnyVal {
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsBetaAccount(value: Boolean): Self = StObject.set(x, "isBetaAccount", value.asInstanceOf[js.Any])
      
      inline def setIsConfirmedPC(value: Boolean): Self = StObject.set(x, "isConfirmedPC", value.asInstanceOf[js.Any])
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setSafeCustomerId(value: String): Self = StObject.set(x, "safeCustomerId", value.asInstanceOf[js.Any])
      
      inline def setSignInName(value: String): Self = StObject.set(x, "signInName", value.asInstanceOf[js.Any])
      
      inline def setTickets(value: IVectorView[OnlineIdServiceTicket]): Self = StObject.set(x, "tickets", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnlineIdAuthenticator
    extends StObject
       with IOnlineIdAuthenticator
  
  trait OnlineIdServiceTicket
    extends StObject
       with IOnlineIdServiceTicket
  object OnlineIdServiceTicket {
    
    inline def apply(errorCode: Double, request: OnlineIdServiceTicketRequest, value: String): OnlineIdServiceTicket = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnlineIdServiceTicket]
    }
  }
  
  trait OnlineIdServiceTicketRequest
    extends StObject
       with IOnlineIdServiceTicketRequest
  object OnlineIdServiceTicketRequest {
    
    inline def apply(policy: String, service: String): OnlineIdServiceTicketRequest = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnlineIdServiceTicketRequest]
    }
  }
  
  @js.native
  trait SignOutUserOperation
    extends StObject
       with IAsyncAction {
    
    @JSName("done")
    def done_MSignOutUserOperation[U](): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](success: js.Function0[Any]): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](success: js.Function0[Any], error: js.Function1[/* error */ Any, Any]): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](
      success: js.Function0[Any],
      error: js.Function1[/* error */ Any, Any],
      progress: js.Function1[/* progress */ Any, Unit]
    ): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](success: js.Function0[Any], error: Unit, progress: js.Function1[/* progress */ Any, Unit]): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](success: Unit, error: js.Function1[/* error */ Any, Any]): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](
      success: Unit,
      error: js.Function1[/* error */ Any, Any],
      progress: js.Function1[/* progress */ Any, Unit]
    ): Unit = js.native
    @JSName("done")
    def done_MSignOutUserOperation[U](success: Unit, error: Unit, progress: js.Function1[/* progress */ Any, Unit]): Unit = js.native
    
    var operation: CompletedGetResults = js.native
  }
  
  @js.native
  trait UserAuthenticationOperation
    extends StObject
       with IAsyncOperation[UserIdentity]
       with IAsyncInfo {
    
    /* InferMemberOverrides */
    override def cancel(): Unit = js.native
    
    def completed(asyncInfo: IAsyncOperation[UserIdentity], asyncStatus: AsyncStatus): Unit = js.native
    @JSName("completed")
    var completed_Original: AsyncOperationCompletedHandler[UserIdentity] = js.native
    
    def getResults(): UserIdentity = js.native
    
    @JSName("operation")
    var operation_UserAuthenticationOperation: `6` = js.native
  }
  
  trait UserIdentity
    extends StObject
       with IUserIdentity
  object UserIdentity {
    
    inline def apply(
      firstName: String,
      id: String,
      isBetaAccount: Boolean,
      isConfirmedPC: Boolean,
      lastName: String,
      safeCustomerId: String,
      signInName: String,
      tickets: IVectorView[OnlineIdServiceTicket]
    ): UserIdentity = {
      val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBetaAccount = isBetaAccount.asInstanceOf[js.Any], isConfirmedPC = isConfirmedPC.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], safeCustomerId = safeCustomerId.asInstanceOf[js.Any], signInName = signInName.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserIdentity]
    }
  }
}
