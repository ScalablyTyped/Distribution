package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesQuadraticBezierCurveMod {
  
  @JSImport("three/src/extras/curves/QuadraticBezierCurve", "QuadraticBezierCurve")
  @js.native
  /**
    * This constructor creates a new {@link QuadraticBezierCurve}.
    * @param v0 The start point. Default is `new THREE.Vector2()`.
    * @param v1 The control point. Default is `new THREE.Vector2()`.
    * @param v2 The end point. Default is `new THREE.Vector2()`.
    */
  open class QuadraticBezierCurve () extends Curve[Vector2] {
    def this(v0: Vector2) = this()
    def this(v0: Unit, v1: Vector2) = this()
    def this(v0: Vector2, v1: Vector2) = this()
    def this(v0: Unit, v1: Unit, v2: Vector2) = this()
    def this(v0: Unit, v1: Vector2, v2: Vector2) = this()
    def this(v0: Vector2, v1: Unit, v2: Vector2) = this()
    def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link LineCurve3}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isQuadraticBezierCurve: /* true */ Boolean = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `QuadraticBezierCurve`
      */
    @JSName("type")
    val type_QuadraticBezierCurve: String | typings.three.threeStrings.QuadraticBezierCurve = js.native
    
    /**
      * The start point.
      * @defaultValue `new THREE.Vector2()`
      */
    var v0: Vector2 = js.native
    
    /**
      * The control point.
      * @defaultValue `new THREE.Vector2()`
      */
    var v1: Vector2 = js.native
    
    /**
      * The end point.
      * @defaultValue `new THREE.Vector2()`
      */
    var v2: Vector2 = js.native
  }
}
