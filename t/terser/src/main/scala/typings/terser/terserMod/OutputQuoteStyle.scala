package typings.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputQuoteStyle extends js.Object

@JSImport("terser", "OutputQuoteStyle")
@js.native
object OutputQuoteStyle extends js.Object {
  @js.native
  sealed trait AlwaysDouble extends OutputQuoteStyle
  
  @js.native
  sealed trait AlwaysOriginal extends OutputQuoteStyle
  
  @js.native
  sealed trait AlwaysSingle extends OutputQuoteStyle
  
  @js.native
  sealed trait PreferDouble extends OutputQuoteStyle
  
  /* 2 */ val AlwaysDouble: typings.terser.terserMod.OutputQuoteStyle.AlwaysDouble with Double = js.native
  /* 3 */ val AlwaysOriginal: typings.terser.terserMod.OutputQuoteStyle.AlwaysOriginal with Double = js.native
  /* 1 */ val AlwaysSingle: typings.terser.terserMod.OutputQuoteStyle.AlwaysSingle with Double = js.native
  /* 0 */ val PreferDouble: typings.terser.terserMod.OutputQuoteStyle.PreferDouble with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputQuoteStyle with Double] = js.native
}

