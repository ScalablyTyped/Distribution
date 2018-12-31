package typings
package threeLib.threeDashProjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-projector", "Projector")
@js.native
class Projector () extends js.Object {
  /**
    * Transforms a 3D scene object into 2D render data that can be rendered in a screen with your renderer of choice, projecting and clipping things out according to the used camera.
    * If the scene were a real scene, this method would be the equivalent of taking a picture with the camera (and developing the film would be the next step, using a Renderer).
    *
    * @param scene scene to project.
    * @param camera camera to use in the projection.
    * @param sort select whether to sort elements using the Painter's algorithm.
    */
  def projectScene(
    scene: threeLib.threeDashCoreMod.Scene,
    camera: threeLib.threeDashCoreMod.Camera,
    sortObjects: scala.Boolean
  ): threeLib.Anon_LightsObjects = js.native
  def projectScene(
    scene: threeLib.threeDashCoreMod.Scene,
    camera: threeLib.threeDashCoreMod.Camera,
    sortObjects: scala.Boolean,
    sortElements: scala.Boolean
  ): threeLib.Anon_LightsObjects = js.native
  // deprecated.
  def projectVector(vector: threeLib.threeDashCoreMod.Vector3, camera: threeLib.threeDashCoreMod.Camera): threeLib.threeDashCoreMod.Vector3 = js.native
  // deprecated.
  def unprojectVector(vector: threeLib.threeDashCoreMod.Vector3, camera: threeLib.threeDashCoreMod.Camera): threeLib.threeDashCoreMod.Vector3 = js.native
}

