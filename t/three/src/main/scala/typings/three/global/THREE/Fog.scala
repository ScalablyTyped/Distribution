package typings.three.global.THREE

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Fog")
@js.native
open class Fog protected ()
  extends typings.three.mod.Fog {
  /**
    * The color parameter is passed to the {@link THREE.Color | Color} constructor to set the color property
    * @remarks
    * Color can be a hexadecimal integer or a CSS-style string.
    * @param color
    * @param near Expects a `Float`
    * @param far Expects a `Float`
    */
  def this(color: ColorRepresentation) = this()
  def this(color: ColorRepresentation, near: Double) = this()
  def this(color: ColorRepresentation, near: Double, far: Double) = this()
  def this(color: ColorRepresentation, near: Unit, far: Double) = this()
}
