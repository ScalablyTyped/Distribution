package typings.winrtUwp.global.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an application to request that a device's display remain on even if there is no user activity for an extended period of time. */
object Display {
  
  /** Represents a display request. */
  @JSGlobal("Windows.System.Display.DisplayRequest")
  @js.native
  /** Creates an instance of the DisplayRequest class. */
  open class DisplayRequest ()
    extends StObject
       with typings.winrtUwp.Windows.System.Display.DisplayRequest {
    
    /** Activates a display request. */
    /* CompleteClass */
    override def requestActive(): Unit = js.native
    
    /** Deactivates a display request. */
    /* CompleteClass */
    override def requestRelease(): Unit = js.native
  }
}
