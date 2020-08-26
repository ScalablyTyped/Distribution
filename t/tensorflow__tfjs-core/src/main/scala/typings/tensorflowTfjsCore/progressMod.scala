package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.typesMod.OnProgressCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/progress", JSImport.Namespace)
@js.native
object progressMod extends js.Object {
  def monitorPromisesProgress(promises: js.Array[js.Promise[js.Object | Unit]], onProgress: OnProgressCallback): js.Promise[js.Array[js.Object]] = js.native
  def monitorPromisesProgress(
    promises: js.Array[js.Promise[js.Object | Unit]],
    onProgress: OnProgressCallback,
    startFraction: js.UndefOr[scala.Nothing],
    endFraction: Double
  ): js.Promise[js.Array[js.Object]] = js.native
  def monitorPromisesProgress(
    promises: js.Array[js.Promise[js.Object | Unit]],
    onProgress: OnProgressCallback,
    startFraction: Double
  ): js.Promise[js.Array[js.Object]] = js.native
  def monitorPromisesProgress(
    promises: js.Array[js.Promise[js.Object | Unit]],
    onProgress: OnProgressCallback,
    startFraction: Double,
    endFraction: Double
  ): js.Promise[js.Array[js.Object]] = js.native
}

