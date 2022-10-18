package typings.vegaLite

import typings.vegaLite.buildSrcCompileModelMod.Model
import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcSpecBaseMod.LayoutSizeMixins
import typings.vegaLite.buildSrcSpecLayerMod.NormalizedLayerSpec
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileLayerMod {
  
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
