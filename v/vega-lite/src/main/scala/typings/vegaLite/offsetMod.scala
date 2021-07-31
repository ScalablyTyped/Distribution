package typings.vegaLite

import typings.vegaLite.channelMod.PolarPositionChannel
import typings.vegaLite.channelMod.PositionChannel
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcMarkMod.MarkDef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getOffset(channel: PolarPositionChannel, markDef: MarkDef[Mark, SignalRef]): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffset")(channel.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  @scala.inline
  def getOffset(channel: PositionChannel, markDef: MarkDef[Mark, SignalRef]): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffset")(channel.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
}
