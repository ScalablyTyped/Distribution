package typings.twilioChat.mod

import typings.twilioChat.twilioChatStrings.delete
import typings.twilioChat.twilioChatStrings.post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandExecutor extends StObject {
  
  /* private */ var _makeRequest: Any = js.native
  
  /* private */ var _preProcessUrl: Any = js.native
  
  /* private */ var _productId: Any = js.native
  
  /* private */ var _serviceUrl: Any = js.native
  
  /* private */ var _services: Any = js.native
  
  def fetchResource[REQ, RESP](url: String): js.Promise[RESP] = js.native
  def fetchResource[REQ, RESP](url: String, requestBody: REQ): js.Promise[RESP] = js.native
  
  def mutateResource[REQ, RESP](method: post | delete, url: String): js.Promise[RESP] = js.native
  def mutateResource[REQ, RESP](method: post | delete, url: String, requestBody: REQ): js.Promise[RESP] = js.native
}
