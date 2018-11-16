package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputQuoteStyle extends js.Object

@JSImport("terser", "OutputQuoteStyle")
@js.native
object OutputQuoteStyle extends js.Object {
  @js.native
  sealed trait AlwaysDouble
    extends terserLib.terserMod.OutputQuoteStyle
  
  @js.native
  sealed trait AlwaysOriginal
    extends terserLib.terserMod.OutputQuoteStyle
  
  @js.native
  sealed trait AlwaysSingle
    extends terserLib.terserMod.OutputQuoteStyle
  
  @js.native
  sealed trait PreferDouble
    extends terserLib.terserMod.OutputQuoteStyle
  
  /* 2 */ val AlwaysDouble: AlwaysDouble with scala.Double = js.native
  /* 3 */ val AlwaysOriginal: AlwaysOriginal with scala.Double = js.native
  /* 1 */ val AlwaysSingle: AlwaysSingle with scala.Double = js.native
  /* 0 */ val PreferDouble: PreferDouble with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[terserLib.terserMod.OutputQuoteStyle with scala.Double] = js.native
}

