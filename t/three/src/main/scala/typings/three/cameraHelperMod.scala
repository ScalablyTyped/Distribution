package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.cameraMod.Camera
import typings.three.geometryMod.Geometry
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraHelperMod {
  
  @JSImport("three/src/helpers/CameraHelper", "CameraHelper")
  @js.native
  class CameraHelper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(camera: Camera) = this()
    
    var camera: Camera = js.native
    
    var pointMap: StringDictionary[js.Array[Double]] = js.native
    
    def update(): Unit = js.native
  }
}
