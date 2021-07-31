package typings.wdioLogger

import typings.std.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webMod {
  
  object default {
    
    @scala.inline
    def apply(component: String): Console = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[Console]
    
    @JSImport("@wdio/logger/build/web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/logger/build/web", "default.clearLogger")
    @js.native
    def clearLogger: js.Function0[Unit] = js.native
    @scala.inline
    def clearLogger_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearLogger")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/logger/build/web", "default.setLevel")
    @js.native
    def setLevel: js.Function0[Unit] = js.native
    @scala.inline
    def setLevel_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/logger/build/web", "default.setLogLevelsConfig")
    @js.native
    def setLogLevelsConfig: js.Function0[Unit] = js.native
    @scala.inline
    def setLogLevelsConfig_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setLogLevelsConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/logger/build/web", "default.waitForBuffer")
    @js.native
    def waitForBuffer: js.Function0[Unit] = js.native
    @scala.inline
    def waitForBuffer_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitForBuffer")(x.asInstanceOf[js.Any])
  }
}
