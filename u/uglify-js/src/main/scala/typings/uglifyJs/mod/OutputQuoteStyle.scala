package typings.uglifyJs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputQuoteStyle extends js.Object

@JSImport("uglify-js", "OutputQuoteStyle")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputQuoteStyle with Double] = js.native
  /* 2 */ @js.native
  object AlwaysDouble extends TopLevel[AlwaysDouble with Double]
  
  /* 3 */ @js.native
  object AlwaysOriginal extends TopLevel[AlwaysOriginal with Double]
  
  /* 1 */ @js.native
  object AlwaysSingle extends TopLevel[AlwaysSingle with Double]
  
  /* 0 */ @js.native
  object PreferDouble extends TopLevel[PreferDouble with Double]
  
}

