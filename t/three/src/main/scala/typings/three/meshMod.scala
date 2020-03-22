package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Mesh", JSImport.Namespace)
@js.native
object meshMod extends js.Object {
  @js.native
  class Mesh () extends Object3D {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
    def this(geometry: BufferGeometry, material: Material) = this()
    def this(geometry: Geometry, material: js.Array[Material]) = this()
    def this(geometry: Geometry, material: Material) = this()
    var geometry: Geometry | BufferGeometry = js.native
    val isMesh: `true` = js.native
    var material: Material | js.Array[Material] = js.native
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    def updateMorphTargets(): Unit = js.native
  }
  
}

