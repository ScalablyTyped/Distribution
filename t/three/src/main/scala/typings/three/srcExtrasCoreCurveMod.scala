package typings.three

import typings.three.anon.Binormals
import typings.three.srcMathVector2Mod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCoreCurveMod {
  
  /* note: abstract class */ @JSImport("three/src/extras/core/Curve", "Curve")
  @js.native
  /* protected */ open class Curve[T /* <: Vector */] () extends StObject {
    
    /**
      * This value determines the amount of divisions when calculating the cumulative segment lengths of a {@link Curve}
      * via {@link .getLengths}.
      * To ensure precision when using methods like {@link .getSpacedPoints}, it is recommended to increase {@link .arcLengthDivisions} if the {@link Curve} is very large.
      * @defaultValue `200`
      * @remarks Expects a `Integer`
      */
    var arcLengthDivisions: Double = js.native
    
    /**
      * Generates the Frenet Frames
      * @remarks
      * Requires a {@link Curve} definition in 3D space
      * Used in geometries like {@link THREE.TubeGeometry | TubeGeometry} or {@link THREE.ExtrudeGeometry | ExtrudeGeometry}.
      * @param segments Expects a `Integer`
      * @param closed
      */
    def computeFrenetFrames(segments: Double): Binormals = js.native
    def computeFrenetFrames(segments: Double, closed: Boolean): Binormals = js.native
    
    /**
      * Copies another {@link Curve} object to this instance.
      * @param source
      */
    def copy(source: Curve[T]): this.type = js.native
    
    /**
      * Copies the data from the given JSON object to this instance.
      * @param json
      */
    def fromJSON(json: js.Object): this.type = js.native
    
    /**
      * Get total {@link Curve} arc length.
      */
    def getLength(): Double = js.native
    
    /**
      * Get list of cumulative segment lengths.
      * @param divisions Expects a `Integer`
      */
    def getLengths(): js.Array[Double] = js.native
    def getLengths(divisions: Double): js.Array[Double] = js.native
    
    /**
      * Returns a vector for a given position on the curve.
      * @param t A position on the curve. Must be in the range `[ 0, 1 ]`. Expects a `Float`
      * @param optionalTarget If specified, the result will be copied into this Vector, otherwise a new Vector will be created. Default `new T`.
      */
    def getPoint(t: Double): T = js.native
    def getPoint(t: Double, optionalTarget: T): T = js.native
    
    /**
      * Returns a vector for a given position on the {@link Curve} according to the arc length.
      * @param u A position on the {@link Curve} according to the arc length. Must be in the range `[ 0, 1 ]`. Expects a `Float`
      * @param optionalTarget If specified, the result will be copied into this Vector, otherwise a new Vector will be created. Default `new T`.
      */
    def getPointAt(u: Double): T = js.native
    def getPointAt(u: Double, optionalTarget: T): T = js.native
    
    /**
      * Returns a set of divisions `+1` points using {@link .getPoint | getPoint(t)}.
      * @param divisions Number of pieces to divide the {@link Curve} into. Expects a `Integer`. Default `5`
      */
    def getPoints(): js.Array[T] = js.native
    def getPoints(divisions: Double): js.Array[T] = js.native
    
    /**
      * Returns a set of divisions `+1` equi-spaced points using {@link .getPointAt | getPointAt(u)}.
      * @param divisions Number of pieces to divide the {@link Curve} into. Expects a `Integer`. Default `5`
      */
    def getSpacedPoints(): js.Array[T] = js.native
    def getSpacedPoints(divisions: Double): js.Array[T] = js.native
    
    /**
      * Returns a unit vector tangent at t
      * @remarks
      * If the derived {@link Curve} does not implement its tangent derivation, two points a small delta apart will be used to find its gradient which seems to give a reasonable approximation.
      * @param t A position on the curve. Must be in the range `[ 0, 1 ]`. Expects a `Float`
      * @param optionalTarget If specified, the result will be copied into this Vector, otherwise a new Vector will be created.
      */
    def getTangent(t: Double): T = js.native
    def getTangent(t: Double, optionalTarget: T): T = js.native
    
    /**
      * Returns tangent at a point which is equidistant to the ends of the {@link Curve} from the point given in {@link .getTangent}.
      * @param u A position on the {@link Curve} according to the arc length. Must be in the range `[ 0, 1 ]`. Expects a `Float`
      * @param optionalTarget If specified, the result will be copied into this Vector, otherwise a new Vector will be created.
      */
    def getTangentAt(u: Double): T = js.native
    def getTangentAt(u: Double, optionalTarget: T): T = js.native
    
    /**
      * Given u in the range `[ 0, 1 ]`,
      * @remarks
      * `u` and `t` can then be used to give you points which are equidistant from the ends of the curve, using {@link .getPoint}.
      * @param u Expects a `Float`
      * @param distance Expects a `Float`
      * @returns `t` also in the range `[ 0, 1 ]`. Expects a `Float`.
      */
    def getUtoTmapping(u: Double, distance: Double): Double = js.native
    
    /**
      * Returns a JSON object representation of this instance.
      */
    def toJSON(): js.Object = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `Curve`
      */
    val `type`: String | typings.three.threeStrings.Curve = js.native
    
    /**
      * Update the cumlative segment distance cache
      * @remarks
      * The method must be called every time {@link Curve} parameters are changed
      * If an updated {@link Curve} is part of a composed {@link Curve} like {@link THREE.CurvePath | CurvePath},
      * {@link .updateArcLengths}() must be called on the composed curve, too.
      */
    def updateArcLengths(): Unit = js.native
  }
}
