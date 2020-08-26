package typings.stylefire.buildMod

import typings.stylefire.svgTypesMod.Dimensions
import typings.stylefire.svgTypesMod.SVGState
import typings.stylefire.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylefire/lib/svg/build", "createAttrBuilder")
@js.native
object createAttrBuilder extends js.Object {
  def apply(dimensions: Dimensions): js.Function1[/* state */ State with SVGState, SVGAttrs] = js.native
  def apply(dimensions: Dimensions, totalPathLength: js.UndefOr[scala.Nothing], isDashCase: Boolean): js.Function1[/* state */ State with SVGState, SVGAttrs] = js.native
  def apply(dimensions: Dimensions, totalPathLength: Double): js.Function1[/* state */ State with SVGState, SVGAttrs] = js.native
  def apply(dimensions: Dimensions, totalPathLength: Double, isDashCase: Boolean): js.Function1[/* state */ State with SVGState, SVGAttrs] = js.native
}

