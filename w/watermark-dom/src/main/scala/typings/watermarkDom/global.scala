package typings.watermarkDom

import typings.watermarkDom.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object watermark {
    
    @JSGlobal("watermark")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(settings: Settings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def load(settings: Settings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def remove(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[Unit]
  }
}
