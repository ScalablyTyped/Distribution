package typings.atTensorflowTfjsDashLayers.distLayersEmbeddingsMod

import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distInitializersMod.InitializerIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/embeddings", "Embedding")
@js.native
class Embedding protected () extends Layer {
  def this(args: EmbeddingLayerArgs) = this()
  val DEFAULT_EMBEDDINGS_INITIALIZER: InitializerIdentifier = js.native
  var embeddings: js.Any = js.native
  val embeddingsConstraint: js.UndefOr[js.Any] = js.native
  var embeddingsInitializer: js.Any = js.native
  val embeddingsRegularizer: js.UndefOr[js.Any] = js.native
  var inputDim: js.Any = js.native
  var inputLength: js.Any = js.native
  var maskZero: js.Any = js.native
  var outputDim: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/embeddings", "Embedding")
@js.native
object Embedding extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

