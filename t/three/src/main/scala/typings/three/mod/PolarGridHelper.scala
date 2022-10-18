package typings.three.mod

import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "PolarGridHelper")
@js.native
open class PolarGridHelper protected ()
  extends typings.three.srcThreeMod.PolarGridHelper {
  /**
    * @param [radius=10]
    * @param [radials=16]
    * @param [circles=8]
    * @param [divisions=64]
    * @param [color1=0x444444]
    * @param [color2=0x888888]
    */
  def this(
    radius: js.UndefOr[Double],
    radials: js.UndefOr[Double],
    circles: js.UndefOr[Double],
    divisions: js.UndefOr[Double],
    color1: js.UndefOr[ColorRepresentation],
    color2: js.UndefOr[ColorRepresentation]
  ) = this()
}
