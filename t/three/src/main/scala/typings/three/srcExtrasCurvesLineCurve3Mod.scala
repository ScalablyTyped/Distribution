package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesLineCurve3Mod {
  
  @JSImport("three/src/extras/curves/LineCurve3", "LineCurve3")
  @js.native
  /**
    * This constructor creates a new {@link LineCurve3}.
    * @param v1 The start point. Default is `new THREE.Vector3()`.
    * @param v2 The end point. Default is `new THREE.Vector3()`.
    */
  open class LineCurve3 () extends Curve[Vector3] {
    def this(v1: Vector3) = this()
    def this(v1: Unit, v2: Vector3) = this()
    def this(v1: Vector3, v2: Vector3) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link LineCurve3}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isLineCurve3: /* true */ Boolean = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `LineCurve3`
      */
    @JSName("type")
    val type_LineCurve3: String | typings.three.threeStrings.LineCurve3 = js.native
    
    /**
      * The start point.
      * @defaultValue `new THREE.Vector3()`.
      */
    var v1: Vector3 = js.native
    
    /**
      * The end point.
      * @defaultValue `new THREE.Vector3()`.
      */
    var v2: Vector3 = js.native
  }
}
