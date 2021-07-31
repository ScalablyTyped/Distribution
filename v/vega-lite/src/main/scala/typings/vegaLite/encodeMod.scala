package typings.vegaLite

import typings.vegaLite.channelMod.PositionScaleChannel
import typings.vegaLite.unitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeMod {
  
  @JSImport("vega-lite/build/src/compile/axis/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def labels(model: UnitModel, channel: PositionScaleChannel, specifiedLabelsSpec: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("labels")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedLabelsSpec.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
