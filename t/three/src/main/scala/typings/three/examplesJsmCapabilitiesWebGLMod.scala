package typings.three

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmCapabilitiesWebGLMod {
  
  object default {
    
    @JSImport("three/examples/jsm/capabilities/WebGL", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getErrorMessage(version: Double): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorMessage")(version.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    inline def getWebGL2ErrorMessage(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebGL2ErrorMessage")().asInstanceOf[HTMLElement]
    
    inline def getWebGLErrorMessage(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebGLErrorMessage")().asInstanceOf[HTMLElement]
    
    inline def isWebGL2Available(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebGL2Available")().asInstanceOf[Boolean]
    
    inline def isWebGLAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebGLAvailable")().asInstanceOf[Boolean]
  }
}
