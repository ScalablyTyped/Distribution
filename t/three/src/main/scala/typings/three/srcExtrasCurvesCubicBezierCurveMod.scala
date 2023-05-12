package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesCubicBezierCurveMod {
  
  @JSImport("three/src/extras/curves/CubicBezierCurve", "CubicBezierCurve")
  @js.native
  /**
    * This constructor creates a new {@link CubicBezierCurve}.
    * @param v0 The starting point. Default is `new THREE.Vector2()`.
    * @param v1 The first control point. Default is `new THREE.Vector2()`.
    * @param v2 The second control point. Default is `new THREE.Vector2()`.
    * @param v3 The ending point. Default is `new THREE.Vector2()`.
    */
  open class CubicBezierCurve () extends Curve[Vector2] {
    def this(v0: Vector2) = this()
    def this(v0: Unit, v1: Vector2) = this()
    def this(v0: Vector2, v1: Vector2) = this()
    def this(v0: Unit, v1: Unit, v2: Vector2) = this()
    def this(v0: Unit, v1: Vector2, v2: Vector2) = this()
    def this(v0: Vector2, v1: Unit, v2: Vector2) = this()
    def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
    def this(v0: Unit, v1: Unit, v2: Unit, v3: Vector2) = this()
    def this(v0: Unit, v1: Unit, v2: Vector2, v3: Vector2) = this()
    def this(v0: Unit, v1: Vector2, v2: Unit, v3: Vector2) = this()
    def this(v0: Unit, v1: Vector2, v2: Vector2, v3: Vector2) = this()
    def this(v0: Vector2, v1: Unit, v2: Unit, v3: Vector2) = this()
    def this(v0: Vector2, v1: Unit, v2: Vector2, v3: Vector2) = this()
    def this(v0: Vector2, v1: Vector2, v2: Unit, v3: Vector2) = this()
    def this(v0: Vector2, v1: Vector2, v2: Vector2, v3: Vector2) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link CubicBezierCurve}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isCubicBezierCurve: /* true */ Boolean = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `CubicBezierCurve`
      */
    @JSName("type")
    val type_CubicBezierCurve: String | typings.three.threeStrings.CubicBezierCurve = js.native
    
    /**
      * The starting point.
      * @defaultValue `new THREE.Vector2()`
      */
    var v0: Vector2 = js.native
    
    /**
      * The first control point.
      * @defaultValue `new THREE.Vector2()`
      */
    var v1: Vector2 = js.native
    
    /**
      * The second control point.
      * @defaultValue `new THREE.Vector2()`
      */
    var v2: Vector2 = js.native
    
    /**
      * The ending point.
      * @defaultValue `new THREE.Vector2()`
      */
    var v3: Vector2 = js.native
  }
}
