package typings.uikit

import typings.uikit.anon.TypeofUIkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uikitIconsMod {
  
  object default {
    
    inline def apply(uikit: TypeofUIkit): Unit = ^.asInstanceOf[js.Dynamic].apply(uikit.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("uikit/dist/js/uikit-icons", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("uikit/dist/js/uikit-icons", "default.installed")
    @js.native
    def installed: Boolean = js.native
    inline def installed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("installed")(x.asInstanceOf[js.Any])
  }
  
  object Icons {
    
    inline def apply(uikit: TypeofUIkit): Unit = ^.asInstanceOf[js.Dynamic].apply(uikit.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("uikit/dist/js/uikit-icons", "Icons")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("uikit/dist/js/uikit-icons", "Icons.installed")
    @js.native
    def installed: Boolean = js.native
    inline def installed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("installed")(x.asInstanceOf[js.Any])
  }
}
