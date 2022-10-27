package typings.vite.mod.Terser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputQuoteStyle extends StObject
@JSImport("vite", "Terser.OutputQuoteStyle")
@js.native
object OutputQuoteStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputQuoteStyle & Double] = js.native
  
  @js.native
  sealed trait AlwaysDouble
    extends StObject
       with OutputQuoteStyle
  /* 2 */ val AlwaysDouble: typings.vite.mod.Terser.OutputQuoteStyle.AlwaysDouble & Double = js.native
  
  @js.native
  sealed trait AlwaysOriginal
    extends StObject
       with OutputQuoteStyle
  /* 3 */ val AlwaysOriginal: typings.vite.mod.Terser.OutputQuoteStyle.AlwaysOriginal & Double = js.native
  
  @js.native
  sealed trait AlwaysSingle
    extends StObject
       with OutputQuoteStyle
  /* 1 */ val AlwaysSingle: typings.vite.mod.Terser.OutputQuoteStyle.AlwaysSingle & Double = js.native
  
  @js.native
  sealed trait PreferDouble
    extends StObject
       with OutputQuoteStyle
  /* 0 */ val PreferDouble: typings.vite.mod.Terser.OutputQuoteStyle.PreferDouble & Double = js.native
}
