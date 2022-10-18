package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.categorical_crossentropy
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.categorical_hinge
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.cosine_proximity
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hinge
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.kullback_leibler_divergence
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.logcosh
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_absolute_error
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_absolute_percentage_error
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_squared_error
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mean_squared_logarithmic_error
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.poisson
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sparse_categorical_crossentropy
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.squared_hinge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLossConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/loss_config", "lossOptions")
  @js.native
  val lossOptions: js.Array[
    mean_squared_error | mean_absolute_error | mean_absolute_percentage_error | mean_squared_logarithmic_error | squared_hinge | hinge | categorical_hinge | logcosh | categorical_crossentropy | sparse_categorical_crossentropy | kullback_leibler_divergence | poisson | cosine_proximity
  ] = js.native
  
  type LossIdentifier = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'mean_squared_error' | 'mean_absolute_error' | 'mean_absolute_percentage_error' | 'mean_squared_logarithmic_error' | 'squared_hinge' | 'hinge' | 'categorical_hinge' | 'logcosh' | 'categorical_crossentropy' | 'sparse_categorical_crossentropy' | 'kullback_leibler_divergence' | 'poisson' | 'cosine_proximity'>[number] */ js.Any
}
