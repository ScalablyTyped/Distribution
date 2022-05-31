package typings.webfontloader

import typings.webfontloader.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WebFont {
    
    @JSGlobal("WebFont")
    @js.native
    val ^ : js.Any = js.native
    
    inline def load(config: Config): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
