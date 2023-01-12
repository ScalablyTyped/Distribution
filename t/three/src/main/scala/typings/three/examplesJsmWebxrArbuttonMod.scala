package typings.three

import typings.std.HTMLElement
import typings.three.anon.PartialARButtonSessionIni
import typings.three.anon.Root
import typings.three.srcThreeMod.WebGLRenderer
import typings.webxr.XRSessionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmWebxrArbuttonMod {
  
  object ARButton {
    
    @JSImport("three/examples/jsm/webxr/ARButton", "ARButton")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createButton(renderer: WebGLRenderer): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createButton")(renderer.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    inline def createButton(renderer: WebGLRenderer, sessionInit: PartialARButtonSessionIni): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createButton")(renderer.asInstanceOf[js.Any], sessionInit.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  }
  
  trait ARButtonSessionInit
    extends StObject
       with XRSessionInit {
    
    @JSName("domOverlay")
    var domOverlay_ARButtonSessionInit: Root
  }
  object ARButtonSessionInit {
    
    inline def apply(domOverlay: Root): ARButtonSessionInit = {
      val __obj = js.Dynamic.literal(domOverlay = domOverlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARButtonSessionInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ARButtonSessionInit] (val x: Self) extends AnyVal {
      
      inline def setDomOverlay(value: Root): Self = StObject.set(x, "domOverlay", value.asInstanceOf[js.Any])
    }
  }
}
