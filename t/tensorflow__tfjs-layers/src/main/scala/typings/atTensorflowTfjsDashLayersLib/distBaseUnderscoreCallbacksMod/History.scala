package typings
package atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "History")
@js.native
class History () extends BaseCallback {
  var epoch: js.Array[scala.Double] = js.native
  var history: org.scalablytyped.runtime.StringDictionary[
    js.Array[
      scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /**
    * Await the values of all losses and metrics.
    */
  def syncData(): js.Promise[scala.Unit] = js.native
}

