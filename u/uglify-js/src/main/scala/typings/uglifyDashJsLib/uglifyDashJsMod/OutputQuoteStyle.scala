package typings
package uglifyDashJsLib.uglifyDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputQuoteStyle extends js.Object

@JSImport("uglify-js", "OutputQuoteStyle")
@js.native
object OutputQuoteStyle extends js.Object {
  @js.native
  sealed trait AlwaysDouble
    extends uglifyDashJsLib.uglifyDashJsMod.OutputQuoteStyle
  
  @js.native
  sealed trait AlwaysOriginal
    extends uglifyDashJsLib.uglifyDashJsMod.OutputQuoteStyle
  
  @js.native
  sealed trait AlwaysSingle
    extends uglifyDashJsLib.uglifyDashJsMod.OutputQuoteStyle
  
  @js.native
  sealed trait PreferDouble
    extends uglifyDashJsLib.uglifyDashJsMod.OutputQuoteStyle
  
  /* 2 */ val AlwaysDouble: AlwaysDouble with scala.Double = js.native
  /* 3 */ val AlwaysOriginal: AlwaysOriginal with scala.Double = js.native
  /* 1 */ val AlwaysSingle: AlwaysSingle with scala.Double = js.native
  /* 0 */ val PreferDouble: PreferDouble with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[uglifyDashJsLib.uglifyDashJsMod.OutputQuoteStyle with scala.Double] = js.native
}

