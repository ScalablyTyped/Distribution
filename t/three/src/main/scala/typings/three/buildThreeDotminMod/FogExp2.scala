package typings.three.buildThreeDotminMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "FogExp2")
@js.native
open class FogExp2 protected ()
  extends typings.three.srcThreeMod.FogExp2 {
  /**
    * The color parameter is passed to the {@link THREE.Color | Color} constructor to set the color property
    * @remarks Color can be a hexadecimal integer or a CSS-style string.
    * @param color
    * @param density Expects a `Float`
    */
  def this(color: ColorRepresentation) = this()
  def this(color: ColorRepresentation, density: Double) = this()
}
