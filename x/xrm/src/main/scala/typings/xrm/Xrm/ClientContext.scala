package typings.xrm.Xrm

import typings.xrm.XrmEnum.ClientFormFactor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the client context.
  */
@js.native
trait ClientContext extends StObject {
  
  /**
    * Returns a value to indicate which client the script is executing in.
    * @returns The client, as either "Web", "Outlook", or "Mobile"
    */
  def getClient(): Client = js.native
  
  /**
    * Gets client's current state.
    * @returns The client state, as either "Online" or "Offline"
    */
  def getClientState(): ClientState = js.native
  
  /**
    * Use this method to get information about the kind of device the user is using.
    */
  def getFormFactor(): ClientFormFactor = js.native
  
  /**
    * Returns information whether the server is online or offline.
    */
  def isOffline(): Boolean = js.native
}
object ClientContext {
  
  @scala.inline
  def apply(
    getClient: () => Client,
    getClientState: () => ClientState,
    getFormFactor: () => ClientFormFactor,
    isOffline: () => Boolean
  ): ClientContext = {
    val __obj = js.Dynamic.literal(getClient = js.Any.fromFunction0(getClient), getClientState = js.Any.fromFunction0(getClientState), getFormFactor = js.Any.fromFunction0(getFormFactor), isOffline = js.Any.fromFunction0(isOffline))
    __obj.asInstanceOf[ClientContext]
  }
  
  @scala.inline
  implicit class ClientContextMutableBuilder[Self <: ClientContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetClient(value: () => Client): Self = StObject.set(x, "getClient", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClientState(value: () => ClientState): Self = StObject.set(x, "getClientState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormFactor(value: () => ClientFormFactor): Self = StObject.set(x, "getFormFactor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOffline(value: () => Boolean): Self = StObject.set(x, "isOffline", js.Any.fromFunction0(value))
  }
}
