package typings.vegaLite

import typings.vegaLite.anon.HeaderBoolean
import typings.vegaLite.buildSrcCompileAxisComponentMod.AxisComponent
import typings.vegaLite.buildSrcCompileAxisComponentMod.AxisComponentIndex
import typings.vegaLite.buildSrcCompileModelMod.Model
import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.vegaLiteStrings.grid
import typings.vegaLite.vegaLiteStrings.main
import typings.vegaTypings.typesSpecAxisMod.Axis
import typings.vegaTypings.typesSpecSignalMod.NewSignal
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileAxisAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/axis/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleAxes(axisComponents: AxisComponentIndex, config: Config[SignalRef]): js.Array[Axis] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxes")(axisComponents.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Axis]]
  
  inline def assembleAxis(axisCmpt: AxisComponent, kind: main | grid, config: Config[SignalRef]): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxis")(axisCmpt.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Axis]
  inline def assembleAxis(axisCmpt: AxisComponent, kind: main | grid, config: Config[SignalRef], opt: HeaderBoolean): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxis")(axisCmpt.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Axis]
  
  inline def assembleAxisSignals(model: Model): js.Array[NewSignal] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleAxisSignals")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[NewSignal]]
}
