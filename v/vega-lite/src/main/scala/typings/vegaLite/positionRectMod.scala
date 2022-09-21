package typings.vegaLite

import typings.vegaLite.anon.FieldDef
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaLite.vegaSchemaMod.VgEncodeEntry
import typings.vegaLite.vegaSchemaMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionRectMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/position-rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rectBinRef(hasFieldDefScaleNameBandPositionOffset: FieldDef): VgValueRef = ^.asInstanceOf[js.Dynamic].applyDynamic("rectBinRef")(hasFieldDefScaleNameBandPositionOffset.asInstanceOf[js.Any]).asInstanceOf[VgValueRef]
  
  inline def rectPosition(model: UnitModel, channel: x | y | theta | radius): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
