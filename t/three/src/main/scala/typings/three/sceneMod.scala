package typings.three

import typings.three.cameraMod.Camera
import typings.three.colorMod.Color
import typings.three.fogMod.IFog
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.textureMod.Texture
import typings.three.threeBooleans.`true`
import typings.three.webGLCubeRenderTargetMod.WebGLCubeRenderTarget
import typings.three.webGLRenderTargetMod.WebGLRenderTarget
import typings.three.webGLRendererMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneMod {
  
  @JSImport("three/src/scenes/Scene", "Scene")
  @js.native
  class Scene () extends Object3D {
    
    /**
    	 * @default true
    	 */
    var autoUpdate: Boolean = js.native
    
    /**
    	 * @default null
    	 */
    var background: Null | Color | Texture | WebGLCubeRenderTarget = js.native
    
    /**
    	 * @default null
    	 */
    var environment: Null | Texture = js.native
    
    /**
    	 * A fog instance defining the type of fog that affects everything rendered in the scene. Default is null.
    	 * @default null
    	 */
    var fog: IFog | Null = js.native
    
    val isScene: `true` = js.native
    
    /**
    	 * Calls after rendering scene
    	 */
    def onAfterRender(renderer: WebGLRenderer, scene: Scene, camera: Camera): Unit = js.native
    
    def onBeforeRender(renderer: WebGLRenderer, scene: Scene, camera: Camera, renderTarget: js.Any): Unit = js.native
    /**
    	 * Calls before rendering scene
    	 */
    def onBeforeRender(renderer: WebGLRenderer, scene: Scene, camera: Camera, renderTarget: WebGLRenderTarget): Unit = js.native
    
    /**
    	 * If not null, it will force everything in the scene to be rendered with that material. Default is null.
    	 * @default null
    	 */
    var overrideMaterial: Material | Null = js.native
    
    def toJSON(meta: js.Any): js.Any = js.native
    
    @JSName("type")
    var type_Scene: typings.three.threeStrings.Scene = js.native
  }
}
