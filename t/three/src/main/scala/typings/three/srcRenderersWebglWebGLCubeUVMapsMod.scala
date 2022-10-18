package typings.three

import typings.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLCubeUVMapsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLCubeUVMaps", "WebGLCubeUVMaps")
  @js.native
  open class WebGLCubeUVMaps protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    
    def dispose(): Unit = js.native
    
    def get[T](texture: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends three.three/src/Three.Texture ? three.three/src/Three.Texture : T */ js.Any = js.native
  }
}
