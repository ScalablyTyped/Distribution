package typings.three

import typings.three.colorMod.Color
import typings.three.fogMod.IFog
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/scenes/Scene", JSImport.Namespace)
@js.native
object sceneMod extends js.Object {
  @js.native
  class Scene () extends Object3D {
    var autoUpdate: Boolean = js.native
    var background: Null | Color | Texture = js.native
    /**
    	 * A fog instance defining the type of fog that affects everything rendered in the scene. Default is null.
    	 */
    var fog: IFog | Null = js.native
    /**
    	 * If not null, it will force everything in the scene to be rendered with that material. Default is null.
    	 */
    var overrideMaterial: Material | Null = js.native
    @JSName("type")
    var type_Scene: typings.three.threeStrings.Scene = js.native
    def dispose(): Unit = js.native
    def toJSON(meta: js.Any): js.Any = js.native
  }
  
}

