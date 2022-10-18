package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersCameraHelperMod {
  
  @JSImport("three/src/helpers/CameraHelper", "CameraHelper")
  @js.native
  open class CameraHelper protected ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    def this(camera: Camera) = this()
    
    var camera: Camera = js.native
    
    def dispose(): Unit = js.native
    
    var pointMap: StringDictionary[js.Array[Double]] = js.native
    
    def update(): Unit = js.native
  }
}
