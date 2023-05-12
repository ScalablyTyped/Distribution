package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesLineCurveMod {
  
  @JSImport("three/src/extras/curves/LineCurve", "LineCurve")
  @js.native
  /**
    * This constructor creates a new {@link LineCurve}.
    * @param v1 The start point. Default is `new THREE.Vector2()`.
    * @param v2 The end point. Default is `new THREE.Vector2()`.
    */
  open class LineCurve () extends Curve[Vector2] {
    def this(v1: Vector2) = this()
    def this(v1: Unit, v2: Vector2) = this()
    def this(v1: Vector2, v2: Vector2) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link LineCurve}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isLineCurve: /* true */ Boolean = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `LineCurve`
      */
    @JSName("type")
    val type_LineCurve: String | typings.three.threeStrings.LineCurve = js.native
    
    /**
      * The start point.
      * @defaultValue `new THREE.Vector2()`
      */
    var v1: Vector2 = js.native
    
    /**
      * The end point
      * @defaultValue `new THREE.Vector2()`
      */
    var v2: Vector2 = js.native
  }
}
