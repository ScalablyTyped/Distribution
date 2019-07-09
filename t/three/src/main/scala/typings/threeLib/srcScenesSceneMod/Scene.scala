package typings
package threeLib.srcScenesSceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/scenes/Scene", "Scene")
@js.native
class Scene ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  var autoUpdate: scala.Boolean = js.native
  var background: scala.Null | threeLib.srcMathColorMod.Color | threeLib.srcTexturesTextureMod.Texture = js.native
  /**
  	 * A fog instance defining the type of fog that affects everything rendered in the scene. Default is null.
  	 */
  var fog: threeLib.srcScenesFogMod.IFog | scala.Null = js.native
  /**
  	 * If not null, it will force everything in the scene to be rendered with that material. Default is null.
  	 */
  var overrideMaterial: threeLib.srcMaterialsMaterialMod.Material | scala.Null = js.native
  @JSName("type")
  var type_Scene: threeLib.threeLibStrings.Scene = js.native
  def copy(source: this.type): this.type = js.native
  def copy(source: this.type, recursive: scala.Boolean): this.type = js.native
  def dispose(): scala.Unit = js.native
  def toJSON(meta: js.Any): js.Any = js.native
}

