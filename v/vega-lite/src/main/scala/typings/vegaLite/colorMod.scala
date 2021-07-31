package typings.vegaLite

import typings.vegaLite.anon.Filled
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaSchemaMod.VgEncodeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def color(model: UnitModel): VgEncodeEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any]).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def color(model: UnitModel, opt: Filled): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
