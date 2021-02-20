package typings.vegaLite

import typings.vegaLite.channeldefMod.Value
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaSchemaMod.VgEncodeEntry
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object definedMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/defined", "defined")
  @js.native
  def defined(model: UnitModel): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/defined", "valueIfDefined")
  @js.native
  def valueIfDefined(prop: String, value: Value[ExprRef | SignalRef]): VgEncodeEntry = js.native
}
