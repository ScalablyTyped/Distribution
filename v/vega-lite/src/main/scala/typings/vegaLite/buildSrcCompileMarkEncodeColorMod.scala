package typings.vegaLite

import typings.vegaLite.anon.Filled
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcVegaDotschemaMod.VgEncodeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodeColorMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def color(model: UnitModel): VgEncodeEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any]).asInstanceOf[VgEncodeEntry]
  inline def color(model: UnitModel, opt: Filled): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
