package typings.winrtUwp.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a mechanism for applications to execute when they are not in the foreground. */
object ExtendedExecution {
  
  /** Describes the reason for the background execution request. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason")
  @js.native
  object ExtendedExecutionReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason with Double
      ] = js.native
    
    /* 1 */ val locationTracking: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.locationTracking with Double = js.native
    
    /* 2 */ val savingData: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.savingData with Double = js.native
    
    /* 0 */ val unspecified: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.unspecified with Double = js.native
  }
  
  /** Specifies the possible background execution request result values. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult")
  @js.native
  object ExtendedExecutionResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult with Double
      ] = js.native
    
    /* 0 */ val allowed: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult.allowed with Double = js.native
    
    /* 1 */ val denied: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult.denied with Double = js.native
  }
  
  /** Represents the object that is passed as a parameter to the event handler that is invoked when the system revokes background execution. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedEventArgs")
  @js.native
  abstract class ExtendedExecutionRevokedEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedEventArgs
  
  /** Describes the reason background execution was revoked. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason")
  @js.native
  object ExtendedExecutionRevokedReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason with Double
      ] = js.native
    
    /* 0 */ val resumed: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason.resumed with Double = js.native
    
    /* 1 */ val systemPolicy: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason.systemPolicy with Double = js.native
  }
  
  /** Supports managing a request for background execution. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionSession")
  @js.native
  /** Creates an ExtendedExecutionSession object. */
  class ExtendedExecutionSession ()
    extends typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionSession
  
  /** Provides a mechanism for applications to perform extended execution while they are in the foreground. */
  object Foreground {
    
    /** Describes the reason for the extended execution request. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason")
    @js.native
    object ExtendedExecutionForegroundReason extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason with Double
          ] = js.native
      
      /* 2 */ val backgroundAudio: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.backgroundAudio with Double = js.native
      
      /* 1 */ val savingData: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.savingData with Double = js.native
      
      /* 3 */ val unconstrained: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.unconstrained with Double = js.native
      
      /* 0 */ val unspecified: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason.unspecified with Double = js.native
    }
    
    /** Specifies the possible extended execution request result values. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult")
    @js.native
    object ExtendedExecutionForegroundResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult with Double
          ] = js.native
      
      /* 0 */ val allowed: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult.allowed with Double = js.native
      
      /* 1 */ val denied: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult.denied with Double = js.native
    }
    
    /** Passed to the event handler that is invoked when the system revokes extended execution. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedEventArgs")
    @js.native
    abstract class ExtendedExecutionForegroundRevokedEventArgs ()
      extends typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedEventArgs
    
    /** Describes the reason extended execution was revoked. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason")
    @js.native
    object ExtendedExecutionForegroundRevokedReason extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason with Double
          ] = js.native
      
      /* 0 */ val resumed: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason.resumed with Double = js.native
      
      /* 1 */ val systemPolicy: typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason.systemPolicy with Double = js.native
    }
    
    /** Supports managing a request for extended foreground execution. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundSession")
    @js.native
    /** Creates an ExtendedExecutionForegroundSession object */
    class ExtendedExecutionForegroundSession ()
      extends typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundSession
  }
}
