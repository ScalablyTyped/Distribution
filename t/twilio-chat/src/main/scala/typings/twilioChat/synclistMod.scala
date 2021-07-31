package typings.twilioChat

import typings.twilioChat.networkMod.Network
import typings.twilioChat.restpaginatorMod.RestPaginator
import typings.twilioChat.sessionMod.Session
import typings.twilioChat.synclistdescriptorMod.SyncListDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object synclistMod {
  
  /**
    * Provides async pagination interface for sync list
    *
    * @property {Network} network Network transport
    * @property {string} syncListUrl Url to the sync list endpoint
    */
  @JSImport("twilio-chat/lib/synclist", "SyncList")
  @js.native
  class SyncList protected () extends StObject {
    /**
      * @param {SyncListServices} services - services needed for SyncList service
      * @private
      */
    def this(services: SyncListServices) = this()
    
    def getPage(): js.Promise[RestPaginator[SyncListDescriptor]] = js.native
    def getPage(args: js.Any): js.Promise[RestPaginator[SyncListDescriptor]] = js.native
    
    val services: js.Any = js.native
  }
  
  trait SyncListServices extends StObject {
    
    var network: Network
    
    var session: Session
  }
  object SyncListServices {
    
    @scala.inline
    def apply(network: Network, session: Session): SyncListServices = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncListServices]
    }
    
    @scala.inline
    implicit class SyncListServicesMutableBuilder[Self <: SyncListServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
}
