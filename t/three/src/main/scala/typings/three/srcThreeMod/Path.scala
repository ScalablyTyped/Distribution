package typings.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "Path")
@js.native
/**
  * Creates a {@link Path} from the points
  * @remarks
  * The first point defines the offset, then successive points are added to the {@link CurvePath.curves | curves} array as {@link LineCurve | LineCurves}.
  * If no points are specified, an empty {@link Path} is created and the {@link .currentPoint} is set to the origin.
  * @param points Array of {@link Vector2 | Vector2s}.
  */
open class Path ()
  extends typings.three.srcExtrasCorePathMod.Path {
  def this(points: js.Array[typings.three.srcMathVector2Mod.Vector2]) = this()
}
