package typings.vegaLite

import typings.vegaLite.anon.HeaderBoolean
import typings.vegaLite.componentMod.AxisComponent
import typings.vegaLite.componentMod.AxisComponentIndex
import typings.vegaLite.modelMod.Model
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.vegaLiteStrings.grid
import typings.vegaLite.vegaLiteStrings.main
import typings.vegaTypings.axisMod.Axis
import typings.vegaTypings.signalMod.NewSignal
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assembleMod {
  
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxes")
  @js.native
  def assembleAxes(axisComponents: AxisComponentIndex, config: Config[SignalRef]): js.Array[Axis] = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxisSignals")
  @js.native
  def assembleAxisSignals(model: Model): js.Array[NewSignal] = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxis")
  @js.native
  def assembleAxis_grid(axisCmpt: AxisComponent, kind: grid, config: Config[SignalRef]): Axis = js.native
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxis")
  @js.native
  def assembleAxis_grid(axisCmpt: AxisComponent, kind: grid, config: Config[SignalRef], opt: HeaderBoolean): Axis = js.native
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxis")
  @js.native
  def assembleAxis_main(axisCmpt: AxisComponent, kind: main, config: Config[SignalRef]): Axis = js.native
  @JSImport("vega-lite/build/src/compile/axis/assemble", "assembleAxis")
  @js.native
  def assembleAxis_main(axisCmpt: AxisComponent, kind: main, config: Config[SignalRef], opt: HeaderBoolean): Axis = js.native
}
