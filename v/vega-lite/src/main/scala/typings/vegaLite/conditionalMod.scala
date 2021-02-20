package typings.vegaLite

import typings.vegaLite.channeldefMod.ChannelDef
import typings.vegaLite.srcGuideMod.GuideEncodingConditionalValueDef
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaSchemaMod.VgEncodeEntry
import typings.vegaLite.vegaSchemaMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/conditional", "wrapCondition")
  @js.native
  def wrapCondition[CD /* <: ChannelDef[String] | GuideEncodingConditionalValueDef */](
    model: UnitModel,
    channelDef: CD,
    vgChannel: String,
    refFn: js.Function1[/* cDef */ CD, VgValueRef]
  ): VgEncodeEntry = js.native
}
