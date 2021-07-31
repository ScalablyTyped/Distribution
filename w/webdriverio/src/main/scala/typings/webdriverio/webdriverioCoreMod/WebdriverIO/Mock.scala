package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mock extends StObject {
  
  /**
    * Abort the request with one of the following error codes:
    * `Failed`, `Aborted`, `TimedOut`, `AccessDenied`, `ConnectionClosed`,
    * `ConnectionReset`, `ConnectionRefused`, `ConnectionAborted`,
    * `ConnectionFailed`, `NameNotResolved`, `InternetDisconnected`,
    * `AddressUnreachable`, `BlockedByClient`, `BlockedByResponse`.
    */
  def abort(errorCode: ErrorCode): js.Promise[Unit] = js.native
  
  /**
    * Abort the request once with one of the following error codes:
    * `Failed`, `Aborted`, `TimedOut`, `AccessDenied`, `ConnectionClosed`,
    * `ConnectionReset`, `ConnectionRefused`, `ConnectionAborted`,
    * `ConnectionFailed`, `NameNotResolved`, `InternetDisconnected`,
    * `AddressUnreachable`, `BlockedByClient`, `BlockedByResponse`.
    */
  def abortOnce(errorCode: ErrorCode): js.Promise[Unit] = js.native
  
  /**
    * list of requests made by the browser to that mock
    */
  var calls: js.Array[Matches] = js.native
  
  /**
    * Resets all information stored in the `mock.calls` array.
    */
  def clear(): js.Promise[Unit] = js.native
  
  /**
    * Always respond with same overwrite.
    */
  def respond(overwrites: MockOverwrite): js.Promise[Unit] = js.native
  def respond(overwrites: MockOverwrite, params: MockResponseParams): js.Promise[Unit] = js.native
  
  /**
    * Only respond once with given overwrite. You can call `respondOnce` multiple
    * consecutive times and it will start with the respond you defined last. If you
    * only use `respondOnce` and the resource is called more times a mock has been
    * defined than it defaults back to the original resource.
    */
  def respondOnce(overwrites: MockOverwrite): js.Promise[Unit] = js.native
  def respondOnce(overwrites: MockOverwrite, params: MockResponseParams): js.Promise[Unit] = js.native
  
  /**
    * Does everything that `mock.clear()` does, and also removes any mocked return values or implementations.
    */
  def restore(): js.Promise[Unit] = js.native
}
