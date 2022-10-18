package typings.three.mod

import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "SpotLight")
@js.native
open class SpotLight protected ()
  extends typings.three.srcThreeMod.SpotLight {
  def this(
    color: js.UndefOr[ColorRepresentation],
    intensity: js.UndefOr[Double],
    distance: js.UndefOr[Double],
    angle: js.UndefOr[Double],
    penumbra: js.UndefOr[Double],
    decay: js.UndefOr[Double]
  ) = this()
}
