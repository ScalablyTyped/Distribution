package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.idle.IdleState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idle {
  
  @JSGlobal("messenger.idle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("messenger.idle.onStateChanged")
  @js.native
  val onStateChanged: WebExtEvent[js.Function1[/* newState */ IdleState, Unit]] = js.native
  
  inline def queryState(detectionIntervalInSeconds: Double): js.Promise[IdleState] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryState")(detectionIntervalInSeconds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IdleState]]
  
  inline def setDetectionInterval(intervalInSeconds: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDetectionInterval")(intervalInSeconds.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
