package typings
package threeLib.srcObjectsPointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Points", "Points")
@js.native
/**
	 * @param geometry An instance of Geometry or BufferGeometry.
	 * @param material An instance of Material (optional).
	 */
class Points ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
  /**
  	 * An instance of Geometry or BufferGeometry, where each vertex designates the position of a particle in the system.
  	 */
  var geometry: threeLib.srcCoreGeometryMod.Geometry | threeLib.srcCoreBufferGeometryMod.BufferGeometry = js.native
  var isPoints: threeLib.threeLibNumbers.`true` = js.native
  /**
  	 * An instance of Material, defining the object's appearance. Default is a PointsMaterial with randomised colour.
  	 */
  var material: threeLib.srcMaterialsMaterialMod.Material | js.Array[threeLib.srcMaterialsMaterialMod.Material] = js.native
  @JSName("type")
  var type_Points: threeLib.threeLibStrings.Points = js.native
}

