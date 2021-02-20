package typings.vegaLite

import typings.vegaLite.channelMod.PolarPositionChannel
import typings.vegaLite.channelMod.PositionChannel
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcMarkMod.MarkDef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/offset", "getOffset")
  @js.native
  def getOffset(channel: PolarPositionChannel, markDef: MarkDef[Mark, SignalRef]): Double | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/offset", "getOffset")
  @js.native
  def getOffset(channel: PositionChannel, markDef: MarkDef[Mark, SignalRef]): Double | SignalRef = js.native
}
