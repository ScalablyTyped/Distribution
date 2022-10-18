package typings.vegaLite

import typings.vegaLite.buildSrcChannelMod.PositionScaleChannel
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileAxisEncodeMod {
  
  @JSImport("vega-lite/build/src/compile/axis/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def labels(model: UnitModel, channel: PositionScaleChannel, specifiedLabelsSpec: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("labels")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedLabelsSpec.asInstanceOf[js.Any])).asInstanceOf[Any]
}
