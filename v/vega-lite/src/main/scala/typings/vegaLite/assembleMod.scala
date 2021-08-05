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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assembleMod {
  
  @JSImport("vega-lite/build/src/compile/axis/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleAxes(axisComponents: AxisComponentIndex, config: Config[SignalRef]): js.Array[Axis] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxes")(axisComponents.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Axis]]
  
  inline def assembleAxisSignals(model: Model): js.Array[NewSignal] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxisSignals")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[NewSignal]]
  
  inline def assembleAxis_grid(axisCmpt: AxisComponent, kind: grid, config: Config[SignalRef]): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxis")(axisCmpt.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Axis]
  inline def assembleAxis_grid(axisCmpt: AxisComponent, kind: grid, config: Config[SignalRef], opt: HeaderBoolean): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxis")(axisCmpt.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Axis]
  
  inline def assembleAxis_main(axisCmpt: AxisComponent, kind: main, config: Config[SignalRef]): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxis")(axisCmpt.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Axis]
  inline def assembleAxis_main(axisCmpt: AxisComponent, kind: main, config: Config[SignalRef], opt: HeaderBoolean): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxis")(axisCmpt.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Axis]
}
