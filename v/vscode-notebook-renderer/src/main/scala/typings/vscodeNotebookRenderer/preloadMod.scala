package typings.vscodeNotebookRenderer

import typings.vscodeNotebookRenderer.eventsMod.VSCodeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preloadMod {
  
  object global {
    
    @JSGlobal("onDidReceiveKernelMessage")
    @js.native
    val onDidReceiveKernelMessage: VSCodeEvent[Any] = js.native
    
    inline def postKernelMessage(data: Any): Unit = js.Dynamic.global.applyDynamic("postKernelMessage")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
