package typings.supportsColor

import typings.supportsColor.mod.ColorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  object default {
    
    @JSImport("supports-color/browser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("supports-color/browser", "default.stderr")
    @js.native
    def stderr: ColorInfo = js.native
    inline def stderr_=(x: ColorInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stderr")(x.asInstanceOf[js.Any])
    
    @JSImport("supports-color/browser", "default.stdout")
    @js.native
    def stdout: ColorInfo = js.native
    inline def stdout_=(x: ColorInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stdout")(x.asInstanceOf[js.Any])
  }
}
