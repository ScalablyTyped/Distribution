package typings.vegaLite

import typings.vegaLite.anon.DefaultRef
import typings.vegaLite.channelMod.NonPositionScaleChannel
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaSchemaMod.VgEncodeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonpositionMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/nonposition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonPosition(channel: NonPositionScaleChannel, model: UnitModel): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("nonPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  inline def nonPosition(channel: NonPositionScaleChannel, model: UnitModel, opt: DefaultRef): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("nonPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
