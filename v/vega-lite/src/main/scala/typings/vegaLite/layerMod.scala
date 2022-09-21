package typings.vegaLite

import typings.vegaLite.modelMod.Model
import typings.vegaLite.specBaseMod.LayoutSizeMixins
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("vega-lite/build/src/compile/layer", "LayerModel")
  @js.native
  open class LayerModel protected () extends Model {
    def this(
      spec: NormalizedLayerSpec,
      parent: Model,
      parentGivenName: String,
      parentGivenSize: LayoutSizeMixins,
      config: Config[SignalRef]
    ) = this()
  }
}
