package typings.three

import typings.three.anon.FullHeight
import typings.three.srcCamerasCameraMod.Camera
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCamerasOrthographicCameraMod {
  
  @JSImport("three/src/cameras/OrthographicCamera", "OrthographicCamera")
  @js.native
  open class OrthographicCamera protected () extends Camera {
    /**
      * Creates a new {@link OrthographicCamera}.
      * @remarks Together these define the camera's {@link https://en.wikipedia.org/wiki/Viewing_frustum | viewing frustum}.
      * @param left Camera frustum left plane. Default `-1`.
      * @param right Camera frustum right plane. Default `1`.
      * @param top Camera frustum top plane. Default `1`.
      * @param bottom Camera frustum bottom plane. Default `-1`.
      * @param near Camera frustum near plane. Default `0.1`.
      * @param far Camera frustum far plane. Default `2000`.
      */
    def this(
      left: js.UndefOr[Double],
      right: js.UndefOr[Double],
      top: js.UndefOr[Double],
      bottom: js.UndefOr[Double],
      near: js.UndefOr[Double],
      far: js.UndefOr[Double]
    ) = this()
    
    /**
      * Camera frustum bottom plane.
      * @remarks Expects a `Float`.
      * @defaultValue `-1`
      */
    var bottom: Double = js.native
    
    /**
      * Removes any offset set by the {@link setViewOffset | .setViewOffset} method.
      */
    def clearViewOffset(): Unit = js.native
    
    /**
      * Camera frustum far plane.
      * @remarks Must be greater than the current value of {@link near | .near} plane.
      * @remarks Expects a `Float`
      * @defaultValue `2000`
      */
    var far: Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link OrthographicCamera}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isOrthographicCamera: `true` = js.native
    
    /**
      * Camera frustum left plane.
      * @remarks Expects a `Float`
      * @defaultValue `-1`
      */
    var left: Double = js.native
    
    /**
      * Camera frustum near plane.`.
      * @remarks The valid range is between `0` and the current value of the {@link far | .far} plane.
      * @remarks Note that, unlike for the {@link THREE.PerspectiveCamera | PerspectiveCamera}, `0` is a valid value for an {@link THREE.OrthographicCamera | OrthographicCamera's} near plane.
      * @remarks Expects a `Float`
      * @defaultValue `0.1`
      */
    var near: Double = js.native
    
    /**
      * Camera frustum right plane.
      * @remarks Expects a `Float`
      * @defaultValue `1`
      */
    var right: Double = js.native
    
    /**
      * Sets an offset in a larger {@link https://en.wikipedia.org/wiki/Viewing_frustum | viewing frustum}
      * @remarks
      * This is useful for multi-window or multi-monitor/multi-machine setups
      * For an example on how to use it see {@link PerspectiveCamera.setViewOffset | PerspectiveCamera}.
      * @see {@link THREE.PerspectiveCamera.setViewOffset | PerspectiveCamera}.
      * @param fullWidth Full width of multiview setup Expects a `Float`.
      * @param fullHeight Full height of multiview setup Expects a `Float`.
      * @param x Horizontal offset of subcamera Expects a `Float`.
      * @param y Vertical offset of subcamera Expects a `Float`.
      * @param width Width of subcamera Expects a `Float`.
      * @param height Height of subcamera Expects a `Float`.
      */
    def setViewOffset(
      fullWidth: Double,
      fullHeight: Double,
      offsetX: Double,
      offsetY: Double,
      width: Double,
      height: Double
    ): Unit = js.native
    
    /**
      * Camera frustum top plane.
      * @remarks Expects a `Float`
      * @defaultValue `1`
      */
    var top: Double = js.native
    
    /**
      * @override
      * @defaultValue `OrthographicCamera`
      */
    @JSName("type")
    val type_OrthographicCamera: String | typings.three.threeStrings.OrthographicCamera = js.native
    
    /**
      * Updates the camera projection matrix
      * @remarks Must be called after any change of parameters.
      */
    def updateProjectionMatrix(): Unit = js.native
    
    /**
      * Set by {@link setViewOffset | .setViewOffset()}.
      * @defaultValue `null`
      */
    var view: Null | FullHeight = js.native
    
    /**
      * Gets or sets the zoom factor of the camera.
      * @defaultValue `1`
      */
    var zoom: Double = js.native
  }
}
