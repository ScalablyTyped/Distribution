package typings.uglifyJs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputQuoteStyle extends js.Object
@JSImport("uglify-js", "OutputQuoteStyle")
@js.native
object OutputQuoteStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputQuoteStyle with Double] = js.native
  
  @js.native
  sealed trait AlwaysDouble extends OutputQuoteStyle
  /* 2 */ @js.native
  object AlwaysDouble extends TopLevel[AlwaysDouble with Double]
  
  @js.native
  sealed trait AlwaysOriginal extends OutputQuoteStyle
  /* 3 */ @js.native
  object AlwaysOriginal extends TopLevel[AlwaysOriginal with Double]
  
  @js.native
  sealed trait AlwaysSingle extends OutputQuoteStyle
  /* 1 */ @js.native
  object AlwaysSingle extends TopLevel[AlwaysSingle with Double]
  
  @js.native
  sealed trait PreferDouble extends OutputQuoteStyle
  /* 0 */ @js.native
  object PreferDouble extends TopLevel[PreferDouble with Double]
}
