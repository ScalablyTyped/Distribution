package typings.vegaLite

import typings.vegaLite.buildSrcChanneldefMod.ChannelDef
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcGuideMod.GuideEncodingConditionalValueDef
import typings.vegaLite.buildSrcVegaDotschemaMod.VgEncodeEntry
import typings.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodeConditionalMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/conditional", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapCondition[CD /* <: ChannelDef[String] | GuideEncodingConditionalValueDef */](
    model: UnitModel,
    channelDef: CD,
    vgChannel: String,
    refFn: js.Function1[/* cDef */ CD, VgValueRef]
  ): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapCondition")(model.asInstanceOf[js.Any], channelDef.asInstanceOf[js.Any], vgChannel.asInstanceOf[js.Any], refFn.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
