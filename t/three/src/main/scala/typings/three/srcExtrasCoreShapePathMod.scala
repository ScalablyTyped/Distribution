package typings.three

import typings.three.srcExtrasCorePathMod.Path
import typings.three.srcExtrasCoreShapeMod.Shape
import typings.three.srcMathColorMod.Color
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCoreShapePathMod {
  
  @JSImport("three/src/extras/core/ShapePath", "ShapePath")
  @js.native
  /**
    * Creates a new {@link ShapePath}
    * @remarks
    * Unlike a {@link THREE.Path | Path}, no points are passed in as the {@link ShapePath} is designed to be generated after creation.
    */
  open class ShapePath () extends StObject {
    
    /**
      * This creates a bezier curve from the {@link ShapePath.currentPath | currentPath}'s
      * offset to _x_ and _y_ with _cp1X_, _cp1Y_ and _cp2X_, _cp2Y_ as control points and
      * updates the {@link ShapePath.currentPath | currentPath}'s offset to _x_ and _y_.
      * @param cp1X Expects a `Float`
      * @param cp1Y Expects a `Float`
      * @param cp2X Expects a `Float`
      * @param cp2Y Expects a `Float`
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      */
    def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): this.type = js.native
    
    /**
      * {@link THREE.Color | Color} of the shape, by default set to white _(0xffffff)_.
      * @defaultValue `new THREE.Color()`
      */
    var color: Color = js.native
    
    /**
      * The current {@link THREE.Path | Path} that is being generated.
      * @defaultValue `null`
      */
    val currentPath: Path | Null = js.native
    
    /**
      * This creates a line from the {@link ShapePath.currentPath | currentPath}'s offset to X and Y and updates the offset to X and Y.
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      */
    def lineTo(x: Double, y: Double): this.type = js.native
    
    /**
      * Starts a new {@link THREE.Path | Path} and calls {@link THREE.Path.moveTo | Path.moveTo}( x, y ) on that {@link THREE.Path | Path}
      * @remarks
      * Also points {@link ShapePath.currentPath | currentPath} to that {@link THREE.Path | Path}.
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      */
    def moveTo(x: Double, y: Double): this.type = js.native
    
    /**
      * This creates a quadratic curve from the {@link ShapePath.currentPath | currentPath}'s
      * offset to _x_ and _y_ with _cpX_ and _cpY_ as control point and updates the {@link ShapePath.currentPath | currentPath}'s offset to _x_ and _y_.
      * @param cpX Expects a `Float`
      * @param cpY Expects a `Float`
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      */
    def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): this.type = js.native
    
    /**
      * Connects a new {@link THREE.SplineCurve | SplineCurve} onto the {@link ShapePath.currentPath | currentPath}.
      * @param points An array of {@link THREE.Vector2 | Vector2}s
      */
    def splineThru(pts: js.Array[Vector2]): this.type = js.native
    
    /**
      * Array of {@link THREE.Path | Path's}s.
      * @defaultValue `[]`
      */
    var subPaths: js.Array[Path] = js.native
    
    /**
      * Converts the {@link ShapePath.subPaths | subPaths} array into an array of Shapes
      * @remarks
      * By default solid shapes are defined clockwise (CW) and holes are defined counterclockwise (CCW)
      * If isCCW is set to true, then those are flipped.
      * @param isCCW Changes how solids and holes are generated
      */
    def toShapes(isCCW: Boolean): js.Array[Shape] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `ShapePath`
      */
    val `type`: typings.three.threeStrings.ShapePath = js.native
  }
}
