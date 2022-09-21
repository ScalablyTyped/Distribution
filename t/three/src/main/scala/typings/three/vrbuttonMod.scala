package typings.three

import typings.std.HTMLElement
import typings.three.threeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vrbuttonMod {
  
  object VRButton {
    
    @JSImport("three/examples/jsm/webxr/VRButton", "VRButton")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createButton(renderer: WebGLRenderer): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createButton")(renderer.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  }
}
