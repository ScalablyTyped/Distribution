package typings.winrtUwp.Windows.Media.PlayTo

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.error
import typings.winrtUwp.winrtUwpStrings.statechanged
import typings.winrtUwp.winrtUwpStrings.transferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a Play To connection. */
@js.native
trait PlayToConnection extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: TypedEventHandler[PlayToConnection, PlayToConnectionErrorEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(
    `type`: statechanged,
    listener: TypedEventHandler[PlayToConnection, PlayToConnectionStateChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transferred(
    `type`: transferred,
    listener: TypedEventHandler[PlayToConnection, PlayToConnectionTransferredEventArgs]
  ): Unit = js.native
  
  /** Occurs when an error is encountered for the Play To connection. */
  def onerror(ev: PlayToConnectionErrorEventArgs & WinRTEvent[PlayToConnection]): Unit = js.native
  /** Occurs when an error is encountered for the Play To connection. */
  @JSName("onerror")
  var onerror_Original: TypedEventHandler[PlayToConnection, PlayToConnectionErrorEventArgs] = js.native
  
  /** Occurs when the state of the Play To connection has changed. */
  def onstatechanged(ev: PlayToConnectionStateChangedEventArgs & WinRTEvent[PlayToConnection]): Unit = js.native
  /** Occurs when the state of the Play To connection has changed. */
  @JSName("onstatechanged")
  var onstatechanged_Original: TypedEventHandler[PlayToConnection, PlayToConnectionStateChangedEventArgs] = js.native
  
  /** Occurs when the Play To connection is transferred to the next Play To source. */
  def ontransferred(ev: PlayToConnectionTransferredEventArgs & WinRTEvent[PlayToConnection]): Unit = js.native
  /** Occurs when the Play To connection is transferred to the next Play To source. */
  @JSName("ontransferred")
  var ontransferred_Original: TypedEventHandler[PlayToConnection, PlayToConnectionTransferredEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: TypedEventHandler[PlayToConnection, PlayToConnectionErrorEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(
    `type`: statechanged,
    listener: TypedEventHandler[PlayToConnection, PlayToConnectionStateChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transferred(
    `type`: transferred,
    listener: TypedEventHandler[PlayToConnection, PlayToConnectionTransferredEventArgs]
  ): Unit = js.native
  
  /** Gets the state of the Play To connection. */
  var state: PlayToConnectionState = js.native
}
