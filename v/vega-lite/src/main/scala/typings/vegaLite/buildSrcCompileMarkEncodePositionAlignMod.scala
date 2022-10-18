package typings.vegaLite

import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcMarkMod.Mark
import typings.vegaLite.buildSrcMarkMod.MarkDef
import typings.vegaLite.vegaLiteStrings.middle
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.top
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodePositionAlignMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/position-align", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def vgAlignedPositionChannel(channel: x | y | radius | theta, markDef: MarkDef[Mark, SignalRef], config: Config[SignalRef]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("vgAlignedPositionChannel")(channel.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def vgAlignedPositionChannel(
    channel: x | y | radius | theta,
    markDef: MarkDef[Mark, SignalRef],
    config: Config[SignalRef],
    defaultAlign: top | middle
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("vgAlignedPositionChannel")(channel.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], defaultAlign.asInstanceOf[js.Any])).asInstanceOf[Any]
}
