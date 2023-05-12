package typings.three

import typings.three.anon.FullHeight
import typings.three.srcCamerasCameraMod.Camera
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCamerasPerspectiveCameraMod {
  
  @JSImport("three/src/cameras/PerspectiveCamera", "PerspectiveCamera")
  @js.native
  /**
    * Creates a new {@link PerspectiveCamera}.
    * @remarks Together these define the camera's {@link https://en.wikipedia.org/wiki/Viewing_frustum | viewing frustum}.
    * @param fov Camera frustum vertical field of view. Default `50`.
    * @param aspect Camera frustum aspect ratio. Default `1`.
    * @param near Camera frustum near plane. Default `0.1`.
    * @param far Camera frustum far plane. Default `2000`.
    */
  open class PerspectiveCamera () extends Camera {
    def this(fov: Double) = this()
    def this(fov: Double, aspect: Double) = this()
    def this(fov: Unit, aspect: Double) = this()
    def this(fov: Double, aspect: Double, near: Double) = this()
    def this(fov: Double, aspect: Unit, near: Double) = this()
    def this(fov: Unit, aspect: Double, near: Double) = this()
    def this(fov: Unit, aspect: Unit, near: Double) = this()
    def this(fov: Double, aspect: Double, near: Double, far: Double) = this()
    def this(fov: Double, aspect: Double, near: Unit, far: Double) = this()
    def this(fov: Double, aspect: Unit, near: Double, far: Double) = this()
    def this(fov: Double, aspect: Unit, near: Unit, far: Double) = this()
    def this(fov: Unit, aspect: Double, near: Double, far: Double) = this()
    def this(fov: Unit, aspect: Double, near: Unit, far: Double) = this()
    def this(fov: Unit, aspect: Unit, near: Double, far: Double) = this()
    def this(fov: Unit, aspect: Unit, near: Unit, far: Double) = this()
    
    /**
      * Camera frustum aspect ratio, usually the canvas width / canvas height.
      * @remarks Expects a `Float`
      * @defaultValue `1`, _(square canvas)_.
      */
    var aspect: Double = js.native
    
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
      * Film size used for the larger axis.
      * This parameter does not influence the projection matrix unless {@link filmOffset | .filmOffset} is set to a nonzero value.
      * @remarks Expects a `Float`
      * @defaultValue `35`, _millimeters_.
      */
    var filmGauge: Double = js.native
    
    /**
      * Horizontal off-center offset in the same unit as {@link filmGauge | .filmGauge}.
      * @remarks Expects a `Float`
      * @defaultValue `0`
      */
    var filmOffset: Double = js.native
    
    /**
      * Object distance used for stereoscopy and depth-of-field effects.
      * @remarks This parameter does not influence the projection matrix unless a {@link THREE.StereoCamera | StereoCamera} is being used.
      * @remarks Expects a `Float`
      * @defaultValue `10`
      */
    var focus: Double = js.native
    
    /**
      * Camera frustum vertical field of view, from bottom to top of view, in degrees.
      * @remarks Expects a `Float`
      * @defaultValue `50`
      */
    var fov: Double = js.native
    
    /**
      * Returns the current vertical field of view angle in degrees considering {@link zoom | .zoom}.
      */
    def getEffectiveFOV(): Double = js.native
    
    /**
      * Returns the height of the image on the film
      * @remarks
      * If {@link aspect | .aspect}. is less than or equal to one (portrait format), the result equals {@link filmGauge | .filmGauge}.
      */
    def getFilmHeight(): Double = js.native
    
    /**
      * Returns the width of the image on the film
      * @remarks
      * If {@link aspect | .aspect}. is greater than or equal to one (landscape format), the result equals {@link filmGauge | .filmGauge}.
      */
    def getFilmWidth(): Double = js.native
    
    /**
      * Returns the focal length of the current {@link .fov | fov} in respect to {@link filmGauge | .filmGauge}.
      */
    def getFocalLength(): Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link Camera}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isPerspectiveCamera: `true` = js.native
    
    /**
      * Camera frustum near plane.
      * @remarks The valid range is greater than `0` and less than the current value of the {@link far | .far} plane.
      * @remarks Note that, unlike for the {@link THREE.OrthographicCamera | OrthographicCamera}, `0` is **not** a valid value for a {@link PerspectiveCamera |PerspectiveCamera's}. near plane.
      * @defaultValue `0.1`
      * @remarks Expects a `Float`
      */
    var near: Double = js.native
    
    /**
      * Sets the FOV by focal length in respect to the current {@link filmGauge | .filmGauge}.
      * @remarks By default, the focal length is specified for a `35mm` (full frame) camera.
      * @param focalLength Expects a `Float`
      */
    def setFocalLength(focalLength: Double): Unit = js.native
    
    /**
      * @deprecated Use {@link PerspectiveCamera.setFocalLength | .setFocalLength()} and {@link PerspectiveCamera.filmGauge | .filmGauge} instead.
      */
    def setLens(focalLength: Double): Unit = js.native
    def setLens(focalLength: Double, frameHeight: Double): Unit = js.native
    
    /**
      * Sets an offset in a larger frustum.
      * @remarks
      * This is useful for multi-window or multi-monitor/multi-machine setups.
      *
      * For example, if you have 3x2 monitors and each monitor is _1920x1080_ and
      * the monitors are in grid like this
      * ```
      * ┌───┬───┬───┐
      * │ A │ B │ C │
      * ├───┼───┼───┤
      * │ D │ E │ F │
      * └───┴───┴───┘
      * ```
      * then for each monitor you would call it like this
      * ```typescript
      *   const w = 1920;
      *   const h = 1080;
      *   const fullWidth = w * 3;
      *   const fullHeight = h * 2;
      *
      *   // Monitor - A
      *   camera.setViewOffset( fullWidth, fullHeight, w * 0, h * 0, w, h );
      *   // Monitor - B
      *   camera.setViewOffset( fullWidth, fullHeight, w * 1, h * 0, w, h );
      *   // Monitor - C
      *   camera.setViewOffset( fullWidth, fullHeight, w * 2, h * 0, w, h );
      *   // Monitor - D
      *   camera.setViewOffset( fullWidth, fullHeight, w * 0, h * 1, w, h );
      *   // Monitor - E
      *   camera.setViewOffset( fullWidth, fullHeight, w * 1, h * 1, w, h );
      *   // Monitor - F
      *   camera.setViewOffset( fullWidth, fullHeight, w * 2, h * 1, w, h );
      * ```
      * Note there is no reason monitors have to be the same size or in a grid.
      * @param fullWidth Full width of multiview setup Expects a `Float`.
      * @param fullHeight Full height of multiview setup Expects a `Float`.
      * @param x Horizontal offset of subcamera Expects a `Float`.
      * @param y Vertical offset of subcamera Expects a `Float`.
      * @param width Width of subcamera Expects a `Float`.
      * @param height Height of subcamera Expects a `Float`.
      */
    def setViewOffset(fullWidth: Double, fullHeight: Double, x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /**
      * @override
      * @defaultValue `PerspectiveCamera`
      */
    @JSName("type")
    val type_PerspectiveCamera: String | typings.three.threeStrings.PerspectiveCamera = js.native
    
    /**
      * Updates the camera projection matrix
      * @remarks Must be called after any change of parameters.
      */
    def updateProjectionMatrix(): Unit = js.native
    
    /**
      * Frustum window specification or null.
      * This is set using the {@link setViewOffset | .setViewOffset} method and cleared using {@link clearViewOffset | .clearViewOffset}.
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
