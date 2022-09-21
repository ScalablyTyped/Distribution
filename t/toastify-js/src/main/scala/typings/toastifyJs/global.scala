package typings.toastifyJs

import typings.toastifyJs.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Toastify {
    
    inline def apply(): typings.toastifyJs.mod.Toastify = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.toastifyJs.mod.Toastify]
    inline def apply(options: Options): typings.toastifyJs.mod.Toastify = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.toastifyJs.mod.Toastify]
    
    @JSGlobal("Toastify")
    @js.native
    val ^ : js.Any = js.native
    
    inline def reposition(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reposition")().asInstanceOf[Unit]
  }
}
