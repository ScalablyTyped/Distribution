package typings.three

import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import typings.three.anon.BOTTOM
import typings.three.anon.PartialLEFTMOUSEMIDDLEMOU
import typings.three.anon.PartialONETOUCHTWOTOUCH
import typings.three.anon.Target
import typings.three.srcThreeMod.Camera
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmControlsOrbitControlsMod {
  
  @JSImport("three/examples/jsm/controls/OrbitControls", "OrbitControls")
  @js.native
  open class OrbitControls protected () extends StObject {
    def this(`object`: Camera) = this()
    def this(`object`: Camera, domElement: HTMLElement) = this()
    
    // EventDispatcher mixins
    def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
    
    /**
      * Set to true to automatically rotate around the target.
      * Note that if this is enabled, you must call
      * .update () in your animation loop.
      */
    var autoRotate: Boolean = js.native
    
    /**
      * How fast to rotate around the target if .autoRotate is true.
      * Default is 2.0, which equates to 30 seconds per orbit at 60fps.
      * Note that if .autoRotate is enabled, you must call
      * .update () in your animation loop.
      * @default 2
      */
    var autoRotateSpeed: Double = js.native
    
    /** @deprecated */
    var center: Vector3 = js.native
    
    /**
      * The damping inertia used if .enableDamping is set to true.
      * Note that for this to work,
      * you must call .update () in your animation loop.
      * @default 0.05
      */
    var dampingFactor: Double = js.native
    
    def dispatchEvent(event: Target): Unit = js.native
    
    /**
      * Remove all the event listeners.
      */
    def dispose(): Unit = js.native
    
    /**
      * The HTMLElement used to listen for mouse / touch events.
      * This must be passed in the constructor;
      * changing it here will not set up new event listeners.
      */
    var domElement: HTMLElement | Document = js.native
    
    /**
      * Set to true to enable damping (inertia), which can
      * be used to give a sense of weight to the controls.
      * Note that if this is enabled, you must call
      * .update () in your animation loop.
      * @default false
      */
    var enableDamping: Boolean = js.native
    
    /**
      * Enable or disable camera panning.
      * @default true
      */
    var enablePan: Boolean = js.native
    
    /**
      * Enable or disable horizontal and
      * vertical rotation of the camera.
      * Note that it is possible to disable a single axis
      * by setting the min and max of the polar angle or
      * azimuth angle to the same value, which will cause
      * the vertical or horizontal rotation to be fixed at that value.
      * @default true
      */
    var enableRotate: Boolean = js.native
    
    /**
      * Enable or disable zooming (dollying) of the camera.
      * @default true
      */
    var enableZoom: Boolean = js.native
    
    /**
      * When set to `false`, the controls will not respond to user input.
      * @default true
      */
    var enabled: Boolean = js.native
    
    /**
      * Get the current horizontal rotation, in radians.
      */
    def getAzimuthalAngle(): Double = js.native
    
    /**
      * Returns the distance from the camera to the target.
      */
    def getDistance(): Double = js.native
    
    /**
      * Get the current vertical rotation, in radians.
      */
    def getPolarAngle(): Double = js.native
    
    def hasEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Boolean = js.native
    
    /**
      * How fast to pan the camera when the keyboard is used.
      * Default is 7.0 pixels per keypress.
      * @default 7
      */
    var keyPanSpeed: Double = js.native
    
    /**
      * This object contains references to the keycodes for controlling
      * camera panning. Default is the 4 arrow keys.
      */
    var keys: BOTTOM = js.native
    
    /**
      * Adds key event listeners to the given DOM element. `window`
      * is a recommended argument for using this method.
      * @param domElement
      */
    def listenToKeyEvents(domElement: HTMLElement): Unit = js.native
    def listenToKeyEvents(domElement: Window): Unit = js.native
    
    /**
      * How far you can orbit horizontally, upper limit.
      * If set, the interval [ min, max ] must be a sub-interval
      * of [ - 2 PI, 2 PI ], with ( max - min < 2 PI ).
      * @default Infinity
      */
    var maxAzimuthAngle: Double = js.native
    
    /**
      * How far you can dolly out ( PerspectiveCamera only ).
      * @default Infinity
      */
    var maxDistance: Double = js.native
    
    /**
      * How far you can orbit vertically, upper limit.
      * Range is 0 to Math.PI radians.
      * @default Math.PI.
      */
    var maxPolarAngle: Double = js.native
    
    /**
      * How far you can zoom out ( OrthographicCamera only ).
      * @default Infinity
      */
    var maxZoom: Double = js.native
    
    /**
      * How far you can orbit horizontally, lower limit.
      * If set, the interval [ min, max ]
      * must be a sub-interval of [ - 2 PI, 2 PI ],
      * with ( max - min < 2 PI ).
      * @default Infinity
      */
    var minAzimuthAngle: Double = js.native
    
    /**
      * How far you can dolly in ( PerspectiveCamera only ).
      * @default 0
      */
    var minDistance: Double = js.native
    
    /**
      * How far you can orbit vertically, lower limit.
      * Range is 0 to Math.PI radians.
      * @default 0
      */
    var minPolarAngle: Double = js.native
    
    /**
      * How far you can zoom in ( OrthographicCamera only ).
      * @default 0
      */
    var minZoom: Double = js.native
    
    /**
      * This object contains references to the mouse actions used
      * by the controls.
      */
    var mouseButtons: PartialLEFTMOUSEMIDDLEMOU = js.native
    
    /**
      * The camera being controlled.
      */
    var `object`: Camera = js.native
    
    /**
      * Speed of panning.
      * @default 1
      */
    var panSpeed: Double = js.native
    
    /**
      * Used internally by the .saveState and .reset methods.
      */
    var position0: Vector3 = js.native
    
    def removeEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
    
    /**
      * Reset the controls to their state from either the last time
      * the .saveState was called, or the initial state.
      */
    def reset(): Unit = js.native
    
    /**
      * Speed of rotation.
      * @default 1
      */
    var rotateSpeed: Double = js.native
    
    /**
      * Save the current state of the controls. This can later be
      * recovered with .reset.
      */
    def saveState(): Unit = js.native
    
    /**
      * Defines how the camera's position is translated when panning.
      * If true, the camera pans in screen space. Otherwise,
      * the camera pans in the plane orthogonal to the camera's
      * up direction. Default is true for OrbitControls; false for MapControls.
      * @default true
      */
    var screenSpacePanning: Boolean = js.native
    
    /**
      * Removes the key event listener previously defined with {@link listenToKeyEvents}.
      */
    def stopListenToKeyEvents(): Unit = js.native
    
    /**
      * The focus point of the controls, the .object orbits around this.
      * It can be updated manually at any point to change the focus
      * of the controls.
      */
    var target: Vector3 = js.native
    
    /**
      * Used internally by the .saveState and .reset methods.
      */
    var target0: Vector3 = js.native
    
    /**
      * This object contains references to the touch actions used by
      * the controls.
      */
    var touches: PartialONETOUCHTWOTOUCH = js.native
    
    /**
      * Update the controls. Must be called after any manual changes
      * to the camera's transform, or in the update loop if .autoRotate
      * or .enableDamping are set.
      */
    def update(): Boolean = js.native
    
    /**
      * Used internally by the .saveState and .reset methods.
      */
    var zoom0: Double = js.native
    
    /**
      * Speed of zooming / dollying.
      * @default 1
      */
    var zoomSpeed: Double = js.native
  }
}
