package typings.three

import typings.three.boneMod.Bone
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonHelperMod {
  
  @JSImport("three/src/helpers/SkeletonHelper", "SkeletonHelper")
  @js.native
  open class SkeletonHelper protected ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    def this(`object`: Object3D[Event]) = this()
    
    var bones: js.Array[Bone] = js.native
    
    def getBoneList(`object`: Object3D[Event]): js.Array[Bone] = js.native
    
    val isSkeletonHelper: `true` = js.native
    
    var root: Object3D[Event] = js.native
    
    def update(): Unit = js.native
  }
}
