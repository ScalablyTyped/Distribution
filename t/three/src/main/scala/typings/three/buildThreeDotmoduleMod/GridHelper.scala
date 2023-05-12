package typings.three.buildThreeDotmoduleMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module", "GridHelper")
@js.native
/**
  * Creates a new {@link GridHelper} of size 'size' and divided into 'divisions' segments per side
  * @remarks
  * Colors are optional.
  * @param size The size of the grid. Default `10`
  * @param divisions The number of divisions across the grid. Default `10`
  * @param colorCenterLine The color of the centerline. This can be a {@link THREE.Color | Color}, a hexadecimal value and an CSS-Color name. Default `0x444444`
  * @param colorGrid The color of the lines of the grid. This can be a {@link THREE.Color | Color}, a hexadecimal value and an CSS-Color name. Default `0x888888`
  */
open class GridHelper ()
  extends typings.three.srcThreeMod.GridHelper {
  def this(size: Double) = this()
  def this(size: Double, divisions: Double) = this()
  def this(size: Unit, divisions: Double) = this()
  def this(size: Double, divisions: Double, color1: ColorRepresentation) = this()
  def this(size: Double, divisions: Unit, color1: ColorRepresentation) = this()
  def this(size: Unit, divisions: Double, color1: ColorRepresentation) = this()
  def this(size: Unit, divisions: Unit, color1: ColorRepresentation) = this()
  def this(size: Double, divisions: Double, color1: Unit, color2: ColorRepresentation) = this()
  def this(size: Double, divisions: Double, color1: ColorRepresentation, color2: ColorRepresentation) = this()
  def this(size: Double, divisions: Unit, color1: Unit, color2: ColorRepresentation) = this()
  def this(size: Double, divisions: Unit, color1: ColorRepresentation, color2: ColorRepresentation) = this()
  def this(size: Unit, divisions: Double, color1: Unit, color2: ColorRepresentation) = this()
  def this(size: Unit, divisions: Double, color1: ColorRepresentation, color2: ColorRepresentation) = this()
  def this(size: Unit, divisions: Unit, color1: Unit, color2: ColorRepresentation) = this()
  def this(size: Unit, divisions: Unit, color1: ColorRepresentation, color2: ColorRepresentation) = this()
}
