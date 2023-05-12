package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesCubicBezierCurve3Mod {
  
  @JSImport("three/src/extras/curves/CubicBezierCurve3", "CubicBezierCurve3")
  @js.native
  /**
    * This constructor creates a new {@link CubicBezierCurve3}.
    * @param v0 The starting point. Default is `new THREE.Vector3()`.
    * @param v1 The first control point. Default is `new THREE.Vector3()`.
    * @param v2 The second control point. Default is `new THREE.Vector3()`.
    * @param v3 The ending point. Default is `new THREE.Vector3()`.
    */
  open class CubicBezierCurve3 () extends Curve[Vector3] {
    def this(v0: Vector3) = this()
    def this(v0: Unit, v1: Vector3) = this()
    def this(v0: Vector3, v1: Vector3) = this()
    def this(v0: Unit, v1: Unit, v2: Vector3) = this()
    def this(v0: Unit, v1: Vector3, v2: Vector3) = this()
    def this(v0: Vector3, v1: Unit, v2: Vector3) = this()
    def this(v0: Vector3, v1: Vector3, v2: Vector3) = this()
    def this(v0: Unit, v1: Unit, v2: Unit, v3: Vector3) = this()
    def this(v0: Unit, v1: Unit, v2: Vector3, v3: Vector3) = this()
    def this(v0: Unit, v1: Vector3, v2: Unit, v3: Vector3) = this()
    def this(v0: Unit, v1: Vector3, v2: Vector3, v3: Vector3) = this()
    def this(v0: Vector3, v1: Unit, v2: Unit, v3: Vector3) = this()
    def this(v0: Vector3, v1: Unit, v2: Vector3, v3: Vector3) = this()
    def this(v0: Vector3, v1: Vector3, v2: Unit, v3: Vector3) = this()
    def this(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link CubicBezierCurve3}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isCubicBezierCurve3: /* true */ Boolean = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `CubicBezierCurve3`
      */
    @JSName("type")
    val type_CubicBezierCurve3: String | typings.three.threeStrings.CubicBezierCurve3 = js.native
    
    /**
      * The starting point.
      * @defaultValue `new THREE.Vector3()`.
      */
    var v0: Vector3 = js.native
    
    /**
      * The first control point.
      * @defaultValue `new THREE.Vector3()`.
      */
    var v1: Vector3 = js.native
    
    /**
      * The second control point.
      * @defaultValue `new THREE.Vector3()`.
      */
    var v2: Vector3 = js.native
    
    /**
      * The ending point.
      * @defaultValue `new THREE.Vector3()`.
      */
    var v3: Vector3 = js.native
  }
}
