package typings
package threeLib.srcObjectsLODMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/LOD", "LOD")
@js.native
class LOD ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  var levels: js.Array[threeLib.Anon_Distance] = js.native
  /**
  	 * @deprecated Use {@link LOD#levels .levels} instead.
  	 */
  var objects: js.Array[_] = js.native
  @JSName("type")
  var type_LOD: threeLib.threeLibStrings.LOD = js.native
  def addLevel(`object`: threeLib.srcCoreObject3DMod.Object3D): this.type = js.native
  def addLevel(`object`: threeLib.srcCoreObject3DMod.Object3D, distance: scala.Double): this.type = js.native
  def getObjectForDistance(distance: scala.Double): threeLib.srcCoreObject3DMod.Object3D = js.native
  def toJSON(meta: js.Any): js.Any = js.native
  def update(camera: threeLib.srcCamerasCameraMod.Camera): scala.Unit = js.native
}

