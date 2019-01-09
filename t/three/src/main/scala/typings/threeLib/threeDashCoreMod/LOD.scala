package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "LOD")
@js.native
class LOD () extends Object3D {
  var levels: js.Array[threeLib.Anon_Distance] = js.native
  /**
    * @deprecated Use {@link LOD#levels .levels} instead.
    */
  var objects: js.Array[_] = js.native
  @JSName("type")
  var type_LOD: threeLib.threeLibStrings.LOD = js.native
  def addLevel(`object`: Object3D): scala.Unit = js.native
  def addLevel(`object`: Object3D, distance: scala.Double): scala.Unit = js.native
  def getObjectForDistance(distance: scala.Double): Object3D = js.native
  def toJSON(meta: js.Any): js.Any = js.native
  def update(camera: Camera): scala.Unit = js.native
}

