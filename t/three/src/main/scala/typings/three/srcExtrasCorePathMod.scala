package typings.three

import typings.three.srcExtrasCoreCurvePathMod.CurvePath
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCorePathMod {
  
  @JSImport("three/src/extras/core/Path", "Path")
  @js.native
  /**
    * Creates a {@link Path} from the points
    * @remarks
    * The first point defines the offset, then successive points are added to the {@link CurvePath.curves | curves} array as {@link LineCurve | LineCurves}.
    * If no points are specified, an empty {@link Path} is created and the {@link .currentPoint} is set to the origin.
    * @param points Array of {@link Vector2 | Vector2s}.
    */
  open class Path () extends CurvePath[Vector2] {
    def this(points: js.Array[Vector2]) = this()
    
    /**
      * Adds an absolutely positioned {@link THREE.EllipseCurve | EllipseCurve} to the path.
      * @param x Expects a `Float`
      * @param y X, The absolute center of the arc. Expects a `Float`
      * @param radius The radius of the arc. Expects a `Float`
      * @param startAngle The start angle in radians. Expects a `Float`
      * @param endAngle The end angle in radians. Expects a `Float`
      * @param clockwise Sweep the arc clockwise. . Default `false`
      */
    def absarc(
      aX: Double,
      aY: Double,
      aRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean
    ): this.type = js.native
    
    /**
      * Adds an absolutely positioned {@link THREE.EllipseCurve | EllipseCurve} to the path.
      * @param x Expects a `Float`
      * @param y X, The absolute center of the ellipse. Expects a `Float`
      * @param xRadius The radius of the ellipse in the x axis. Expects a `Float`
      * @param yRadius The radius of the ellipse in the y axis. Expects a `Float`
      * @param startAngle The start angle in radians. Expects a `Float`
      * @param endAngle The end angle in radians. Expects a `Float`
      * @param clockwise Sweep the ellipse clockwise. . Default `false`
      * @param rotation The rotation angle of the ellipse in radians, counterclockwise from the positive X axis. Optional, Expects a `Float`. Default `0`
      */
    def absellipse(
      aX: Double,
      aY: Double,
      xRadius: Double,
      yRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean,
      aRotation: Double
    ): this.type = js.native
    
    /**
      * Adds an {@link THREE.EllipseCurve | EllipseCurve} to the path, positioned relative to {@link .currentPoint}.
      * @param x Expects a `Float`
      * @param y X, The center of the arc offset from the last call. Expects a `Float`
      * @param radius The radius of the arc. Expects a `Float`
      * @param startAngle The start angle in radians. Expects a `Float`
      * @param endAngle The end angle in radians. Expects a `Float`
      * @param clockwise Sweep the arc clockwise. . Default `false`
      */
    def arc(
      aX: Double,
      aY: Double,
      aRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean
    ): this.type = js.native
    
    /**
      * This creates a bezier curve from {@link .currentPoint} with (cp1X, cp1Y) and (cp2X, cp2Y) as control points and updates {@link .currentPoint} to x and y.
      * @param cp1X Expects a `Float`
      * @param cp1Y Expects a `Float`
      * @param cp2X Expects a `Float`
      * @param cp2Y Expects a `Float`
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      */
    def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): this.type = js.native
    
    /**
      * The current offset of the path. Any new {@link THREE.Curve | Curve} added will start here.
      * @defaultValue `new THREE.Vector2()`
      */
    var currentPoint: Vector2 = js.native
    
    /**
      * Adds an {@link THREE.EllipseCurve | EllipseCurve} to the path, positioned relative to {@link .currentPoint}.
      * @param x Expects a `Float`
      * @param y X, The center of the ellipse offset from the last call. Expects a `Float`
      * @param xRadius The radius of the ellipse in the x axis. Expects a `Float`
      * @param yRadius The radius of the ellipse in the y axis. Expects a `Float`
      * @param startAngle The start angle in radians. Expects a `Float`
      * @param endAngle The end angle in radians. Expects a `Float`
      * @param clockwise Sweep the ellipse clockwise. . Default `false`
      * @param rotation The rotation angle of the ellipse in radians, counterclockwise from the positive X axis. Optional, Expects a `Float`. Default `0`
      */
    def ellipse(
      aX: Double,
      aY: Double,
      xRadius: Double,
      yRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean,
      aRotation: Double
    ): this.type = js.native
    
    /**
      * Connects a {@link THREE.LineCurve | LineCurve} from {@link .currentPoint} to x, y onto the path.
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      */
    def lineTo(x: Double, y: Double): this.type = js.native
    
    /**
      * Move the {@link .currentPoint} to x, y.
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      */
    def moveTo(x: Double, y: Double): this.type = js.native
    
    /**
      * Creates a quadratic curve from {@link .currentPoint} with cpX and cpY as control point and updates {@link .currentPoint} to x and y.
      * @param cpX Expects a `Float`
      * @param cpY Expects a `Float`
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      */
    def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): this.type = js.native
    
    /**
      * Points are added to the {@link CurvePath.curves | curves} array as {@link THREE.LineCurve | LineCurves}.
      * @param vector2s
      */
    def setFromPoints(vectors: js.Array[Vector2]): this.type = js.native
    
    /**
      * Connects a new {@link THREE.SplineCurve | SplineCurve} onto the path.
      * @param points An array of {@link Vector2 | Vector2's}
      */
    def splineThru(pts: js.Array[Vector2]): this.type = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `Path`
      */
    @JSName("type")
    val type_Path: String | typings.three.threeStrings.Path = js.native
  }
}
