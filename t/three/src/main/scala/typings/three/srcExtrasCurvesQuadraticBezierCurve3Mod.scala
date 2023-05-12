package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesQuadraticBezierCurve3Mod {
  
  @JSImport("three/src/extras/curves/QuadraticBezierCurve3", "QuadraticBezierCurve3")
  @js.native
  /**
    * This constructor creates a new {@link QuadraticBezierCurve}.
    * @param v0 The start point. Default is `new THREE.Vector3()`.
    * @param v1 The control point. Default is `new THREE.Vector3()`.
    * @param v2 The end point. Default is `new THREE.Vector3()`.
    */
  open class QuadraticBezierCurve3 () extends Curve[Vector3] {
    def this(v0: Vector3) = this()
    def this(v0: Unit, v1: Vector3) = this()
    def this(v0: Vector3, v1: Vector3) = this()
    def this(v0: Unit, v1: Unit, v2: Vector3) = this()
    def this(v0: Unit, v1: Vector3, v2: Vector3) = this()
    def this(v0: Vector3, v1: Unit, v2: Vector3) = this()
    def this(v0: Vector3, v1: Vector3, v2: Vector3) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link QuadraticBezierCurve3}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isQuadraticBezierCurve3: /* true */ Boolean = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `QuadraticBezierCurve3`
      */
    @JSName("type")
    val type_QuadraticBezierCurve3: String | typings.three.threeStrings.QuadraticBezierCurve3 = js.native
    
    /**
      * The start point.
      * @defaultValue `new THREE.Vector3()`
      */
    var v0: Vector3 = js.native
    
    /**
      * The control point.
      * @defaultValue `new THREE.Vector3()`
      */
    var v1: Vector3 = js.native
    
    /**
      * The end point.
      * @defaultValue `new THREE.Vector3()`
      */
    var v2: Vector3 = js.native
  }
}
