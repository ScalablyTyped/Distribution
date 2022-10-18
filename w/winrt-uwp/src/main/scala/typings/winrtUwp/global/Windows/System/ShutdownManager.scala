package typings.winrtUwp.global.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("Windows.System.ShutdownManager")
@js.native
open class ShutdownManager ()
  extends StObject
     with typings.winrtUwp.Windows.System.ShutdownManager
object ShutdownManager {
  
  @JSGlobal("Windows.System.ShutdownManager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Windows.System.ShutdownManager.beginShutdown")
  @js.native
  def beginShutdown: Any = js.native
  inline def beginShutdown_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beginShutdown")(x.asInstanceOf[js.Any])
  
  /* unmapped type */
  /* static member */
  @JSGlobal("Windows.System.ShutdownManager.cancelShutdown")
  @js.native
  def cancelShutdown: Any = js.native
  inline def cancelShutdown_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancelShutdown")(x.asInstanceOf[js.Any])
}
