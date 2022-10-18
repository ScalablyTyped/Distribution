package typings.victoryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryUtilLogMod {
  
  @JSImport("victory-core/lib/victory-util/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
