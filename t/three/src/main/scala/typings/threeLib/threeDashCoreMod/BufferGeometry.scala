package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "BufferGeometry")
@js.native
class BufferGeometry () extends EventDispatcher {
  var attributes: org.scalablytyped.runtime.StringDictionary[BufferAttribute | InterleavedBufferAttribute] = js.native
  var boundingBox: Box3 = js.native
  var boundingSphere: Sphere = js.native
  var drawRange: threeLib.Anon_CountStartNumber = js.native
  /**
       * @deprecated Use {@link BufferGeometry#groups .groups} instead.
       */
  var drawcalls: js.Any = js.native
  var groups: js.Array[threeLib.Anon_CountStart] = js.native
  /**
       * Unique number of this buffergeometry instance
       */
  var id: scala.Double = js.native
  var index: BufferAttribute = js.native
  var morphAttributes: js.Any = js.native
  var name: java.lang.String = js.native
  /**
       * @deprecated Use {@link BufferGeometry#groups .groups} instead.
       */
  var offsets: js.Any = js.native
  var `type`: java.lang.String = js.native
  var uuid: java.lang.String = js.native
  def addAttribute(name: java.lang.String, attribute: BufferAttribute): BufferGeometry = js.native
  def addAttribute(name: java.lang.String, attribute: InterleavedBufferAttribute): BufferGeometry = js.native
  def addAttribute(name: js.Any, array: js.Any, itemSize: js.Any): js.Any = js.native
  /**
       * @deprecated Use {@link BufferGeometry#addGroup .addGroup()} instead.
       */
  def addDrawCall(start: js.Any, count: js.Any): scala.Unit = js.native
  /**
       * @deprecated Use {@link BufferGeometry#addGroup .addGroup()} instead.
       */
  def addDrawCall(start: js.Any, count: js.Any, indexOffset: js.Any): scala.Unit = js.native
  def addGroup(start: scala.Double, count: scala.Double): scala.Unit = js.native
  def addGroup(start: scala.Double, count: scala.Double, materialIndex: scala.Double): scala.Unit = js.native
  /**
       * @deprecated Use {@link BufferGeometry#setIndex .setIndex()} instead.
       */
  def addIndex(index: js.Any): scala.Unit = js.native
  /**
       * Bakes matrix transform directly into vertex coordinates.
       */
  def applyMatrix(matrix: Matrix4): BufferGeometry = js.native
  def center(): BufferGeometry = js.native
  /**
       * @deprecated Use {@link BufferGeometry#clearGroups .clearGroups()} instead.
       */
  def clearDrawCalls(): scala.Unit = js.native
  def clearGroups(): scala.Unit = js.native
  /**
       * Computes bounding box of the geometry, updating Geometry.boundingBox attribute.
       * Bounding boxes aren't computed by default. They need to be explicitly computed, otherwise they are null.
       */
  def computeBoundingBox(): scala.Unit = js.native
  /**
       * Computes bounding sphere of the geometry, updating Geometry.boundingSphere attribute.
       * Bounding spheres aren't' computed by default. They need to be explicitly computed, otherwise they are null.
       */
  def computeBoundingSphere(): scala.Unit = js.native
  /**
       * Computes vertex normals by averaging face normals.
       */
  def computeVertexNormals(): scala.Unit = js.native
  def copy(source: this.type): this.type = js.native
  /**
       * Disposes the object from memory.
       * You need to call this when you want the bufferGeometry removed while the application is running.
       */
  def dispose(): scala.Unit = js.native
  def fromDirectGeometry(geometry: DirectGeometry): BufferGeometry = js.native
  def fromGeometry(geometry: Geometry): BufferGeometry = js.native
  def fromGeometry(geometry: Geometry, settings: js.Any): BufferGeometry = js.native
  def getAttribute(name: java.lang.String): BufferAttribute | InterleavedBufferAttribute = js.native
  def getIndex(): BufferAttribute = js.native
  def lookAt(v: Vector3): scala.Unit = js.native
  def merge(geometry: BufferGeometry, offset: scala.Double): BufferGeometry = js.native
  def normalizeNormals(): scala.Unit = js.native
  def removeAttribute(name: java.lang.String): BufferGeometry = js.native
  def rotateX(angle: scala.Double): BufferGeometry = js.native
  def rotateY(angle: scala.Double): BufferGeometry = js.native
  def rotateZ(angle: scala.Double): BufferGeometry = js.native
  def scale(x: scala.Double, y: scala.Double, z: scala.Double): BufferGeometry = js.native
  def setDrawRange(start: scala.Double, count: scala.Double): scala.Unit = js.native
  def setFromObject(`object`: Object3D): BufferGeometry = js.native
  def setFromPoints(points: js.Array[Vector2 | Vector3]): BufferGeometry = js.native
  def setIndex(index: js.Array[scala.Double]): scala.Unit = js.native
  def setIndex(index: BufferAttribute): scala.Unit = js.native
  def toJSON(): js.Any = js.native
  def toNonIndexed(): BufferGeometry = js.native
  def translate(x: scala.Double, y: scala.Double, z: scala.Double): BufferGeometry = js.native
  def updateFromObject(`object`: Object3D): scala.Unit = js.native
}

@JSImport("three/three-core", "BufferGeometry")
@js.native
object BufferGeometry extends js.Object {
  var MaxIndex: scala.Double = js.native
}

