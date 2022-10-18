package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an authentication failure is received. The listener has three options: it can provide authentication
  * credentials, it can cancel the request and display the error page, or it can take no action on the challenge.
  * If bad user credentials are provided, this may be called multiple times for the same request.
  */
@js.native
trait onAuthRequiredEvent
  extends StObject
     with Event[
      js.Function1[/* details */ OnAuthRequiredDetailsType, BlockingResponseOrPromise | Unit]
    ] {
  
  /**
    * Registers an event listener <em>callback</em> to an event.
    *
    * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
    * @param filter A set of filters that restricts the events that will be sent to this listener.
    * @param extraInfoSpec Optional. Array of extra information that should be passed to the listener function.
    */
  def addListener(
    callback: js.Function1[/* details */ OnAuthRequiredDetailsType, BlockingResponseOrPromise | Unit],
    filter: RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ OnAuthRequiredDetailsType, BlockingResponseOrPromise | Unit],
    filter: RequestFilter,
    extraInfoSpec: js.Array[OnAuthRequiredOptions]
  ): Unit = js.native
}
