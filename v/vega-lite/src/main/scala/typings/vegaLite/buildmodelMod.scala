package typings.vegaLite

import typings.vegaLite.modelMod.Model
import typings.vegaLite.specBaseMod.LayoutSizeMixins
import typings.vegaLite.specMod.NormalizedSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildmodelMod {
  
  @JSImport("vega-lite/build/src/compile/buildmodel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildModel(
    spec: NormalizedSpec,
    parent: Model,
    parentGivenName: String,
    unitSize: LayoutSizeMixins,
    config: Config[SignalRef]
  ): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("buildModel")(spec.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], parentGivenName.asInstanceOf[js.Any], unitSize.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Model]
}
