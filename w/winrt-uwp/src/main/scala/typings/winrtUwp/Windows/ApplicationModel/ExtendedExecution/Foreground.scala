package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution

import org.scalablytyped.runtime.TopLevel
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.revoked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a mechanism for applications to perform extended execution while they are in the foreground. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground")
@js.native
object Foreground extends js.Object {
  @js.native
  sealed trait ExtendedExecutionForegroundReason extends js.Object
  
  @js.native
  sealed trait ExtendedExecutionForegroundResult extends js.Object
  
  /** Passed to the event handler that is invoked when the system revokes extended execution. */
  @js.native
  abstract class ExtendedExecutionForegroundRevokedEventArgs () extends js.Object {
    /** Gets the reason extended execution was revoked. */
    var reason: ExtendedExecutionForegroundRevokedReason = js.native
  }
  
  @js.native
  sealed trait ExtendedExecutionForegroundRevokedReason extends js.Object
  
  /** Supports managing a request for extended foreground execution. */
  @js.native
  /** Creates an ExtendedExecutionForegroundSession object */
  class ExtendedExecutionForegroundSession () extends js.Object {
    /** Gets or sets a string to display in the shell. */
    var description: String = js.native
    /** This event occurs when the system revokes extended execution. */
    @JSName("onrevoked")
    var onrevoked_Original: TypedEventHandler[_, ExtendedExecutionForegroundRevokedEventArgs] = js.native
    /** Gets or sets the reason for the extended execution request. */
    var reason: ExtendedExecutionForegroundReason = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_revoked(`type`: revoked, listener: TypedEventHandler[_, ExtendedExecutionForegroundRevokedEventArgs]): Unit = js.native
    /** Closes the session and removes the application's extended execution capability. */
    def close(): Unit = js.native
    /** This event occurs when the system revokes extended execution. */
    def onrevoked(ev: ExtendedExecutionForegroundRevokedEventArgs with WinRTEvent[_]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_revoked(`type`: revoked, listener: TypedEventHandler[_, ExtendedExecutionForegroundRevokedEventArgs]): Unit = js.native
    /**
      * Requests extended execution
      * @return The result of the request.
      */
    def requestExtensionAsync(): IPromiseWithIAsyncOperation[ExtendedExecutionForegroundResult] = js.native
  }
  
  /** Describes the reason for the extended execution request. */
  @js.native
  object ExtendedExecutionForegroundReason extends js.Object {
    /** To play audio. */
    @js.native
    sealed trait backgroundAudio extends ExtendedExecutionForegroundReason
    
    /** To save data. */
    @js.native
    sealed trait savingData extends ExtendedExecutionForegroundReason
    
    /** To perform any task that requires extended execution time. */
    @js.native
    sealed trait unconstrained extends ExtendedExecutionForegroundReason
    
    /** No reason specified. */
    @js.native
    sealed trait unspecified extends ExtendedExecutionForegroundReason
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExtendedExecutionForegroundReason with Double] = js.native
    /* 2 */ @js.native
    object backgroundAudio extends TopLevel[backgroundAudio with Double]
    
    /* 1 */ @js.native
    object savingData extends TopLevel[savingData with Double]
    
    /* 3 */ @js.native
    object unconstrained extends TopLevel[unconstrained with Double]
    
    /* 0 */ @js.native
    object unspecified extends TopLevel[unspecified with Double]
    
  }
  
  /** Specifies the possible extended execution request result values. */
  @js.native
  object ExtendedExecutionForegroundResult extends js.Object {
    /** Extended execution is allowed. */
    @js.native
    sealed trait allowed extends ExtendedExecutionForegroundResult
    
    /** App execution is not allowed. */
    @js.native
    sealed trait denied extends ExtendedExecutionForegroundResult
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExtendedExecutionForegroundResult with Double] = js.native
    /* 0 */ @js.native
    object allowed extends TopLevel[allowed with Double]
    
    /* 1 */ @js.native
    object denied extends TopLevel[denied with Double]
    
  }
  
  /** Describes the reason extended execution was revoked. */
  @js.native
  object ExtendedExecutionForegroundRevokedReason extends js.Object {
    /** The app was resumed during its extended execution. */
    @js.native
    sealed trait resumed extends ExtendedExecutionForegroundRevokedReason
    
    /** Extended execution is revoked due to system resources. */
    @js.native
    sealed trait systemPolicy extends ExtendedExecutionForegroundRevokedReason
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExtendedExecutionForegroundRevokedReason with Double] = js.native
    /* 0 */ @js.native
    object resumed extends TopLevel[resumed with Double]
    
    /* 1 */ @js.native
    object systemPolicy extends TopLevel[systemPolicy with Double]
    
  }
  
}

