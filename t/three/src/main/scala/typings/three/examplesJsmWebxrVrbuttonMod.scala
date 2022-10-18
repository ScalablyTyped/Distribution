package typings.three

import typings.std.HTMLElement
import typings.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmWebxrVrbuttonMod {
  
  object VRButton {
    
    @JSImport("three/examples/jsm/webxr/VRButton", "VRButton")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createButton(renderer: WebGLRenderer): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createButton")(renderer.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  }
}
