package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Shape")
@js.native
/**
  * Creates a {@link Shape} from the points
  * @remarks
  * The first point defines the offset, then successive points are added to the {@link CurvePath.curves | curves} array as {@link THREE.LineCurve | LineCurves}.
  * If no points are specified, an empty {@link Shape} is created and the {@link .currentPoint} is set to the origin.
  * @param points Array of {@link Vector2 | Vector2s}.
  */
open class Shape ()
  extends typings.three.mod.Shape {
  def this(points: js.Array[typings.three.srcMathVector2Mod.Vector2]) = this()
}
