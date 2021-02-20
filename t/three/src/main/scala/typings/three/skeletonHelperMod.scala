package typings.three

import typings.three.boneMod.Bone
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonHelperMod {
  
  @JSImport("three/src/helpers/SkeletonHelper", "SkeletonHelper")
  @js.native
  class SkeletonHelper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(`object`: Object3D) = this()
    
    var bones: js.Array[Bone] = js.native
    
    def getBoneList(`object`: Object3D): js.Array[Bone] = js.native
    
    val isSkeletonHelper: `true` = js.native
    
    var root: Object3D = js.native
    
    def update(): Unit = js.native
  }
}
