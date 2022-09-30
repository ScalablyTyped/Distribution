package typings.testcafeHammerhead.mod

import typings.testcafeHammerhead.RequestEventListenerError
import typings.testcafeHammerhead.anon.PartialSessionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "Session")
@js.native
abstract class Session protected () extends StObject {
  /** Creates a session instance **/
  /* protected */ def this(uploadRoots: js.Array[String], options: PartialSessionOptions) = this()
  
  /** Adds request event listeners **/
  def addRequestEventListeners(
    rule: RequestFilterRule,
    listeners: RequestEventListeners,
    errorHandler: js.Function1[/* event */ RequestEventListenerError, Unit]
  ): Unit = js.native
  
  /** Remove request event listeners for all request filter rules **/
  def clearRequestEventListeners(): Unit = js.native
  
  /** Session's cookie API **/
  var cookies: Cookies = js.native
  
  /** Abstract method that must return a payload script for iframe **/
  def getIframePayloadScript(iframeWithoutSrc: Boolean): js.Promise[String] = js.native
  
  /** Abstract method that must return a payload script **/
  def getPayloadScript(): js.Promise[String] = js.native
  
  /** Get the cookie, sessionStorage and localStorage snapshot of current session **/
  def getStateSnapshot(): StateSnapshot = js.native
  
  /** Abstract method that must handle a file download **/
  def handleFileDownload(): Unit = js.native
  
  /** Unique identifier of the Session instance **/
  var id: String = js.native
  
  /** Session's injectable resources **/
  var injectable: InjectableResources = js.native
  
  /** Check disabling http2 **/
  def isHttp2Disabled(): Boolean = js.native
  
  /** Remove the header on the specified ConfigureResponseEvent **/
  def removeHeaderOnConfigureResponseEvent(eventId: String, headerName: String): js.Promise[Unit] = js.native
  
  /** Removes request event listeners **/
  def removeRequestEventListeners(rule: RequestFilterRule): Unit = js.native
  
  /** Set ConfigureResponseEvent options which are applied during the request pipeline execution**/
  def setConfigureResponseEventOptions(eventId: String, opts: ConfigureResponseEventOptions): js.Promise[Unit] = js.native
  
  /** Change the header on the specified ConfigureResponseEvent **/
  def setHeaderOnConfigureResponseEvent(eventId: String, headerName: String, headerValue: String): js.Promise[Unit] = js.native
  
  /** Set RequestMock on the specified ResponseEvent event **/
  def setMock(responseEventId: String, mock: ResponseMock): js.Promise[Unit] = js.native
  
  /** Apply the cookie, sessionStorage and localStorage snapshot to the session **/
  def useStateSnapshot(snapshot: StateSnapshot): Unit = js.native
}
