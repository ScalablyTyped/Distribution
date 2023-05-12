package typings.three.buildThreeDotmoduleDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module.min", "ArcCurve")
@js.native
open class ArcCurve protected ()
  extends typings.three.srcThreeMod.ArcCurve {
  /**
    * This constructor creates a new {@link ArcCurve}.
    * @param aX The X center of the ellipse. Expects a `Float`. Default is `0`.
    * @param aY The Y center of the ellipse. Expects a `Float`. Default is `0`.
    * @param xRadius The radius of the ellipse in the x direction. Expects a `Float`. Default is `1`.
    * @param yRadius The radius of the ellipse in the y direction. Expects a `Float`. Default is `1`.
    * @param aStartAngle The start angle of the curve in radians starting from the positive X axis. Default is `0`.
    * @param aEndAngle The end angle of the curve in radians starting from the positive X axis. Default is `2 x Math.PI`.
    * @param aClockwise Whether the ellipse is drawn clockwise. Default is `false`.
    */
  def this(
    aX: js.UndefOr[Double],
    aY: js.UndefOr[Double],
    aRadius: js.UndefOr[Double],
    aStartAngle: js.UndefOr[Double],
    aEndAngle: js.UndefOr[Double],
    aClockwise: js.UndefOr[Boolean]
  ) = this()
}
