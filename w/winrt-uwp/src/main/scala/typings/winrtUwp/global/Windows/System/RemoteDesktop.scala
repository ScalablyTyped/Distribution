package typings.winrtUwp.global.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an application to obtain information about Remote Desktop sessions. */
object RemoteDesktop {
  
  /** Provides Remote Desktop information about the current session. */
  /* note: abstract class */ @JSGlobal("Windows.System.RemoteDesktop.InteractiveSession")
  @js.native
  open class InteractiveSession ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteDesktop.InteractiveSession
  object InteractiveSession {
    
    @JSGlobal("Windows.System.RemoteDesktop.InteractiveSession")
    @js.native
    val ^ : js.Any = js.native
    
    /** Indicates whether the calling process is running in a Remote Desktop session. */
    /* static member */
    @JSGlobal("Windows.System.RemoteDesktop.InteractiveSession.isRemote")
    @js.native
    def isRemote: Boolean = js.native
    inline def isRemote_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRemote")(x.asInstanceOf[js.Any])
  }
}
