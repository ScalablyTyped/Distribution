package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Scene")
@js.native
class Scene () extends Object3D {
  var autoUpdate: scala.Boolean = js.native
  var background: scala.Null | Color | Texture = js.native
  /**
    * A fog instance defining the type of fog that affects everything rendered in the scene. Default is null.
    */
  var fog: IFog | scala.Null = js.native
  /**
    * If not null, it will force everything in the scene to be rendered with that material. Default is null.
    */
  var overrideMaterial: Material | scala.Null = js.native
  @JSName("type")
  var type_Scene: threeLib.threeLibStrings.Scene = js.native
  def toJSON(meta: js.Any): js.Any = js.native
}

