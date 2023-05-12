package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.Color
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersCameraHelperMod {
  
  @JSImport("three/src/helpers/CameraHelper", "CameraHelper")
  @js.native
  open class CameraHelper protected ()
    extends LineSegments[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    /**
      * This create a new {@link CameraHelper} for the specified camera.
      * @param camera The camera to visualize.
      */
    def this(camera: Camera) = this()
    
    /**
      * The camera being visualized.
      */
    var camera: Camera = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * This contains the points used to visualize the camera.
      */
    var pointMap: StringDictionary[js.Array[Double]] = js.native
    
    /**
      * Defines the colors of the helper.
      * @param frustum
      * @param cone
      * @param up
      * @param target
      * @param cross
      */
    def setColors(frustum: Color, cone: Color, up: Color, target: Color, cross: Color): this.type = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `CameraHelper`
      */
    @JSName("type")
    val type_CameraHelper: String | typings.three.threeStrings.CameraHelper = js.native
    
    /**
      * Updates the helper based on the projectionMatrix of the camera.
      */
    def update(): Unit = js.native
  }
}
