package typings.three.threeMod

import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "DirectionalLightHelper")
@js.native
open class DirectionalLightHelper protected ()
  extends typings.three.directionalLightHelperMod.DirectionalLightHelper {
  /**
    * @param light
    * @param [size=1]
    * @param color
    */
  def this(light: typings.three.directionalLightMod.DirectionalLight) = this()
  def this(light: typings.three.directionalLightMod.DirectionalLight, size: Double) = this()
  def this(
    light: typings.three.directionalLightMod.DirectionalLight,
    size: Double,
    color: ColorRepresentation
  ) = this()
  def this(light: typings.three.directionalLightMod.DirectionalLight, size: Unit, color: ColorRepresentation) = this()
}
