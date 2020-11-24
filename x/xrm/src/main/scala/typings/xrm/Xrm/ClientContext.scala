package typings.xrm.Xrm

import typings.xrm.XrmEnum.ClientFormFactor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the client context.
  */
@js.native
trait ClientContext extends js.Object {
  
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
  implicit class ClientContextOps[Self <: ClientContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetClient(value: () => Client): Self = this.set("getClient", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClientState(value: () => ClientState): Self = this.set("getClientState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormFactor(value: () => ClientFormFactor): Self = this.set("getFormFactor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOffline(value: () => Boolean): Self = this.set("isOffline", js.Any.fromFunction0(value))
  }
}
