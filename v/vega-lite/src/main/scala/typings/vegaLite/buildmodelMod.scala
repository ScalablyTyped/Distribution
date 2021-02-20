package typings.vegaLite

import typings.vegaLite.modelMod.Model
import typings.vegaLite.specBaseMod.LayoutSizeMixins
import typings.vegaLite.specMod.NormalizedSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildmodelMod {
  
  @JSImport("vega-lite/build/src/compile/buildmodel", "buildModel")
  @js.native
  def buildModel(
    spec: NormalizedSpec,
    parent: Model,
    parentGivenName: String,
    unitSize: LayoutSizeMixins,
    config: Config[SignalRef]
  ): Model = js.native
}
