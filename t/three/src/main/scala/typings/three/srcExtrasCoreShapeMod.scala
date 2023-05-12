package typings.three

import typings.three.anon.Holes
import typings.three.srcExtrasCorePathMod.Path
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCoreShapeMod {
  
  @JSImport("three/src/extras/core/Shape", "Shape")
  @js.native
  /**
    * Creates a {@link Shape} from the points
    * @remarks
    * The first point defines the offset, then successive points are added to the {@link CurvePath.curves | curves} array as {@link THREE.LineCurve | LineCurves}.
    * If no points are specified, an empty {@link Shape} is created and the {@link .currentPoint} is set to the origin.
    * @param points Array of {@link Vector2 | Vector2s}.
    */
  open class Shape () extends Path {
    def this(points: js.Array[Vector2]) = this()
    
    /**
      * Call {@link THREE.Curve.getPoints | getPoints} on the {@link Shape} and the {@link holes} array
      * @param divisions The fineness of the result. Expects a `Integer`
      */
    def extractPoints(divisions: Double): Holes = js.native
    
    /**
      * Get an array of {@link Vector2 | Vector2's} that represent the holes in the shape.
      * @param divisions The fineness of the result. Expects a `Integer`
      */
    def getPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
    
    /**
      * An array of {@link Path | paths} that define the holes in the shape.
      * @defaultValue `[]`
      */
    var holes: js.Array[Path] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `Shape`
      */
    @JSName("type")
    val type_Shape: String | typings.three.threeStrings.Shape = js.native
    
    /**
      * {@link http://en.wikipedia.org/wiki/Universally_unique_identifier | UUID} of this object instance.
      * @remarks This gets automatically assigned and shouldn't be edited.
      */
    var uuid: String = js.native
  }
}
