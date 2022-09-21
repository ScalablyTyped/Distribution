package typings.three

import typings.three.threeMod.Texture
import typings.three.threeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLCubeUVMapsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLCubeUVMaps", "WebGLCubeUVMaps")
  @js.native
  open class WebGLCubeUVMaps protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    
    def dispose(): Unit = js.native
    
    def get[T](texture: T): T | Texture = js.native
  }
}
