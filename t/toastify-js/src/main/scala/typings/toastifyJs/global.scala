package typings.toastifyJs

import typings.toastifyJs.anon.ShowToast
import typings.toastifyJs.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Toastify {
    
    inline def apply(): ShowToast = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ShowToast]
    inline def apply(options: Options): ShowToast = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ShowToast]
    
    @JSGlobal("Toastify")
    @js.native
    val ^ : js.Any = js.native
    
    inline def reposition(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reposition")().asInstanceOf[Unit]
  }
}
