package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Points")
@js.native
/**
  * @param geometry An instance of Geometry or BufferGeometry.
  * @param material An instance of Material (optional).
  */
class Points () extends Object3D {
  def this(geometry: BufferGeometry) = this()
  def this(geometry: Geometry) = this()
  def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
  def this(geometry: BufferGeometry, material: Material) = this()
  def this(geometry: Geometry, material: js.Array[Material]) = this()
  def this(geometry: Geometry, material: Material) = this()
  /**
    * An instance of Geometry or BufferGeometry, where each vertex designates the position of a particle in the system.
    */
  var geometry: Geometry | BufferGeometry = js.native
  var isPoints: threeLib.threeLibNumbers.`true` = js.native
  /**
    * An instance of Material, defining the object's appearance. Default is a PointsMaterial with randomised colour.
    */
  var material: Material | js.Array[Material] = js.native
  @JSName("type")
  var type_Points: threeLib.threeLibStrings.Points = js.native
}

