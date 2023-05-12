package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesCatmullRomCurve3Mod {
  
  @JSImport("three/src/extras/curves/CatmullRomCurve3", "CatmullRomCurve3")
  @js.native
  /**
    * This constructor creates a new {@link CatmullRomCurve3}.
    * @param points An array of {@link THREE.Vector3 | Vector3} points
    * @param closed Whether the curve is closed. Default `false`
    * @param curveType Type of the curve. Default `centripetal`
    * @param tension Tension of the curve. Expects a `Float`. Default `0.5`
    */
  open class CatmullRomCurve3 () extends Curve[Vector3] {
    def this(points: js.Array[Vector3]) = this()
    def this(points: js.Array[Vector3], closed: Boolean) = this()
    def this(points: Unit, closed: Boolean) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: CurveType) = this()
    def this(points: js.Array[Vector3], closed: Unit, curveType: CurveType) = this()
    def this(points: Unit, closed: Boolean, curveType: CurveType) = this()
    def this(points: Unit, closed: Unit, curveType: CurveType) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: Unit, tension: Double) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: CurveType, tension: Double) = this()
    def this(points: js.Array[Vector3], closed: Unit, curveType: Unit, tension: Double) = this()
    def this(points: js.Array[Vector3], closed: Unit, curveType: CurveType, tension: Double) = this()
    def this(points: Unit, closed: Boolean, curveType: Unit, tension: Double) = this()
    def this(points: Unit, closed: Boolean, curveType: CurveType, tension: Double) = this()
    def this(points: Unit, closed: Unit, curveType: Unit, tension: Double) = this()
    def this(points: Unit, closed: Unit, curveType: CurveType, tension: Double) = this()
    
    /**
      * The curve will loop back onto itself when this is true.
      * @defaultValue `false`
      */
    var closed: Boolean = js.native
    
    /**
      * Possible values are `centripetal`, `chordal` and `catmullrom`.
      * @defaultValue `centripetal`
      */
    var curveType: CurveType = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link CatmullRomCurve3}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isCatmullRomCurve3: /* true */ Boolean = js.native
    
    /**
      * The array of {@link THREE.Vector3 | Vector3} points that define the curve.
      * @remarks It needs at least two entries.
      * @defaultValue `[]`
      */
    var points: js.Array[Vector3] = js.native
    
    /**
      * When {@link .curveType} is `catmullrom`, defines catmullrom's tension.
      * @remarks Expects a `Float`
      */
    var tension: Double = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `CatmullRomCurve3`
      */
    @JSName("type")
    val type_CatmullRomCurve3: String | typings.three.threeStrings.CatmullRomCurve3 = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.threeStrings.centripetal
    - typings.three.threeStrings.chordal
    - typings.three.threeStrings.catmullrom
  */
  trait CurveType extends StObject
  object CurveType {
    
    inline def catmullrom: typings.three.threeStrings.catmullrom = "catmullrom".asInstanceOf[typings.three.threeStrings.catmullrom]
    
    inline def centripetal: typings.three.threeStrings.centripetal = "centripetal".asInstanceOf[typings.three.threeStrings.centripetal]
    
    inline def chordal: typings.three.threeStrings.chordal = "chordal".asInstanceOf[typings.three.threeStrings.chordal]
  }
}
