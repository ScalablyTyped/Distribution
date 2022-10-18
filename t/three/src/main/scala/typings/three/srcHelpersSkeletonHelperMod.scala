package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcObjectsBoneMod.Bone
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersSkeletonHelperMod {
  
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
