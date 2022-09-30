package typings.three

import typings.std.HTMLElement
import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Camera
import typings.three.threeMod.EventDispatcher
import typings.three.threeMod.Raycaster
import typings.three.threeMod.Scene
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcballControlsMod {
  
  @JSImport("three/examples/jsm/controls/ArcballControls", "ArcballControls")
  @js.native
  open class ArcballControls protected () extends EventDispatcher[Event] {
    def this(camera: Camera, domElement: HTMLElement) = this()
    def this(camera: Camera, domElement: HTMLElement, scene: Scene) = this()
    
    def activateGizmos(isActive: Boolean): Unit = js.native
    
    /**
      * @default true
      */
    var adjustNearFar: Boolean = js.native
    
    var camera: Camera | Null = js.native
    
    def copyState(): Unit = js.native
    
    // if grid should be showed during pan operation
    /**
      * @default false
      */
    var cursorZoom: Boolean = js.native
    
    /**
      * @default 25
      */
    var dampingFactor: Double = js.native
    
    def dispose(): Unit = js.native
    
    var domElement: HTMLElement = js.native
    
    // maximum angular velocity allowed
    /**
      * @default true
      */
    var enableAnimations: Boolean = js.native
    
    /**
      * @default true
      */
    var enableGizmos: Boolean = js.native
    
    // if animations should be performed
    /**
      * @default false
      */
    var enableGrid: Boolean = js.native
    
    /**
      * @default true
      */
    var enablePan: Boolean = js.native
    
    /**
      * @default true
      */
    var enableRotate: Boolean = js.native
    
    /**
      * @default true
      */
    var enableZoom: Boolean = js.native
    
    /**
      * @default true
      */
    var enabled: Boolean = js.native
    
    /**
      * @default 500
      */
    var focusAnimationTime: Double = js.native
    
    def getRaycaster(): Raycaster = js.native
    
    /**
      * @default Infinity
      */
    var maxDistance: Double = js.native
    
    /**
      * @default 90
      */
    var maxFov: Double = js.native
    
    /**
      * @default Infinity
      */
    var maxZoom: Double = js.native
    
    /**
      * @default 0
      */
    var minDistance: Double = js.native
    
    // if wheel zoom should be cursor centered
    /**
      * @default 5
      */
    var minFov: Double = js.native
    
    /**
      * @default 0
      */
    var minZoom: Double = js.native
    
    def pasteState(): Unit = js.native
    
    /**
      * @default 0.67
      */
    var radiusFactor: Double = js.native
    
    def reset(): Unit = js.native
    
    def saveState(): Unit = js.native
    
    /**
      * @default 1.1
      */
    var scaleFactor: Double = js.native
    
    var scene: js.UndefOr[Scene | Null] = js.native
    
    def setCamera(camera: Camera): Unit = js.native
    
    def setGizmosVisible(value: Boolean): Unit = js.native
    
    def setMouseAction(operation: ArcballControlsMouseActionOperations, mouse: ArcballControlsMouseActionMouse): Boolean = js.native
    def setMouseAction(
      operation: ArcballControlsMouseActionOperations,
      mouse: ArcballControlsMouseActionMouse,
      key: ArcballControlsMouseActionKeys
    ): Boolean = js.native
    
    def setTbRadius(value: Double): Unit = js.native
    
    /**
      * @default Vector3(0,0,0)
      */
    var target: Vector3 = js.native
    
    def unsetMouseAction(mouse: ArcballControlsMouseActionMouse): Boolean = js.native
    def unsetMouseAction(mouse: ArcballControlsMouseActionMouse, key: ArcballControlsMouseActionKeys): Boolean = js.native
    
    def update(): Unit = js.native
    
    /**
      * @default 20
      */
    var wMax: Double = js.native
  }
  
  @js.native
  sealed trait ArcballControlsMouseActionKeys extends StObject
  @JSImport("three/examples/jsm/controls/ArcballControls", "ArcballControlsMouseActionKeys")
  @js.native
  object ArcballControlsMouseActionKeys extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ArcballControlsMouseActionKeys & String] = js.native
    
    @js.native
    sealed trait CTRL
      extends StObject
         with ArcballControlsMouseActionKeys
    /* "CTRL" */ val CTRL: typings.three.arcballControlsMod.ArcballControlsMouseActionKeys.CTRL & String = js.native
    
    @js.native
    sealed trait SHIFT
      extends StObject
         with ArcballControlsMouseActionKeys
    /* "SHIFT" */ val SHIFT: typings.three.arcballControlsMod.ArcballControlsMouseActionKeys.SHIFT & String = js.native
  }
  
  @js.native
  sealed trait ArcballControlsMouseActionOperations extends StObject
  @JSImport("three/examples/jsm/controls/ArcballControls", "ArcballControlsMouseActionOperations")
  @js.native
  object ArcballControlsMouseActionOperations extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ArcballControlsMouseActionOperations & String] = js.native
    
    @js.native
    sealed trait FOV
      extends StObject
         with ArcballControlsMouseActionOperations
    /* "FOV" */ val FOV: typings.three.arcballControlsMod.ArcballControlsMouseActionOperations.FOV & String = js.native
    
    @js.native
    sealed trait PAN
      extends StObject
         with ArcballControlsMouseActionOperations
    /* "PAN" */ val PAN: typings.three.arcballControlsMod.ArcballControlsMouseActionOperations.PAN & String = js.native
    
    @js.native
    sealed trait ROTATE
      extends StObject
         with ArcballControlsMouseActionOperations
    /* "ROTATE" */ val ROTATE: typings.three.arcballControlsMod.ArcballControlsMouseActionOperations.ROTATE & String = js.native
    
    @js.native
    sealed trait ZOOM
      extends StObject
         with ArcballControlsMouseActionOperations
    /* "ZOOM" */ val ZOOM: typings.three.arcballControlsMod.ArcballControlsMouseActionOperations.ZOOM & String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.threeInts.`0`
    - typings.three.threeInts.`1`
    - typings.three.threeInts.`2`
    - typings.three.threeStrings.WHEEL
  */
  trait ArcballControlsMouseActionMouse extends StObject
  object ArcballControlsMouseActionMouse {
    
    inline def `0`: typings.three.threeInts.`0` = 0.asInstanceOf[typings.three.threeInts.`0`]
    
    inline def `1`: typings.three.threeInts.`1` = 1.asInstanceOf[typings.three.threeInts.`1`]
    
    inline def `2`: typings.three.threeInts.`2` = 2.asInstanceOf[typings.three.threeInts.`2`]
    
    inline def WHEEL: typings.three.threeStrings.WHEEL = "WHEEL".asInstanceOf[typings.three.threeStrings.WHEEL]
  }
}
