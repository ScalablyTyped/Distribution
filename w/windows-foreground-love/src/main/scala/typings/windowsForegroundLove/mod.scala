package typings.windowsForegroundLove

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("windows-foreground-love", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def allowSetForegroundWindow(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowSetForegroundWindow")().asInstanceOf[Boolean]
  @scala.inline
  def allowSetForegroundWindow(pid: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowSetForegroundWindow")(pid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
