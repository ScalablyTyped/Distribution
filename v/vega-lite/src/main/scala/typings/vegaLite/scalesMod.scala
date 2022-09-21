package typings.vegaLite

import typings.vegaLite.channelMod.ScaleChannel
import typings.vegaLite.selectionMod.SelectionCompiler
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scalesMod {
  
  @JSImport("vega-lite/build/src/compile/selection/scales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/scales", JSImport.Default)
  @js.native
  val default: SelectionCompiler[interval] = js.native
  
  inline def domain(model: UnitModel, channel: ScaleChannel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("domain")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
}
