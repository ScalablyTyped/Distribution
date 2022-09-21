package typings.three.threeMod

import typings.three.punctualLightNodeMod.PunctualLight
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "SpotLight")
@js.native
open class SpotLight protected ()
  extends typings.three.spotLightMod.SpotLight
     with PunctualLight {
  def this(
    color: js.UndefOr[ColorRepresentation],
    intensity: js.UndefOr[Double],
    distance: js.UndefOr[Double],
    angle: js.UndefOr[Double],
    penumbra: js.UndefOr[Double],
    decay: js.UndefOr[Double]
  ) = this()
}
